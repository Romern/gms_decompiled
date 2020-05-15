package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StatusBarBackgroundLayout extends FrameLayout {

    /* renamed from: a */
    private Drawable f7248a;

    /* renamed from: b */
    private Object f7249b;

    public StatusBarBackgroundLayout(Context context) {
        super(context);
        m4751a(context, null, 0);
    }

    /* renamed from: a */
    private final void m4751a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, blz.f5149p, i, 0);
        mo4124a(obtainStyledAttributes.getDrawable(0));
        obtainStyledAttributes.recycle();
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f7249b = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (this.f7249b == null) {
            requestApplyInsets();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        int i = Build.VERSION.SDK_INT;
        Object obj = this.f7249b;
        if (obj != null && (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) > 0) {
            this.f7248a.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f7248a.draw(canvas);
        }
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4751a(context, attributeSet, 0);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4751a(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo4124a(Drawable drawable) {
        this.f7248a = drawable;
        boolean z = true;
        boolean z2 = drawable == null;
        int i = Build.VERSION.SDK_INT;
        setWillNotDraw(z2);
        if (drawable == null) {
            z = false;
        }
        setFitsSystemWindows(z);
        invalidate();
    }
}
