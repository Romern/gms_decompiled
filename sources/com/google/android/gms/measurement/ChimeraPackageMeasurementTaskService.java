package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraPackageMeasurementTaskService extends aeah implements aglr {

    /* renamed from: a */
    private agls f80090a;

    /* renamed from: b */
    private final agls m67262b() {
        if (this.f80090a == null) {
            this.f80090a = new agls(this);
        }
        return this.f80090a;
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        String str = aecc.f63128a;
        if (str.hashCode() == 1395561816 && str.equals("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            return 2;
        }
        agje a = agje.m54353a(this);
        agid E = a.mo35497E();
        if (a.f65690f.f65291a) {
            E.f65572k.mo35435a("Device ChimeraPackageMeasurementTaskService called.");
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            synchronized (atomicBoolean) {
                m67262b().mo35637a(new agcn(a, E, atomicBoolean));
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = 30000 + currentTimeMillis;
                    while (!atomicBoolean.get() && currentTimeMillis < j) {
                        atomicBoolean.wait(j - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                } catch (InterruptedException e) {
                    E.f65567f.mo35435a("Interrupted in onRunTask while uploading");
                    return 0;
                }
            }
            return 0;
        }
        E.f65564c.mo35435a("TaskService called on client side.");
        return 2;
    }

    public final void onCreate() {
        super.onCreate();
        m67262b().mo35635a();
    }

    public final void onDestroy() {
        m67262b().mo35638b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m67262b().mo35639b(intent);
    }

    public final boolean onUnbind(Intent intent) {
        m67262b().mo35641c(intent);
        return super.onUnbind(intent);
    }

    /* renamed from: a */
    public final void mo35631a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo35632a(Intent intent) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo35633a(int i) {
        throw new UnsupportedOperationException();
    }
}
