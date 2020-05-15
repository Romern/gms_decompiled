package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.accountsettings.widget.PagerTabContainer;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fas extends fbu {

    /* renamed from: a */
    public feu f16170a;

    /* renamed from: b */
    public fem f16171b;

    /* renamed from: c */
    public bsxn f16172c;

    /* renamed from: d */
    public PagerTabContainer f16173d;

    /* renamed from: e */
    public TabLayout f16174e;

    /* renamed from: f */
    public List f16175f;

    /* renamed from: g */
    boolean f16176g;

    /* renamed from: h */
    private far f16177h;

    /* renamed from: i */
    private ViewPager f16178i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public fas() {
        this(null);
        ffs ffs = ffs.f16473a;
        new fat();
    }

    /* renamed from: a */
    public static fes m11376a(bsxn bsxn) {
        return fes.m11567a("", null, bsxn);
    }

    /* renamed from: b */
    private final void m11377b(bsxn bsxn) {
        int g = bnjd.m109601g(this.f16175f, new fao(bsxn));
        if (g != -1) {
            ViewPager viewPager = this.f16178i;
            if (g != viewPager.f1754c) {
                this.f16176g = true;
                viewPager.mo2143b(g);
                this.f16176g = false;
            }
        }
    }

    /* renamed from: aU */
    public final bsxn mo10584aU() {
        return this.f16172c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aV */
    public final View mo10640aV() {
        return getView();
    }

    /* renamed from: c */
    public final fek mo10624c() {
        return new fek(getClass().getName(), null);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        fet a = fet.m11571a(epr.m10932d(getArguments().getByteArray("topNavKey")));
        ffg c = ((ffh) activity).mo6340c();
        feu feu = new feu(a, c.f16446a, c.f16447b);
        this.f16170a = feu;
        C0052bk.m3244a(feu.f16418c, fer.f16415a).mo2445a(this, new fal(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.d(android.view.View, int):void
     arg types: [com.google.android.material.tabs.TabLayout, int]
     candidates:
      ps.d(android.view.View, float):void
      ps.d(android.view.View, int):void */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.as_pager_frame_fragment, viewGroup, false);
        this.f16177h = new far(this, getChildFragmentManager());
        ViewPager viewPager = (ViewPager) inflate.findViewById(C0126R.C0129id.pager);
        this.f16178i = viewPager;
        viewPager.mo2136a(this.f16177h);
        this.f16178i.mo2137a(new fap(this));
        PagerTabContainer pagerTabContainer = (PagerTabContainer) inflate.findViewById(C0126R.C0129id.tab_layout_parent);
        this.f16173d = pagerTabContainer;
        this.f16174e = pagerTabContainer.f7815a;
        if (cbro.m128208l()) {
            this.f16173d.f7815a.f7821a = new fam(this);
        }
        adyg.m51402a(this.f16174e, 3, eot.f15436a);
        this.f16174e.mo71218a(this.f16178i);
        if (evi.m11187a(getContext())) {
            C1280ps.m19912d((View) this.f16174e, 0);
        }
        if (bundle == null) {
            bsxn bsxn = this.f16171b.f16392a.f15491a.f147583d;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            this.f16172c = bsxn;
            mo10639a(bngx.m109356a(m11376a(bsxn)));
        }
        this.f16173d.mo6362b(2);
        return inflate;
    }

    public fas(byte[] bArr) {
        this.f16175f = bngx.m109376e();
    }

    /* renamed from: a */
    public final void mo10638a(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f16174e.f151268w == 0) {
            char c = 1;
            this.f16173d.mo6362b(1);
            TabLayout tabLayout = this.f16174e;
            int i6 = -1;
            if (tabLayout.f151268w == 0) {
                boolean a = evi.m11187a(tabLayout.getContext());
                if (!a) {
                    i4 = 1;
                } else {
                    i4 = -1;
                }
                boolean isSmoothScrollingEnabled = this.f16174e.isSmoothScrollingEnabled();
                if (!a) {
                    i5 = 66;
                } else {
                    i5 = 17;
                }
                this.f16174e.setSmoothScrollingEnabled(false);
                this.f16174e.fullScroll(i5);
                this.f16174e.setSmoothScrollingEnabled(isSmoothScrollingEnabled);
                int b = a ? this.f16174e.mo71227b() - 1 : this.f16174e.mo71227b();
                for (int i7 = !a; i7 < b; i7++) {
                    bhnu a2 = this.f16174e.mo71216a(i7);
                    if (a2 == null) {
                        break;
                    }
                    a2.f119169h.setTranslationX(((float) i4) * this.f16174e.getResources().getDimension(C0126R.dimen.as_tabs_startup_animation_shift));
                }
            }
            TabLayout tabLayout2 = this.f16174e;
            Resources resources = tabLayout2.getResources();
            int integer = resources.getInteger(C0126R.integer.as_tabs_startup_animation_duration);
            int integer2 = resources.getInteger(C0126R.integer.as_tab_startup_animation_delay);
            int integer3 = resources.getInteger(C0126R.integer.as_tab_startup_animation_diff);
            boolean a3 = evi.m11187a(tabLayout2.getContext());
            ArrayList arrayList = new ArrayList(tabLayout2.mo71227b() + 1);
            akc akc = new akc();
            int i8 = 2;
            int[] iArr = new int[2];
            iArr[0] = tabLayout2.getScrollX();
            if (a3) {
                i = tabLayout2.getChildAt(0).getWidth() - tabLayout2.getWidth();
            } else {
                i = 0;
            }
            iArr[1] = i;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(tabLayout2, "scrollX", iArr);
            long j2 = (long) integer;
            ofInt.setDuration(j2);
            ofInt.setInterpolator(akc);
            arrayList.add(ofInt);
            long j3 = (long) integer2;
            int i9 = 1;
            while (i9 < tabLayout2.mo71227b()) {
                if (a3) {
                    i2 = (tabLayout2.mo71227b() - i9) + i6;
                } else {
                    i2 = i9;
                }
                bhnu a4 = tabLayout2.mo71216a(i2);
                if (a4 != null) {
                    bhnx bhnx = a4.f119169h;
                    float[] fArr = new float[i8];
                    fArr[0] = bhnx.getTranslationX();
                    fArr[c] = 0.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bhnx, "translationX", fArr);
                    ofFloat.setDuration(j2);
                    ofFloat.setInterpolator(akc);
                    ofFloat.setStartDelay(j3);
                    arrayList.add(ofFloat);
                    i3 = i9;
                    j3 += (long) integer3;
                } else {
                    i3 = i9;
                }
                i9 = i3 + 1;
                c = 1;
                i6 = -1;
                i8 = 2;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setStartDelay(j);
            animatorSet.start();
            animatorSet.addListener(new faq(this));
        }
    }

    /* renamed from: a */
    public final void mo10639a(bngx bngx) {
        this.f16175f = bngx;
        this.f16176g = true;
        this.f16177h.mo2720c();
        this.f16176g = false;
        m11377b(this.f16172c);
    }

    /* renamed from: a */
    public final void mo10557a(fem fem) {
        epq epq = fem.f16392a;
        if (mo10558a(epq)) {
            bsxn bsxn = epq.f15491a.f147583d;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            if (!sdg.m34949a(bsxn, this.f16172c)) {
                this.f16172c = bsxn;
                m11377b(bsxn);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo10558a(epq epq) {
        return sdg.m34949a(epr.m10935g(epq.mo10395b()), ((fcm) this.f16170a.f16416a).f16281a);
    }
}
