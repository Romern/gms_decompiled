package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: com.google.android.wallet.ui.common.MaterialFieldManagerLinearLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MaterialFieldManagerLinearLayout extends LinearLayout {

    /* renamed from: a */
    private final bkem f152172a;

    /* renamed from: b */
    private bjxv f152173b;

    public MaterialFieldManagerLinearLayout(Context context) {
        super(context);
        this.f152172a = new bkem(context, getViewTreeObserver());
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(layoutParams);
        bkem bkem = this.f152172a;
        if (this.f152173b == null) {
            this.f152173b = bjxv.m104861c();
        }
        View a = bkem.mo65899a(view, this, this.f152173b);
        if (a.getLayoutParams() != null) {
            layoutParams2 = a.getLayoutParams();
        }
        super.addView(a, i, layoutParams2);
    }

    public final int indexOfChild(View view) {
        return super.indexOfChild(this.f152172a.mo65898a(view));
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedState"));
        this.f152173b = bjxv.m104860b(bundle);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedState", super.onSaveInstanceState());
        bjxv bjxv = this.f152173b;
        if (bjxv != null) {
            bjxv.mo65615a(bundle);
        }
        return bundle;
    }

    public final void removeAllViews() {
        this.f152172a.mo65900a();
        super.removeAllViews();
    }

    public final void removeView(View view) {
        super.removeView(this.f152172a.mo65898a(view));
        this.f152172a.mo65901b(view);
    }

    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        if (childAt instanceof MaterialFieldLayout) {
            this.f152172a.mo65901b(((MaterialFieldLayout) childAt).f152147b);
        }
        super.removeViewAt(i);
    }

    public MaterialFieldManagerLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f152172a = new bkem(context, getViewTreeObserver());
    }

    public MaterialFieldManagerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f152172a = new bkem(context, getViewTreeObserver());
    }

    public MaterialFieldManagerLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f152172a = new bkem(context, getViewTreeObserver());
    }
}
