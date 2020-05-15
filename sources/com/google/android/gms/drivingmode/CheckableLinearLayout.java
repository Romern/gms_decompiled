package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckableLinearLayout extends LinearLayout implements Checkable {

    /* renamed from: a */
    private boolean f31226a;

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean isChecked() {
        return this.f31226a;
    }

    public final void setChecked(boolean z) {
        this.f31226a = z;
        ((CheckedTextView) findViewById(16908310)).setChecked(this.f31226a);
    }

    public final void toggle() {
        setChecked(!this.f31226a);
    }
}
