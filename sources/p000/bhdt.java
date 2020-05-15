package p000;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: bhdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdt implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f118345a;

    /* renamed from: b */
    final /* synthetic */ AppBarLayout f118346b;

    /* renamed from: c */
    final /* synthetic */ AppBarLayout.BaseBehavior f118347c;

    public bhdt(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f118347c = baseBehavior;
        this.f118345a = coordinatorLayout;
        this.f118346b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f118347c.mo63591b(this.f118345a, this.f118346b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
