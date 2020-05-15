package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bkam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkam extends bkdx {

    /* renamed from: a */
    FormHeaderView f123817a;

    /* renamed from: b */
    InfoMessageView f123818b;

    /* renamed from: c */
    InfoMessageView f123819c;

    /* renamed from: d */
    ViewGroup f123820d;

    /* renamed from: e */
    public View f123821e;

    /* renamed from: f */
    ImageWithCaptionView f123822f;

    /* renamed from: g */
    FrameLayout f123823g;

    /* renamed from: h */
    ViewGroup f123824h;

    /* renamed from: i */
    private final bjes f123825i = new bjes(21);

    /* renamed from: j */
    private final bkip f123826j = new bkip();

    /* renamed from: k */
    private View f123827k;

    /* renamed from: l */
    private final ArrayList f123828l = new ArrayList();

    /* renamed from: m */
    private final ArrayList f123829m = new ArrayList(1);

    /* renamed from: T */
    public final ArrayList mo52820T() {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fragment_challenge_deposit, viewGroup, false);
        this.f123827k = inflate;
        FormHeaderView formHeaderView = (FormHeaderView) inflate.findViewById(C0126R.C0129id.challenge_deposit_form_header);
        this.f123817a = formHeaderView;
        bmdn bmdn = ((bmgt) this.f124069w).f129326b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        formHeaderView.mo71963a(bmdn, layoutInflater, mo65982av(), this.f123828l);
        this.f123818b = (InfoMessageView) this.f123827k.findViewById(C0126R.C0129id.verification_info_message_text_view);
        if ((((bmgt) this.f124069w).f129325a & 2) != 0) {
            this.f123818b.setVisibility(0);
            this.f123828l.add(this.f123818b);
            InfoMessageView infoMessageView = this.f123818b;
            bmnr bmnr = ((bmgt) this.f124069w).f129327c;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72003a(bmnr);
            this.f123818b.mo72002a((bkdw) this);
        } else {
            this.f123818b.setVisibility(8);
        }
        this.f123822f = (ImageWithCaptionView) this.f123827k.findViewById(C0126R.C0129id.challenge_image_view);
        if ((((bmgt) this.f124069w).f129325a & 4) != 0) {
            this.f123822f.setVisibility(0);
            ImageWithCaptionView imageWithCaptionView = this.f123822f;
            bmno bmno = ((bmgt) this.f124069w).f129328d;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            imageWithCaptionView.mo71993a(bmno, bjvn.m104721b(getActivity().getApplicationContext()), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue(), mo65980at());
        } else {
            this.f123822f.setVisibility(8);
        }
        this.f123820d = (ViewGroup) this.f123827k.findViewById(C0126R.C0129id.dynamic_challenge_deposit_info_message_list);
        this.f123823g = (FrameLayout) this.f123827k.findViewById(C0126R.C0129id.money_input_container);
        this.f123820d.removeAllViews();
        this.f123823g.removeAllViews();
        this.f123826j.mo66035b();
        bmgt bmgt = (bmgt) this.f124069w;
        if ((bmgt.f129325a & 8) != 0) {
            bmqf bmqf = bmgt.f129329e;
            if (bmqf == null) {
                bmqf = bmqf.f130370r;
            }
            bkfu bkfu = new bkfu(bmqf, layoutInflater, mo65818aq(), this.f123823g);
            bkfu.f124162a = getActivity();
            bkfu.f124164c = mo65980at();
            bkfu.f124167f = this;
            this.f123821e = bkfu.mo65971a();
            this.f123821e = bkem.m105437a(this.f123962aG, this.f123821e, this.f123823g, mo65818aq().mo65614a());
            bmqf bmqf2 = ((bmgt) this.f124069w).f129329e;
            if (bmqf2 == null) {
                bmqf2 = bmqf.f130370r;
            }
            long j = bmqf2.f130376e;
            View view = this.f123821e;
            bmqf bmqf3 = ((bmgt) this.f124069w).f129329e;
            if (bmqf3 == null) {
                bmqf3 = bmqf.f130370r;
            }
            bkde bkde = new bkde(j, view, bkft.m105642b(bmqf3));
            this.f123829m.add(bkde);
            this.f123826j.mo66027a(bkde);
            this.f123823g.addView(this.f123821e);
            View view2 = this.f123821e;
            bmqf bmqf4 = ((bmgt) this.f124069w).f129329e;
            if (bmqf4 == null) {
                bmqf4 = bmqf.f130370r;
            }
            bjwl.m104784a(view2, bmqf4.f130376e, this.f124196aK);
        }
        this.f123826j.mo66038c();
        ImageLoader b = bjvn.m104721b(getActivity().getApplicationContext());
        Boolean bool = (Boolean) bjwd.f123461a.mo54082a();
        bxwc bxwc = ((bmgt) this.f124069w).f129330f;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            this.f123820d.addView(bkfr.m105549a(layoutInflater, (bmnr) bxwc.get(i), b, this.f123820d, mo65818aq(), bool.booleanValue(), this));
        }
        this.f123819c = (InfoMessageView) this.f123827k.findViewById(C0126R.C0129id.bottom_info_message_text_view);
        if ((((bmgt) this.f124069w).f129325a & 16) != 0) {
            this.f123819c.setVisibility(0);
            InfoMessageView infoMessageView2 = this.f123819c;
            bmnr bmnr2 = ((bmgt) this.f124069w).f129331g;
            if (bmnr2 == null) {
                bmnr2 = bmnr.f130153o;
            }
            infoMessageView2.mo72003a(bmnr2);
            this.f123819c.mo72002a((bkdw) this);
            this.f123828l.add(this.f123819c);
        } else {
            this.f123819c.setVisibility(8);
        }
        this.f123824h = (ViewGroup) this.f123827k.findViewById(C0126R.C0129id.challenge_deposit_button_container);
        bxwc bxwc2 = ((bmgt) this.f124069w).f129332h;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bkbs.m105284a((bmdb) bxwc2.get(i2), this.f123962aG, this.f124196aK, mo65980at(), layoutInflater, this.f123824h);
        }
        return this.f123827k;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return mo52806b((List) null);
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f123826j;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f123828l;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f123829m;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f123825i;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        if (this.f123827k != null) {
            boolean z = this.f124195aJ;
            this.f123817a.setEnabled(z);
            this.f123818b.setEnabled(z);
            this.f123822f.setEnabled(z);
            int childCount = this.f123820d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f123820d.getChildAt(i).setEnabled(z);
            }
            View view = this.f123821e;
            if (view != null) {
                view.setEnabled(z);
            }
            this.f123819c.setEnabled(z);
            bkfr.m105570a(this.f123824h, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmgt.f129323i.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmgt) this.f124069w).f129326b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        String str = bmaf.f128438a;
        bmdn bmdn = ((bmgt) this.f124069w).f129326b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (!str.equals(bmdn.f128834b)) {
            return false;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        if (bmaf2.f128439b != 1 || (((bmgt) this.f124069w).f129325a & 8) == 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            bmaf bmaf3 = bmas.f128496a;
            if (bmaf3 == null) {
                bmaf3 = bmaf.f128436d;
            }
            objArr[0] = Integer.valueOf(bmaf3.f128439b);
            throw new IllegalArgumentException(String.format(locale, "Unknown FormFieldMessage fieldId: %d", objArr));
        }
        bkft.m105635a(this.f123821e, bmas.f128497b);
        return true;
    }
}
