package com.felicanetworks.mfc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface FelicaEventListener {
    public static final int TYPE_HTTP_ERROR = 3;
    public static final int TYPE_INTERRUPTED_ERROR = 2;
    public static final int TYPE_INVALID_APP_ERROR = 6;
    public static final int TYPE_MFC_VERSION_ERROR = 8;
    public static final int TYPE_MFICLIENT_NOT_PERMIT = 101;
    public static final int TYPE_MFICLIENT_VERSION_ERROR = 100;
    public static final int TYPE_NOT_FOUND_ERROR = 4;
    public static final int TYPE_REVOKED_ERROR = 5;
    public static final int TYPE_UNKNOWN_ERROR = 1;
    public static final int TYPE_USED_BY_OTHER_APP = 7;
    public static final int TYPE_UTILITY_VERSION_ERROR = 9;

    void errorOccurred(int i, String str, AppInfo appInfo);

    void finished();
}
