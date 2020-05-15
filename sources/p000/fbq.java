package p000;

import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: fbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fbq {

    /* renamed from: a */
    public Animation f16214a;

    /* renamed from: b */
    ViewPropertyAnimator f16215b;

    /* renamed from: c */
    public final fbr f16216c;

    /* renamed from: d */
    private AnimatorListenerAdapter f16217d;

    /* renamed from: b */
    public final void mo10657b() {
        mo10656a((AnimatorListenerAdapter) null);
        this.f16216c.f16218a.mo4059d();
    }

    public fbq(fbr fbr) {
        this.f16216c = fbr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10654a() {
        Animation animation = this.f16214a;
        if (animation != null) {
            animation.setAnimationListener(null);
            this.f16214a.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10655a(float f, float f2) {
        mo10654a();
        this.f16216c.f16218a.mo4059d();
        this.f16216c.f16218a.mo4046a(0, (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED);
        this.f16216c.f16218a.mo4050a(false);
        mo10656a(new fbn(this, f, f2));
        this.f16216c.f16219b.setVisibility(8);
        this.f16216c.f16218a.setVisibility(0);
        this.f16216c.f16218a.mo4051b();
    }

    /* renamed from: a */
    public final void mo10656a(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f16216c.f16218a.mo4054b(this.f16217d);
        this.f16217d = animatorListenerAdapter;
        if (animatorListenerAdapter != null) {
            this.f16216c.f16218a.mo4047a(animatorListenerAdapter);
        }
    }
}
