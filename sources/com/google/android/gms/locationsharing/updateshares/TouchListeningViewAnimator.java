package com.google.android.gms.locationsharing.updateshares;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ViewAnimator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TouchListeningViewAnimator extends ViewAnimator {

    /* renamed from: a */
    public aewu f79740a;

    public TouchListeningViewAnimator(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        aewu aewu = this.f79740a;
        if (aewu != null) {
            UpdateSharesChimeraActivity updateSharesChimeraActivity = aewu.f63960b;
            updateSharesChimeraActivity.f79764o.removeCallbacks(updateSharesChimeraActivity.f79765p);
            UpdateSharesChimeraActivity updateSharesChimeraActivity2 = aewu.f63960b;
            updateSharesChimeraActivity2.f79764o.postDelayed(updateSharesChimeraActivity2.f79765p, aewu.f63959a);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public TouchListeningViewAnimator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
