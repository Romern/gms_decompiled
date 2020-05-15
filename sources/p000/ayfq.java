package p000;

import android.util.Log;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ayfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfq implements ThreadFactory {

    /* renamed from: a */
    public final String f97491a;

    /* renamed from: b */
    private final String f97492b;

    /* renamed from: c */
    private final AtomicInteger f97493c;

    public ayfq(String str, String str2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f97493c = atomicInteger;
        this.f97491a = str;
        this.f97492b = str2;
        atomicInteger.set(0);
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f97492b;
        int incrementAndGet = this.f97493c.incrementAndGet();
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(str);
        sb.append("-");
        sb.append(incrementAndGet);
        ayfp ayfp = new ayfp(runnable, sb.toString());
        ayfp.setUncaughtExceptionHandler(new ayfo(this));
        if (Log.isLoggable(this.f97491a, 2)) {
            String str2 = this.f97491a;
            String name = ayfp.getName();
            long id = ayfp.getId();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 42);
            sb2.append("[");
            sb2.append(name);
            sb2.append("] created new thread ");
            sb2.append(id);
            Log.v(str2, sb2.toString());
        }
        return ayfp;
    }
}
