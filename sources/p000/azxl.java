package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: azxl */
final /* synthetic */ class azxl implements azxm {

    /* renamed from: a */
    static final azxm f100174a = new azxl();

    private azxl() {
    }

    /* renamed from: a */
    public final void mo55369a(ValueAnimator valueAnimator, View view) {
        int i = azxn.f100175a;
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
