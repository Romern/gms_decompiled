package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bqgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqgz implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ ThreadFactory f140648a;

    /* renamed from: b */
    final /* synthetic */ String f140649b;

    /* renamed from: c */
    final /* synthetic */ AtomicLong f140650c;

    /* renamed from: d */
    final /* synthetic */ Boolean f140651d;

    public bqgz(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f140648a = threadFactory;
        this.f140649b = str;
        this.f140650c = atomicLong;
        this.f140651d = bool;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f140648a.newThread(runnable);
        String str = this.f140649b;
        if (str != null) {
            newThread.setName(bqha.m112819a(str, Long.valueOf(this.f140650c.getAndIncrement())));
        }
        Boolean bool = this.f140651d;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        return newThread;
    }
}
