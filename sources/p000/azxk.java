package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: azxk */
final /* synthetic */ class azxk implements azxm {

    /* renamed from: a */
    static final azxm f100173a = new azxk();

    private azxk() {
    }

    /* renamed from: a */
    public final void mo55369a(ValueAnimator valueAnimator, View view) {
        int i = azxn.f100175a;
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
