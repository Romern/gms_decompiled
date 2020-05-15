package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0922d implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f12487a = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f12487a.getAndIncrement())));
        return thread;
    }
}
