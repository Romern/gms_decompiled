package com.google.android.gms.drive.api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApiChimeraService extends zzx {

    /* renamed from: a */
    private static final sbw f30755a = new sbw("ApiChimeraService", "");

    /* renamed from: b */
    private ubm f30756b;

    /* renamed from: k */
    private uqu f30757k;

    /* renamed from: l */
    private uaj f30758l;

    /* renamed from: m */
    private vcz f30759m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiChimeraService() {
        super(new int[]{11}, new String[]{"com.google.android.gms.drive.ApiService.START", "com.google.android.gms.drive.ApiService.STOP", "com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT"}, bnon.f131923a, 3, 9);
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m22936a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.drive.api.ApiService");
        intent.setAction("com.google.android.gms.drive.ApiService.STOP");
        context.startService(intent);
    }

    /* renamed from: b */
    public static void m22937b(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.drive.api.ApiService");
        context.startService(intent);
    }

    /* renamed from: c */
    public static void m22938c(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.drive.api.ApiService");
        intent.setAction("com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT");
        PendingIntent service = PendingIntent.getService(context, 0, intent, 0);
        new skc(context).mo25675a("ApiService", 2, ((Long) twy.f46863au.mo58455c()).longValue(), service, "com.google.android.gms");
    }

    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT".equals(action)) {
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                uqu uqu = this.f30757k;
                uhn uhn = uqu.f48561b;
                ((ugx) uhn).f47578a.mo27465a(umv.f48267a, umu.LAST_UPDATE_TIME.f48266i.mo27703a(currentTimeMillis - elapsedRealtime));
                uqu.mo27886a();
            }
            if (("com.google.android.gms.drive.ApiService.STOP".equals(action) || "com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT".equals(action)) && !this.f30758l.mo27004e()) {
                return null;
            }
        }
        return super.onBind(intent);
    }

    public final void onCreate() {
        tws.m37568a(this);
        vpu a = vpu.m41034a();
        this.f30756b = new ubm(a.f49766m, a.f49758e);
        this.f30758l = a.f49759f;
        this.f30757k = a.f49765l;
        sqv sqv = a.f49747F;
        this.f30759m = a.f49777x;
    }

    public final void onDestroy() {
        if (vav.m39898a()) {
            vav.m39900c().mo28182d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        String string = getServiceRequest2.f30233g.getString("proxy_package_name");
        int i = getServiceRequest2.f30233g.getInt("proxy_type", 0);
        boolean z = getServiceRequest2.f30233g.getBoolean("bypass_initial_sync", false);
        String string2 = getServiceRequest2.f30233g.getString("method_trace_filename");
        vcy c = this.f30759m.mo28312c();
        c.mo28308i();
        c.mo28300c(4, 44);
        try {
            aaag aaag = new aaag(this, this.f56354e, this.f56355f);
            aaag.mo16658a(new ucs(this, aaag, this.f30756b, Binder.getCallingUid(), getServiceRequest2.f30230d, string, getServiceRequest2.f30234h, getServiceRequest.mo17822a(), stc.m36284a(getServiceRequest2.f30232f), aaac, getServiceRequest2.f30229c, c, i, z, string2));
        } catch (ucr e) {
            f30755a.mo25378c("ApiChimeraService", "Connection failed", e);
        }
    }
}
