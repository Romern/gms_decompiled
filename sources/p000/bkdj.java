package p000;

import android.animation.ValueAnimator;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;

/* renamed from: bkdj */
public final /* synthetic */ class bkdj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final FocusedViewToTopScrollView f124043a;

    public bkdj(FocusedViewToTopScrollView focusedViewToTopScrollView) {
        this.f124043a = focusedViewToTopScrollView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FocusedViewToTopScrollView focusedViewToTopScrollView = this.f124043a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        focusedViewToTopScrollView.f151973u = intValue;
        focusedViewToTopScrollView.mo71901a(intValue);
    }
}
