package com.google.android.gms.drive.metadata.sync.syncadapter;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MetadataSyncChimeraService extends Service {

    /* renamed from: a */
    public static final sbw f31076a = new sbw("MetadataSyncChimeraServ", "");

    /* renamed from: b */
    public vby f31077b;

    /* renamed from: c */
    private vbm f31078c;

    /* renamed from: a */
    public static String m23065a(String str) {
        return str != null ? str.replaceAll("([/~])", "/$1") : "";
    }

    public final IBinder onBind(Intent intent) {
        return this.f31078c;
    }

    public final void onCreate() {
        this.f31077b = new vby(vpu.m41034a());
        this.f31078c = new vbm(this);
    }

    public final boolean onUnbind(Intent intent) {
        stopSelf();
        return false;
    }
}
