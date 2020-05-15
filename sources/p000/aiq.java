package p000;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: aiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiq implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f613a;

    public aiq(CoordinatorLayout coordinatorLayout) {
        this.f613a = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.f613a.mo1870a(0);
        return true;
    }
}
