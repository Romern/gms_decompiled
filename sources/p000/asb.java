package p000;

import android.view.ViewGroup;

/* renamed from: asb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asb extends atg {

    /* renamed from: a */
    boolean f2106a = false;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f2107b;

    public asb(ViewGroup viewGroup) {
        this.f2107b = viewGroup;
    }

    /* renamed from: a */
    public final void mo2371a() {
        atv.m2098a(this.f2107b, false);
        this.f2106a = true;
    }

    /* renamed from: b */
    public final void mo2373b() {
        atv.m2098a(this.f2107b, false);
    }

    /* renamed from: c */
    public final void mo2374c() {
        atv.m2098a(this.f2107b, true);
    }

    /* renamed from: a */
    public final void mo2372a(atf atf) {
        if (!this.f2106a) {
            atv.m2098a(this.f2107b, false);
        }
        atf.mo2473b(this);
    }
}
