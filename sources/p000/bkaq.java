package p000;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.animation.ImageWithCaptionLottieView;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bkaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkaq extends bkdx {

    /* renamed from: a */
    FrameLayout f123840a;

    /* renamed from: b */
    ImageView f123841b;

    /* renamed from: c */
    ImageWithCaptionLottieView f123842c;

    /* renamed from: d */
    FormHeaderView f123843d;

    /* renamed from: e */
    ViewGroup f123844e;

    /* renamed from: f */
    public ViewGroup f123845f;

    /* renamed from: g */
    InfoMessageView f123846g;

    /* renamed from: h */
    InfoMessageView f123847h;

    /* renamed from: i */
    ViewGroup f123848i;

    /* renamed from: j */
    private final bjes f123849j = new bjes(20);

    /* renamed from: k */
    private final bkip f123850k = new bkip();

    /* renamed from: l */
    private View f123851l;

    /* renamed from: m */
    private final ArrayList f123852m = new ArrayList();

    /* renamed from: n */
    private final ArrayList f123853n = new ArrayList();

    /* renamed from: o */
    private final TextWatcher f123854o = new bkap(this);

    /* renamed from: T */
    public final ArrayList mo52820T() {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LottieAnimationView lottieAnimationView;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fragment_yodlee, (ViewGroup) null, false);
        this.f123851l = inflate;
        FormHeaderView formHeaderView = (FormHeaderView) inflate.findViewById(C0126R.C0129id.yodlee_form_header);
        this.f123843d = formHeaderView;
        bmdn bmdn = ((bmha) this.f124069w).f129380b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        formHeaderView.mo71963a(bmdn, layoutInflater, mo65982av(), this.f123853n);
        this.f123844e = (ViewGroup) this.f123851l.findViewById(C0126R.C0129id.yodlee_image_container);
        int dimension = (int) getResources().getDimension(C0126R.dimen.wallet_uic_spacing_material_top_bottom);
        bxwc bxwc = ((bmha) this.f124069w).f129381c;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            this.f123844e.addView(ImageWithCaptionView.m118567a((bmno) bxwc.get(i), this.f123962aG, this.f123844e, mo65818aq().mo65614a(), dimension, 0, mo65980at(), 8388611));
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f123851l.findViewById(C0126R.C0129id.dynamic_challenge_questions);
        this.f123845f = viewGroup2;
        viewGroup2.removeAllViews();
        this.f123850k.mo66035b();
        bxwc bxwc2 = ((bmha) this.f124069w).f129382d;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bmqf bmqf = (bmqf) bxwc2.get(i2);
            bkfu bkfu = new bkfu(bmqf, layoutInflater, mo65818aq(), this.f123845f);
            bkfu.f124162a = getActivity();
            bkfu.f124164c = mo65980at();
            bkfu.f124167f = this;
            View a = bkem.m105437a(this.f123962aG, bkfu.mo65971a(), this.f123845f, mo65818aq().mo65614a());
            bkde bkde = new bkde(bmqf.f130376e, a, bkft.m105642b(bmqf));
            View b = bkft.m105641b(a);
            if (b instanceof FormEditText) {
                ((FormEditText) b).addTextChangedListener(this.f123854o);
            }
            this.f123852m.add(bkde);
            this.f123850k.mo66027a(bkde);
            this.f123845f.addView(a);
            bjwl.m104784a(a, bmqf.f130376e, this.f124196aK);
        }
        this.f123850k.mo66038c();
        this.f123846g = (InfoMessageView) this.f123851l.findViewById(C0126R.C0129id.yodlee_footer_info_message);
        if ((((bmha) this.f124069w).f129379a & 16) != 0) {
            this.f123846g.setVisibility(0);
            InfoMessageView infoMessageView = this.f123846g;
            bmnr bmnr = ((bmha) this.f124069w).f129386h;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72003a(bmnr);
            this.f123846g.mo72002a((bkdw) this);
            this.f123853n.add(this.f123846g);
        } else {
            this.f123846g.setVisibility(8);
        }
        this.f123847h = (InfoMessageView) this.f123851l.findViewById(C0126R.C0129id.yodlee_legal_message);
        if ((((bmha) this.f124069w).f129379a & 8) != 0) {
            this.f123847h.setVisibility(0);
            InfoMessageView infoMessageView2 = this.f123847h;
            bmjf bmjf = ((bmha) this.f124069w).f129385g;
            if (bmjf == null) {
                bmjf = bmjf.f129685i;
            }
            bmnr bmnr2 = bmjf.f129689c;
            if (bmnr2 == null) {
                bmnr2 = bmnr.f130153o;
            }
            infoMessageView2.mo72003a(bmnr2);
            this.f123847h.mo72002a((bkdw) this);
            this.f123853n.add(this.f123847h);
        } else {
            this.f123847h.setVisibility(8);
        }
        this.f123842c = (ImageWithCaptionLottieView) this.f123851l.findViewById(C0126R.C0129id.yodlee_completed_lottie);
        bmha bmha = (bmha) this.f124069w;
        int i3 = bmha.f129379a;
        if ((i3 & 4) != 0) {
            bmno bmno = bmha.f129384f;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            if (bjvn.m104718a(bmno.f130142c)) {
                bmno bmno2 = ((bmha) this.f124069w).f129384f;
                if (bmno2 == null) {
                    bmno2 = bmno.f130138m;
                }
                if (bjvn.m104720b(bmno2.f130142c) == 106) {
                    this.f123842c.setVisibility(8);
                    this.f123840a = (FrameLayout) this.f123851l.findViewById(C0126R.C0129id.yodlee_progress_container);
                    this.f123841b = (ImageView) this.f123851l.findViewById(C0126R.C0129id.yodlee_progress_animator);
                }
            }
            this.f123842c.setVisibility(0);
            ImageWithCaptionLottieView imageWithCaptionLottieView = this.f123842c;
            bmno bmno3 = ((bmha) this.f124069w).f129384f;
            if (bmno3 == null) {
                bmno3 = bmno.f130138m;
            }
            imageWithCaptionLottieView.mo71821a(bmno3);
        } else if ((i3 & 2) != 0) {
            this.f123842c.setVisibility(0);
            ImageWithCaptionLottieView imageWithCaptionLottieView2 = this.f123842c;
            bmno bmno4 = ((bmha) this.f124069w).f129383e;
            if (bmno4 == null) {
                bmno4 = bmno.f130138m;
            }
            imageWithCaptionLottieView2.mo71821a(bmno4);
            ImageWithCaptionLottieView imageWithCaptionLottieView3 = this.f123842c;
            if (!imageWithCaptionLottieView3.f151859c && (lottieAnimationView = imageWithCaptionLottieView3.f151858b) != null) {
                lottieAnimationView.mo4042a();
                ImageWithCaptionView imageWithCaptionView = imageWithCaptionLottieView3.f151857a;
                if (imageWithCaptionView != null) {
                    imageWithCaptionView.setVisibility(8);
                }
            }
            imageWithCaptionLottieView3.f151859c = true;
        } else {
            this.f123842c.setVisibility(8);
        }
        this.f123848i = (ViewGroup) this.f123851l.findViewById(C0126R.C0129id.yodlee_button_container);
        bxwc bxwc3 = ((bmha) this.f124069w).f129387i;
        int size3 = bxwc3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            bkbs.m105284a((bmdb) bxwc3.get(i4), this.f123962aG, this.f124196aK, mo65980at(), layoutInflater, this.f123848i);
        }
        if (((bmha) this.f124069w).f129388j != 0) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("EventListener.EXTRA_SHOULD_AUTO_SUBMIT", true);
            bundle2.putLong("EventListener.EXTRA_AUTO_SUBMIT_TIME_OUT_MILLIS", ((bmha) this.f124069w).f129388j);
            mo51905a(4, bundle2);
        }
        return this.f123851l;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return mo52806b((List) null);
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f123850k;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f123853n;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f123852m;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f123849j;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z;
        boolean z2;
        Animatable animatable;
        if (this.f123851l != null) {
            boolean z3 = this.f124195aJ;
            int i = ((bmha) this.f124069w).f129379a & 4;
            ImageView imageView = this.f123841b;
            if (!(imageView == null || (animatable = (Animatable) imageView.getDrawable()) == null)) {
                if (z3) {
                    animatable.stop();
                    this.f123840a.setVisibility(8);
                } else {
                    this.f123840a.setVisibility(0);
                    animatable.start();
                }
            }
            ImageWithCaptionLottieView imageWithCaptionLottieView = this.f123842c;
            if (imageWithCaptionLottieView != null) {
                imageWithCaptionLottieView.setEnabled(z3);
            }
            FormHeaderView formHeaderView = this.f123843d;
            boolean z4 = true;
            if (z3) {
                z = true;
            } else {
                z = i != 0;
            }
            formHeaderView.setEnabled(z);
            InfoMessageView infoMessageView = this.f123846g;
            if (z3) {
                z2 = true;
            } else {
                z2 = i != 0;
            }
            infoMessageView.setEnabled(z2);
            InfoMessageView infoMessageView2 = this.f123847h;
            if (!z3 && i == 0) {
                z4 = false;
            }
            infoMessageView2.setEnabled(z4);
            int childCount = this.f123845f.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.f123845f.getChildAt(i2).setEnabled(z3);
            }
            bkfr.m105570a(this.f123848i, z3);
            bkfr.m105570a(this.f123844e, z3);
        }
    }

    public final void onResume() {
        if ((((bmha) this.f124069w).f129379a & 4) != 0) {
            mo51905a(17, Bundle.EMPTY);
        }
        super.onResume();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmha.f129377k.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmha) this.f124069w).f129380b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmdn bmdn = ((bmha) this.f124069w).f129380b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        String str = bmdn.f128834b;
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        if (!str.equals(bmaf.f128438a)) {
            return false;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        if (bmaf2.f128439b != 1) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            bmaf bmaf3 = bmas.f128496a;
            if (bmaf3 == null) {
                bmaf3 = bmaf.f128436d;
            }
            objArr[0] = Integer.valueOf(bmaf3.f128439b);
            throw new IllegalArgumentException(String.format(locale, "Unknown FormFieldMessage fieldId: %d", objArr));
        }
        ViewGroup viewGroup = this.f123845f;
        bmaf bmaf4 = bmas.f128496a;
        if (bmaf4 == null) {
            bmaf4 = bmaf.f128436d;
        }
        bkft.m105635a(viewGroup.getChildAt(bmaf4.f128440c), bmas.f128497b);
        return true;
    }
}
