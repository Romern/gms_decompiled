package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: zs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1550zs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1551zt f27792a;

    public C1550zs(C1551zt ztVar) {
        this.f27792a = ztVar;
    }

    public final void run() {
        C1551zt ztVar = this.f27792a;
        ztVar.mo16638d();
        View view = ztVar.f27795c;
        if (view.isEnabled() && !view.isLongClickable() && ztVar.mo16181b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            ztVar.f27796d = true;
        }
    }
}
