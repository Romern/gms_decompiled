package p000;

import android.view.View;

/* renamed from: aeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeg {

    /* renamed from: a */
    final aef f331a;

    /* renamed from: b */
    final aee f332b = new aee();

    public aeg(aef aef) {
        this.f331a = aef;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo525a(int i, int i2, int i3, int i4) {
        int i5;
        int a = this.f331a.mo213a();
        int b = this.f331a.mo216b();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View a2 = this.f331a.mo215a(i);
            this.f332b.mo523a(a, b, this.f331a.mo214a(a2), this.f331a.mo217b(a2));
            this.f332b.mo521a();
            this.f332b.mo522a(i3);
            if (this.f332b.mo524b()) {
                return a2;
            }
            this.f332b.mo521a();
            this.f332b.mo522a(i4);
            if (this.f332b.mo524b()) {
                view = a2;
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo526a(View view) {
        this.f332b.mo523a(this.f331a.mo213a(), this.f331a.mo216b(), this.f331a.mo214a(view), this.f331a.mo217b(view));
        this.f332b.mo521a();
        this.f332b.mo522a(24579);
        return this.f332b.mo524b();
    }
}
