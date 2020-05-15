package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.SummaryTextLayout;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: axab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axab extends bkdx {

    /* renamed from: a */
    public View f95482a;

    /* renamed from: b */
    private final ArrayList f95483b = new ArrayList(1);

    /* renamed from: c */
    private ViewGroup f95484c;

    /* renamed from: d */
    private final ArrayList f95485d = new ArrayList(1);

    /* renamed from: e */
    private final bjes f95486e = new bjes(1737);

    /* renamed from: f */
    private final bkip f95487f = new bkip();

    /* renamed from: g */
    private SummaryExpanderWrapper f95488g;

    /* renamed from: T */
    public final ArrayList mo52820T() {
        return this.f95483b;
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
        SummaryExpanderWrapper summaryExpanderWrapper = (SummaryExpanderWrapper) layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_billing_account_form, viewGroup, false);
        this.f95488g = summaryExpanderWrapper;
        summaryExpanderWrapper.mo72161a(this, C0126R.C0129id.billing_summary_image, C0126R.C0129id.billing_summary_text);
        SummaryTextLayout summaryTextLayout = (SummaryTextLayout) this.f95488g.findViewById(C0126R.C0129id.billing_summary_text);
        this.f95484c = (ViewGroup) this.f95488g.findViewById(C0126R.C0129id.billing_id_container);
        bmqf bmqf = ((bmen) this.f124069w).f128972b;
        if (bmqf == null) {
            bmqf = bmqf.f130370r;
        }
        bkfu bkfu = new bkfu(bmqf, layoutInflater, mo65818aq(), this.f95484c);
        bkfu.f124162a = getActivity();
        bkfu.f124164c = mo65980at();
        bkfu.f124167f = this;
        this.f95482a = bkfu.mo65971a();
        View a = bkem.m105437a(this.f123962aG, this.f95482a, this.f95484c, mo65818aq().mo65614a());
        bmqf bmqf2 = ((bmen) this.f124069w).f128972b;
        if (bmqf2 == null) {
            bmqf2 = bmqf.f130370r;
        }
        bkem.m105439a(a, bmqf2.f130380i);
        ArrayList arrayList = this.f95485d;
        bmqf bmqf3 = ((bmen) this.f124069w).f128972b;
        if (bmqf3 == null) {
            bmqf3 = bmqf.f130370r;
        }
        long j = bmqf3.f130376e;
        View view = this.f95482a;
        bmqf bmqf4 = ((bmen) this.f124069w).f128972b;
        if (bmqf4 == null) {
            bmqf4 = bmqf.f130370r;
        }
        arrayList.add(new bkde(j, view, bkft.m105642b(bmqf4)));
        this.f95484c.addView(a);
        bmqf bmqf5 = ((bmen) this.f124069w).f128972b;
        if (bmqf5 == null) {
            bmqf5 = bmqf.f130370r;
        }
        if (!bmqf5.f130380i.isEmpty() && summaryTextLayout != null) {
            bmqf bmqf6 = ((bmen) this.f124069w).f128972b;
            if (bmqf6 == null) {
                bmqf6 = bmqf.f130370r;
            }
            summaryTextLayout.mo72106a(bmqf6.f130380i);
        }
        this.f95483b.add(this.f95484c);
        return this.f95488g;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return mo52806b((List) null);
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95487f;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95485d;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95486e;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
        this.f95484c.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        if (this.f95488g != null) {
            stq.m36308a(this.f95484c, this.f124195aJ);
            this.f95488g.setEnabled(this.f124195aJ);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmen.f128969c.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmen) this.f124069w).f128971a;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        String str = bmaf.f128438a;
        bmdn bmdn = ((bmen) this.f124069w).f128971a;
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
        if (bmaf2.f128439b != 1) {
            Object[] objArr = new Object[1];
            bmaf bmaf3 = bmas.f128496a;
            if (bmaf3 == null) {
                bmaf3 = bmaf.f128436d;
            }
            objArr[0] = Integer.valueOf(bmaf3.f128439b);
            throw new IllegalArgumentException(String.format("Unexpected field id '%s' for BillingAccountForm", objArr));
        }
        bkft.m105635a(this.f95482a, bmas.f128497b);
        return true;
    }
}
