package com.chenx.handler;

// 用于处理sentinel的异常
//@Component
//public class SentinelExceptionHandler implements BlockExceptionHandler {
//    /**
//     * RESTFul异常信息处理器
//     *
//     * @param httpServletRequest
//     * @param httpServletResponse
//     * @param e
//     * @throws Exception
//     */
//    @Override
//    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
//        String msg = null;
//        if (e instanceof FlowException) {//限流异常
//            msg = "接口已被限流";
//        } else if (e instanceof DegradeException) {//熔断异常
//            msg = "接口已被熔断,请稍后再试";
//        } else if (e instanceof ParamFlowException) { //热点参数限流
//            msg = "热点参数限流";
//        } else if (e instanceof SystemBlockException) { //系统规则异常
//            msg = "系统规则(负载/....不满足要求)";
//        } else if (e instanceof AuthorityException) { //授权规则异常
//            msg = "授权规则不通过";
//        }
//        httpServletResponse.setStatus(500);
//        httpServletResponse.setCharacterEncoding("UTF-8");
//        httpServletResponse.setContentType("application/json;charset=utf-8");
//        //ObjectMapper是内置Jackson的序列化工具类,这用于将对象转为JSON字符串
//        ObjectMapper mapper = new ObjectMapper();
//        //某个对象属性为null时不进行序列化输出
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        mapper.writeValue(httpServletResponse.getWriter(),
//                new ResponseObject(e.getClass().getSimpleName(), msg)
//        );
//    }
//}
