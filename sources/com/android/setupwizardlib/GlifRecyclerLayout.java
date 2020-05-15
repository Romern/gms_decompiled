package com.android.setupwizardlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GlifRecyclerLayout extends GlifLayout {

    /* renamed from: a */
    public bmv f7201a;

    public GlifRecyclerLayout(Context context) {
        this(context, 0, 0);
    }

    /* renamed from: a */
    private final void m4682a(AttributeSet attributeSet, int i) {
        bmv bmv = this.f7201a;
        Context context = bmv.f5170a.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, blz.f5148o, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            bmi bmi = new bmi((bmd) new bmj(context).mo3279a(resourceId));
            bmi.mo170a(obtainStyledAttributes.getBoolean(4, false));
            bmv.mo3291a(bmi);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize == -1) {
            bmv.mo3290a(obtainStyledAttributes.getDimensionPixelSize(3, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0));
        } else {
            bmv.mo3290a(dimensionPixelSize, 0);
        }
        obtainStyledAttributes.recycle();
        mo4085a(bmv.class, this.f7201a);
        bmw bmw = (bmw) mo4084a(bmw.class);
    }

    /* renamed from: c */
    public final View mo4081c(int i) {
        View findViewById;
        View view = this.f7201a.f5172c;
        return (view == null || (findViewById = view.findViewById(i)) == null) ? super.findViewById(i) : findViewById;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bmv bmv = this.f7201a;
        if (bmv.f5173d == null) {
            bmv.mo3289a();
        }
    }

    public GlifRecyclerLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifRecyclerLayout(Context context, int i, int i2) {
        super(context, i, i2);
        m4682a((AttributeSet) null, 0);
    }

    public GlifRecyclerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4682a(attributeSet, 0);
    }

    public GlifRecyclerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4682a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo4077a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = C0126R.C0128layout.suw_glif_recycler_template;
        }
        return super.mo4077a(layoutInflater, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ViewGroup mo4078a(int i) {
        if (i == 0) {
            i = C0126R.C0129id.suw_recycler_view;
        }
        return super.mo4078a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo4080a() {
        View findViewById = findViewById(C0126R.C0129id.suw_recycler_view);
        if (findViewById instanceof RecyclerView) {
            this.f7201a = new bmv(this, (RecyclerView) findViewById);
            return;
        }
        throw new IllegalStateException("GlifRecyclerLayout should use a template with recycler view");
    }
}
