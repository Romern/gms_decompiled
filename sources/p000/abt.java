package p000;

import android.view.View;

/* renamed from: abt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abt implements aef {

    /* renamed from: a */
    final /* synthetic */ abu f111a;

    public abt(abu abu) {
        this.f111a = abu;
    }

    /* renamed from: a */
    public final int mo213a() {
        return this.f111a.mo252w();
    }

    /* renamed from: b */
    public final int mo216b() {
        abu abu = this.f111a;
        return abu.f116E - abu.mo254y();
    }

    /* renamed from: a */
    public final int mo214a(View view) {
        return abu.m287h(view) - ((abv) view.getLayoutParams()).topMargin;
    }

    /* renamed from: b */
    public final int mo217b(View view) {
        return abu.m282c(view) + ((abv) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: a */
    public final View mo215a(int i) {
        return this.f111a.mo245i(i);
    }
}
