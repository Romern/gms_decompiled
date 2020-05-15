package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: azxj */
public final /* synthetic */ class azxj implements azxm {

    /* renamed from: a */
    public static final azxm f100172a = new azxj();

    private azxj() {
    }

    /* renamed from: a */
    public final void mo55369a(ValueAnimator valueAnimator, View view) {
        int i = azxn.f100175a;
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }
}
