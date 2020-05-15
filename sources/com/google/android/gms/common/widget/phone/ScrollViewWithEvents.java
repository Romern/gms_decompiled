package com.google.android.gms.common.widget.phone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ScrollViewWithEvents extends ScrollView implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public sur f30408a;

    /* renamed from: b */
    public suq f30409b;

    /* renamed from: c */
    private boolean f30410c;

    public ScrollViewWithEvents(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m22746a(int i) {
        boolean b = m22747b(i);
        if (b != this.f30410c) {
            this.f30410c = b;
            sur sur = this.f30408a;
            if (sur != null) {
                sur.mo26132a(this, b);
            }
        }
    }

    /* renamed from: b */
    private final boolean m22747b(int i) {
        return getChildAt(getChildCount() + -1).getBottom() - (i + getHeight()) <= 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    public final void onGlobalLayout() {
        m22746a(getScrollY());
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        suq suq = this.f30409b;
        if (suq != null) {
            suq.mo26131a(i2);
        }
        if (i2 == i4) {
            return;
        }
        if (this.f30410c || i2 > i4) {
            m22746a(i2);
        }
    }

    public ScrollViewWithEvents(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollViewWithEvents(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final boolean mo17935a() {
        boolean b = m22747b(getScrollY());
        this.f30410c = b;
        return b;
    }
}
