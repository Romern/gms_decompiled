package com.google.android.gms.tapandpay.tap2;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TapLottieAnimationView extends LottieAnimationView {

    /* renamed from: e */
    private static final srn f108684e = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public TapLottieAnimationView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f108684e.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Lottie draw failure suppressed");
        }
    }

    public TapLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TapLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
