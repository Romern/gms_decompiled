package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.wallet.ui.common.OcrBelowCardNumberButtonView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OcrBelowCardNumberButtonView extends LinearLayout {
    public OcrBelowCardNumberButtonView(Context context) {
        super(context);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bkfr.m105572a((ImageView) findViewById(C0126R.C0129id.below_card_number_ocr_button_image), bkfr.m105588b(getContext()));
    }

    public OcrBelowCardNumberButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OcrBelowCardNumberButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OcrBelowCardNumberButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
