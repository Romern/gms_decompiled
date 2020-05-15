package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.material.tabs.TabLayout;

/* renamed from: fak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fak extends fbv {

    /* renamed from: a */
    public feq f16153a;

    /* renamed from: b */
    public bswt f16154b;

    /* renamed from: c */
    public fai f16155c;

    /* renamed from: d */
    public AccessibilityManager f16156d;

    /* renamed from: e */
    public AccountParticleDisc f16157e;

    /* renamed from: f */
    public ViewPager f16158f;

    /* renamed from: g */
    public LottieAnimationView f16159g;

    /* renamed from: h */
    public int f16160h;

    /* renamed from: i */
    public boolean f16161i;

    /* renamed from: j */
    public eva f16162j;

    /* renamed from: a */
    public final String mo10634a(int i) {
        String str = ((bswu) this.f16154b.f147493c.get(i)).f147498a;
        String str2 = ((bswu) this.f16154b.f147493c.get(i)).f147499b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("\n");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public final int mo10635b(int i) {
        return evi.m11187a(getContext()) ? (this.f16154b.f147493c.size() - i) - 1 : i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.d(android.view.View, int):void
     arg types: [com.google.android.material.tabs.TabLayout, int]
     candidates:
      ps.d(android.view.View, float):void
      ps.d(android.view.View, int):void */
    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        View view = getView();
        epm c = this.f16153a.f16409a.mo10736c();
        if (c.f15487c == 3) {
            bdej a = ((evc) getActivity()).mo6337a();
            this.f16157e = (AccountParticleDisc) view.findViewById(C0126R.C0129id.avatar_disc);
            eva eva = new eva(this.f16157e, a);
            this.f16162j = eva;
            fcg fcg = this.f16153a.f16410b;
            eql eql = fcg.f16267e;
            eva.mo10524a(eql != null ? (bmxv) eql.mo10415a(fcg.mo10683b()).mo2448b() : bmvz.f131120a);
            this.f16153a.f16410b.f16264b.mo2445a(this, new fac(this));
            this.f16157e.setVisibility(0);
            this.f16159g = (LottieAnimationView) view.findViewById(C0126R.C0129id.lottie_onboarding_animation);
            this.f16158f = (ViewPager) view.findViewById(C0126R.C0129id.onboarding_view_pager);
            this.f16160h = this.f16153a.f16409a.mo10737d().f147589b;
            this.f16154b = c.f15485a;
            faj faj = new faj(this, getContext());
            this.f16158f.mo2136a(faj);
            feq feq = this.f16153a;
            int i2 = this.f16160h;
            int i3 = ((bswu) this.f16154b.f147493c.get(0)).f147502e;
            feq.f16413e = i3;
            feq.f16412d.mo10741a(0, i2, 0, i3);
            this.f16155c = new fai(this, c.f15486b);
            this.f16161i = false;
            fae fae = new fae(this);
            fai fai = this.f16155c;
            bsus bsus = ((bswu) this.f16154b.f147493c.get(0)).f147500c;
            if (bsus == null) {
                bsus = bsus.f147182c;
            }
            fai.mo10633a(bsus, fae);
            this.f16156d = (AccessibilityManager) getContext().getSystemService("accessibility");
            this.f16158f.mo2137a(new faf(this, fae));
            if (evi.m11187a(getContext())) {
                this.f16158f.mo2143b(faj.mo2709a() - 1);
            }
            if (cbro.m128198b() && this.f16156d.isTouchExplorationEnabled()) {
                this.f16158f.setContentDescription(mo10634a(0));
                this.f16158f.requestFocus();
                this.f16158f.sendAccessibilityEvent(8);
            }
            if (this.f16154b.f147493c.size() > 1) {
                TabLayout tabLayout = (TabLayout) view.findViewById(C0126R.C0129id.page_indicator);
                tabLayout.mo71218a(this.f16158f);
                tabLayout.setVisibility(0);
                if (cbro.m128198b() && this.f16156d.isTouchExplorationEnabled()) {
                    for (int i4 = 0; i4 < tabLayout.mo71227b(); i4++) {
                        if (evi.m11187a(getContext())) {
                            i = (tabLayout.mo71227b() - i4) - 1;
                        } else {
                            i = i4;
                        }
                        tabLayout.mo71216a(i4).mo64062a(getResources().getString(C0126R.string.as_warm_welcome_tab_indicator_button_a11y_description, Integer.valueOf(i + 1), Integer.valueOf(tabLayout.mo71227b()), ((bswu) this.f16154b.f147493c.get(i)).f147498a));
                    }
                }
                C1280ps.m19912d((View) tabLayout, 0);
            }
            Button button = (Button) view.findViewById(C0126R.C0129id.skip_button);
            button.setOnClickListener(new fad(this, button));
            button.setText(this.f16154b.f147495e);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        feq feq = ((ffh) activity).mo6340c().f16452g;
        this.f16153a = feq;
        feq.f16411c.f16381e.mo2445a(this, new fab(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.as_onboarding_flow_fragment, viewGroup, false);
    }
}
