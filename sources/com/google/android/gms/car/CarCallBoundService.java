package com.google.android.gms.car;

import android.content.Intent;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarCallBoundService extends nys {

    /* renamed from: a */
    private nkw f29305a;

    /* renamed from: b */
    private olx f29306b;

    static {
        odk.m28481a("CAR.CALL.CLIENT");
    }

    public final IBinder onBind(Intent intent) {
        if (!ccrv.f179815a.mo6606a().mo76691a() || !nzi.m28224a()) {
            return this.f29306b;
        }
        return null;
    }

    public final void onCreate() {
        this.f29305a = new nkw(this);
        this.f29306b = new olx(this, this.f29305a, bnon.f131923a, new nkx());
    }

    public final void onDestroy() {
        this.f29305a.mo20989a();
        this.f29305a = null;
        this.f29306b = null;
    }
}
