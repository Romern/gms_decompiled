package com.google.android.gms.ads.internal.util.future;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.ads.internal.util.future.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0642a implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ String f8969a;

    /* renamed from: b */
    private final AtomicInteger f8970b = new AtomicInteger(1);

    public C0642a(String str) {
        this.f8969a = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f8969a;
        int andIncrement = this.f8970b.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
