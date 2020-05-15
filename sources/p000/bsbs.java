package p000;

import java.util.Arrays;

/* renamed from: bsbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsbs {

    /* renamed from: a */
    public final int f144005a;

    /* renamed from: b */
    public final int f144006b;

    public bsbs(int i, int i2) {
        this.f144005a = i;
        this.f144006b = i2;
    }

    /* renamed from: a */
    public static bsbs m115125a(bsbs bsbs, double d, double d2) {
        return new bsbs(bsbs.mo70228a(d2), bsbs.mo70230b(d));
    }

    /* renamed from: a */
    public final int mo70228a(double d) {
        return this.f144005a + ayuo.m84844a(ayuo.m84855e(d));
    }

    /* renamed from: b */
    public final double mo70229b(int i) {
        return ayuo.m84840a(ayuo.m84842a(i - this.f144006b), ayuo.m84842a(this.f144005a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bsbs) {
            bsbs bsbs = (bsbs) obj;
            return this.f144005a == bsbs.f144005a && this.f144006b == bsbs.f144006b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f144005a), Integer.valueOf(this.f144006b)});
    }

    public final String toString() {
        int i = this.f144005a;
        int i2 = this.f144006b;
        StringBuilder sb = new StringBuilder(66);
        sb.append("EquirectangularProjection latE7 = ");
        sb.append(i);
        sb.append(", lngE7 = ");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final double mo70226a(double d, double d2) {
        return Math.abs(d - ((Math.cos(ayuo.m84842a(mo70228a(d2))) / Math.cos(ayuo.m84842a(this.f144005a))) * d));
    }

    /* renamed from: b */
    public final int mo70230b(double d) {
        return this.f144006b + ayuo.m84844a(ayuo.m84845b(d, ayuo.m84842a(this.f144005a)));
    }

    /* renamed from: a */
    public final double mo70227a(int i) {
        return ayuo.m84852c(i - this.f144005a);
    }
}
