package com.google.android.setupcompat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StatusBarBackgroundLayout extends FrameLayout {

    /* renamed from: a */
    public Drawable f151477a;

    /* renamed from: b */
    private Object f151478b;

    public StatusBarBackgroundLayout(Context context) {
        super(context);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f151478b = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (this.f151478b == null) {
            requestApplyInsets();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        int i = Build.VERSION.SDK_INT;
        Object obj = this.f151478b;
        if (obj != null && (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) > 0) {
            this.f151477a.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f151477a.draw(canvas);
        }
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
