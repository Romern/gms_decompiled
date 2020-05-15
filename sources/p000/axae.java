package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;
import com.google.android.wallet.p097ui.common.MaterialFieldRegionCodeView;
import com.google.android.wallet.p097ui.common.RegionCodeView;
import com.google.android.wallet.p097ui.common.SummaryTextLayout;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: axae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axae extends bkdx implements bkey, bjer {

    /* renamed from: a */
    int f95492a = 0;

    /* renamed from: b */
    MaterialFieldRegionCodeView f95493b;

    /* renamed from: c */
    SummaryExpanderWrapper f95494c;

    /* renamed from: d */
    SummaryExpanderWrapper f95495d;

    /* renamed from: e */
    bjzo f95496e;

    /* renamed from: f */
    public bkdx f95497f;

    /* renamed from: g */
    axbt f95498g;

    /* renamed from: h */
    final ArrayList f95499h = new ArrayList();

    /* renamed from: i */
    private ArrayList f95500i;

    /* renamed from: j */
    private final bkip f95501j = new bkip();

    /* renamed from: k */
    private String f95502k;

    /* renamed from: l */
    private bpis f95503l;

    /* renamed from: m */
    private final bjes f95504m = new bjes(1665);

    /* renamed from: a */
    public static axae m81889a(bmeq bmeq, int i, String str, bpis bpis, LogContext logContext) {
        int i2 = bmeq.f128992a;
        if (!((i2 & 2) == 0 || (i2 & 4) == 0)) {
            bmbr bmbr = bmeq.f128995d;
            if (bmbr == null) {
                bmbr = bmbr.f128572L;
            }
            if (!new bxvv(bmbr.f128607x, bmbr.f128574y).contains(bmbm.COUNTRY)) {
                throw new IllegalArgumentException("Customer form with both a legal country selector and a legal address form containing a country selector is not supported");
            }
        }
        axae axae = new axae();
        Bundle a = bkdx.m105383a(i, bmeq, logContext);
        a.putString("flowAnalyticsId", str);
        a.putSerializable("flowType", bpis);
        axae.setArguments(a);
        return axae;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        int size = this.f95499h.size();
        for (int i = 0; i < size; i++) {
            if ((((bkde) this.f95499h.get(i)).f124039e instanceof bkdm) && !((bkdm) ((bkde) this.f95499h.get(i)).f124039e).mo52775bR()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95501j;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        ArrayList arrayList = new ArrayList();
        int size = this.f95499h.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) this.f95499h.get(i)).f124039e;
            if (obj instanceof bjer) {
                arrayList.add((bjer) obj);
            } else if (obj instanceof RegionCodeView) {
                arrayList.add(new bjeq(1668));
            }
        }
        return arrayList;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95499h;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95504m;
    }

    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        int size = this.f95499h.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) this.f95499h.get(i)).f124039e;
            if (obj instanceof bkfm) {
                ((bkfm) obj).mo52808n(z);
            } else if (obj instanceof View) {
                ((View) obj).setEnabled(z);
            }
        }
        SummaryExpanderWrapper summaryExpanderWrapper = this.f95494c;
        if (summaryExpanderWrapper != null) {
            summaryExpanderWrapper.setEnabled(z);
        }
        SummaryExpanderWrapper summaryExpanderWrapper2 = this.f95495d;
        if (summaryExpanderWrapper2 != null) {
            summaryExpanderWrapper2.setEnabled(z);
        }
        axbt axbt = this.f95498g;
        if (axbt != null) {
            axbt.mo52808n(z);
        }
    }

    /* renamed from: l */
    public final bmer mo52936l() {
        bmjf bmjf;
        bxvd da = bmer.f129000g.mo74144da();
        int size = this.f95499h.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) this.f95499h.get(i)).f124039e;
            if (obj instanceof bjzp) {
                bmbs a = ((bjzp) obj).mo52928a(Bundle.EMPTY);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmer bmer = (bmer) da.f164949b;
                a.getClass();
                bmer.f129004c = a;
                bmer.f129002a |= 2;
            } else {
                if (obj instanceof bkdx) {
                    bkdx bkdx = (bkdx) obj;
                    if (awia.m79991a(bkdx)) {
                        bmfv a2 = awia.m79972a(bkdx, Bundle.EMPTY);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmer bmer2 = (bmer) da.f164949b;
                        a2.getClass();
                        bmer2.f129003b = a2;
                        bmer2.f129002a |= 1;
                    }
                }
                if (obj instanceof axco) {
                    Bundle bundle = Bundle.EMPTY;
                    bmkv t = ((axco) obj).mo66092t();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmer bmer3 = (bmer) da.f164949b;
                    t.getClass();
                    bmer3.f129007f = t;
                    bmer3.f129002a |= 16;
                } else if (obj instanceof RegionCodeView) {
                    String a3 = bjtv.m104615a(this.f95493b.mo72078a());
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmer bmer4 = (bmer) da.f164949b;
                    a3.getClass();
                    bmer4.f129002a |= 8;
                    bmer4.f129006e = a3;
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                    sb.append(valueOf);
                    sb.append(" is not supported");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        axbt axbt = this.f95498g;
        if (!(axbt == null || (bmjf = axbt.f95734b) == null)) {
            String str = bmjf.f129693g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmer bmer5 = (bmer) da.f164949b;
            str.getClass();
            bmer5.f129002a |= 4;
            bmer5.f129005d = str;
        }
        return (bmer) da.mo74062i();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f95492a = bundle.getInt("selectedRegionCode", 0);
        }
        this.f95502k = getArguments().getString("flowAnalyticsId");
        this.f95503l = (bpis) getArguments().getSerializable("flowType");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putIntegerArrayList("regionCodes", this.f95500i);
        bundle.putInt("selectedRegionCode", this.f95492a);
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        mo51905a(6, Bundle.EMPTY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmeq.f128990h.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmeq) this.f124069w).f128993b;
        return bmdn == null ? bmdn.f128831k : bmdn;
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
        bmfu bmfu;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_customer_form, (ViewGroup) null, false);
        bmeq bmeq = (bmeq) this.f124069w;
        if ((bmeq.f128992a & 2) != 0) {
            if (bundle != null) {
                this.f95500i = bundle.getIntegerArrayList("regionCodes");
            } else {
                bmbt bmbt = bmeq.f128994c;
                if (bmbt == null) {
                    bmbt = bmbt.f128620d;
                }
                if (bmbt.f128623b.size() > 0) {
                    bmbt bmbt2 = ((bmeq) this.f124069w).f128994c;
                    if (bmbt2 == null) {
                        bmbt2 = bmbt.f128620d;
                    }
                    this.f95500i = bjtl.m104574b(bjtl.m104568a(bmbt2.f128623b));
                } else {
                    throw new IllegalArgumentException("LegalCountrySelector's allowed country codes cannot be empty");
                }
            }
            MaterialFieldRegionCodeView materialFieldRegionCodeView = (MaterialFieldRegionCodeView) inflate.findViewById(C0126R.C0129id.region_code_view);
            this.f95493b = materialFieldRegionCodeView;
            materialFieldRegionCodeView.mo72082a(mo65980at());
            MaterialFieldRegionCodeView materialFieldRegionCodeView2 = this.f95493b;
            bmbt bmbt3 = ((bmeq) this.f124069w).f128994c;
            if (bmbt3 == null) {
                bmbt3 = bmbt.f128620d;
            }
            bmdn bmdn = bmbt3.f128622a;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            materialFieldRegionCodeView2.mo72081a(bmdn);
            String string = getString(C0126R.string.wallet_uic_address_field_country);
            MaterialFieldRegionCodeView materialFieldRegionCodeView3 = this.f95493b;
            materialFieldRegionCodeView3.f152176c = string;
            MaterialFieldLayout materialFieldLayout = materialFieldRegionCodeView3.f152174a;
            if (materialFieldLayout != null) {
                materialFieldLayout.mo72053c(string);
            }
            MaterialFieldRegionCodeView materialFieldRegionCodeView4 = this.f95493b;
            materialFieldRegionCodeView4.f152187h = this;
            materialFieldRegionCodeView4.mo72073a((List) this.f95500i);
            MaterialFieldRegionCodeView materialFieldRegionCodeView5 = this.f95493b;
            bmbt bmbt4 = ((bmeq) this.f124069w).f128994c;
            if (bmbt4 == null) {
                bmbt4 = bmbt.f128620d;
            }
            materialFieldRegionCodeView5.mo72079a(bjtv.m104614a(bmbt4.f128624c));
            SummaryExpanderWrapper summaryExpanderWrapper = (SummaryExpanderWrapper) inflate.findViewById(C0126R.C0129id.legal_country_selector_wrapper);
            this.f95494c = summaryExpanderWrapper;
            summaryExpanderWrapper.setVisibility(0);
            this.f95501j.mo66032a((bkiq) this.f95494c);
            this.f95494c.mo72165b(C0126R.C0129id.legal_country_summary);
            this.f95494c.mo72167d(C0126R.C0129id.legal_country_image);
            ((SummaryTextLayout) this.f95494c.findViewById(C0126R.C0129id.legal_country_summary)).mo72106a(string);
            this.f95494c.mo72160a(new bkde(0, this.f95493b, null));
            this.f95494c.mo72169i();
            ArrayList arrayList = this.f95499h;
            MaterialFieldRegionCodeView materialFieldRegionCodeView6 = this.f95493b;
            bmbt bmbt5 = ((bmeq) this.f124069w).f128994c;
            if (bmbt5 == null) {
                bmbt5 = bmbt.f128620d;
            }
            arrayList.add(new bkde(0, materialFieldRegionCodeView6, bmbt5.f128624c));
            OrchestrationViewEvent.m93828c(getActivity(), this.f95502k, new bjes(1668));
        }
        if (((bmeq) this.f124069w).f128998g.size() <= 1) {
            if (((bmeq) this.f124069w).f128998g.size() == 1) {
                SummaryExpanderWrapper summaryExpanderWrapper2 = (SummaryExpanderWrapper) inflate.findViewById(C0126R.C0129id.tax_info_form_wrapper);
                this.f95495d = summaryExpanderWrapper2;
                summaryExpanderWrapper2.setVisibility(0);
                int a = mo65818aq().mo65614a();
                ((ViewGroup) this.f95495d.findViewById(C0126R.C0129id.container)).setId(a);
                axco axco = (axco) getChildFragmentManager().findFragmentByTag("Tax_Info_Tag");
                if (axco == null) {
                    axco = axco.m82324a((bmkt) ((bmeq) this.f124069w).f128998g.get(0), this.f123961aF, mo65980at());
                    getChildFragmentManager().beginTransaction().replace(a, axco, "Tax_Info_Tag").commit();
                }
                axco.f124196aK = this.f124196aK;
                ((ImageView) this.f95495d.findViewById(C0126R.C0129id.icon)).setImageResource(bkfr.m105543a(this.f123962aG, 99, -1));
                ((SummaryTextLayout) this.f95495d.findViewById(C0126R.C0129id.summary_text)).mo72106a(((bmkt) ((bmeq) this.f124069w).f128998g.get(0)).f129888d);
                SummaryExpanderWrapper summaryExpanderWrapper3 = this.f95495d;
                summaryExpanderWrapper3.f152316l = this;
                summaryExpanderWrapper3.mo72162a(axco, C0126R.C0129id.icon, C0126R.C0129id.summary_text, C0126R.C0129id.summary_title);
                this.f95501j.mo66032a(axco);
                this.f95499h.add(new bkde(axco));
                OrchestrationViewEvent.m93828c(getActivity(), this.f95502k, axco.f124437c);
            }
            if ((((bmeq) this.f124069w).f128992a & 4) != 0) {
                bjzo bjzo = (bjzo) getChildFragmentManager().findFragmentById(C0126R.C0129id.address_fragment_holder);
                this.f95496e = bjzo;
                if (bjzo == null) {
                    bmbr bmbr = ((bmeq) this.f124069w).f128995d;
                    if (bmbr == null) {
                        bmbr = bmbr.f128572L;
                    }
                    this.f95496e = bjzo.m105001a(bmbr, this.f123961aF, mo65980at());
                    getChildFragmentManager().beginTransaction().add((int) C0126R.C0129id.address_fragment_holder, this.f95496e).commit();
                }
                this.f95496e.mo65675a(this);
                this.f95501j.mo66032a(this.f95496e);
                this.f95499h.add(new bkde(this.f95496e));
                OrchestrationViewEvent.m93828c(getActivity(), this.f95502k, this.f95496e.f123709i);
            }
            if ((((bmeq) this.f124069w).f128992a & 8) != 0) {
                bkdx bkdx = (bkdx) getChildFragmentManager().findFragmentById(C0126R.C0129id.instrument_fragment_holder);
                this.f95497f = bkdx;
                if (bkdx == null) {
                    bmfu bmfu2 = ((bmeq) this.f124069w).f128996e;
                    if (bmfu2 == null) {
                        bmfu = bmfu.f129167j;
                    } else {
                        bmfu = bmfu2;
                    }
                    int i = this.f123961aF;
                    bmdn bmdn2 = ((bmeq) this.f124069w).f128993b;
                    if (bmdn2 == null) {
                        bmdn2 = bmdn.f128831k;
                    }
                    this.f95497f = awia.m79969a(bmfu, i, bmdn2.f128837e, this.f95502k, this.f95503l, mo65980at(), null);
                    getChildFragmentManager().beginTransaction().add((int) C0126R.C0129id.instrument_fragment_holder, this.f95497f).commit();
                }
                this.f95501j.mo66032a(this.f95497f);
                this.f95499h.add(new bkde(this.f95497f));
                OrchestrationViewEvent.m93828c(getActivity(), this.f95502k, this.f95497f.mo51919co());
            }
            if ((((bmeq) this.f124069w).f128992a & 16) != 0) {
                inflate.findViewById(C0126R.C0129id.customer_legal_message_holder).setVisibility(0);
                axbt axbt = (axbt) getChildFragmentManager().findFragmentById(C0126R.C0129id.customer_legal_message_holder);
                this.f95498g = axbt;
                if (axbt == null) {
                    bmjh bmjh = ((bmeq) this.f124069w).f128997f;
                    if (bmjh == null) {
                        bmjh = bmjh.f129700e;
                    }
                    this.f95498g = axbt.m82230a(bmjh, this.f123961aF, mo65980at());
                    getChildFragmentManager().beginTransaction().add((int) C0126R.C0129id.customer_legal_message_holder, this.f95498g).commit();
                }
                OrchestrationViewEvent.m93828c(getActivity(), this.f95502k, this.f95498g.f95735c);
            }
            return inflate;
        }
        throw new IllegalArgumentException("Customer form with multiple tax info forms is not supported");
    }

    /* renamed from: a */
    public final void mo52935a(int i, int i2, boolean z) {
        SummaryExpanderWrapper summaryExpanderWrapper;
        if (this.f95492a != i) {
            this.f95492a = i;
            String a = bjtv.m104615a(i);
            if ((((bmeq) this.f124069w).f128992a & 2) != 0 && i2 == this.f95493b.getId()) {
                bmbt bmbt = ((bmeq) this.f124069w).f128994c;
                if (bmbt == null) {
                    bmbt = bmbt.f128620d;
                }
                if (!bmbt.f128624c.equals(a)) {
                    Bundle bundle = new Bundle();
                    bmdn bmdn = ((bmeq) this.f124069w).f128993b;
                    if (bmdn == null) {
                        bmdn = bmdn.f128831k;
                    }
                    bundle.putString("EventListener.EXTRA_FORM_ID", bmdn.f128834b);
                    bundle.putInt("EventListener.EXTRA_FIELD_ID", 1);
                    mo51905a(3, bundle);
                }
            }
            axbt axbt = this.f95498g;
            if (axbt != null) {
                axbt.mo52997c(bjtv.m104615a(i));
            }
        }
        if (i != 0 && (summaryExpanderWrapper = this.f95494c) != null) {
            summaryExpanderWrapper.f152305a.mo66041d(isResumed());
        }
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        String str = bmaf.f128438a;
        bmdn bmdn = ((bmeq) this.f124069w).f128993b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (!str.equals(bmdn.f128834b)) {
            int size = this.f95499h.size();
            for (int i = 0; i < size; i++) {
                if ((((bkde) this.f95499h.get(i)).f124039e instanceof bkdm) && ((bkdm) ((bkde) this.f95499h.get(i)).f124039e).mo52281a(bmas)) {
                    return true;
                }
            }
            return false;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        int i2 = bmaf2.f128439b;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Unknown FormFieldMessage fieldId: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
