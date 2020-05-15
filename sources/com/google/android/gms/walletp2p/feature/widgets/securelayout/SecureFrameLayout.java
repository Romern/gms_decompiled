package com.google.android.gms.walletp2p.feature.widgets.securelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecureFrameLayout extends FrameLayout {
    public SecureFrameLayout(Context context) {
        super(context);
    }

    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        boolean onFilterTouchEventForSecurity = super.onFilterTouchEventForSecurity(motionEvent);
        if (!onFilterTouchEventForSecurity) {
            Toast.makeText(getContext(), (int) C0126R.string.walletp2p_obscured_screen, 1).show();
        }
        return onFilterTouchEventForSecurity;
    }

    public SecureFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SecureFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
