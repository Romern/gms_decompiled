package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: bezl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezl {

    /* renamed from: a */
    public final int f113155a;

    /* renamed from: b */
    public final int f113156b;

    /* renamed from: c */
    public final int f113157c;

    /* renamed from: d */
    private final bezn f113158d;

    /* renamed from: e */
    private final int f113159e;

    public bezl(bezn bezn, int i, int i2, int i3, int i4) {
        this.f113158d = bezn;
        this.f113155a = i;
        this.f113156b = i2;
        this.f113159e = i3;
        this.f113157c = i4;
    }

    /* renamed from: a */
    public static double m96167a(int i) {
        if (i <= 0 || i >= 29) {
            return 0.0d;
        }
        double d = (double) (2 << i);
        Double.isNaN(d);
        return 2097152.0d / d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bezl) {
            bezl bezl = (bezl) obj;
            return this.f113158d.equals(bezl.f113158d) && this.f113155a == bezl.f113155a && this.f113156b == bezl.f113156b && this.f113159e == bezl.f113159e && this.f113157c == bezl.f113157c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f113158d, Integer.valueOf(this.f113155a), Integer.valueOf(this.f113156b), Integer.valueOf(this.f113159e), Integer.valueOf(this.f113157c)});
    }

    public final String toString() {
        return String.format("%s%s:%s:%s:%s:%s", Integer.valueOf(this.f113158d.f113175a), this.f113158d.f113176b, Integer.valueOf(this.f113159e), Integer.valueOf(this.f113157c), Integer.valueOf(this.f113155a), Integer.valueOf(this.f113156b));
    }

    /* renamed from: a */
    public static Iterable m96168a(bezn bezn, bnwe bnwe, int i, int i2) {
        bnvk a = bezn.mo61299a(bnwe);
        double d = (double) i;
        double a2 = m96167a(i2);
        Double.isNaN(d);
        double d2 = d * a2;
        ArrayList arrayList = new ArrayList();
        int i3 = (int) (a.mo68528b().f132224a / d2);
        while (true) {
            double d3 = (double) i3;
            Double.isNaN(d3);
            if (d3 * d2 >= a.mo68529c().f132224a) {
                return arrayList;
            }
            int i4 = (int) (a.mo68528b().f132225b / d2);
            while (true) {
                double d4 = (double) i4;
                Double.isNaN(d4);
                if (d4 * d2 >= a.mo68529c().f132225b) {
                    break;
                }
                arrayList.add(new bezl(bezn, i3, i4, i2, i));
                i4++;
            }
            i3++;
        }
    }

    /* renamed from: a */
    public final double mo61294a() {
        return m96167a(this.f113159e);
    }
}
