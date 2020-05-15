package com.google.android.libraries.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TouchObserverFrameLayout extends FrameLayout {

    /* renamed from: a */
    public View.OnTouchListener f111260a;

    public TouchObserverFrameLayout(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f111260a;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f111260a = onTouchListener;
    }

    public TouchObserverFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchObserverFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
