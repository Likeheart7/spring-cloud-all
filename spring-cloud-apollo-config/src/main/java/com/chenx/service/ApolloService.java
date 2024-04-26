package com.chenx.service;

import com.ctrip.framework.apollo.openapi.client.ApolloOpenApiClient;
import com.ctrip.framework.apollo.openapi.dto.NamespaceGrayDelReleaseDTO;
import com.ctrip.framework.apollo.openapi.dto.OpenItemDTO;
import com.ctrip.framework.apollo.openapi.dto.OpenReleaseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApolloService {
    @Value("application")
    private String namespace;

    @Autowired
    private ApolloOpenApiClient apolloOpenApiClient;
    @Value("${file.path}")
    private String filePath;

    @Value("${app.id}")
    private String appId;

    public void updateApolloConfig(String newPath) {
        String realPath = newPath.replace("_", "/");
        OpenItemDTO openItemDTO = new OpenItemDTO();
        openItemDTO.setKey("file.path");
        openItemDTO.setValue(realPath);
        openItemDTO.setDataChangeCreatedBy("apollo");
        apolloOpenApiClient.createOrUpdateItem(appId, "DEV", "default", namespace, openItemDTO);
    }

    public String getFilePath() {
        return filePath;
    }

    public void releaseParam() {
        NamespaceGrayDelReleaseDTO namespaceGrayDelReleaseDTO = new NamespaceGrayDelReleaseDTO();
        //配置版本名称
        namespaceGrayDelReleaseDTO.setReleaseTitle(System.currentTimeMillis() + "-release");
        //刷新说明
        namespaceGrayDelReleaseDTO.setReleaseComment("auto release");
        namespaceGrayDelReleaseDTO.setReleasedBy("apollo");
        OpenReleaseDTO openReleaseDTO = apolloOpenApiClient.publishNamespace(appId, "dev", "default", namespace, namespaceGrayDelReleaseDTO);
    }
}
