package com.google.android.libraries.matchstick.p091ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.libraries.matchstick.ui.SwipableReplyView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SwipableReplyView extends CardView {

    /* renamed from: g */
    public azme f111256g;

    /* renamed from: h */
    public int f111257h = 2;

    public SwipableReplyView(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        azme azme = this.f111256g;
        if (azme != null) {
            return azme.mo55045a(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f111257h != 4) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0126R.dimen.reply_view_card_max_height);
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            if (size > dimensionPixelSize && mode != 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        azme azme = this.f111256g;
        if (azme == null) {
            return true;
        }
        azme.mo55045a(motionEvent);
        return true;
    }

    public SwipableReplyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipableReplyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
