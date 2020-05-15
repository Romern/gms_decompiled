package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: bhiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bhiu extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private boolean f118737a;

    /* renamed from: b */
    final /* synthetic */ bhiv f118738b;

    /* renamed from: c */
    private float f118739c;

    /* renamed from: d */
    private float f118740d;

    public bhiu(bhiv bhiv) {
        this.f118738b = bhiv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract float mo63820a();

    public final void onAnimationEnd(Animator animator) {
        this.f118738b.mo63832b((float) ((int) this.f118740d));
        this.f118737a = false;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.f118737a) {
            bhlr bhlr = this.f118738b.f118758c;
            this.f118739c = bhlr != null ? bhlr.mo63958k() : 0.0f;
            this.f118740d = mo63820a();
            this.f118737a = true;
        }
        bhiv bhiv = this.f118738b;
        float f = this.f118739c;
        bhiv.mo63832b((float) ((int) (f + ((this.f118740d - f) * valueAnimator.getAnimatedFraction()))));
    }
}
