package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: hed */
final /* synthetic */ class hed implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final heg f19576a;

    /* renamed from: b */
    private final Fragment f19577b;

    /* renamed from: c */
    private final Fragment f19578c;

    public hed(heg heg, Fragment fragment, Fragment fragment2) {
        this.f19576a = heg;
        this.f19577b = fragment;
        this.f19578c = fragment2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        heg heg = this.f19576a;
        Fragment fragment = this.f19577b;
        Fragment fragment2 = this.f19578c;
        BottomSheetBehavior bottomSheetBehavior = heg.f19584b;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo71025a(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        if (fragment != null) {
            View view = fragment.getView();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            view.setLayoutParams(layoutParams);
            view.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
        }
        fragment2.getView().setAlpha(valueAnimator.getAnimatedFraction());
    }
}
