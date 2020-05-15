package p000;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: sbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbc {

    /* renamed from: a */
    public final Object f43981a = new Object();

    /* renamed from: b */
    public HashMap f43982b;

    /* renamed from: c */
    public HashMap f43983c;

    /* renamed from: d */
    private final C1231nx f43984d;

    /* renamed from: e */
    private final long f43985e;

    /* renamed from: f */
    private final long f43986f;

    public sbc(int i, long j, long j2, TimeUnit timeUnit) {
        this.f43985e = TimeUnit.NANOSECONDS.convert(j, timeUnit);
        this.f43986f = TimeUnit.NANOSECONDS.convert(j2, timeUnit);
        boolean z = true;
        if (!mo25328b() && !mo25329c()) {
            z = false;
        }
        sdo.m34975b(z, "ExpirableLruCache has both access and write expiration negative");
        this.f43984d = new sbb(this, i);
        if (mo25328b()) {
            this.f43982b = new HashMap();
        }
        if (mo25329c()) {
            this.f43983c = new HashMap();
        }
    }

    /* renamed from: a */
    public final Object mo25325a(Object obj) {
        Object a;
        synchronized (this.f43981a) {
            long nanoTime = System.nanoTime();
            if (!mo25328b() || !this.f43982b.containsKey(obj) || nanoTime - ((Long) this.f43982b.get(obj)).longValue() <= this.f43985e) {
                if (mo25329c() && this.f43983c.containsKey(obj)) {
                    if (nanoTime - ((Long) this.f43983c.get(obj)).longValue() <= this.f43986f) {
                    }
                }
                a = this.f43984d.mo15546a(obj);
                if (a != null && this.f43985e > 0) {
                    this.f43982b.put(obj, Long.valueOf(System.nanoTime()));
                }
            }
            this.f43984d.mo15552b(obj);
            a = this.f43984d.mo15546a(obj);
            this.f43982b.put(obj, Long.valueOf(System.nanoTime()));
        }
        return a;
    }

    /* renamed from: b */
    public final boolean mo25328b() {
        return this.f43985e >= 0;
    }

    /* renamed from: c */
    public final boolean mo25329c() {
        return this.f43986f >= 0;
    }

    /* renamed from: a */
    public final void mo25326a() {
        this.f43984d.mo15548a();
    }

    /* renamed from: a */
    public final void mo25327a(Object obj, Object obj2) {
        if (mo25329c()) {
            long nanoTime = System.nanoTime();
            synchronized (this.f43981a) {
                this.f43983c.put(obj, Long.valueOf(nanoTime));
            }
        }
        this.f43984d.mo15547a(obj, obj2);
    }
}
