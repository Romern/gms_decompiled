package p000;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;

/* renamed from: bhno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhno implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TabLayout f119142a;

    public bhno(TabLayout tabLayout) {
        this.f119142a = tabLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f119142a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
