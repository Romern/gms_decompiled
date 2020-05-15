package com.google.android.gms.constellation.p038ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.RadioButton;

/* renamed from: com.google.android.gms.constellation.ui.CheckableLinearLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckableLinearLayout extends LinearLayout implements Checkable {

    /* renamed from: a */
    private boolean f30534a;

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean isChecked() {
        return this.f30534a;
    }

    public final void setChecked(boolean z) {
        this.f30534a = z;
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof RadioButton)) {
                i++;
            } else {
                ((Checkable) childAt).setChecked(z);
                return;
            }
        }
    }

    public final void toggle() {
        setChecked(!this.f30534a);
    }
}
