package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: sod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sod implements adzj {
    /* renamed from: a */
    static int m35739a(int i) {
        return i + -1 != 0 ? 9 : 10;
    }

    /* renamed from: b */
    public final ExecutorService mo25879b(int i) {
        return snp.m35704b(m35739a(i));
    }

    /* renamed from: c */
    public final ExecutorService mo25880c(int i) {
        return sne.m35694a(i, m35739a(2));
    }

    /* renamed from: a */
    public final ExecutorService mo25874a() {
        return snp.m35702a(m35739a(2));
    }

    /* renamed from: a */
    public final ExecutorService mo25875a(int i, ThreadFactory threadFactory) {
        return mo25880c(2);
    }

    /* renamed from: a */
    public final ExecutorService mo25876a(ThreadFactory threadFactory) {
        return mo25879b(2);
    }

    /* renamed from: a */
    public final ScheduledExecutorService mo25877a(int i, int i2) {
        return snp.m35703a(i, m35739a(i2));
    }

    /* renamed from: a */
    public final ScheduledExecutorService mo25878a(ThreadFactory threadFactory, int i) {
        return mo25877a(1, i);
    }
}
