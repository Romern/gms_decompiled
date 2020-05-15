package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;

/* renamed from: fbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fbo extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ float f16210a;

    /* renamed from: b */
    final /* synthetic */ float f16211b;

    /* renamed from: c */
    final /* synthetic */ fbq f16212c;

    public fbo(fbq fbq, float f, float f2) {
        this.f16212c = fbq;
        this.f16210a = f;
        this.f16211b = f2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16212c.f16215b.setListener(null);
        fbq fbq = this.f16212c;
        float f = this.f16210a;
        float f2 = this.f16211b;
        if (!evi.m11189b(fbq.f16216c.getContext())) {
            fbq.f16216c.f16220c.mo10770b();
        }
        fbq.f16216c.f16218a.setVisibility(8);
        fbq.f16216c.f16222e.setVisibility(0);
        fbq.f16216c.f16222e.setAlpha(1.0f);
        Resources resources = fbq.f16216c.getContext().getResources();
        float dimensionPixelSize = f / ((float) resources.getDimensionPixelSize(C0126R.dimen.as_splash_screen_avatar_size));
        fbq.f16215b = fbq.f16216c.f16222e.animate().translationY((f2 - fbq.f16216c.f16222e.getY()) - ((((float) resources.getDimensionPixelSize(C0126R.dimen.as_splash_screen_avatar_size)) * (1.0f - dimensionPixelSize)) / 2.0f)).scaleX(dimensionPixelSize).scaleY(dimensionPixelSize).setDuration(350).setInterpolator(new akd()).setListener(new fbp(fbq));
    }
}
