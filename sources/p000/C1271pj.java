package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: pj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1271pj implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final View f26834a;

    /* renamed from: b */
    private ViewTreeObserver f26835b;

    /* renamed from: c */
    private final Runnable f26836c;

    private C1271pj(View view, Runnable runnable) {
        this.f26834a = view;
        this.f26835b = view.getViewTreeObserver();
        this.f26836c = runnable;
    }

    /* renamed from: a */
    public static void m19857a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C1271pj pjVar = new C1271pj(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(pjVar);
            view.addOnAttachStateChangeListener(pjVar);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public final boolean onPreDraw() {
        mo15693a();
        this.f26836c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f26835b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        mo15693a();
    }

    /* renamed from: a */
    public final void mo15693a() {
        if (this.f26835b.isAlive()) {
            this.f26835b.removeOnPreDrawListener(this);
        } else {
            this.f26834a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f26834a.removeOnAttachStateChangeListener(this);
    }
}
