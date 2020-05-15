package com.felicanetworks.mfc.mfi;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface BaseMfiEventCallback {
    public static final int TYPE_AGREEMENT_NOT_ACCEPT = 218;
    public static final int TYPE_CARD_NOT_ACTIVE = 211;
    public static final int TYPE_CARD_NOT_EXIST = 208;
    public static final int TYPE_CARD_NOT_UNIQUE = 214;
    public static final int TYPE_EXIST_UNKNOWN_CARD = 212;
    public static final int TYPE_EXPIRED_MFI = 207;
    public static final int TYPE_FELICA_NOT_AVAILABLE = 55;
    public static final int TYPE_HTTP_COMMUNICATION_ERROR = 205;
    public static final int TYPE_HTTP_ERROR = 203;
    public static final int TYPE_ILLEGAL_LINKAGE_DATA = 209;
    public static final int TYPE_INTERRUPTED_ERROR = 215;
    public static final int TYPE_INVALID_LINKAGE_DATA = 210;
    public static final int TYPE_INVALID_RESPONSE = 6;
    public static final int TYPE_ISSUE_LIMIT_EXCEEDED = 213;
    public static final int TYPE_NOT_IC_CHIP_FORMATTING = 31;
    public static final int TYPE_OPEN_FAILED = 8;
    public static final int TYPE_OPSRV_ACCOUNT_ERROR = 216;
    public static final int TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE = 219;
    public static final int TYPE_OPSRV_RESULT_ERROR = 217;
    public static final int TYPE_PROTOCOL_ERROR = 202;
    public static final int TYPE_SERVER_CANNOT_RESPOND_ERROR = 204;
    public static final int TYPE_SERVER_GENERAL_ERROR = 206;
    public static final int TYPE_UNKNOWN_ERROR = 200;

    void onError(int i, String str);
}
