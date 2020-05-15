package p000;

import android.view.View;

/* renamed from: abs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abs implements aef {

    /* renamed from: a */
    final /* synthetic */ abu f110a;

    public abs(abu abu) {
        this.f110a = abu;
    }

    /* renamed from: a */
    public final int mo213a() {
        return this.f110a.mo251v();
    }

    /* renamed from: b */
    public final int mo216b() {
        abu abu = this.f110a;
        return abu.f115D - abu.mo253x();
    }

    /* renamed from: a */
    public final int mo214a(View view) {
        return abu.m283d(view) - ((abv) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: b */
    public final int mo217b(View view) {
        return abu.m286g(view) + ((abv) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: a */
    public final View mo215a(int i) {
        return this.f110a.mo245i(i);
    }
}
