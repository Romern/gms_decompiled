package com.google.android.gms.smart_profile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InterceptableFrameLayout extends FrameLayout {
    public InterceptableFrameLayout(Context context) {
        super(context);
        m92507a(context);
    }

    /* renamed from: a */
    private final void m92507a(Context context) {
        if (cgnz.m146325b() && cgnt.m146316b()) {
            setBackgroundColor(thh.m36965a(context, C0126R.attr.cardsContainerBackgroundColor));
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(false);
    }

    public InterceptableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m92507a(context);
    }

    public InterceptableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m92507a(context);
    }
}
