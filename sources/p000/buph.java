package p000;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: buph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buph {

    /* renamed from: a */
    public final Map f154636a = new HashMap();

    /* renamed from: b */
    public final double f154637b;

    /* renamed from: c */
    public final double f154638c;

    /* renamed from: d */
    public int f154639d = 3;

    /* renamed from: e */
    private final double f154640e;

    public buph(double d, double d2, double d3) {
        this.f154640e = d;
        this.f154637b = d2;
        this.f154638c = d3;
    }

    /* renamed from: a */
    public static bupb m120199a(List list, double d, double d2) {
        boolean z;
        List list2 = list;
        int size = list.size();
        if (size > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        double d3 = 0.0d;
        double d4 = d;
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        int i = 0;
        int i2 = 0;
        while (i < size && d4 > d3) {
            bupb bupb = (bupb) list2.get(i);
            double d9 = bupb.f154624b;
            int i3 = bupb.f154626d;
            double d10 = (double) i3;
            Double.isNaN(d10);
            d6 += d9 * d10 * d4;
            Double.isNaN(d10);
            d7 += d9 * d9 * d10 * d4;
            double d11 = bupb.f154625c;
            Double.isNaN(d10);
            d8 += d11 * d10 * d4;
            Double.isNaN(d10);
            d5 += d10 * d4;
            i2 += i3;
            d4 -= d2;
            i++;
            d3 = 0.0d;
            list2 = list;
            size = size;
        }
        double d12 = d6 / d5;
        bupb bupb2 = (bupb) list.get(0);
        return new bupb(bupb2.f154623a, d12, ((d8 / d5) + (d7 / d5)) - (d12 * d12), i2, bupb2.f154627e, bupb2.f154628f);
    }

    /* renamed from: a */
    public final void mo72971a(List list, double d) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (d - ((bupb) listIterator.next()).f154628f > this.f154640e) {
                listIterator.remove();
            }
        }
    }
}
