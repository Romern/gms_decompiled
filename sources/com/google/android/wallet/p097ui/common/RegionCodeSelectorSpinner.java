package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;

/* renamed from: com.google.android.wallet.ui.common.RegionCodeSelectorSpinner */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegionCodeSelectorSpinner extends FormSpinner {

    /* renamed from: u */
    public ContextThemeWrapper f152178u;

    /* renamed from: v */
    public bkey f152179v;

    public RegionCodeSelectorSpinner(Context context) {
        super(context);
        m118703a(context);
    }

    /* renamed from: a */
    private final void m118703a(Context context) {
        if (context instanceof ContextThemeWrapper) {
            this.f152178u = (ContextThemeWrapper) context;
            return;
        }
        throw new IllegalArgumentException("RegionCodeSelectorSpinner must be used with a ContextThemeWrapper");
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return super.mo65798cL() && mo72077i() != 0;
    }

    /* renamed from: g */
    public final CharSequence mo71976g() {
        return bjtl.m104573b(mo72077i());
    }

    /* renamed from: i */
    public final int mo72077i() {
        return ((Integer) getSelectedItem()).intValue();
    }

    public RegionCodeSelectorSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118703a(context);
    }

    public RegionCodeSelectorSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118703a(context);
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return bjtl.m104573b(mo72077i());
    }
}
