package p000;

import java.util.Arrays;

/* renamed from: bfbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfbd {

    /* renamed from: a */
    public final double f113288a;

    /* renamed from: b */
    public final double f113289b;

    /* renamed from: c */
    public final double f113290c;

    private bfbd(double d, double d2, double d3) {
        this.f113288a = d;
        this.f113289b = d2;
        this.f113290c = d3;
    }

    /* renamed from: a */
    public static bfbd m96295a(double d, double d2, double d3) {
        return new bfbd(d, d2, d3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bfbd bfbd = (bfbd) obj;
            return Double.compare(bfbd.f113288a, this.f113288a) == 0 && Double.compare(bfbd.f113289b, this.f113289b) == 0 && Double.compare(bfbd.f113290c, this.f113290c) == 0;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new double[]{this.f113288a, this.f113289b, this.f113290c});
    }
}
