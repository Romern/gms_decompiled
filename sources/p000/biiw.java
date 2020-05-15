package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: biiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biiw implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f120705a;

    /* renamed from: b */
    final /* synthetic */ Runnable f120706b;

    public biiw(View view, Runnable runnable) {
        this.f120705a = view;
        this.f120706b = runnable;
    }

    public final void onGlobalLayout() {
        this.f120705a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.f120706b.run();
    }
}
