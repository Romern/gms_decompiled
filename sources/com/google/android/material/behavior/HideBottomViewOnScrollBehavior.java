package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HideBottomViewOnScrollBehavior extends aim {

    /* renamed from: a */
    public ViewPropertyAnimator f151053a;

    /* renamed from: b */
    private int f151054b = 0;

    /* renamed from: c */
    private int f151055c = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: a */
    private final void m117465a(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f151053a = view.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new bheo(this));
    }

    /* renamed from: a */
    public boolean mo778a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo767a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.f151055c != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f151053a;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f151055c = 1;
                m117465a(view, this.f151054b, 175, bhdl.f118329c);
            }
        } else if (i < 0 && this.f151055c != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f151053a;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f151055c = 2;
            m117465a(view, 0, 225, bhdl.f118330d);
        }
    }

    /* renamed from: a */
    public boolean mo773a(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f151054b = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }
}
