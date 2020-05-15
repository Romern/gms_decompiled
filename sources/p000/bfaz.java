package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: bfaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfaz {

    /* renamed from: a */
    public final double f113282a;

    /* renamed from: b */
    public final double f113283b;

    /* renamed from: c */
    public final double f113284c;

    public bfaz(double d, double d2, double d3) {
        this.f113282a = d;
        this.f113283b = d2;
        this.f113284c = d3;
    }

    /* renamed from: a */
    public final double[] mo61350a() {
        return new double[]{this.f113282a, this.f113283b, this.f113284c};
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfaz) {
            bfaz bfaz = (bfaz) obj;
            return this.f113282a == bfaz.f113282a && this.f113283b == bfaz.f113283b && this.f113284c == bfaz.f113284c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f113282a), Double.valueOf(this.f113283b), Double.valueOf(this.f113284c)});
    }

    public final String toString() {
        return String.format(Locale.US, "%.3f,%.3f,%.3f", Double.valueOf(this.f113282a), Double.valueOf(this.f113283b), Double.valueOf(this.f113284c));
    }
}
