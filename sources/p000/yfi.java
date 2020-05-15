package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yfi implements yhg {

    /* renamed from: a */
    public final cadz f53724a;

    public yfi(cadz cadz) {
        this.f53724a = cadz;
    }

    /* renamed from: a */
    public final long mo30385a() {
        return TimeUnit.MILLISECONDS.toNanos(this.f53724a.f172779e);
    }

    /* renamed from: a */
    public final long mo30386a(TimeUnit timeUnit) {
        return yhf.m44093a(this, timeUnit);
    }

    /* renamed from: b */
    public final long mo30387b() {
        return TimeUnit.MILLISECONDS.toNanos(this.f53724a.f172780f);
    }

    /* renamed from: b */
    public final long mo30388b(TimeUnit timeUnit) {
        return yhf.m44095b(this, timeUnit);
    }

    /* renamed from: c */
    public final long mo30389c() {
        return yhf.m44092a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof yfi) && this.f53724a.equals(((yfi) obj).f53724a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        cadz cadz = this.f53724a;
        int i = cadz.f164758ag;
        if (i != 0) {
            return i;
        }
        int a = bxxm.f165037a.mo74228a(cadz).mo74216a(cadz);
        cadz.f164758ag = a;
        return a;
    }
}
