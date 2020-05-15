package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.airbnb.lottie.LottieAnimationView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: fbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fbr extends fbv {

    /* renamed from: a */
    LottieAnimationView f16218a;

    /* renamed from: b */
    ProductLockupView f16219b;

    /* renamed from: c */
    ffe f16220c;

    /* renamed from: d */
    public fbq f16221d;

    /* renamed from: e */
    AccountParticleDisc f16222e;

    /* renamed from: f */
    private eva f16223f;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f16218a = (LottieAnimationView) getView().findViewById(C0126R.C0129id.lottie_loading_animation);
        ProductLockupView productLockupView = (ProductLockupView) getView().findViewById(C0126R.C0129id.product_lockup);
        this.f16219b = productLockupView;
        productLockupView.f111295d = C1391tv.m20459b(productLockupView.getContext(), C0126R.C0127drawable.googlelogo_standard_color_vd_112x36);
        productLockupView.mo60462a();
        ProductLockupView productLockupView2 = this.f16219b;
        productLockupView2.f111297f = new azyq(getContext().getResources(), C0126R.dimen.product_name_text_size_asm, C0126R.dimen.logo_margin_top_asm, C0126R.dimen.logo_width_asm, C0126R.dimen.logo_height_asm, C0126R.dimen.separation_margin_asm);
        productLockupView2.f111298g = new int[]{-1, 1, 2};
        productLockupView2.f111296e = -1;
        productLockupView2.requestLayout();
        if (adyf.m51386a(eot.f15436a)) {
            this.f16219b.mo60465b(2);
            ProductLockupView productLockupView3 = this.f16219b;
            productLockupView3.f111293b.setTextColor(C1133kh.m17843b(productLockupView3.getContext(), C0126R.color.google_white));
        }
        this.f16222e = (AccountParticleDisc) getView().findViewById(C0126R.C0129id.avatar_disc);
        this.f16223f = new eva(this.f16222e, ((evc) getActivity()).mo6337a());
        C0034at atVar = this.f16220c.f16441a.f16264b;
        eva eva = this.f16223f;
        eva.getClass();
        atVar.mo2445a(this, new fbj(eva));
        this.f16221d = new fbq(this);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ffe ffe = ((ffh) activity).mo6340c().f16451f;
        this.f16220c = ffe;
        ffe.f16443c.f16381e.mo2445a(this, new fbi(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.as_splash_screen_fragment, viewGroup, false);
    }

    public final void onPause() {
        this.f16220c.f16444d.mo2444a(this);
        fbq fbq = this.f16221d;
        fbq.mo10654a();
        fbq.mo10657b();
        ViewPropertyAnimator viewPropertyAnimator = fbq.f16215b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setListener(null);
            fbq.f16215b.cancel();
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f16220c.f16444d.mo2445a(this, new fbk(this));
    }
}
