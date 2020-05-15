package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckableLinearLayout extends LinearLayout implements Checkable {

    /* renamed from: a */
    private boolean f151518a = false;

    public CheckableLinearLayout(Context context) {
        super(context);
        setFocusable(true);
    }

    public final boolean isChecked() {
        return this.f151518a;
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        if (!this.f151518a) {
            return super.onCreateDrawableState(i);
        }
        return mergeDrawableStates(super.onCreateDrawableState(i + 1), new int[]{16842912});
    }

    public final void setChecked(boolean z) {
        this.f151518a = z;
        refreshDrawableState();
    }

    public final void toggle() {
        setChecked(!this.f151518a);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(true);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusable(true);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setFocusable(true);
    }
}
