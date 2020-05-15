package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* renamed from: com.google.android.wallet.ui.common.CallbackListenerScrollView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CallbackListenerScrollView extends ScrollView {

    /* renamed from: a */
    private final bkbt f151918a = new bkbt(this);

    /* renamed from: o */
    protected boolean f151919o;

    /* renamed from: p */
    public bkbu f151920p;

    public CallbackListenerScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo71866h() {
        if (this.f151920p != null && getChildCount() != 0) {
            mo71867i();
            this.f151920p.mo52894f(getScrollY());
        }
    }

    /* renamed from: i */
    public final void mo71867i() {
        if (!C1280ps.m19867B(this) || !chgf.m148668b()) {
            boolean z = false;
            if (getChildCount() != 0 && getScrollY() >= getChildAt(0).getHeight() - getHeight()) {
                z = true;
            }
            bkbu bkbu = this.f151920p;
            if (bkbu != null && z) {
                bkbu.mo52871ad();
            }
            removeCallbacks(this.f151918a);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (chgf.m148668b()) {
            post(this.f151918a);
        }
        boolean z2 = false;
        if (getChildCount() != 0 && ((getHeight() - getChildAt(0).getHeight()) - getPaddingTop()) - getPaddingBottom() < 0) {
            z2 = true;
        }
        if (z2 != this.f151919o) {
            this.f151919o = z2;
            bkbu bkbu = this.f151920p;
            if (bkbu != null) {
                bkbu.mo52893e(z2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        mo71866h();
    }

    public CallbackListenerScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CallbackListenerScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CallbackListenerScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
