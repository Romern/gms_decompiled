package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: zo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1546zo extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1548zq f27757a;

    /* renamed from: b */
    private boolean f27758b = false;

    public C1546zo(C1548zq zqVar) {
        this.f27757a = zqVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f27758b = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f27758b) {
            this.f27758b = false;
        } else if (((Float) this.f27757a.f27782p.getAnimatedValue()).floatValue() == 0.0f) {
            C1548zq zqVar = this.f27757a;
            zqVar.f27783q = 0;
            zqVar.mo16632a(0);
        } else {
            C1548zq zqVar2 = this.f27757a;
            zqVar2.f27783q = 2;
            zqVar2.mo16631a();
        }
    }
}
