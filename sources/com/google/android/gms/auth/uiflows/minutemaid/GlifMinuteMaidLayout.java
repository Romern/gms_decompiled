package com.google.android.gms.auth.uiflows.minutemaid;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.setupdesign.GlifLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GlifMinuteMaidLayout extends GlifLayout {

    /* renamed from: a */
    public Context f11530a;

    /* renamed from: b */
    public biyn f11531b;

    /* renamed from: c */
    public biyp f11532c;

    /* renamed from: d */
    public biyp f11533d;

    public GlifMinuteMaidLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo7903a(String str, int i, imh imh) {
        if (!TextUtils.isEmpty(str)) {
            biyo biyo = new biyo(this.f11530a);
            biyo.f122328c = i;
            biyo.f122329d = 2132018229;
            biyo.f122326a = str;
            biyp a = biyo.mo64882a();
            this.f11532c = a;
            a.mo64885a(0);
            this.f11531b.mo52733a(this.f11532c);
            if (imh != null) {
                this.f11532c.f122336f = new jyr(imh);
                return;
            }
            return;
        }
        biyp biyp = this.f11532c;
        if (biyp != null) {
            biyp.mo64885a(8);
        }
    }

    public GlifMinuteMaidLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlifMinuteMaidLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11530a = context;
        biyn biyn = (biyn) mo71342a(biyn.class);
        this.f11531b = biyn;
        biyn.f122320l = true;
        biyn.mo64879d();
    }

    /* renamed from: a */
    public final void mo7904a(boolean z) {
        biyp biyp = this.f11532c;
        if (biyp != null) {
            biyp.mo64888a(z);
        }
    }
}
