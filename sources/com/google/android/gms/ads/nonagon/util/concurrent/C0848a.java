package com.google.android.gms.ads.nonagon.util.concurrent;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.ads.nonagon.util.concurrent.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0848a implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f9353a = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f9353a.getAndIncrement();
        StringBuilder sb = new StringBuilder(25);
        sb.append("AdWorker(NG) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
