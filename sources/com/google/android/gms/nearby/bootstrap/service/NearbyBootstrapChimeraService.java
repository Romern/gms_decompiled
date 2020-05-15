package com.google.android.gms.nearby.bootstrap.service;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbyBootstrapChimeraService extends Service {

    /* renamed from: a */
    public static final bnsp f80439a = bnsp.m110328a("NearbyBootstrap");

    /* renamed from: b */
    public ahfe f80440b;

    /* renamed from: c */
    public Handler f80441c;

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START".equals(intent.getAction())) {
            return new ahet(this);
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("NearbyBootstrapBackground", 10);
        handlerThread.start();
        this.f80441c = new adzt(handlerThread.getLooper());
    }

    public final void onDestroy() {
        ahfe ahfe = this.f80440b;
        if (ahfe != null) {
            ahct ahct = ahfe.f67102b;
            if (ahct != null) {
                ahct.mo36315a(null);
            }
            skh.m35531a().mo25689a(ahfe.f67103c, ahfe.f67105e);
            ahfe.f67102b = null;
            this.f80440b = null;
        }
        Looper looper = this.f80441c.getLooper();
        if (looper != null) {
            looper.quit();
        }
        super.onDestroy();
    }
}
