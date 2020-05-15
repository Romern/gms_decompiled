package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: fbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fbn extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ float f16207a;

    /* renamed from: b */
    final /* synthetic */ float f16208b;

    /* renamed from: c */
    final /* synthetic */ fbq f16209c;

    public fbn(fbq fbq, float f, float f2) {
        this.f16209c = fbq;
        this.f16207a = f;
        this.f16208b = f2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16209c.f16216c.f16218a.mo4046a((int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, 180);
        this.f16209c.mo10656a((AnimatorListenerAdapter) null);
        this.f16209c.f16216c.f16218a.mo4051b();
        fbq fbq = this.f16209c;
        float f = this.f16207a;
        float f2 = this.f16208b;
        fbq.f16216c.f16222e.setVisibility(0);
        fbq.f16215b = fbq.f16216c.f16222e.animate().alpha(1.0f).setDuration(300).setListener(new fbo(fbq, f, f2));
    }
}
