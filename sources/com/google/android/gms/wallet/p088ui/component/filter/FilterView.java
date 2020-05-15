package com.google.android.gms.wallet.p088ui.component.filter;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.wallet.ui.component.filter.FilterView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FilterView extends FlexboxLayout implements View.OnClickListener, bjwh, bjwm, bkea {

    /* renamed from: b */
    public ManageFiltersChipButton f110521b;

    /* renamed from: c */
    public bwhv f110522c;

    /* renamed from: d */
    public axaq f110523d;

    /* renamed from: e */
    public bkgd f110524e;

    /* renamed from: f */
    public axas f110525f;

    /* renamed from: g */
    public boolean f110526g;

    /* renamed from: h */
    public atj f110527h;

    /* renamed from: i */
    public asw f110528i;

    public FilterView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 27) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmmb.m108166a(bmmv.f130058d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "FilterView does not handle resulting action type %s", objArr));
        } else if (this.f110526g) {
            this.f110528i.f2143b = new axat(this);
            this.f110527h.mo2488a(this.f110528i);
        } else {
            mo60091m();
        }
    }

    /* renamed from: b */
    public final boolean mo52806b(List list) {
        return this.f110523d.mo52806b(list);
    }

    /* renamed from: bT */
    public final boolean mo52807bT() {
        return this.f110523d.mo52807bT();
    }

    /* renamed from: l */
    public final bwhy mo60090l() {
        return this.f110523d.mo52953c();
    }

    /* renamed from: m */
    public final void mo60091m() {
        if (getVisibility() == 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public void onClick(View view) {
        axas axas;
        if (view == this.f110521b && (axas = this.f110525f) != null) {
            axas.mo52858a(this.f110522c);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            setVisibility(bundle.getInt("viewVisibility"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putInt("viewVisibility", getVisibility());
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
        axaq axaq = this.f110523d;
        axaq.f95547a = (axap) axaq.f95548b.f124187b.findFragmentByTag("FilterCategoryDialogFragment");
        axap axap = axaq.f95547a;
        if (axap != null) {
            axap.mo52808n(z);
        }
    }

    public FilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof bjwh) {
                ((bjwh) childAt).mo52947bY();
            }
        }
    }

    public FilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final boolean mo52804a(List list) {
        return this.f110523d.mo52804a(list);
    }
}
