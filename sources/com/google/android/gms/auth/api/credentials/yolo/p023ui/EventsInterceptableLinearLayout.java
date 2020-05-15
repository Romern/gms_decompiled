package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.EventsInterceptableLinearLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EventsInterceptableLinearLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f10196a = false;

    public EventsInterceptableLinearLayout(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f10196a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public EventsInterceptableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
