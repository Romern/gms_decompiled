package com.google.android.setupdesign;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GlifListLayout extends GlifLayout {

    /* renamed from: a */
    private bjaf f151483a;

    public GlifListLayout(Context context) {
        this(context, 0, 0);
    }

    /* renamed from: b */
    private final void m117824b(AttributeSet attributeSet, int i) {
        bjaf bjaf = new bjaf(this, attributeSet, i);
        this.f151483a = bjaf;
        mo71343a(bjaf.class, bjaf);
        bjas bjas = (bjas) mo71342a(bjas.class);
        bjas.f122440b = new bjag(bjas, mo7880a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo64837a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = C0126R.C0128layout.sud_glif_list_template;
        }
        return super.mo64837a(layoutInflater, i);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f151483a.mo64942b();
    }

    public GlifListLayout(Context context, int i) {
        this(context, i, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ViewGroup mo64838a(int i) {
        if (i == 0) {
            i = 16908298;
        }
        return super.mo64838a(i);
    }

    public GlifListLayout(Context context, int i, int i2) {
        super(context, i, i2);
        m117824b(null, 0);
    }

    /* renamed from: a */
    public final ListView mo7880a() {
        return this.f151483a.mo64940a();
    }

    public GlifListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m117824b(attributeSet, 0);
    }

    public GlifListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m117824b(attributeSet, i);
    }
}
