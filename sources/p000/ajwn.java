package p000;

import java.util.Locale;

/* renamed from: ajwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajwn {

    /* renamed from: a */
    public final int f71431a = ((int) cfop.m141881k());

    /* renamed from: b */
    public final int f71432b = ((int) cfop.m141880j());

    /* renamed from: c */
    public long f71433c;

    /* renamed from: d */
    public double f71434d = 0.0d;

    /* renamed from: e */
    public double f71435e = 0.0d;

    /* renamed from: f */
    public boolean f71436f = true;

    public final String toString() {
        return String.format(Locale.US, "WeightedAverage<lastValue: %s, smoothedValue: %s>", Double.valueOf(this.f71434d), Double.valueOf(this.f71435e));
    }
}
