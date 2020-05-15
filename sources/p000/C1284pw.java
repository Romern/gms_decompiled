package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: pw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1284pw implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1387tr f26844a;

    public C1284pw(C1387tr trVar) {
        this.f26844a = trVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.f26844a.f27155a.f27167c.getParent()).invalidate();
    }
}
