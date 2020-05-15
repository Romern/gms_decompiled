package p000;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: bhfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhfg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ BottomSheetBehavior f118468a;

    public bhfg(BottomSheetBehavior bottomSheetBehavior) {
        this.f118468a = bottomSheetBehavior;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bhlr bhlr = this.f118468a.f151089c;
        if (bhlr != null) {
            bhlr.mo63947c(floatValue);
        }
    }
}
