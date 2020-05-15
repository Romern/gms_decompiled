package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BottomScrollView extends ScrollView {

    /* renamed from: a */
    public bjat f151514a;

    /* renamed from: b */
    private int f151515b;

    /* renamed from: c */
    private boolean f151516c = false;

    /* renamed from: d */
    private final Runnable f151517d = new bjbd(this);

    public BottomScrollView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo71405a() {
        if (this.f151514a == null) {
            return;
        }
        if (getScrollY() >= this.f151515b) {
            this.f151514a.f122444a.mo64963a(false);
        } else if (!this.f151516c) {
            this.f151516c = true;
            this.f151514a.f122444a.mo64963a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f151515b = Math.max(0, ((childAt.getMeasuredHeight() - i4) + i2) - getPaddingBottom());
        }
        if (i4 - i2 > 0) {
            post(this.f151517d);
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i4 != i2) {
            mo71405a();
        }
    }

    public BottomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
