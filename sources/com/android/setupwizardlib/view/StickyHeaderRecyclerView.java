package com.android.setupwizardlib.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StickyHeaderRecyclerView extends HeaderRecyclerView {

    /* renamed from: b */
    private View f7254b;

    /* renamed from: c */
    private int f7255c = 0;

    /* renamed from: d */
    private final RectF f7256d = new RectF();

    public StickyHeaderRecyclerView(Context context) {
        super(context);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f7256d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.f7256d.left, -this.f7256d.top);
        return this.f7236a.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        View view;
        int i;
        super.draw(canvas);
        if (this.f7254b != null) {
            View view2 = this.f7236a;
            int save = canvas.save();
            if (view2 == null) {
                view = this.f7254b;
            } else {
                view = view2;
            }
            if (view2 != null) {
                i = this.f7254b.getTop();
            } else {
                i = 0;
            }
            if (view.getTop() + i < this.f7255c || !view.isShown()) {
                this.f7256d.set(0.0f, (float) ((-i) + this.f7255c), (float) view.getWidth(), (float) ((view.getHeight() - i) + this.f7255c));
                canvas.translate(0.0f, this.f7256d.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.f7256d.setEmpty();
            }
            canvas.restoreToCount(save);
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.f7255c = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f7254b == null && (view2 = this.f7236a) != null) {
            this.f7254b = view2.findViewWithTag("sticky");
        }
        if (this.f7254b != null && (view = this.f7236a) != null && view.getHeight() == 0) {
            view.layout(0, -view.getMeasuredHeight(), view.getMeasuredWidth(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f7254b != null) {
            measureChild(this.f7236a, i, i2);
        }
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
