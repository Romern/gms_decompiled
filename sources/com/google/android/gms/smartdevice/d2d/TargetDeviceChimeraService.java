package com.google.android.gms.smartdevice.d2d;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TargetDeviceChimeraService extends Service {

    /* renamed from: a */
    public static arah f107945a = arah.f87196a;

    /* renamed from: b */
    public static armb f107946b = armb.f87877a;

    /* renamed from: e */
    public static final /* synthetic */ int f107947e = 0;

    /* renamed from: f */
    private static final sek f107948f = ascp.m73787a("D2D", "TargetDeviceChimeraService");

    /* renamed from: c */
    public Handler f107949c;

    /* renamed from: d */
    public LifecycleSynchronizer f107950d;

    /* renamed from: g */
    private aren f107951g;

    public final IBinder onBind(Intent intent) {
        f107948f.mo25409a("onBind()", new Object[0]);
        if ("com.google.android.gms.smartdevice.d2d.TargetDeviceService.START".equals(intent.getAction())) {
            return this.f107951g;
        }
        return null;
    }

    public final void onCreate() {
        f107948f.mo25409a("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.f107950d = new LifecycleSynchronizer(this);
        this.f107949c = new adzt(handlerThread.getLooper());
        this.f107951g = new aren(this);
    }

    public final void onDestroy() {
        f107948f.mo25409a("onDestroy()", new Object[0]);
        arge arge = this.f107951g.f87536a;
        if (arge != null) {
            arge.mo48500b();
        }
        asca.m73765a(this.f107949c);
        super.onDestroy();
    }
}
