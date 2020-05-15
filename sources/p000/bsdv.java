package p000;

/* renamed from: bsdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdv {

    /* renamed from: a */
    public double f144222a;

    /* renamed from: b */
    public double f144223b;

    /* renamed from: c */
    public double f144224c;

    /* renamed from: d */
    public double f144225d;

    public bsdv() {
    }

    /* renamed from: a */
    public static bsdv m115367a() {
        return new bsdv(null);
    }

    /* renamed from: a */
    public final void mo70282a(double d, double d2, double d3, double d4) {
        this.f144222a = d;
        this.f144223b = d2;
        this.f144224c = d3;
        this.f144225d = d4;
    }

    /* renamed from: a */
    public final void mo70283a(bsdv bsdv) {
        bsdv.f144222a = this.f144222a;
        bsdv.f144223b = this.f144223b;
        bsdv.f144224c = this.f144224c;
        bsdv.f144225d = this.f144225d;
    }

    /* renamed from: b */
    public final void mo70284b() {
        double d = this.f144222a;
        double d2 = this.f144223b;
        double d3 = this.f144224c;
        double d4 = this.f144225d;
        double sqrt = Math.sqrt((d * d) + (d2 * d2) + (d3 * d3) + (d4 * d4));
        if (sqrt >= 1.0E-9d) {
            double d5 = 1.0d / sqrt;
            this.f144222a *= d5;
            this.f144223b *= d5;
            this.f144224c *= d5;
            this.f144225d *= d5;
            return;
        }
        this.f144222a = 0.0d;
        this.f144223b = 0.0d;
        this.f144224c = 0.0d;
        this.f144225d = 1.0d;
    }

    public bsdv(byte[] bArr) {
        this.f144222a = 0.0d;
        this.f144223b = 0.0d;
        this.f144224c = 0.0d;
        this.f144225d = 1.0d;
    }

    /* renamed from: a */
    public static void m115368a(bsdv bsdv, bsdv bsdv2, bsdv bsdv3, boolean z) {
        bsdv bsdv4 = bsdv3;
        double d = bsdv.f144225d;
        double d2 = bsdv.f144222a;
        double d3 = bsdv.f144223b;
        double d4 = bsdv.f144224c;
        double d5 = bsdv2.f144225d;
        double d6 = bsdv2.f144222a;
        double d7 = d4;
        double d8 = bsdv2.f144223b;
        double d9 = bsdv2.f144224c;
        if (z) {
            d6 = -d6;
            d8 = -d8;
            d9 = -d9;
        }
        bsdv4.f144225d = (((d * d5) - (d2 * d6)) - (d3 * d8)) - (d7 * d9);
        bsdv4.f144222a = (((d * d6) + (d2 * d5)) + (d3 * d9)) - (d7 * d8);
        bsdv4.f144223b = (((d * d8) + (d3 * d5)) + (d7 * d6)) - (d2 * d9);
        bsdv4.f144224c = (((d * d9) + (d7 * d5)) + (d2 * d8)) - (d3 * d6);
    }
}
