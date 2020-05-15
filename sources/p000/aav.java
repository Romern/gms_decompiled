package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: aav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aav extends aaw {
    /* renamed from: a */
    public final int mo117a() {
        abu abu = this.f87a;
        return abu.f116E - abu.mo254y();
    }

    /* renamed from: a */
    public final void mo119a(int i) {
        RecyclerView recyclerView = this.f87a.f120r;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i);
        }
    }

    /* renamed from: b */
    public final int mo120b() {
        return this.f87a.f116E;
    }

    /* renamed from: c */
    public final int mo122c() {
        return this.f87a.mo252w();
    }

    /* renamed from: d */
    public final int mo124d() {
        abu abu = this.f87a;
        return (abu.f116E - abu.mo252w()) - this.f87a.mo254y();
    }

    /* renamed from: e */
    public final int mo126e() {
        return this.f87a.mo254y();
    }

    /* renamed from: f */
    public final int mo128f() {
        return this.f87a.f114C;
    }

    /* renamed from: g */
    public final int mo130g() {
        return this.f87a.f113B;
    }

    public aav(abu abu) {
        super(abu);
    }

    /* renamed from: a */
    public final int mo118a(View view) {
        abv abv = (abv) view.getLayoutParams();
        return abu.m284e(view) + abv.topMargin + abv.bottomMargin;
    }

    /* renamed from: b */
    public final int mo121b(View view) {
        abv abv = (abv) view.getLayoutParams();
        return abu.m285f(view) + abv.leftMargin + abv.rightMargin;
    }

    /* renamed from: c */
    public final int mo123c(View view) {
        return abu.m282c(view) + ((abv) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: d */
    public final int mo125d(View view) {
        return abu.m287h(view) - ((abv) view.getLayoutParams()).topMargin;
    }

    /* renamed from: e */
    public final int mo127e(View view) {
        this.f87a.mo238b(view, this.f89c);
        return this.f89c.bottom;
    }

    /* renamed from: f */
    public final int mo129f(View view) {
        this.f87a.mo238b(view, this.f89c);
        return this.f89c.top;
    }
}
