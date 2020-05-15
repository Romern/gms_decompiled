package com.google.android.gms.analytics;

import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraAnalyticsTaskService extends aeah implements fod {

    /* renamed from: a */
    private foe f9485a;

    /* renamed from: b */
    private final foe m6111b() {
        if (this.f9485a == null) {
            this.f9485a = new foe(this);
        }
        return this.f9485a;
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        String str = aecc.f63128a;
        if (str.hashCode() == 563533826 && str.equals("Analytics.AnalyticsTaskService.UPLOAD_TASK_TAG")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            return 2;
        }
        fnt a = fkm.m11883a(this).mo10957a();
        a.mo10933d("Device ChimeraAnalyticsTaskService called.");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (atomicBoolean) {
            m6111b().mo11057a(new fim(a, atomicBoolean));
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long j = 30000 + currentTimeMillis;
                while (!atomicBoolean.get() && currentTimeMillis < j) {
                    atomicBoolean.wait(j - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            } catch (InterruptedException e) {
                a.mo10934d("Interrupted while uploading from task", e);
                return 0;
            }
        }
        return 0;
    }

    public final void onCreate() {
        super.onCreate();
        m6111b().mo11056a();
    }

    public final void onDestroy() {
        m6111b().mo11058b();
        super.onDestroy();
    }

    public final boolean onUnbind(Intent intent) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo7136a(int i) {
        throw new UnsupportedOperationException();
    }
}
