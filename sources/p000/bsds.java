package p000;

/* renamed from: bsds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsds {

    /* renamed from: a */
    public double f144217a;

    /* renamed from: b */
    public final bsdw f144218b = new bsdw();

    public bsds() {
        bsdw bsdw = bsdw.f144226a;
        mo70281a(bsdw, 0.0d);
    }

    /* renamed from: a */
    public final void mo70281a(bsdw bsdw, double d) {
        if (bsdw.mo70285a() < 1.0E-6d || Math.abs(d) < 1.0E-6d) {
            this.f144217a = 0.0d;
            bsdw.f144226a.mo70286a(this.f144218b);
            return;
        }
        bsdw.mo70286a(this.f144218b);
        this.f144218b.mo70288c();
        this.f144217a = d;
    }
}
