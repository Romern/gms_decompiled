package p000;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: yhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yhe {

    /* renamed from: a */
    public static final yhe f53818a;

    /* renamed from: d */
    private static final long f53819d = TimeUnit.MILLISECONDS.toNanos(TimeUnit.NANOSECONDS.toMillis(Long.MAX_VALUE));

    /* renamed from: b */
    public final int f53820b;

    /* renamed from: c */
    public final int f53821c;

    /* renamed from: e */
    private final yfv f53822e;

    static {
        yhd a = m44086a();
        a.mo30492b(Long.MAX_VALUE);
        a.mo30491a(Long.MIN_VALUE);
        a.f53814c = -1;
        a.f53815d = 0;
        f53818a = a.mo30490a();
    }

    public yhe(yhd yhd) {
        this.f53822e = yfv.m44005a(Math.min(yhd.f53812a, f53819d), Math.min(yhd.f53813b, f53819d));
        this.f53820b = yhd.f53814c;
        this.f53821c = yhd.f53815d;
    }

    /* renamed from: a */
    public static yhd m44086a() {
        return new yhd();
    }

    /* renamed from: b */
    public final long mo30494b() {
        return ((yfw) this.f53822e).f53737a;
    }

    /* renamed from: c */
    public final long mo30495c() {
        return ((yfw) this.f53822e).f53738b;
    }

    /* renamed from: d */
    public final boolean mo30496d() {
        return this.f53820b >= 0;
    }

    /* renamed from: e */
    public final boolean mo30497e() {
        return this.f53821c != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yhe) {
            yhe yhe = (yhe) obj;
            return this.f53822e.equals(yhe.f53822e) && this.f53821c == yhe.f53821c && this.f53820b == yhe.f53820b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53822e, Integer.valueOf(this.f53821c), Integer.valueOf(this.f53820b)});
    }

    public final String toString() {
        return String.format("[%s-%s, limit: %s, readBehind: %s]", Long.valueOf(mo30494b()), Long.valueOf(mo30495c()), Integer.valueOf(this.f53820b), Integer.valueOf(this.f53821c));
    }

    /* renamed from: a */
    public final yhe mo30493a(yhe yhe) {
        boolean z;
        if (this == f53818a) {
            return yhe;
        }
        if (mo30496d() == yhe.mo30496d()) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108597a(z, "Can't extend a query with limit mismatch %s %s", this, yhe);
        yhd a = m44086a();
        a.mo30492b(Math.min(mo30494b(), yhe.mo30494b()));
        a.mo30491a(Math.max(mo30495c(), yhe.mo30495c()));
        a.f53814c = Math.max(this.f53820b, yhe.f53820b);
        a.f53815d = Math.max(this.f53821c, yhe.f53821c);
        return a.mo30490a();
    }
}
