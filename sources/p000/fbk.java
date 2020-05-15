package p000;

import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: fbk */
final /* synthetic */ class fbk implements C0038ax {

    /* renamed from: a */
    private final fbr f16204a;

    public fbk(fbr fbr) {
        this.f16204a = fbr;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        fbr fbr = this.f16204a;
        ffd ffd = (ffd) obj;
        if (ffd == ffd.BRANDING) {
            fbq fbq = fbr.f16221d;
            fbq.mo10657b();
            fbq.f16216c.f16219b.setVisibility(0);
            fbq.f16214a = AnimationUtils.loadAnimation(fbq.f16216c.getContext(), C0126R.anim.as_splash_screen_branding_anim);
            fbq.f16214a.setAnimationListener(new fbl(fbq));
            fbq.f16216c.f16219b.startAnimation(fbq.f16214a);
        } else if (ffd == ffd.LOADING_SPINNER) {
            fbq fbq2 = fbr.f16221d;
            fbq2.mo10654a();
            fbq2.f16216c.f16218a.mo4059d();
            fbq2.f16216c.f16219b.setVisibility(8);
            fbq2.f16216c.f16218a.setVisibility(0);
            fbq2.f16216c.f16218a.mo4046a(0, 135);
            fbq2.f16216c.f16218a.mo4050a(false);
            fbq2.mo10656a(new fbm(fbq2));
            fbq2.f16216c.f16218a.mo4051b();
        } else if (ffd == ffd.FINISHING_WITHOUT_ONBOARDING) {
            Resources resources = fbr.getContext().getResources();
            fbr.f16221d.mo10655a((float) resources.getDimensionPixelSize(C0126R.dimen.as_expanded_avatar_size), (float) resources.getDimensionPixelSize(C0126R.dimen.as_appbar_expanded_avatar_top_margin));
        } else if (ffd == ffd.FINISHING_WITH_ONBOARDING) {
            Resources resources2 = fbr.getContext().getResources();
            fbr.f16221d.mo10655a((float) resources2.getDimensionPixelSize(C0126R.dimen.as_ob_avatar_size), (float) resources2.getDimensionPixelSize(C0126R.dimen.as_ob_avatar_margin_top));
        }
    }
}
