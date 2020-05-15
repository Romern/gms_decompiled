package com.google.android.gms.ads.internal.util.future;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.C0641f;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.ads.internal.util.future.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0643b implements Executor {

    /* renamed from: a */
    private final Handler f8971a = new C0641f(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                C0387d.m5363a().mo6855a(C0387d.m5366d().f8896b, th);
                throw th;
            }
        } else {
            this.f8971a.post(runnable);
        }
    }
}
