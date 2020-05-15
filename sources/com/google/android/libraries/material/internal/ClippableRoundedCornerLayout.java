package com.google.android.libraries.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: a */
    public Path f111259a;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f111259a != null) {
            int save = canvas.save();
            canvas.clipPath(this.f111259a);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
