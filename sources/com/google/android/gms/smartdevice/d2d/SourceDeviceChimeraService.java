package com.google.android.gms.smartdevice.d2d;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SourceDeviceChimeraService extends Service {

    /* renamed from: a */
    public static final arah f107924a = arah.f87196a;

    /* renamed from: b */
    public static final armb f107925b = armb.f87877a;

    /* renamed from: e */
    private static final sek f107926e = ascp.m73787a("D2D", "SourceDeviceChimeraService");

    /* renamed from: c */
    public Handler f107927c;

    /* renamed from: d */
    public LifecycleSynchronizer f107928d;

    /* renamed from: f */
    private araz f107929f;

    public final IBinder onBind(Intent intent) {
        f107926e.mo25409a("onBind()", new Object[0]);
        if ("com.google.android.gms.smartdevice.d2d.SourceDeviceService.START".equals(intent.getAction())) {
            return this.f107929f;
        }
        return null;
    }

    public final void onCreate() {
        f107926e.mo25409a("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("SourceDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.f107927c = new adzt(handlerThread.getLooper());
        this.f107929f = new araz(this);
        this.f107928d = new LifecycleSynchronizer(this);
    }

    public final void onDestroy() {
        f107926e.mo25409a("onDestroy()", new Object[0]);
        arda arda = this.f107929f.f87257a;
        if (arda != null) {
            arda.mo48419c();
        }
        asct.m73795a();
        asca.m73765a(this.f107927c);
        super.onDestroy();
    }
}
