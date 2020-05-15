package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bwas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwas implements ThreadFactory {

    /* renamed from: a */
    private final String f158674a;

    /* renamed from: b */
    private final AtomicInteger f158675b = new AtomicInteger(0);

    public bwas(String str) {
        this.f158674a = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f158674a;
        int incrementAndGet = this.f158675b.incrementAndGet();
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(str);
        sb.append("-");
        sb.append(incrementAndGet);
        return new Thread(runnable, sb.toString());
    }
}
