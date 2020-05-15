package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.wallet.ui.common.InfoMessageWithImageAndText */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InfoMessageWithImageAndText extends LinearLayout implements bjer, bkdf, bjwm {

    /* renamed from: a */
    public bmnr f152097a;

    /* renamed from: b */
    public InfoMessageView f152098b;

    /* renamed from: c */
    public ImageWithCaptionView f152099c;

    /* renamed from: d */
    public bkdw f152100d;

    public InfoMessageWithImageAndText(Context context) {
        super(context);
        new bjes(1627);
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return this.f152100d;
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return "";
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bZ */
    public final void mo52779bZ() {
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return true;
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        return true;
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        return this.f152098b.mo65800cN();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    public final CharSequence getError() {
        return "";
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f152099c.setEnabled(z);
        this.f152098b.setEnabled(z);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            setVisibility(0);
        } else if (i2 != 11) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmmb.m108166a(bmmv.f130058d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "Unsupported resulting action type: %s", objArr));
        } else {
            setVisibility(8);
        }
    }

    public InfoMessageWithImageAndText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new bjes(1627);
    }

    public InfoMessageWithImageAndText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new bjes(1627);
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        if (obj instanceof bmnr) {
            bmnr bmnr = (bmnr) obj;
            if (!TextUtils.equals(bmnr.f130159e, this.f152097a.f130159e) || !TextUtils.equals(bmnr.f130160f, this.f152097a.f130160f) || bmnr.f130157c.size() != 1 || !((bmno) bmnr.f130157c.get(0)).f130142c.equals(((bmno) this.f152097a.f130157c.get(0)).f130142c)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
