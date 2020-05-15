package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: com.google.android.wallet.ui.common.MaterialFieldRegionCodeView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MaterialFieldRegionCodeView extends RegionCodeView {

    /* renamed from: a */
    public MaterialFieldLayout f152174a;

    /* renamed from: b */
    MaterialFieldLayout f152175b;

    /* renamed from: c */
    public String f152176c;

    public MaterialFieldRegionCodeView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo72073a(List list) {
        super.mo72073a(list);
        int i = 8;
        this.f152174a.setVisibility(list.size() == 1 ? 8 : 0);
        MaterialFieldLayout materialFieldLayout = this.f152175b;
        if (list.size() == 1) {
            i = 0;
        }
        materialFieldLayout.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f152174a = (MaterialFieldLayout) findViewById(C0126R.C0129id.region_code_spinner_container);
        this.f152175b = (MaterialFieldLayout) findViewById(C0126R.C0129id.region_code_text_container);
        if (!TextUtils.isEmpty(this.f152176c)) {
            this.f152174a.mo72053c(this.f152176c);
        }
    }

    public MaterialFieldRegionCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaterialFieldRegionCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MaterialFieldRegionCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
