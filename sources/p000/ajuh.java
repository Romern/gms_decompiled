package p000;

import android.view.ViewTreeObserver;

/* renamed from: ajuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajuh implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ ajuj f71295a;

    /* renamed from: b */
    final /* synthetic */ ajuk f71296b;

    public ajuh(ajuk ajuk, ajuj ajuj) {
        this.f71296b = ajuk;
        this.f71295a = ajuj;
    }

    public final boolean onPreDraw() {
        this.f71295a.f201a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f71296b.mo38927a(this.f71295a);
        return true;
    }
}
