package com.xhfk.scatter;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname: Constant
 * @Description: 常量类
 * @Date: 2019/3/22 15:41
 * @Created by AwuWang
 */
public class Constant {

    public static final String DIC_TYPE_SEX = "SEX";
    public static final String DIC_TYPE_AGE = "AGE";
    public static final String DIC_TYPE_BEARD = "BEARD";
    public static final String DIC_TYPE_GLASSES = "GLASSES";
    public static final String DIC_TYPE_HAT = "HAT";
    public static final String DIC_TYPE_MASK = "MASK";
    public static final String DIC_TYPE_PAGESIZE = "PAGESIZE";
    public static final String DIC_TYPE_THRESHOLD = "THRESHOLD";
    public static final String DIC_TYPE_CRIMINALRECORD = "CRIMINALRECORD";
    public static final String DIC_TYPE_IDTYPE = "IDTYPE";
    public static final String DIC_TYPE_DEPLOYLEVEL = "DEPLOYLEVEL";

    public static final String DIC_TYPE_SYSTEMROOT = "SYSTEMAREAROOT";
    public static final String DIC_TYPE_RYLX = "RYLX";
    public static final String BACK_WEB_DATA_TYPE = "tree";
    public static final String RESPONSE_RESULT_LIST = "list";
    public static final String MONITOR_DATA_TYPE_TASK = "taskList";
    public static final String MONITOR_DATA_TYPE_CAMERA = "cameraList";
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    /*
     * tree 结构字段
     */
    public static final String TREE_COLUMN_LABEL = "label";
    public static final String TREE_COLUMN_VALUE = "value";
    public static final String TREE_COLUMN_ID = "id";
    public static final String TREE_COLUMN_NODETYPE = "nodeType";
    public static final String TREE_COLUMN_CHILDREN = "children";
    public static final String TREE_COLUMN_PARENTCODE = "parentCode";
    public static final String TREE_NODETYPE_AREA = "areaId";
    public static final String TREE_NODETYPE_SOURCE = "sourceId";
    public static final String TREE_NODETYPE_ISDISABLED = "isDisabled";
    public static final String TREE_COLUMN_NAME = "name";
    public static final String TREE_COLUMN_DEPLOY_ID = "deployId";
    public static final Map<String, String> DEPLOY_STATUS_NAME_MAPPING = new HashMap<>();
    public static final Map<String, String> DEPLOY_TYPE_NAME_MAPPING = new HashMap<>();


    public final static String TIME_FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public final static String TIME_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
    public final static String TIME_FORMAT_YYYYMMDD = "yyyyMMdd";
    public static final String DFACE_MAP_FLAG = "IMAGE";
    /*
     *分页默认数量
     */
    public static final int PAGINATION_ITEMS_PER_PAGE = 20;
    public static final int PAGINATION_ITEMS_PER_PAGE_MULTIPLE = 100;
    public static final int PAGINATION_ITEMS_PER_PAGE_MAX = 1000;
    public static final int PAGINATION_ITEMS_PER_PAGE_FIFTY = 50;

    /*
     * 系统路径常量
     */
    public static final String STORAGE_PRIVATE_BASEPATH = "storage.private.basePath";
    public static final String DFACE_IMAGE_ROOT_PATH = "dface.image.root.path";
    public static final String DFACE_IMAGE_NGINX_PATH = "dface.image.nginx.path";

    ///mnt/storage4/ +dface
    // public static final String DFACE_IMAGE_BASE_PATH = ConfigUtils.getInstance().
    //     getConfigValue(STORAGE_PRIVATE_BASEPATH)
    //     + ConfigUtils.getInstance().getConfigValue(DFACE_IMAGE_ROOT_PATH);
    //
    // public static final String FACE_IMG_PATH_RREFIX = ConfigUtils.getInstance().getConfigValue(DFACE_IMAGE_NGINX_PATH);
    // public static final String FACE_FILE_PATH_RREFIX = DFACE_IMAGE_BASE_PATH;

    /*
     * 后端服务messageTag
     */
    public static final String DFACE_CAPTURE_SEARCH_SERVICE = "dface_capture_search_service";
    public static final String DFACE_GROUP_SEARCH_SERVICE = "dface_group_search_service";
    public static final String DFACE_MODELING_SERVICE = "dface_modeling_service";
    public static final String DFACE_COMPARE_SERVICE = "dface_compare_service";
    public static final String DFACE_SEARCH_IDENTIFY_TRACK_SERVICE = "dface_search_identify_track_service";
    public static final String DFACE_VIDEO_START_SERVICE = "dface_video_start_service";
    public static final String DFACE_VIDEO_STOP_SERVICE = "dface_video_stop_service";
    public static final String DFACE_RECORDINGVIDEO_START_SERVICE = "dface_recordingVideo_start_service";
    public static final String DFACE_RECORDINGVIDEO_STOP_SERVICE = "dface_recordingVideo_stop_service";
    public static final String DFACE_RECORDINGVIDEO_PAUSE_SERVICE = "dface_recordingVideo_pause_service";
    public static final String DFACE_RECORDINGVIDEO_RESUME_SERVICE = "dface_recordingVideo_resume_service";
    public static final String DFACE_RECORDINGVIDEO_SEEK_SERVICE = "dface_recordingVideo_seek_service";
    public static final String DFACE_RECORDINGVIDEO_DOWNLOAD_SERVICE = "dface_recordingVideo_download_service";
    public static final String DFACE_SEARCH_IDENTIFY_VERSION_SERVICE = "dface.search.identify.version_service";
    public static final String DFACE_COMPARE_CQ_SERVICE = "dface_compare_cq_service";

    /**
     * 服务端URl
     */
    public static final String DFACE_SEARCH_CAPTURE_URL = "dface.search.capture.url";
    public static final String DFACE_SEARCH_GROUP_URL = "dface.search.group.url";
    public static final String DFACE_MODELING_URL = "dface.modeling.url";
    public static final String DFACE_SEARCH_IDENTIFY_TRACK_URL = "dface.search.identify.track.url";
    public static final String DFACE_SEARCH_IDENTIFY_VERSION_URL = "dface.search.identify.version.url";
    public static final String DFACE_VIDEO_PREFIX_URL = "dface.video.url.prefix";
    public static final String DFACE_COMPARE_URL = "dface.compare.url";
    public static final String DFACE_COMPARE_DETECT_URL = "dface.compare.detect.url";

    /**
     * 分隔符
     */
    public static final String SEPARATOR_COMMA = ",";

    /**
     * 设备管理用到
     */
    public static final String ONLINE = "online";
    public static final String OFFLINE = "offline";
    public static final String FACECAMERA = "facecamera";
    public static final String IMAGE = "image";
    /**
     * 后端返回解析常量
     */
    public static final String GROUP_SEARCH_RESPONSE_SCORE_NODE = "score";
    public static final String GROUP_SEARCH_RESPONSE_IMGPATH_NODE = "img_path";
    public static final String GROUP_SEARCH_RESPONSE_ID_NODE = "face_token";
    public static final String GROUP_SEARCH_RESPONSE_RESULTS_NODE = "results";

    public static final String INTERSECTION_SEARCH_RESULT_TYPE = "intersection";
    public static final String UNION_SEARCH_RESULT_TYPE = "union";
    public static final String SCORE_SORT = "score_sort";
    public static final String CAPTURE_TIME_SORT = "capture_time_sort";

    public static final String FACE_SEX_MALE = "男";
    public static final String FACE_SEX_FEMALE = "女";
    public static final String FACE_HAS_RECORD = "有";
    public static final String FACE_NO_RECORD = "无";

    public static final String FACE_INDEX_JOB_ADD_ACTION = "add";
    public static final String FACE_INDEX_JOB_REMOVE_ACTION = "remove";

    public static final String TUNICORN_HAIKANG_DEFAULT_VIRTUAL_FACE_CAMERA =
        "TUNICORN_HAIKANG_DEFAULT_VIRTUAL_FACE_CAMERA";

    public static Map<String, String> ONE_TO_ONE_COMPARE_RESULT_MAPPING = new HashMap<>();
    public static Map<String, String> ALERT_PROCESS_STATUS_NAME_MAPPING = new HashMap<String, String>();
    public static Map<String, String> DEPLOY_STATUS_TASK_MAPPING = new HashMap<>();
    public static Map<String, Integer> HOME_COUNT_MAPPING = new HashMap<>();
    //特征提取状态结果
    public static Map<Integer, String> FEATURE_EXTRACTION_RESULT_MAPPING = new HashMap<Integer, String>();
    //大库碰撞job状态
    public static Map<String, String> GROUP_COLLISION_STATUS_NAME_MAPPING = new HashMap<String, String>();


    //批量比对生成文件路径
    // public static final String BATCH_COMPARE_FILE_PATH = DFACE_IMAGE_BASE_PATH + "/files/";
    public static final String TEMP_FOLDER = "temp";
    public static final String BUCKET_PREFIX = "xhfk-";
    public static final String CORE_SERVICE_SUCCESS_FLAG = "success";


    /**
     * 本地缓存中的key
     */
    public static final String CACHE_KEY_RYLX_SIZE = "rylx_size";
    public static final String CACHE_TOTALCOUNT_KEY = "totalCountCache";
    public static final String CACHE_COUNTBYTAG_ALL_KEY = "countByTagForAllCache";
    public static final String CACHE_COUNTBYTAG_WEEK_KEY = "countByTagForWeekCache";
    public static final String CACHE_COUNTBYTAG_DAY_KEY = "countByTagForDayCache";
    public static final String CACHE_UPDATETIME_DAY_KEY = "updateTimeByTagForDayCache";
    public static final String CACHE_UPDATETIME_WEEK_KEY = "updateTimeByTagForWeekCache";
    public static final String CACHE_UPDATETIME_ALL_KEY = "updateTimeByTagForAllCache";
    public static final String CACHE_COUNTBYAREA_KEY = "countByAreaCache";
    public static final String CACHE_AREACODELIST_KEY = "areaCodeListCache";
    public static final String CACHE_STATISTICS_KEY = "statisticsCache";
    public static final String PRIVILEGE_CACHE_PREFIX = "privilege_";

    public static final String CACHE_SYSTEMROOT_AREACODE_KEY = "systemRootAreaCode";

    public static final String CACHE_COUNTBYTAG_OTHER_KEY = "其他";

    /**
     * 首页统计常量
     */
    public static final String COUNT_BYTIME_MONTH = "M";
    public static final String COUNT_BYTIME_DAY = "D";
    public static final int STATISTIC_TYPE_TOTAL = 0;
    public static final int STATISTIC_TYPE_BYMONTH = 1;
    public static final int STATISTIC_TYPE_BYDAY = 2;
    public static final int STATISTIC_TYPE_BYTAG = 3;
    public static final int STATISTIC_TYPE_BYAREA = 4;

    ///////////////////////////////////////

    public final static String SESSION_MENU = "menu";
    public static final String REALTIME_MONTOR_PRIVILEGE = "实时监控";
    public static final String STAND_GROUP_MANAGE_PRIVILEGE = "底库管理";
    public static final String DIST_MANAGE_PRIVILEGE = "布控管理";
    public static final String STATIC_SEARCH_PRIVILEGE = "静态检索";
    public static final String USER_MAMAGE_PRIVILEGE = "用户管理";

    public static final String MONITOR_INFO_PRIVILEGE = "监控详情";
    public static final String SNAPSHOT_HISTORY_PRIVILEGE = "抓拍历史";
    public static final String ALERT_HISTORY_PRIVILEGE = "告警历史";

    public static final String STAND_GROUP_CONFIG_PRIVILEGE = "底库配置";
    public static final String PERSON_INFO_CONFIG_PRIVILEGE = "人员信息配置";

    public static final String HARDWARE_CONFIG_PRIVILEGE = "硬件配置";
    public static final String MATCH_CONFIG_PRIVILEGE = "匹配配置";
    public static final String DIST_CONFIG_PRIVILEGE = "布控配置";

    public static final String SNAPSHOT_SEARCH_PRIVILEGE = "抓拍检索";
    public static final String IMAGE_SEARCH_PRIVILEGE = "图像检索";

    public static final String FACE_IMAGE_TYPE = "face";
    public static final String CAPTURE_IAMGE_TYPE = "capture";


    public static final String DEPLOY_STATUS_INPROGRESS = "inprogress";


    public static final String GROUP_COLLISION_DICTIONART_TYPE_NAME = "DKPZ";
    public static final String PERSON_TYPE_DICTIONART_TYPE_NAME = "RYLX";


    /*************************导出文件的存放基础目录**************************/
    // public static final String FACE_FILE_EXPORT_PATH_RREFIX = FACE_FILE_PATH_RREFIX + File.separator
    //     + ConfigUtils.getInstance().getConfigValue("dface.export.files.path");

    // public static final String FACE_FILE_EXPORT_DEPLOY_PATH_RREFIX = FACE_FILE_EXPORT_PATH_RREFIX + File.separator
    //     + "deploy";

    /*************************导出考生比对的结果excel**************************/
    // public static final String FACE_FILE_EXPORT_TASK_RESULT_PATH_PREFIX = FACE_FILE_EXPORT_PATH_RREFIX + File.separator + "taskResult";

/*    public static final String FACE_FILE_EXPORT_TASK_RESULT_PATH_PREFIX =
        FACE_FILE_EXPORT_PATH_RREFIX + File.separator + "taskResult";*/


    static {
        DEPLOY_STATUS_NAME_MAPPING.put("created", "已创建");
        DEPLOY_STATUS_NAME_MAPPING.put("inprogress", "进行中");
        DEPLOY_STATUS_NAME_MAPPING.put("stoped", "已停止");
        DEPLOY_STATUS_NAME_MAPPING.put("finished", "已结束");
        DEPLOY_STATUS_NAME_MAPPING.put("abnormal", "异常");

        DEPLOY_TYPE_NAME_MAPPING.put("alert", "识别告警");
        DEPLOY_TYPE_NAME_MAPPING.put("black", "黑名单布控");
        DEPLOY_TYPE_NAME_MAPPING.put("white", "白名单布控");

        ALERT_PROCESS_STATUS_NAME_MAPPING.put("unprocessed", "未处理");
        ALERT_PROCESS_STATUS_NAME_MAPPING.put("solved", "已处理");

        DEPLOY_STATUS_TASK_MAPPING.put("inprogress", "进行中");
        DEPLOY_STATUS_TASK_MAPPING.put("unprogress", "未进行");

        ONE_TO_ONE_COMPARE_RESULT_MAPPING.put("0", "http_code_success");
        ONE_TO_ONE_COMPARE_RESULT_MAPPING.put("1", "http_code_bad_json_body");
        ONE_TO_ONE_COMPARE_RESULT_MAPPING.put("2", "http_code_bat_request_undefined");
        ONE_TO_ONE_COMPARE_RESULT_MAPPING.put("3", "http_code_bad_request_no_image");
        ONE_TO_ONE_COMPARE_RESULT_MAPPING.put("4", "http_code_bad_request_no_threshold");
        ONE_TO_ONE_COMPARE_RESULT_MAPPING.put("5", "http_code_bad_request_invalid_search");
        ONE_TO_ONE_COMPARE_RESULT_MAPPING.put("6", "http_code_bad_image");
        ONE_TO_ONE_COMPARE_RESULT_MAPPING.put("7", "http_code_detect_failed");

        FEATURE_EXTRACTION_RESULT_MAPPING.put(0, "初始化");
        FEATURE_EXTRACTION_RESULT_MAPPING.put(1, "特征提取成功");
        FEATURE_EXTRACTION_RESULT_MAPPING.put(-1, "图片为空");
        FEATURE_EXTRACTION_RESULT_MAPPING.put(-2, "未检测到人脸");
        FEATURE_EXTRACTION_RESULT_MAPPING.put(-3, "非正脸");
        FEATURE_EXTRACTION_RESULT_MAPPING.put(-4, "图片不存在");
        FEATURE_EXTRACTION_RESULT_MAPPING.put(-6, "图像质量差");
        FEATURE_EXTRACTION_RESULT_MAPPING.put(-7, "年龄因素");
        FEATURE_EXTRACTION_RESULT_MAPPING.put(-99, "检测失败,原因未知");

        GROUP_COLLISION_STATUS_NAME_MAPPING.put("created", "已创建");
        GROUP_COLLISION_STATUS_NAME_MAPPING.put("pending", "待执行");
        GROUP_COLLISION_STATUS_NAME_MAPPING.put("inprogress", "进行中");
        GROUP_COLLISION_STATUS_NAME_MAPPING.put("stopped", "已停止");
        GROUP_COLLISION_STATUS_NAME_MAPPING.put("finished", "已结束");
    }

    public static final String PATH_DFACE = "dface";

    public static final String STATUS_ACTIVE = "active";

    public static final String STATUS_DELETED = "deleted";

    public static final int BATCH_UPLOAD_FACE_SIZE = 1;
    public static final int BATCH_UPLOAD_ASSET_SIZE = 1;

    public static final int BATCH_UPLOAD_MAX_File_SIZE = 1;

    public static final int BATCH_UPLOAD_FACE_INDEX_JOB_SIZE =
        1;

    public static final int BATCH_UPLOAD_FACE_THREAD_SIZE =
        1;

    public static final String USER_MANUAL_PATH = "static" + File.separator + "doc" + File.separator + "usermanual"
        + File.separator + "用户手册.pdf";
    public static final String USER_MANUAL_NAME = "用户手册.pdf";

    public static final String UTF8 = "UTF-8";
    public static final String ISO88991 = "iso-8859-1";

    public static final String BROWSER_IE = "IE";
    public static final String BROWSER_FIREFOX = "FF";
    public static final String BROWSER_SAFARI = "SF";

    public static final String USER_AGENT = "USER-AGENT";

    public static final String SUPER_ADMIN_ROLE_NAME = "super_admin";

    // Privilege AbbrName Related
    public static final String VIEW_MONITOR_PAGE_PRIVILEGE = "view_monitor_page";
    public static final String VIEW_CAPTURE_PAGE_PRIVILEGE = "view_capture_page";
    public static final String VIEW_ALERT_PAGE_PRIVILEGE = "view_alert_page";
    public static final String VIEW_FACE_GROUP_PAGE_PRIVILEGE = "view_face_group_page";
    public static final String VIEW_FACE_PAGE_PRIVILEGE = "view_face_page";
    public static final String VIEW_SERVER_PAGE_PRIVILEGE = "view_server_page";
    public static final String VIEW_SOURCE_PAGE_PRIVILEGE = "view_source_page";
    public static final String VIEW_MAPPING_PAGE_PRIVILEGE = "view_mapping_page";
    public static final String VIEW_DEPLOY_PAGE_PRIVILEGE = "view_deploy_page";
    public static final String VIEW_CAPTURE_SEARCH_PAGE_PRIVILEGE = "view_capture_search_page";
    public static final String VIEW_FACE_GROUP_SEARCH_PAGE_PRIVILEGE = "view_face_group_search_page";
    public static final String VIEW_USER_MANAGE_PAGE_PRIVILEGE = "view_user_manage_page";
    public static final String VIEW_MANUAL_PAGE_PRIVILEGE = "view_mamual_page";
    public static final String ACCOUNT_PROMOTE_PRIVILEGE = "account_promote";
    public static final String CREATE_FACE_GROUP_PRIVILEGE = "create_face_group";
    public static final String INDEX_FACE_GROUP_PRIVILEGE = "index_face_group";
    public static final String VIEW_FACE_GROUP_INDEX_PRIVILEGE = "view_face_group_index";
    public static final String EDIT_FACE_GROUP_PRIVILEGE = "edit_face_group";
    public static final String MANAGE_FACES_IN_FACE_GROUP_PRIVILEGE = "manage_faces_in_face_group";
    public static final String DELETE_FACE_GROUP_PRIVILEGE = "delete_face_group";
    public static final String CREATE_FACE_BY_SINGLE_PRIVILEGE = "create_face_by_single";
    public static final String CREATE_FACE_BY_BATCH_PRIVILEGE = "create_face_by_batch";
    public static final String EDIT_FACE_PRIVILEGE = "edit_face";
    public static final String MANAGE_ASSETS_IN_FACE_PRIVILEGE = "manage_assets_in_face";
    public static final String DELETE_FACE_PRIVILEGE = "delete_face";
    public static final String CREATE_SERVER_PRIVILEGE = "create_server";
    public static final String EDIT_SERVER_PRIVILEGE = "edit_server";
    public static final String DELETE_SERVER_PRIVILEGE = "delete_server";
    public static final String CREATE_CAMERA_PRIVILEGE = "create_camera";
    public static final String EDIT_CAMERA_PRIVILEGE = "edit_camera";
    public static final String DELETE_CAMERA_PRIVILEGE = "delete_camera";
    public static final String CREATE_OFFLINE_PRIVILEGE = "create_offline";
    public static final String EDIT_OFFLINE_PRIVILEGE = "edit_offline";
    public static final String DELETE_OFFLINE_PRIVILEGE = "delete_offline";
    public static final String CREATE_DEPLOY_PRIVILEGE = "create_deploy";
    public static final String EXECUTE_DEPLOY_PRIVILEGE = "execute_deploy";
    public static final String EDIT_DEPLOY_PRIVILEGE = "edit_deploy";
    public static final String DELETE_DEPLOY_PRIVILEGE = "delete_deploy";
    public static final String CREATE_USER_PRIVILEGE = "create_user";
    public static final String EDIT_USER_PRIVILEGE = "edit_user";
    public static final String CHANGE_USER_PASSWORD_PRIVILEGE = "change_user_password";
    public static final String DELETE_USER_PRIVILEGE = "delete_user";
    public static final String VIEW_AUDIT_LOG_PAGE_PRIVILEGE = "view_audit_log_page";
    public static final String HANDLE_ALERT_PRIVILEGE = "handle_alert";
    public static final String SERVER_SOURCE_MAPPING_PRIVILEGE = "server_source_mapping";
    public static final String VIEW_OUT_IN_SUMMARY_PAGE_PRIVILEGE = "view_outin_summary_page";
    public static final String VIEW_ONE_ONE_COMPARE_PAGE_PRIVILEGE = "view_one_to_one_compare_page";
    public static final String VIEW_PERSON_CENTER_PAGE = "view_person_center_page";
    public static final String VIEW_NOTICE_CENTER_PAGE = "view_notice_center_page";
    public static final String CREATE_FACE_CAMERA_PRIVILEGE = "create_face_camera";
    public static final String EDIT_FACE_CAMERA_PRIVILEGE = "edit_face_camera";
    public static final String DELETE_FACE_CAMERA_PRIVILEGE = "delete_face_camera";
    public static final String CREATE_VIDEO_IMAGE_PRIVILEGE = "create_video_image";
    public static final String EDIT_VIDEO_IMAGE_PRIVILEGE = "edit_video_image";
    public static final String DELETE_VIDEO_IMAGE_PRIVILEGE = "delete_video_image";

    public static final String CREATE_MEDIA_ENCODER_PRIVILEGE = "create_media_encoder";
    public static final String EDIT_MEDIA_ENCODER_PRIVILEGE = "edit_media_encoder";
    public static final String DELETE_MEDIA_ENCODER_PRIVILEGE = "delete_media_encoder";
    public static final String MEDIA_ENCODER_CONNECT_CAMERA_PRIVILEGE = "media_encoder_connect_camera";

    public static final String CREATE_ROLE = "create_role";
    public static final String EDIT_ROLE = "edit_role";
    public static final String DELETE_ROLE = "delete_role";
    public static final String VIEW_ROLE = "view_role";

    public static final String CREATE_AREA = "create_area";
    public static final String EDIT_AREA = "edit_area";
    public static final String DELETE_AREA = "delete_area";
    public static final String VIEW_AREA = "view_area";
    public static final String VIEW_ALL_CAPTURE = "view_all_capture";

    public static final String FACE_INDEX_JOB_INIT_STATUS = "init";
    public static final String FACE_INDEX_JOB_READY_STATUS = "ready";
    public static final String FACE_INDEX_JOB_INPROGRESS_STATUS = "inprogress";

    public static final String DFACE_GROUP_NULL = "dface_group_null";
    public static final String DFACE_GROUP_INDEX_INIT = "dface_group_index_init";
    public static final String DFACE_GROUP_INDEX_READY = "dface_group_index_ready";
    public static final String DFACE_GROUP_INDEX_INPROGRESS = "dface_group_index_inprogress";
    public static final String DFACE_GROUP_INDEX_FINISHED = "dface_group_index_finished";


    public static final String ROLE_PRIVATE = "private";
    public static final String DFACE_NO_AUTHORITY = "dface_no_authority";

    public final static String SESSION_IS_CROPPER = "isCropper";

    public final static String FACE_GROUP_TYPE_WHITE = "white";
    public final static String FACE_GROUP_TYPE_BLACK = "black";

    public final static String FACE_GROUP_TYPE_WHITE_CN = "白名单";
    public final static String FACE_GROUP_TYPE_BLACK_CN = "黑名单";


    //activemq配置activemq.flag
    public final static int CMD_TYPE_DEPLOY_NOTIFY = 5;    //向activemq发送布控通知的request_cmd_id值
    //是否启用activemq开关
    // public static final String ACTIVEMQ_FLAG = ConfigUtils.getInstance().getConfigValue("activemq.flag");

    //大库碰撞的几种类型
    public final static String STATIC_COLLISION = "1";
    public final static String CAPTURE_COLLISION = "2";
    public final static String BATCH_COLLISION = "3";
    //布控任务操作类型
    public static final String DEPLOY_ACTION_START = "start";
    public static final String DEPLOY_ACTION_STOP = "stop";
    public static final String DEPLOY_ACTION_DELETE = "delete";


    //普通用户可查查看记录天数
    public static final String HTTP_HEADER_APP_KEY = "App-Key";
    public static final String HTTP_HEADER_APP_SECRET = "App-Secret";
    public static final String HTTP_HEADER_APP_REQUEST_ID = "App-Request-ID";
    public static final String HTTP_HEADER_APP_TOKEN = "App-Token";

}

