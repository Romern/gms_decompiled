package p000;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ygw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ygw {

    /* renamed from: a */
    public final long f53781a;

    /* renamed from: b */
    public final boolean f53782b;

    /* renamed from: c */
    public final AtomicLong f53783c;

    /* renamed from: d */
    public final AtomicLong f53784d;

    /* renamed from: e */
    public final long f53785e;

    public ygw(long j, boolean z, long j2, long j3, long j4) {
        this.f53781a = j;
        this.f53782b = z;
        this.f53783c = new AtomicLong(j2);
        this.f53784d = new AtomicLong(j3);
        this.f53785e = j4;
    }

    /* renamed from: a */
    public final long mo30468a() {
        return this.f53783c.get();
    }

    /* renamed from: b */
    public final long mo30469b() {
        return this.f53784d.get();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ygw)) {
                return false;
            }
            ygw ygw = (ygw) obj;
            if (!(this.f53781a == ygw.f53781a && this.f53782b == ygw.f53782b && this.f53783c.get() == ygw.f53783c.get() && this.f53784d.get() == ygw.f53784d.get() && this.f53785e == ygw.f53785e)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (int) this.f53781a;
    }

    public final String toString() {
        return String.format("DataSourceStats{id=%s, isRemote=%s, minEnd=%s, maxEnd=%s, minContiguousTime=%s}", Long.valueOf(this.f53781a), Boolean.valueOf(this.f53782b), this.f53783c, this.f53784d, Long.valueOf(this.f53785e));
    }
}
