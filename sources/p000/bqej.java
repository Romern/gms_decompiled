package p000;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bqej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqej implements Serializable {

    /* renamed from: a */
    private final ConcurrentHashMap f140545a;

    private bqej(ConcurrentHashMap concurrentHashMap) {
        bmxy.m108581a(concurrentHashMap);
        this.f140545a = concurrentHashMap;
    }

    /* renamed from: a */
    public static bqej m112702a() {
        return new bqej(new ConcurrentHashMap());
    }

    /* renamed from: b */
    public final long mo69172b(Object obj) {
        return mo69171a(obj, -1);
    }

    /* renamed from: c */
    public final void mo69174c(Object obj) {
        mo69171a(obj, 1);
    }

    /* renamed from: d */
    public final void mo69175d(Object obj) {
        long j;
        AtomicLong atomicLong = (AtomicLong) this.f140545a.get(obj);
        if (atomicLong != null) {
            do {
                j = atomicLong.get();
                if (j == 0) {
                    break;
                }
            } while (!atomicLong.compareAndSet(j, 0));
            this.f140545a.remove(obj, atomicLong);
        }
    }

    public final String toString() {
        return this.f140545a.toString();
    }

    /* renamed from: a */
    public final long mo69170a(Object obj) {
        AtomicLong atomicLong = (AtomicLong) this.f140545a.get(obj);
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo69173b() {
        return this.f140545a.isEmpty();
    }

    /* renamed from: a */
    public final long mo69171a(Object obj, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.f140545a.get(obj);
            if (atomicLong == null && (atomicLong = (AtomicLong) this.f140545a.putIfAbsent(obj, new AtomicLong(j))) == null) {
                return j;
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 != 0) {
                    long j3 = j2 + j;
                    if (atomicLong.compareAndSet(j2, j3)) {
                        return j3;
                    }
                }
            }
        } while (!this.f140545a.replace(obj, atomicLong, new AtomicLong(j)));
        return j;
    }
}
