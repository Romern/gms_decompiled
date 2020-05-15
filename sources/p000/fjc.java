package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fjc implements ThreadFactory {

    /* renamed from: a */
    private static final AtomicInteger f16705a = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = f16705a.incrementAndGet();
        StringBuilder sb = new StringBuilder(23);
        sb.append("measurement-");
        sb.append(incrementAndGet);
        return new fjd(runnable, sb.toString());
    }
}
