package p000;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.p088ui.component.instrument.creditcard.CvcHintImageView;
import com.google.android.wallet.p097ui.common.DateEditText;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;
import com.google.android.wallet.p097ui.common.SummaryTextLayout;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: axba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axba extends bkdx implements View.OnFocusChangeListener {

    /* renamed from: a */
    TextView f95602a;

    /* renamed from: b */
    DateEditText f95603b;

    /* renamed from: c */
    public FormEditText f95604c;

    /* renamed from: d */
    MaterialFieldLayout f95605d;

    /* renamed from: e */
    MaterialFieldLayout f95606e;

    /* renamed from: f */
    CvcHintImageView f95607f;

    /* renamed from: g */
    private View f95608g;

    /* renamed from: h */
    private View f95609h;

    /* renamed from: i */
    private SummaryExpanderWrapper f95610i;

    /* renamed from: j */
    private SummaryTextLayout f95611j;

    /* renamed from: k */
    private final ArrayList f95612k = new ArrayList(1);

    /* renamed from: l */
    private final ArrayList f95613l = new ArrayList(2);

    /* renamed from: m */
    private final bjes f95614m = new bjes(1651);

    /* renamed from: n */
    private final bkip f95615n = new bkip();

    /* renamed from: T */
    public final ArrayList mo52820T() {
        return this.f95612k;
    }

    /* renamed from: W */
    public final long mo52837W() {
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void
     arg types: [com.google.android.wallet.ui.common.DateEditText, com.google.android.wallet.ui.common.DateEditText, int]
     candidates:
      com.google.android.wallet.ui.common.DateEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.DateEditText.a(int, java.lang.String, java.lang.String):void
      com.google.android.wallet.ui.common.DateEditText.a(java.lang.String, java.lang.String, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void
     arg types: [bkbi, com.google.android.wallet.ui.common.FormEditText, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bkbi bkbi;
        bxvd bxvd;
        GeneratedMessageLite GeneratedMessageLite;
        int i = 0;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_expiration_date_form, (ViewGroup) null, false);
        this.f95608g = inflate;
        SummaryExpanderWrapper summaryExpanderWrapper = (SummaryExpanderWrapper) inflate.findViewById(C0126R.C0129id.expiration_date_form_wrapper);
        this.f95610i = summaryExpanderWrapper;
        summaryExpanderWrapper.mo72161a(this, C0126R.C0129id.expiration_date_form_image, C0126R.C0129id.expiration_date_form_summary);
        this.f95611j = (SummaryTextLayout) this.f95608g.findViewById(C0126R.C0129id.expiration_date_form_summary);
        this.f95609h = this.f95608g.findViewById(C0126R.C0129id.expiration_date_content);
        this.f95605d = (MaterialFieldLayout) this.f95608g.findViewById(C0126R.C0129id.exp_date_material_field_container);
        this.f95606e = (MaterialFieldLayout) this.f95608g.findViewById(C0126R.C0129id.cvc_material_field_container);
        this.f95602a = (TextView) this.f95608g.findViewById(C0126R.C0129id.card_label_text);
        this.f95603b = (DateEditText) this.f95608g.findViewById(C0126R.C0129id.exp_date);
        boolean m = mo52968m();
        if (m) {
            this.f95603b.mo71919a(mo65980at());
            Activity activity = getActivity();
            bmie bmie = (bmie) this.f124069w;
            bmqf a = awfx.m79879a(activity, bmie.f129556i, bmie.f129557j, bmie.f129558k, bmie.f129559l);
            bxvd bxvd2 = (bxvd) a.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) a);
            long l = mo65985l(5);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bmqf bmqf = (bmqf) bxvd2.f164949b;
            bmqf bmqf2 = bmqf.f130370r;
            bmqf.f130372a |= 2;
            bmqf.f130376e = l;
            bkft.m105629a((bmqf) bxvd2.mo74062i(), this.f95603b);
            this.f95605d.mo72052c();
        }
        this.f95604c = (FormEditText) this.f95608g.findViewById(C0126R.C0129id.cvc);
        boolean t = mo52970t();
        if (t) {
            this.f95604c.mo71919a(mo65980at());
            this.f95604c.mo71914a(mo65985l(1));
            bkbi = new bkbi(this.f95604c, ((bmie) this.f124069w).f129552e);
            this.f95604c.mo65972a((bkgj) bkbi);
            this.f95604c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((bmie) this.f124069w).f129552e)});
            this.f95604c.setOnFocusChangeListener(this);
        } else {
            bkbi = null;
        }
        if (!TextUtils.isEmpty(((bmie) this.f124069w).f129551d)) {
            this.f95612k.add(this.f95602a);
            this.f95602a.setText(((bmie) this.f124069w).f129551d);
            this.f95602a.setVisibility(0);
            this.f95613l.add(new bkde(0, this.f95602a, null));
        }
        if (m) {
            bmie bmie2 = (bmie) this.f124069w;
            if ((bmie2.f129548a & 8192) != 0) {
                bmif bmif = bmie2.f129561n;
                if (bmif == null) {
                    bmif = bmif.f129564j;
                }
                if (bmif.f129569d > 0) {
                    DateEditText dateEditText = this.f95603b;
                    bmif bmif2 = ((bmie) this.f124069w).f129561n;
                    if (bmif2 == null) {
                        bmif2 = bmif.f129564j;
                    }
                    String valueOf = String.valueOf(bmif2.f129569d);
                    bmif bmif3 = ((bmie) this.f124069w).f129561n;
                    if (bmif3 == null) {
                        bmif3 = bmif.f129564j;
                    }
                    dateEditText.mo71883a(valueOf, String.valueOf(bmif3.f129570e), 6);
                }
            }
        }
        if (m && t) {
            DateEditText dateEditText2 = this.f95603b;
            dateEditText2.mo71917a((bkce) dateEditText2, (bkdf) dateEditText2, false);
            this.f95603b.setNextFocusDownId(C0126R.C0129id.cvc);
            FormEditText formEditText = this.f95604c;
            formEditText.mo71917a((bkce) bkbi, (bkdf) formEditText, true);
            this.f95604c.setNextFocusUpId(C0126R.C0129id.exp_date);
        } else if (m) {
            this.f95606e.setVisibility(8);
            DateEditText dateEditText3 = this.f95603b;
            dateEditText3.mo71917a((bkce) dateEditText3, (bkdf) dateEditText3, false);
        } else if (t) {
            this.f95605d.setVisibility(8);
            FormEditText formEditText2 = this.f95604c;
            formEditText2.mo71917a((bkce) bkbi, (bkdf) formEditText2, false);
        } else {
            throw new IllegalArgumentException("Expiration date or CVC must be shown");
        }
        if (m) {
            if ((((bmie) this.f124069w).f129548a & 8192) != 0) {
                bxvd = blxc.f128037e.mo74144da();
                bmif bmif4 = ((bmie) this.f124069w).f129561n;
                if (bmif4 == null) {
                    bmif4 = bmif.f129564j;
                }
                int i2 = bmif4.f129569d;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                blxc blxc = (blxc) bxvd.f164949b;
                blxc.f128039a |= 2;
                blxc.f128041c = i2;
                bmif bmif5 = ((bmie) this.f124069w).f129561n;
                if (bmif5 == null) {
                    bmif5 = bmif.f129564j;
                }
                int i3 = bmif5.f129570e;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                blxc blxc2 = (blxc) bxvd.f164949b;
                blxc2.f128039a = 1 | blxc2.f128039a;
                blxc2.f128040b = i3;
            } else {
                bxvd = null;
            }
            ArrayList arrayList = this.f95613l;
            DateEditText dateEditText4 = this.f95603b;
            if (bxvd != null) {
                GeneratedMessageLite = bxvd.mo74062i();
            } else {
                GeneratedMessageLite = null;
            }
            arrayList.add(new bkde(0, dateEditText4, GeneratedMessageLite));
        }
        if (t) {
            this.f95613l.add(new bkde(0, this.f95604c, null));
        }
        CvcHintImageView cvcHintImageView = (CvcHintImageView) this.f95608g.findViewById(C0126R.C0129id.cvc_hint_image);
        this.f95607f = cvcHintImageView;
        cvcHintImageView.f110537g = getChildFragmentManager();
        CvcHintImageView cvcHintImageView2 = this.f95607f;
        bmie bmie3 = (bmie) this.f124069w;
        String str = bmie3.f129555h;
        String str2 = bmie3.f129554g;
        bmno bmno = bmie3.f129553f;
        if (bmno == null) {
            bmno = bmno.f130138m;
        }
        cvcHintImageView2.mo60106a(str, str2, bmno);
        CvcHintImageView cvcHintImageView3 = this.f95607f;
        if (!this.f95604c.isFocused()) {
            i = 8;
        }
        cvcHintImageView3.setVisibility(i);
        this.f95612k.add(this.f95609h);
        return this.f95608g;
    }

    /* renamed from: b */
    public final String mo52922b(String str) {
        if (!mo52806b((List) null)) {
            return "";
        }
        boolean z = !TextUtils.isEmpty(((bmie) this.f124069w).f129551d);
        boolean m = mo52968m();
        if (z && m) {
            return String.format(getActivity().getResources().getString(C0126R.string.wallet_add_credit_card_summary_expires), ((bmie) this.f124069w).f129551d, this.f95603b.mo52823a((String) null));
        } else if (m) {
            return String.format(getActivity().getResources().getString(C0126R.string.wallet_add_credit_card_summary_expires_no_label), this.f95603b.mo52823a((String) null));
        } else if (!z) {
            return getActivity().getResources().getString(C0126R.string.wallet_cvc);
        } else {
            return ((bmie) this.f124069w).f129551d;
        }
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return mo52806b((List) null);
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95615n;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95613l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bX */
    public final long mo52966bX() {
        bmdn bmdn = ((bmie) this.f124069w).f129549b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        return bmdn.f128835c;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95614m;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
        this.f95609h.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        if (this.f95610i != null) {
            boolean z = this.f124195aJ;
            this.f95605d.setEnabled(z);
            this.f95606e.setEnabled(z);
            this.f95607f.setEnabled(z);
            this.f95610i.setEnabled(z);
        }
    }

    /* renamed from: m */
    public final boolean mo52968m() {
        boolean z = !new bxvv(((bmie) this.f124069w).f129562o, bmie.f129545p).contains(bmid.EXPIRATION_MONTH);
        if (z == (!new bxvv(((bmie) this.f124069w).f129562o, bmie.f129545p).contains(bmid.EXPIRATION_YEAR))) {
            return z;
        }
        throw new IllegalArgumentException("Month and year must both shown, or both hidden.");
    }

    public final void onFocusChange(View view, boolean z) {
        if (view == this.f95604c) {
            this.f95607f.setVisibility(!z ? 8 : 0);
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f95611j != null) {
            StringBuilder sb = new StringBuilder(((bmie) this.f124069w).f129551d);
            if (mo52968m()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.f95605d.f152152g);
            }
            if (mo52970t()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.f95606e.f152152g);
            }
            this.f95611j.mo72106a(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmie.f129546r.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmie) this.f124069w).f129549b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: t */
    public final boolean mo52970t() {
        return !new bxvv(((bmie) this.f124069w).f129562o, bmie.f129545p).contains(bmid.CVC);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.DateEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void */
    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        if (bmaf.f128438a.equals(((bmie) this.f124069w).f129550c)) {
            bmaf bmaf2 = bmas.f128496a;
            if (bmaf2 == null) {
                bmaf2 = bmaf.f128436d;
            }
            bmid a = bmid.m108054a(bmaf2.f128439b);
            if (a != null) {
                if (!new bxvv(((bmie) this.f124069w).f129562o, bmie.f129545p).contains(a)) {
                    int ordinal = a.ordinal();
                    if (ordinal == 1) {
                        this.f95604c.mo65794a((CharSequence) bmas.f128497b, true);
                    } else if (ordinal != 2 && ordinal != 3) {
                        return false;
                    } else {
                        this.f95603b.mo65794a((CharSequence) bmas.f128497b, true);
                    }
                    return true;
                }
                int i = a.f129544g;
                StringBuilder sb = new StringBuilder(49);
                sb.append("Cannot apply message to hidden field: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return false;
    }
}
