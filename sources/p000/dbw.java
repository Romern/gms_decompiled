package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dbw implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f12754a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f12755b = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f12754a.newThread(runnable);
        int andIncrement = this.f12755b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
