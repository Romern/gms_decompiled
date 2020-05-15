package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.chimera.WakefulBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ChimeraPackageMeasurementService extends Service implements aglr {

    /* renamed from: a */
    private agls f80089a;

    /* renamed from: a */
    private final agls m67258a() {
        if (this.f80089a == null) {
            this.f80089a = new agls(this);
        }
        return this.f80089a;
    }

    public final IBinder onBind(Intent intent) {
        return m67258a().mo35634a(intent);
    }

    public final void onCreate() {
        super.onCreate();
        m67258a().mo35635a();
    }

    public final void onDestroy() {
        m67258a().mo35638b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m67258a().mo35639b(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        m67258a().mo35636a(intent, i2);
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        m67258a().mo35641c(intent);
        return true;
    }

    /* renamed from: a */
    public final void mo35631a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo35632a(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    /* renamed from: a */
    public final boolean mo35633a(int i) {
        return stopSelfResult(i);
    }
}
