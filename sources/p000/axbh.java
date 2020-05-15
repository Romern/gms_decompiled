package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.wallet.p088ui.component.instrument.creditcard.CvcHintImageView;

/* renamed from: axbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbh extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f95685a;

    /* renamed from: b */
    final /* synthetic */ CvcHintImageView f95686b;

    public axbh(CvcHintImageView cvcHintImageView, int i) {
        this.f95686b = cvcHintImageView;
        this.f95685a = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.wallet.ui.component.instrument.creditcard.CvcHintImageView.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(bmno, android.content.Context):android.graphics.drawable.Drawable
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(com.android.volley.toolbox.ImageLoader, int):void
      com.google.android.wallet.ui.common.FifeNetworkImageView.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.gms.wallet.ui.component.instrument.creditcard.CvcHintImageView.a(int, boolean):void */
    public final void onAnimationEnd(Animator animator) {
        this.f95686b.mo60105a(this.f95685a, false);
        this.f95686b.setAlpha(1.0f);
        this.f95686b.animate().setListener(null);
    }
}
