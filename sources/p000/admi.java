package p000;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: admi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class admi implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ adml f62157a;

    public admi(adml adml) {
        this.f62157a = adml;
    }

    public final void onGlobalLayout() {
        this.f62157a.f62163e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view = this.f62157a.f62163e;
        this.f62157a.mo33651a(ObjectAnimator.ofFloat(view, "translationY", (float) view.getHeight(), 0.0f), ObjectAnimator.ofFloat(this.f62157a.f62162d, "alpha", 0.0f, 1.0f), new admh(this));
    }
}
