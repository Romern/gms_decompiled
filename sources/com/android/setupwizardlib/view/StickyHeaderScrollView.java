package com.android.setupwizardlib.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StickyHeaderScrollView extends BottomScrollView {

    /* renamed from: a */
    private View f7257a;

    /* renamed from: b */
    private View f7258b;

    /* renamed from: c */
    private int f7259c = 0;

    public StickyHeaderScrollView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m4754a() {
        View view;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        View view2 = this.f7257a;
        if (view2 != null) {
            View view3 = this.f7258b;
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
            if ((view.getTop() - getScrollY()) + i < this.f7259c || !view.isShown()) {
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
        this.f7259c = windowInsets.getSystemWindowInsetTop();
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f7257a == null) {
            this.f7257a = findViewWithTag("sticky");
            this.f7258b = findViewWithTag("stickyContainer");
        }
        m4754a();
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m4754a();
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
