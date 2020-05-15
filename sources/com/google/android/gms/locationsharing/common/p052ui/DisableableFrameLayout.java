package com.google.android.gms.locationsharing.common.p052ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.locationsharing.common.ui.DisableableFrameLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DisableableFrameLayout extends FrameLayout {

    /* renamed from: a */
    private ColorDrawable f79653a = new ColorDrawable(getResources().getColor(C0126R.color.location_sharing_off_shade));

    /* renamed from: b */
    private boolean f79654b = false;

    public DisableableFrameLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo43791a(boolean z) {
        this.f79654b = z;
        setForeground(z ? this.f79653a : null);
        setEnabled(!this.f79654b);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f79654b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f79654b ? super.onTouchEvent(motionEvent) : performClick();
    }

    public final boolean performClick() {
        if (!this.f79654b) {
            return super.performClick();
        }
        return true;
    }

    public DisableableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DisableableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DisableableFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
