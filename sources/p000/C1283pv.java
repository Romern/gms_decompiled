package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: pv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1283pv extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1286py f26842a;

    /* renamed from: b */
    final /* synthetic */ View f26843b;

    public C1283pv(C1286py pyVar, View view) {
        this.f26842a = pyVar;
        this.f26843b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f26842a.mo483a();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f26842a.mo484a(this.f26843b);
    }

    public final void onAnimationStart(Animator animator) {
        this.f26842a.mo485b();
    }
}
