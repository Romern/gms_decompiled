package com.google.android.gms.analytics.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraAnalyticsService extends Service {

    /* renamed from: a */
    public fkm f9490a;

    /* renamed from: b */
    public fnz f9491b;

    /* renamed from: a */
    public final fnt mo7141a() {
        return this.f9490a.mo10957a();
    }

    /* renamed from: b */
    public final fkh mo7142b() {
        return this.f9490a.mo10959c();
    }

    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            mo7141a().mo10926a("onBind called. action", action);
            if ("com.google.android.gms.analytics.service.START".equals(action)) {
                return new fnn(this);
            }
            return null;
        }
        mo7141a().mo10942g("onBind called with null intent");
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f9491b = fnz.m12060a(this);
        this.f9490a = fkm.m11883a(this);
        mo7141a().mo10933d("AnalyticsService created");
    }

    public final void onDestroy() {
        mo7141a().mo10933d("AnalyticsService destroyed");
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        if (intent != null) {
            mo7141a().mo10926a("onRebind called. action", intent.getAction());
            return;
        }
        mo7141a().mo10942g("onRebind called with null intent");
    }

    public final boolean onUnbind(Intent intent) {
        if (intent != null) {
            mo7141a().mo10926a("onUnbind called for intent. action", intent.getAction());
            return true;
        }
        mo7141a().mo10942g("onUnbind called with null intent");
        return true;
    }
}
