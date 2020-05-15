package p000;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bqha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqha {

    /* renamed from: a */
    private String f140652a = null;

    /* renamed from: b */
    private Boolean f140653b = null;

    /* renamed from: c */
    private ThreadFactory f140654c = null;

    /* renamed from: a */
    public static String m112819a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: a */
    public static ThreadFactory m112820a(bqha bqha) {
        String str = bqha.f140652a;
        Boolean bool = bqha.f140653b;
        ThreadFactory threadFactory = bqha.f140654c;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new bqgz(threadFactory, str, str != null ? new AtomicLong(0) : null, bool);
    }

    /* renamed from: a */
    public final void mo69261a() {
        this.f140653b = true;
    }

    /* renamed from: a */
    public final void mo69262a(String str) {
        m112819a(str, 0);
        this.f140652a = str;
    }

    /* renamed from: a */
    public final void mo69263a(ThreadFactory threadFactory) {
        bmxy.m108581a(threadFactory);
        this.f140654c = threadFactory;
    }
}
