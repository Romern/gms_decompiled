package com.google.android.wallet.p097ui.animation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: com.google.android.wallet.ui.animation.ImageWithCaptionLottieView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ImageWithCaptionLottieView extends FrameLayout {

    /* renamed from: a */
    public ImageWithCaptionView f151857a;

    /* renamed from: b */
    public LottieAnimationView f151858b;

    /* renamed from: c */
    public boolean f151859c;

    public ImageWithCaptionLottieView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo71821a(bmno bmno) {
        if ((bmno.f130140a & 2) != 0) {
            ImageWithCaptionView imageWithCaptionView = new ImageWithCaptionView(getContext());
            this.f151857a = imageWithCaptionView;
            imageWithCaptionView.mo71992a(bmno, bjvn.m104721b(getContext()), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
            addView(this.f151857a);
        }
        if ((bmno.f130140a & 8) != 0) {
            bmkz bmkz = bmno.f130144e;
            if (bmkz == null) {
                bmkz = bmkz.f129905c;
            }
            if (!bmkz.f129907a.isEmpty()) {
                LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
                this.f151858b = lottieAnimationView;
                bmkz bmkz2 = bmno.f130144e;
                if (bmkz2 == null) {
                    bmkz2 = bmkz.f129905c;
                }
                lottieAnimationView.mo4048a((axw) aye.m2425a(bmkz2.f129907a).f2600a);
                LottieAnimationView lottieAnimationView2 = this.f151858b;
                bmkz bmkz3 = bmno.f130144e;
                if (bmkz3 == null) {
                    bmkz3 = bmkz.f129905c;
                }
                int a = bmky.m108133a(bmkz3.f129908b);
                boolean z = true;
                if (a == 0) {
                    a = 1;
                }
                if (a != 3) {
                    z = false;
                }
                lottieAnimationView2.mo4050a(z);
                addView(this.f151858b);
            }
        }
    }

    public final void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        if (!z) {
            f = 0.3f;
        } else {
            f = 1.0f;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof LottieAnimationView) {
                childAt.setAlpha(f);
            }
        }
    }

    public ImageWithCaptionLottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageWithCaptionLottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
