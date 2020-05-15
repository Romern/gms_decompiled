package com.google.android.setupdesign.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StickyHeaderScrollView extends BottomScrollView {

    /* renamed from: b */
    private View f151545b;

    /* renamed from: c */
    private View f151546c;

    /* renamed from: d */
    private int f151547d = 0;

    public StickyHeaderScrollView(Context context) {
        super(context);
    }

    /* renamed from: b */
    private final void m117925b() {
        View view;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        View view2 = this.f151545b;
        if (view2 != null) {
            View view3 = this.f151546c;
            if (view3 == null) {
                view = view2;
            } else {
                view = view3;
            }
            if (view3 != null) {
                i = view2.getTop();
            } else {
                i = 0;
            }
            if ((view.getTop() - getScrollY()) + i < this.f151547d || !view.isShown()) {
                view.setTranslationY((float) (getScrollY() - i));
            } else {
                view.setTranslationY(0.0f);
            }
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (!getFitsSystemWindows()) {
            return windowInsets;
        }
        this.f151547d = windowInsets.getSystemWindowInsetTop();
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f151545b == null) {
            this.f151545b = findViewWithTag("sticky");
            this.f151546c = findViewWithTag("stickyContainer");
        }
        m117925b();
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m117925b();
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
