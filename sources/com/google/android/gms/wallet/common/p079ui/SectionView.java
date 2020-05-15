package com.google.android.gms.wallet.common.p079ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: com.google.android.gms.wallet.common.ui.SectionView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SectionView extends LinearLayout implements View.OnClickListener, bkiq, bkii, bkio {

    /* renamed from: a */
    public View f110121a;

    /* renamed from: b */
    public ViewGroup f110122b;

    /* renamed from: c */
    public View f110123c;

    /* renamed from: d */
    public View f110124d;

    /* renamed from: e */
    public final bkip f110125e = new bkip();

    public SectionView(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo59887b() {
        int i;
        boolean z = this.f110125e.f124294c;
        View view = this.f110121a;
        int i2 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (!z) {
            i2 = 8;
        }
        this.f110122b.setVisibility(i2);
        this.f110123c.setVisibility(i2);
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f110125e;
    }

    /* renamed from: c */
    public final void mo59888c() {
    }

    /* renamed from: n */
    public final void mo51927n() {
        bkfr.m105607d(getRootView());
        bkfr.m105559a(getContext(), this);
    }

    public void onClick(View view) {
        bkip bkip = this.f110125e;
        if (bkip.f124294c) {
            bkfr.m105607d(getRootView());
            bkfr.m105559a(getContext(), this);
            this.f110125e.mo66041d(true);
            return;
        }
        bkip.mo66039c(true);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
            this.f110125e.mo66026a(bundle.getParcelable("expandedInstanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putParcelable("expandedInstanceState", this.f110125e.mo66024a());
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f110123c.setEnabled(z);
        bkfr.m105608d(this.f110123c, z);
        this.f110121a.setEnabled(z);
        bkfr.m105608d(this.f110121a, z);
        this.f110124d.setEnabled(z);
    }

    public SectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
