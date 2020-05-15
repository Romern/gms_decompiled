package p000;

import android.animation.ValueAnimator;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azkh implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99554a;

    public azkh(CardChimeraActivity cardChimeraActivity) {
        this.f99554a = cardChimeraActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f99554a.f111176H.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
