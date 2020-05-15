package com.google.android.setupwizard.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StickyHeaderScrollView extends BottomScrollView {

    /* renamed from: a */
    private View f151561a;

    /* renamed from: b */
    private View f151562b;

    /* renamed from: c */
    private int f151563c = 0;

    /* renamed from: d */
    private RectF f151564d = new RectF();

    public StickyHeaderScrollView(Context context) {
        super(context);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f151564d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.f151564d.left, -this.f151564d.top);
        return this.f151562b.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        View view;
        int i;
        setVerticalScrollBarEnabled(false);
        super.draw(canvas);
        if (this.f151561a != null) {
            int save = canvas.save();
            View view2 = this.f151562b;
            if (view2 == null) {
                view = this.f151561a;
            } else {
                view = view2;
            }
            if (view2 != null) {
                i = this.f151561a.getTop();
            } else {
                i = 0;
            }
            int top = view.getTop() - getScrollY();
            if (top + i < this.f151563c || !view.isShown()) {
                this.f151564d.set(0.0f, (float) ((-i) + this.f151563c), (float) view.getWidth(), (float) ((view.getHeight() - i) + this.f151563c));
                canvas.translate(0.0f, ((float) (-top)) + this.f151564d.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.f151564d.setEmpty();
            }
            canvas.restoreToCount(save);
        }
        setVerticalScrollBarEnabled(true);
        onDrawScrollBars(canvas);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.f151563c = windowInsets.getSystemWindowInsetTop();
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f151561a == null) {
            this.f151561a = findViewWithTag("sticky");
            this.f151562b = findViewWithTag("stickyContainer");
        }
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
