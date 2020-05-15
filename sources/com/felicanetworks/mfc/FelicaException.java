package com.felicanetworks.mfc;

import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FelicaException extends Exception {
    public static final int ID_GET_APP_IDENTIFICATION_CODE_ERROR = 25;
    public static final int ID_GET_BLOCK_COUNT_INFORMATION_ERROR = 13;
    public static final int ID_GET_CONTAINER_ID_ERROR = 20;
    public static final int ID_GET_KEY_VERSION_ERROR = 4;
    public static final int ID_GET_KEY_VERSION_V2_ERROR = 28;
    public static final int ID_GET_NODE_INFORMATION_ERROR = 9;
    public static final int ID_GET_PRIVACY_NODE_INFORMATION_ERROR = 10;
    public static final int ID_GET_PUSH_NOTIFICATION_LISTENER_ERROR = 24;
    public static final int ID_GET_RFS_STATE_ERROR = 17;
    public static final int ID_GET_SYSTEM_CODE_LIST_ERROR = 26;
    public static final int ID_ILLEGAL_STATE_ERROR = 2;
    public static final int ID_IO_ERROR = 3;
    public static final int ID_OPEN_ERROR = 8;
    public static final int ID_PERMISSION_ERROR = 12;
    public static final int ID_PUSH_ERROR = 21;
    public static final int ID_READ_ERROR = 5;
    public static final int ID_SET_NODECODESIZE_ERROR = 7;
    public static final int ID_SET_PRIVACY_ERROR = 11;
    public static final int ID_SET_PUSH_NOTIFICATION_LISTENER_ERROR = 22;
    public static final int ID_START_ADHOC_ERROR = 23;
    public static final int ID_UNKNOWN_ERROR = 1;
    public static final int ID_WRITE_ERROR = 6;
    public static final String LA_ERROR_MESSAGE = "Cannot change discovery-state.";
    public static final String NFC_RW_USED_MESSAGE = "NFC R/W function is being used.";
    public static final String RW_STOP_MESSAGE = "Reader/Writer Function Stopped.";
    public static final int TYPE_ACTIVATE_FAILED = 56;
    public static final int TYPE_ACTIVATING_BY_OTHER_APP = 48;
    public static final int TYPE_ALREADY_ACTIVATED = 42;
    public static final int TYPE_AUTHENTICATE_FAILED = 30;
    public static final int TYPE_BLOCK_NOT_FOUND = 12;
    public static final int TYPE_CASH_BACK_FAILED = 16;
    public static final int TYPE_CHECK_PIN_LIMIT = 18;
    public static final int TYPE_CHECK_PIN_OVERRUN = 19;
    public static final int TYPE_COMMUNICATION_START_FAILED = 27;
    public static final int TYPE_CURRENTLY_ACTIVATING = 49;
    public static final int TYPE_CURRENTLY_ONLINE = 2;
    public static final int TYPE_DEVICELIST_NOT_SET = 25;
    public static final int TYPE_ENABLE_PIN_FAILED = 21;
    public static final int TYPE_EXECUTE_FELICA_COMMAND_FAILED = 63;
    public static final int TYPE_FELICA_NOT_AVAILABLE = 55;
    public static final int TYPE_FELICA_NOT_SET = 24;
    public static final int TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED = 43;
    public static final int TYPE_GET_CONTAINER_ID_FAILED = 46;
    public static final int TYPE_GET_CONTAINER_ISSUE_INFORMATION_FAILED = 29;
    public static final int TYPE_GET_KEY_VERSION_FAILED = 10;
    public static final int TYPE_GET_KEY_VERSION_V2_FAILED = 64;
    public static final int TYPE_GET_NODE_INFORMATION_FAILED = 34;
    public static final int TYPE_GET_PRIVACY_NODE_INFORMATION_FAILED = 35;
    public static final int TYPE_GET_RFS_STATE_FAILED = 51;
    public static final int TYPE_GET_SYSTEM_CODE_LIST_FAILED = 45;
    public static final int TYPE_ILLEGAL_METHOD_CALL = 38;
    public static final int TYPE_ILLEGAL_NODECODE = 32;
    public static final int TYPE_ILLEGAL_PACKET_INDEX = 33;
    public static final int TYPE_ILLEGAL_SYSTEMCODE = 50;
    public static final int TYPE_INITIATE_ADHOC_ERROR = 61;
    public static final int TYPE_INVALID_PIN = 17;
    public static final int TYPE_INVALID_RESPONSE = 6;
    public static final int TYPE_INVALID_SELECTED_INTERFACE = 54;
    public static final int TYPE_LISTENER_NOT_SET = 26;
    public static final int TYPE_MFC_NOT_FOUND = 60;
    public static final int TYPE_NOT_ACTIVATED = 5;
    public static final int TYPE_NOT_CLOSED = 37;
    public static final int TYPE_NOT_IC_CHIP_FORMATTING = 31;
    public static final int TYPE_NOT_OPENED = 1;
    public static final int TYPE_NOT_SELECTED = 3;
    public static final int TYPE_NOW_EXECUTING_FALP = 59;
    public static final int TYPE_OFFLINE_CANCELED = 58;
    public static final int TYPE_OPEN_FAILED = 8;
    public static final int TYPE_PIN_NOT_CHECKED = 13;
    public static final int TYPE_PURSE_FAILED = 15;
    public static final int TYPE_PUSH_FAILED = 40;
    public static final int TYPE_READ_FAILED = 14;
    public static final int TYPE_REMOTE_ACCESS_FAILED = 47;
    public static final int TYPE_RESET_FAILED = 44;
    public static final int TYPE_SELECT_FAILED = 9;
    public static final int TYPE_SERVICE_NOT_FOUND = 11;
    public static final int TYPE_SET_NODECODESIZE_FAILED = 28;
    public static final int TYPE_SET_PRIVACY_FAILED = 36;
    public static final int TYPE_START_ADHOC_FAILED = 53;
    public static final int TYPE_TIMEOUT_OCCURRED = 7;
    public static final int TYPE_USED_BY_OTHER_APP = 39;
    public static final int TYPE_WRITE_FAILED = 20;

    /* renamed from: id */
    private int f7374id;
    protected AppInfo otherAppInfo;
    private int statusFlag1;
    private int statusFlag2;
    private int type;

    public FelicaException() {
        LogMgr.log(5, "%s", "000");
        LogMgr.log(5, "%s", "999");
    }

    public int getID() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s id=%d", "999", Integer.valueOf(this.f7374id));
        return this.f7374id;
    }

    public AppInfo getOtherAppInfo() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s otherAppInfo=%s", "999", this.otherAppInfo);
        return this.otherAppInfo;
    }

    public int getStatusFlag1() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s statusFlag1=%d", "999", Integer.valueOf(this.statusFlag1));
        return this.statusFlag1;
    }

    public int getStatusFlag2() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s statusFlag2=%d", "999", Integer.valueOf(this.statusFlag2));
        return this.statusFlag2;
    }

    public int getType() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s type=%d", "999", Integer.valueOf(this.type));
        return this.type;
    }

    public FelicaException(int i, int i2) {
        LogMgr.log(5, "%s id=%d type=%d", "000", Integer.valueOf(i), Integer.valueOf(i2));
        this.f7374id = i;
        this.type = i2;
        LogMgr.log(5, "%s", "999");
    }

    public FelicaException(int i, int i2, int i3, int i4) {
        LogMgr.log(5, "%s id=%d type=%d statusFlag1=%d statusFlag2=%d", "000", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        this.f7374id = i;
        this.type = i2;
        this.statusFlag1 = i3;
        this.statusFlag2 = i4;
        LogMgr.log(5, "%s", "999");
    }

    public FelicaException(int i, int i2, AppInfo appInfo) {
        LogMgr.log(5, "%s id=%d type=%d otherAppPID=%d", "000", Integer.valueOf(i), Integer.valueOf(i2), appInfo);
        this.f7374id = i;
        this.type = i2;
        this.otherAppInfo = appInfo;
        LogMgr.log(5, "%s", "999");
    }

    public FelicaException(int i, int i2, AppInfo appInfo, int i3, int i4) {
        LogMgr.log(5, "%s id=%d type=%d otherAppPID=%d statusFlag1=%d statusFlag2=%d", "000", Integer.valueOf(i), Integer.valueOf(i2), appInfo, Integer.valueOf(i3), Integer.valueOf(i4));
        this.f7374id = i;
        this.type = i2;
        this.otherAppInfo = appInfo;
        this.statusFlag1 = i3;
        this.statusFlag2 = i4;
        LogMgr.log(5, "%s", "999");
    }

    public FelicaException(int i, int i2, AppInfo appInfo, int i3, int i4, String str) {
        super(str);
        LogMgr.log(5, "%s id=%d type=%d otherAppPID=%d statusFlag1=%d statusFlag2=%d msg=%s", "000", Integer.valueOf(i), Integer.valueOf(i2), appInfo, Integer.valueOf(i3), Integer.valueOf(i4), str);
        this.f7374id = i;
        this.type = i2;
        this.otherAppInfo = appInfo;
        this.statusFlag1 = i3;
        this.statusFlag2 = i4;
        LogMgr.log(5, "%s", "999");
    }

    public FelicaException(int i, int i2, String str) {
        super(str);
        LogMgr.log(5, "%s id=%d type=%d message=%s", "000", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.f7374id = i;
        this.type = i2;
        LogMgr.log(5, "%s", "999");
    }
}
