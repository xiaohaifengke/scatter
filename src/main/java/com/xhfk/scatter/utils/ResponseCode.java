package com.xhfk.scatter.utils;

/*
 * 定义返回码为6位，第一位非零，其中1开头的为图麟javaweb项目通用码，大于199999的为各个项目私有返回码
 *
 * 第三，四位表示私有分类code
 *  **10 表示角色管理code
 * @author weixiaokai
 * @date 2019/1/14 15:09
 * @param
 * @return
 */
public class ResponseCode {
    public static final String RESPONSE_CODE_SUCCESS = "100000";    //接口返回成功
    public static final String RESPONSE_CODE_UNKNOWN_ERROR = "100001";  //未知错误
    public static final String RESPONSE_CODE_VALIDATION_ERROR = "100002"; //参数验证失败
    public static final String RESPONSE_CODE_TOKEN_VALIDATION_ERROR = "100003"; //token验证失败
    public static final String RESPONSE_CODE_OLDPASSWORD_VALIDATION_ERROR = "100004"; //旧密码验证失败
    public static final String RESPONSE_CODE_NEWPASSWORD_VALIDATION_ERROR = "100005"; //新旧密码验证失败
    public static final String RESPONSE_CODE_CALL_OUT_ERROR = "100006";   //请求外部服务错误
    public static final String RESPONSE_CODE_CALL_OUT_TIMEOUT = "100007";   //请求外部服务超时


    /**************************************项目私有返回码********************************************************/
    public static final String RESPONSE_CODE_NO_DEVICE = "200000"; //未查询到设备
    public static final String RESPONSE_CODE_NAME_DUPLICATION = "201001"; //角色名称不能重复
    public static final String RESPONSE_CODE_DECRYPTAES_ERROR = "201002"; //角色名称不能重复

}
