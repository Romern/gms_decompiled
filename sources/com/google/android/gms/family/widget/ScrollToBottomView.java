package com.google.android.gms.family.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ScrollToBottomView extends ScrollView {

    /* renamed from: a */
    public wru f31481a;

    public ScrollToBottomView(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    private final void m23343a() {
        wru wru;
        if (((float) (getChildAt(getChildCount() - 1).getBottom() - (getHeight() + getScrollY()))) < getResources().getDimension(C0126R.dimen.fm_create_bottom_margin) && (wru = this.f31481a) != null) {
            wru.mo29167a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m23343a();
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m23343a();
    }

    public ScrollToBottomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollToBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
