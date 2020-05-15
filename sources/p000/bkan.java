package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.SelectorView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bkan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkan extends bkdx implements bkfe {

    /* renamed from: a */
    FormHeaderView f123830a;

    /* renamed from: b */
    SelectorView f123831b;

    /* renamed from: c */
    InfoMessageView f123832c;

    /* renamed from: d */
    public bmgx f123833d;

    /* renamed from: e */
    private final bjes f123834e = new bjes(19);

    /* renamed from: f */
    private final ArrayList f123835f = new ArrayList();

    /* renamed from: g */
    private final bkip f123836g = new bkip();

    /* renamed from: B */
    public final boolean mo52723B() {
        return true;
    }

    /* renamed from: C */
    public final void mo52724C() {
    }

    /* renamed from: D */
    public final void mo52725D() {
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
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fragment_verification_option, viewGroup, false);
        FormHeaderView formHeaderView = (FormHeaderView) inflate.findViewById(C0126R.C0129id.verification_form_header);
        this.f123830a = formHeaderView;
        bmdn bmdn = ((bmgy) this.f124069w).f129367a;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        formHeaderView.mo71963a(bmdn, layoutInflater, mo65982av(), this.f123835f);
        this.f123831b = (SelectorView) inflate.findViewById(C0126R.C0129id.verification_selector);
        this.f123832c = (InfoMessageView) inflate.findViewById(C0126R.C0129id.description_details_info_message);
        return inflate;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f123836g;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f123835f;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return new ArrayList();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f123834e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        if (this.f123831b != null) {
            boolean z = this.f124195aJ;
            this.f123830a.setEnabled(z);
            this.f123831b.setEnabled(z);
            this.f123832c.setEnabled(z);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bmgy bmgy = (bmgy) this.f124069w;
            this.f123833d = (bmgx) bmgy.f129368b.get(bmgy.f129369c);
            return;
        }
        this.f123833d = (bmgx) bjvp.m104730a(bundle, "selectedOption", (bxxk) bmgx.f129356h.mo74142c(7));
    }

    public final void onResume() {
        super.onResume();
        this.f123831b.f152212h = mo65980at();
        this.f123831b.f152211g = mo52837W();
        this.f123836g.mo66032a((bkiq) this.f123831b);
        this.f123831b.f152205a.mo66034a(true);
        SelectorView selectorView = this.f123831b;
        selectorView.f152209e = this;
        selectorView.f152210f = this;
        selectorView.removeAllViews();
        bxwc bxwc = ((bmgy) this.f124069w).f129368b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bmgx bmgx = (bmgx) bxwc.get(i);
            bkao bkao = new bkao(this.f123962aG);
            bkao.f124136q = bmgx;
            bkao.f123838b.setText(((bmgx) bkao.f124136q).f129360c);
            InfoMessageView infoMessageView = bkao.f123837a;
            bmnr bmnr = ((bmgx) bkao.f124136q).f129361d;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72003a(bmnr);
            bkao.mo65945a(bmgx.f129359b);
            this.f123831b.addView(bkao);
        }
        this.f123831b.mo72096a(this.f123833d.f129359b);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bjvp.m104736a(bundle, "selectedOption", this.f123833d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmgy.f129365d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmgy) this.f124069w).f129367a;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: z */
    public final void mo52731z() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo52728a(Object obj, Object obj2) {
        bxxc bxxc = (bxxc) obj2;
        this.f123833d = (bmgx) ((bxxc) obj);
        this.f123835f.remove(this.f123832c);
        if ((this.f123833d.f129358a & 8) != 0) {
            this.f123832c.setVisibility(0);
            InfoMessageView infoMessageView = this.f123832c;
            bmnr bmnr = this.f123833d.f129362e;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72003a(bmnr);
            this.f123835f.add(this.f123832c);
            return;
        }
        this.f123832c.setVisibility(8);
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        String str = bmaf.f128438a;
        bmdn bmdn = ((bmgy) this.f124069w).f129367a;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (!str.equals(bmdn.f128834b)) {
            return false;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        objArr[0] = Integer.valueOf(bmaf2.f128439b);
        throw new IllegalArgumentException(String.format(locale, "Unknown FormFieldMessage fieldId: %d", objArr));
    }
}
