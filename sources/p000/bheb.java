package p000;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: bheb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bheb implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f118358a;

    public bheb(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f118358a = collapsingToolbarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f118358a.mo70998a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
