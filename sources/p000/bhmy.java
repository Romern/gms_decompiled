package p000;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* renamed from: bhmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhmy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhnd f119095a;

    public bhmy(bhnd bhnd) {
        this.f119095a = bhnd;
    }

    public final void run() {
        bhnc bhnc = this.f119095a.f119110e;
        if (bhnc != null) {
            bhnc.setVisibility(0);
            bhnd bhnd = this.f119095a;
            if (bhnd.f119110e.f119098a == 1) {
                ValueAnimator a = bhnd.mo64016a(0.0f, 1.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
                ofFloat.setInterpolator(bhdl.f118330d);
                ofFloat.addUpdateListener(new bhmk(bhnd));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a, ofFloat);
                animatorSet.setDuration(150L);
                animatorSet.addListener(new bhmh(bhnd));
                animatorSet.start();
                return;
            }
            int h = bhnd.mo64025h();
            bhnd.f119110e.setTranslationY((float) h);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(h, 0);
            valueAnimator.setInterpolator(bhdl.f118328b);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new bhml(bhnd));
            valueAnimator.addUpdateListener(new bhmm(bhnd));
            valueAnimator.start();
        }
    }
}
