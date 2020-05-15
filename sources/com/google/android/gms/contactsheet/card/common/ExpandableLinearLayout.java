package com.google.android.gms.contactsheet.card.common;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExpandableLinearLayout extends LinearLayout {
    public ExpandableLinearLayout(Context context) {
        super(context);
        m22836b();
    }

    /* renamed from: a */
    public final void mo18005a() {
        mo18006a(Integer.MAX_VALUE);
    }

    public ExpandableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22836b();
    }

    /* renamed from: b */
    private final void m22836b() {
        int i = Build.VERSION.SDK_INT;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        layoutTransition.disableTransitionType(1);
        layoutTransition.disableTransitionType(3);
        setLayoutTransition(layoutTransition);
    }

    /* renamed from: a */
    public final void mo18006a(int i) {
        int i2 = 0;
        while (i2 < getChildCount()) {
            getChildAt(i2).setVisibility(i2 < i ? 0 : 8);
            i2++;
        }
    }
}
