package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: aau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aau extends aaw {
    /* renamed from: a */
    public final int mo117a() {
        abu abu = this.f87a;
        return abu.f115D - abu.mo253x();
    }

    /* renamed from: a */
    public final void mo119a(int i) {
        RecyclerView recyclerView = this.f87a.f120r;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i);
        }
    }

    /* renamed from: b */
    public final int mo120b() {
        return this.f87a.f115D;
    }

    /* renamed from: c */
    public final int mo122c() {
        return this.f87a.mo251v();
    }

    /* renamed from: d */
    public final int mo124d() {
        abu abu = this.f87a;
        return (abu.f115D - abu.mo251v()) - this.f87a.mo253x();
    }

    /* renamed from: e */
    public final int mo126e() {
        return this.f87a.mo253x();
    }

    /* renamed from: f */
    public final int mo128f() {
        return this.f87a.f113B;
    }

    /* renamed from: g */
    public final int mo130g() {
        return this.f87a.f114C;
    }

    public aau(abu abu) {
        super(abu);
    }

    /* renamed from: a */
    public final int mo118a(View view) {
        abv abv = (abv) view.getLayoutParams();
        return abu.m285f(view) + abv.leftMargin + abv.rightMargin;
    }

    /* renamed from: b */
    public final int mo121b(View view) {
        abv abv = (abv) view.getLayoutParams();
        return abu.m284e(view) + abv.topMargin + abv.bottomMargin;
    }

    /* renamed from: c */
    public final int mo123c(View view) {
        return abu.m286g(view) + ((abv) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: d */
    public final int mo125d(View view) {
        return abu.m283d(view) - ((abv) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: e */
    public final int mo127e(View view) {
        this.f87a.mo238b(view, this.f89c);
        return this.f89c.right;
    }

    /* renamed from: f */
    public final int mo129f(View view) {
        this.f87a.mo238b(view, this.f89c);
        return this.f89c.left;
    }
}
