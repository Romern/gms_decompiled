package p000;

import android.view.View;

/* renamed from: gd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1014gd extends C1030gr {

    /* renamed from: a */
    final /* synthetic */ C1018gh f17909a;

    public C1014gd(C1018gh ghVar) {
        this.f17909a = ghVar;
    }

    /* renamed from: a */
    public final View mo11664a(int i) {
        View view = this.f17909a.f18174K;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    /* renamed from: a */
    public final boolean mo11665a() {
        return this.f17909a.f18174K != null;
    }
}
