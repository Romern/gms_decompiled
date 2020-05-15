package com.google.android.wallet.shared.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckableFrameLayout extends FrameLayout implements Checkable {

    /* renamed from: a */
    private static final int[] f151842a = {16842912};

    /* renamed from: b */
    private boolean f151843b = false;

    public CheckableFrameLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m118371a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(z);
            } else if (childAt instanceof ViewGroup) {
                m118371a((ViewGroup) childAt, z);
            }
        }
    }

    public final boolean isChecked() {
        return this.f151843b;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f151843b) {
            mergeDrawableStates(onCreateDrawableState, f151842a);
        }
        return onCreateDrawableState;
    }

    public final void setChecked(boolean z) {
        if (z != this.f151843b) {
            this.f151843b = z;
            refreshDrawableState();
            m118371a(this, z);
        }
    }

    public final void toggle() {
        setChecked(!this.f151843b);
    }

    public CheckableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CheckableFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
