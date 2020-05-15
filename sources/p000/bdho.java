package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bdho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdho implements ThreadFactory {

    /* renamed from: a */
    public final int f105665a;

    /* renamed from: b */
    private final AtomicInteger f105666b = new AtomicInteger(1);

    /* renamed from: c */
    private final String f105667c;

    public bdho(String str, int i) {
        this.f105665a = i;
        this.f105667c = str;
    }

    public final Thread newThread(Runnable runnable) {
        bdhn bdhn = new bdhn(this, runnable);
        String str = this.f105667c;
        int andIncrement = this.f105666b.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(str);
        sb.append("-");
        sb.append(andIncrement);
        Thread thread = new Thread(bdhn, sb.toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
