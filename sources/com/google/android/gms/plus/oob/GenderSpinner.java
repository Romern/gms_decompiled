package com.google.android.gms.plus.oob;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GenderSpinner extends Spinner {

    /* renamed from: a */
    public anyv f82586a;

    public GenderSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void setSelection(int i) {
        super.setSelection(i);
        anyv anyv = this.f82586a;
        if (anyv != null) {
            anyv.mo42438b(i);
        }
    }
}
