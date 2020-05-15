package p000;

import android.view.ViewParent;

/* renamed from: zr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1549zr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1551zt f27791a;

    public C1549zr(C1551zt ztVar) {
        this.f27791a = ztVar;
    }

    public final void run() {
        ViewParent parent = this.f27791a.f27795c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
