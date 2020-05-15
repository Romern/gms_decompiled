package com.google.android.gms.udc.p077ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: com.google.android.gms.udc.ui.ResizeableIllustrationHeaderView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ResizeableIllustrationHeaderView extends LinearLayout {

    /* renamed from: b */
    private static final srn f109394b = srn.m36124a();

    /* renamed from: a */
    public double f109395a = 1.5d;

    /* renamed from: c */
    private float f109396c = 0.0f;

    public ResizeableIllustrationHeaderView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final ViewGroup m93676a() {
        try {
            ViewGroup viewGroup = (ViewGroup) findViewById(C0126R.C0129id.illustration_container);
            if (viewGroup == null) {
                bnsl bnsl = (bnsl) f109394b.mo68387b();
                bnsl.mo68432a("com.google.android.gms.udc.ui.ResizeableIllustrationHeaderView", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Cannot find illustration container.");
            }
            return viewGroup;
        } catch (ClassCastException e) {
            bnsl bnsl2 = (bnsl) f109394b.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("com.google.android.gms.udc.ui.ResizeableIllustrationHeaderView", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Illustration container is not ViewGroup");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        if (r1 != 0) goto L_0x002d;
     */
    public final void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        int i3;
        int i4 = (int) (this.f109396c * ((float) getContext().getResources().getDisplayMetrics().heightPixels));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(i4, View.MeasureSpec.getSize(i2));
        }
        i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        int size = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE));
        try {
            viewGroup = (ViewGroup) findViewById(C0126R.C0129id.illustration_container);
            if (viewGroup == null) {
                bnsl bnsl = (bnsl) f109394b.mo68387b();
                bnsl.mo68432a("com.google.android.gms.udc.ui.ResizeableIllustrationHeaderView", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Cannot find illustration container.");
            }
        } catch (ClassCastException e) {
            bnsl bnsl2 = (bnsl) f109394b.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("com.google.android.gms.udc.ui.ResizeableIllustrationHeaderView", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Illustration container is not ViewGroup");
            viewGroup = null;
        }
        if (viewGroup != null) {
            if (viewGroup.getVisibility() == 0) {
                i3 = viewGroup.getMeasuredHeight();
            } else {
                i3 = 0;
            }
            int a = avgy.m78500a(Math.max(0, size - (getMeasuredHeight() - i3)), this.f109395a, getMeasuredWidth());
            if (a == 0) {
                viewGroup.setVisibility(8);
            } else {
                viewGroup.getLayoutParams().height = a;
                viewGroup.setVisibility(0);
            }
            super.onMeasure(i, i2);
        }
    }

    public ResizeableIllustrationHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93677a(context, attributeSet);
    }

    public ResizeableIllustrationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93677a(context, attributeSet);
    }

    /* renamed from: a */
    private final void m93677a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, avha.f93171a, 0, 0);
            try {
                this.f109396c = obtainStyledAttributes.getFloat(0, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
