package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.google.android.wallet.ui.common.LegalMessageView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LegalMessageView extends bkbp {

    /* renamed from: h */
    private bmjf f152117h;

    public LegalMessageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo72030a(bmjf bmjf) {
        bmnr bmnr;
        this.f152117h = bmjf;
        if ((bmjf.f129687a & 2) != 0) {
            bmnr = bmjf.f129689c;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
        } else {
            bmnr = null;
        }
        mo65793a(bmnr);
        if (bmjf.f129691e) {
            mo65789a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo65796b() {
        return this.f152117h.f129691e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final bmnr mo65797c() {
        bmjf bmjf = this.f152117h;
        if ((bmjf.f129687a & 16) == 0) {
            return null;
        }
        bmnr bmnr = bmjf.f129692f;
        return bmnr == null ? bmnr.f130153o : bmnr;
    }

    /* renamed from: g */
    public final String mo71871g() {
        return this.f152117h.f129693g;
    }

    public LegalMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LegalMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LegalMessageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
