package com.google.android.setupwizard.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ListView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StickyHeaderListView extends ListView {

    /* renamed from: a */
    private View f151557a;

    /* renamed from: b */
    private View f151558b;

    /* renamed from: c */
    private int f151559c = 0;

    /* renamed from: d */
    private RectF f151560d = new RectF();

    public StickyHeaderListView(Context context) {
        super(context);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f151560d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.f151560d.left, -this.f151560d.top);
        return this.f151558b.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        View view;
        int i;
        setVerticalScrollBarEnabled(false);
        super.draw(canvas);
        if (this.f151557a != null) {
            int save = canvas.save();
            View view2 = this.f151558b;
            if (view2 == null) {
                view = this.f151557a;
            } else {
                view = view2;
            }
            if (view2 != null) {
                i = this.f151557a.getTop();
            } else {
                i = 0;
            }
            if (view.getTop() + i < this.f151559c || !view.isShown()) {
                this.f151560d.set(0.0f, (float) ((-i) + this.f151559c), (float) view.getWidth(), (float) ((view.getHeight() - i) + this.f151559c));
                canvas.translate(0.0f, this.f151560d.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.f151560d.setEmpty();
            }
            canvas.restoreToCount(save);
        }
        setVerticalScrollBarEnabled(true);
        onDrawScrollBars(canvas);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.f151559c = windowInsets.getSystemWindowInsetTop();
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f151557a == null) {
            this.f151557a = findViewWithTag("sticky");
            this.f151558b = findViewWithTag("stickyContainer");
        }
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
