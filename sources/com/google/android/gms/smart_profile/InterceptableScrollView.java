package com.google.android.gms.smart_profile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InterceptableScrollView extends ScrollView {
    public InterceptableScrollView(Context context) {
        super(context);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(false);
    }

    public InterceptableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
