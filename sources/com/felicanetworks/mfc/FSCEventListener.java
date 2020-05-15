package com.felicanetworks.mfc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface FSCEventListener {
    public static final int TYPE_HTTP_ERROR = 3;
    public static final int TYPE_INTERRUPTED_ERROR = 2;
    public static final int TYPE_PROTOCOL_ERROR = 4;
    public static final int TYPE_TCAP_IMMEDIATE_STOP = 100;
    public static final int TYPE_UNKNOWN_ERROR = 1;

    void errorOccurred(int i, String str);

    void finished(int i);

    byte[] operationRequested(int i, String str, byte[] bArr);
}
