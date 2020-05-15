package com.felicanetworks.sductrl.net;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthResponseData {
    public static final int RESPONSE_NG = 1;
    public static final int RESPONSE_OK = 0;
    public String authFinishCode;
    public int resCode;
    public String startUrl;

    public AuthResponseData(int i, String str, String str2) {
        this.resCode = i;
        this.authFinishCode = str;
        this.startUrl = str2;
    }

    public String toString() {
        return "AuthResponseData[" + this.resCode + ", " + this.authFinishCode + ", " + this.startUrl + "]";
    }
}
