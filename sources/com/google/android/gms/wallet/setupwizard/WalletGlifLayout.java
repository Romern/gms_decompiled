package com.google.android.gms.wallet.setupwizard;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WalletGlifLayout extends GlifLayout {

    /* renamed from: a */
    private awxy f110405a;

    public WalletGlifLayout(Context context) {
        super(context, 0, 0);
        m94171b(null, C0126R.attr.sudLayoutTheme);
    }

    /* renamed from: b */
    private final void m94171b(AttributeSet attributeSet, int i) {
        awxy awxy = new awxy(this, attributeSet, i);
        this.f110405a = awxy;
        mo71343a(biyn.class, awxy);
    }

    /* renamed from: a */
    public final void mo7880a() {
        super.onFinishInflate();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        awxr awxr;
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(getClass().getClassLoader());
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        awxy awxy = this.f110405a;
        if (awxy != null && (awxr = awxy.f95269c) != null) {
            awxr.onRestoreInstanceState(parcelable);
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle;
        awxr awxr;
        awxy awxy = this.f110405a;
        if (awxy == null || (awxr = awxy.f95269c) == null) {
            bundle = new Bundle();
        } else {
            bundle = (Bundle) awxr.onSaveInstanceState();
        }
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        return bundle;
    }

    public WalletGlifLayout(Context context, int i) {
        super(context, i, 0);
        m94171b(null, C0126R.attr.sudLayoutTheme);
    }

    public WalletGlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        m94171b(null, C0126R.attr.sudLayoutTheme);
    }

    public WalletGlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m94171b(attributeSet, C0126R.attr.sudLayoutTheme);
    }

    public WalletGlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m94171b(attributeSet, i);
    }
}
