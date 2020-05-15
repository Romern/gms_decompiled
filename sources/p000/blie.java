package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: blie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blie {

    /* renamed from: a */
    public final blib f126603a;

    /* renamed from: b */
    public final AtomicLong f126604b = new AtomicLong(m107192a(Integer.MIN_VALUE, Integer.MIN_VALUE));

    /* renamed from: c */
    public final AtomicReference f126605c = new AtomicReference(null);

    /* renamed from: d */
    public final bqgy f126606d = bqgy.m112818c();

    /* renamed from: e */
    private final AtomicReference f126607e = new AtomicReference(null);

    /* renamed from: f */
    private final Executor f126608f = bqgs.m112813a(bqfb.INSTANCE);

    public blie(bqeg bqeg, Executor executor) {
        blib blib = new blib(bqeg, executor);
        this.f126603a = blib;
        this.f126606d.mo741a(blib, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public static int m107191a(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: a */
    public static long m107192a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* renamed from: a */
    public final bqgg mo66570a() {
        long j;
        int a;
        bqgg bqgg;
        if (this.f126606d.isDone()) {
            return this.f126606d;
        }
        do {
            j = this.f126604b.get();
            a = m107191a(j);
        } while (!this.f126604b.compareAndSet(j, m107192a(a, ((int) j) + 1)));
        bqgy c = bqgy.m112818c();
        bqgg bqgg2 = (bqgg) this.f126607e.getAndSet(c);
        if (bqgg2 == null) {
            bqgg = bqga.m112771a(bljx.m107265a(new blhz(this, a)), bqfb.INSTANCE);
        } else {
            bqgg = bqdf.m112620a(bqgg2, Throwable.class, bljx.m107266a(new blia(this, a)), this.f126608f);
        }
        c.mo69137b(bqgg);
        blic blic = new blic(this, a);
        c.mo741a(new blhy(this, c, blic), bqfb.INSTANCE);
        return blic;
    }

    /* renamed from: a */
    public final bqgg mo66571a(int i) {
        blid blid;
        if (m107191a(this.f126604b.get()) > i) {
            return bqga.m112770a();
        }
        blid blid2 = new blid(i);
        do {
            blid = (blid) this.f126605c.get();
            if (blid != null && blid.f126602a > i) {
                return bqga.m112770a();
            }
        } while (!this.f126605c.compareAndSet(blid, blid2));
        if (m107191a(this.f126604b.get()) > i) {
            blid2.cancel(true);
            this.f126605c.compareAndSet(blid2, null);
            return blid2;
        }
        blib blib = this.f126603a;
        bqeg bqeg = blib.f126598a;
        Executor executor = blib.f126599b;
        if (bqeg == null || executor == null) {
            blid2.mo69137b((bqgg) this.f126606d);
        } else {
            blid2.mo69137b(bqga.m112771a(bljx.m107265a(bqeg), executor));
        }
        return blid2;
    }
}
