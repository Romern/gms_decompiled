package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: fbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fbm extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ fbq f16206a;

    public fbm(fbq fbq) {
        this.f16206a = fbq;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16206a.mo10656a((AnimatorListenerAdapter) null);
        if (this.f16206a.f16216c.f16220c.mo10769a() != ffd.FINISHING_WITH_ONBOARDING && this.f16206a.f16216c.f16220c.mo10769a() != ffd.FINISHING_WITHOUT_ONBOARDING) {
            this.f16206a.f16216c.f16218a.mo4046a(0, 135);
            this.f16206a.f16216c.f16218a.mo4050a(true);
            this.f16206a.f16216c.f16218a.mo4042a();
        }
    }
}
