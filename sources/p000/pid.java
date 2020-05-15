package p000;

/* renamed from: pid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pid {

    /* renamed from: a */
    private double f39200a;

    /* renamed from: b */
    private double f39201b;

    /* renamed from: c */
    private int f39202c;

    /* renamed from: d */
    private double f39203d;

    /* renamed from: e */
    private double f39204e;

    public pid() {
        mo23162a();
    }

    /* renamed from: a */
    public final void mo23162a() {
        this.f39200a = 0.0d;
        this.f39201b = 0.0d;
        this.f39202c = 0;
        this.f39203d = Double.POSITIVE_INFINITY;
        this.f39204e = Double.NEGATIVE_INFINITY;
    }

    /* renamed from: b */
    public final bpsv mo23164b() {
        bxvd da = bpsv.f139020g.mo74144da();
        int i = this.f39202c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsv bpsv = (bpsv) da.f164949b;
        int i2 = bpsv.f139022a | 1;
        bpsv.f139022a = i2;
        bpsv.f139023b = i;
        double d = this.f39203d;
        int i3 = i2 | 2;
        bpsv.f139022a = i3;
        bpsv.f139024c = d;
        double d2 = this.f39204e;
        int i4 = i3 | 4;
        bpsv.f139022a = i4;
        bpsv.f139025d = d2;
        double d3 = this.f39200a;
        int i5 = i4 | 8;
        bpsv.f139022a = i5;
        bpsv.f139026e = d3;
        double d4 = this.f39201b;
        bpsv.f139022a = i5 | 16;
        bpsv.f139027f = d4;
        return (bpsv) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo23163a(double d) {
        this.f39200a += d;
        this.f39201b += d * d;
        this.f39202c++;
        this.f39203d = Math.min(this.f39203d, d);
        this.f39204e = Math.max(this.f39204e, d);
    }
}
