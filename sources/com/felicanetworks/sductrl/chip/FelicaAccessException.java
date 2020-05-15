package com.felicanetworks.sductrl.chip;

import com.felicanetworks.mfc.AppInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FelicaAccessException extends Exception {
    public static final int ID_FELICA_EVENT = 1;
    public static final int ID_FSC_EVENT = 2;
    AppInfo appInfo;

    /* renamed from: id */
    int f7456id = 2;
    String message;
    int type;

    public FelicaAccessException(int i, String str) {
        super(i + "," + str);
        this.type = i;
        this.message = str;
    }

    public AppInfo getAppInfo() {
        return this.appInfo;
    }

    public int getId() {
        return this.f7456id;
    }

    public String getMessage() {
        return this.message;
    }

    public int getType() {
        return this.type;
    }

    public FelicaAccessException(int i, String str, AppInfo appInfo2) {
        super(i + "," + str + "," + appInfo2);
        this.type = i;
        this.message = str;
        this.appInfo = appInfo2;
    }
}
