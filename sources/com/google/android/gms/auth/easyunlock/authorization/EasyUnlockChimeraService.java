package com.google.android.gms.auth.easyunlock.authorization;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EasyUnlockChimeraService extends Service {

    /* renamed from: b */
    public static final sek f10563b = new sek(new String[]{"EasyUnlockService"}, (char[]) null);

    /* renamed from: c */
    private static iuy f10564c;

    /* renamed from: a */
    public rrs f10565a;

    /* renamed from: d */
    private ExecutorService f10566d;

    /* renamed from: e */
    private Future f10567e;

    public EasyUnlockChimeraService() {
    }

    /* renamed from: a */
    public static Intent m6556a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.easyunlock.authorization.InitializerIntentService");
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        this.f10565a = rrs.m34317a();
        this.f10566d = snp.m35704b(10);
    }

    public final void onDestroy() {
        f10563b.mo25412b("EasyUnlockService destroyed...", new Object[0]);
        Future future = this.f10567e;
        if (future != null) {
            future.cancel(false);
            this.f10567e = null;
        }
        iuy a = m6557a();
        if (a != null) {
            a.mo13352c();
            m6558a((iuy) null);
        }
        this.f10566d.shutdown();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        f10563b.mo25412b("Handling intent for EasyUnlockChimeraService.", new Object[0]);
        Future future = this.f10567e;
        if (future == null || future.isDone()) {
            this.f10567e = this.f10566d.submit(new iuw(this));
            return 1;
        }
        f10563b.mo25412b("Initialization in progress...", new Object[0]);
        return 1;
    }

    EasyUnlockChimeraService(iul iul, rrs rrs, iux iux, ExecutorService executorService) {
        this.f10565a = rrs;
        this.f10566d = executorService;
    }

    /* renamed from: a */
    public static iuy m6557a() {
        iuy iuy;
        synchronized (EasyUnlockChimeraService.class) {
            iuy = f10564c;
        }
        return iuy;
    }

    /* renamed from: a */
    public static void m6558a(iuy iuy) {
        synchronized (EasyUnlockChimeraService.class) {
            f10564c = iuy;
        }
    }
}
