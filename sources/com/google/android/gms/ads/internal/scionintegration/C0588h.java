package com.google.android.gms.ads.internal.scionintegration;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.ads.internal.scionintegration.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0588h implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f8881a = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f8881a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
