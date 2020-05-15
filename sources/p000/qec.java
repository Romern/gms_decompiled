package p000;

import android.content.Context;

/* renamed from: qec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qec implements qeo {

    /* renamed from: a */
    final /* synthetic */ int f41067a;

    /* renamed from: b */
    private double f41068b = 0.0d;

    /* renamed from: c */
    private int f41069c = 0;

    public qec(int i) {
        this.f41067a = i;
    }

    /* renamed from: a */
    public final void mo23984a(Object obj) {
        double d = this.f41068b;
        double a = (double) qeq.m32020a(qeq.m32021a(obj, this.f41067a));
        Double.isNaN(a);
        this.f41068b = d + a;
        this.f41069c++;
    }

    /* renamed from: a */
    public final void mo23985a(StringBuilder sb, Context context) {
        double d;
        int i = this.f41069c;
        if (i > 0) {
            double d2 = this.f41068b;
            double d3 = (double) i;
            Double.isNaN(d3);
            d = d2 / d3;
        } else {
            d = 0.0d;
        }
        sb.append(d);
    }
}
