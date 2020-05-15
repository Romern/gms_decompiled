package com.google.android.gms.analytics;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ChimeraAnalyticsService extends Service implements fod {

    /* renamed from: a */
    private foe f9484a;

    /* renamed from: a */
    private final foe m6109a() {
        if (this.f9484a == null) {
            this.f9484a = new foe(this);
        }
        return this.f9484a;
    }

    public final IBinder onBind(Intent intent) {
        m6109a();
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        m6109a().mo11056a();
    }

    public final void onDestroy() {
        m6109a().mo11058b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        foe a = m6109a();
        try {
            synchronized (foa.f16995a) {
                asfb asfb = foa.f16996b;
                if (asfb != null && asfb.mo49124e()) {
                    asfb.mo49120c();
                }
            }
        } catch (SecurityException e) {
        }
        fnt a2 = fkm.m11883a(a.f17005b).mo10957a();
        if (intent == null) {
            a2.mo10940f("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a2.mo10927a("Device AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            return 2;
        }
        a.mo11057a(new fob(a, i2, a2));
        return 2;
    }

    /* renamed from: a */
    public final boolean mo7136a(int i) {
        return stopSelfResult(i);
    }
}
