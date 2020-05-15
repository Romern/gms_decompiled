package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppMeasurementService extends Service implements aglr {

    /* renamed from: a */
    private agls f80087a;

    /* renamed from: a */
    private final agls m67253a() {
        if (this.f80087a == null) {
            this.f80087a = new agls(this);
        }
        return this.f80087a;
    }

    public final IBinder onBind(Intent intent) {
        return m67253a().mo35634a(intent);
    }

    public final void onCreate() {
        super.onCreate();
        m67253a().mo35635a();
    }

    public final void onDestroy() {
        m67253a().mo35638b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m67253a().mo35639b(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        m67253a().mo35636a(intent, i2);
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        m67253a().mo35641c(intent);
        return true;
    }

    /* renamed from: a */
    public final void mo35631a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo35632a(Intent intent) {
        C1146ku.m18579a(intent);
    }

    /* renamed from: a */
    public final boolean mo35633a(int i) {
        return stopSelfResult(i);
    }
}
