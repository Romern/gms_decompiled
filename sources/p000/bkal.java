package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bkal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkal extends bkdx {

    /* renamed from: a */
    InfoMessageView f123806a;

    /* renamed from: b */
    public ArrayList f123807b;

    /* renamed from: c */
    LinearLayout f123808c;

    /* renamed from: d */
    LinearLayout f123809d;

    /* renamed from: e */
    public bkag f123810e;

    /* renamed from: f */
    public bkag f123811f;

    /* renamed from: g */
    final bkip f123812g = new bkip();

    /* renamed from: h */
    private final ArrayList f123813h = new ArrayList();

    /* renamed from: i */
    private final ArrayList f123814i = new ArrayList();

    /* renamed from: j */
    private final bjes f123815j = new bjes(22);

    /* renamed from: k */
    private final bkip f123816k = new bkip();

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjzo.a(bmbr, int, boolean, com.google.android.wallet.clientlog.LogContext):bjzo
     arg types: [bmbr, int, int, com.google.android.wallet.clientlog.LogContext]
     candidates:
      bjzp.a(int, bmbr, boolean, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bjzo.a(bmbr, int, boolean, com.google.android.wallet.clientlog.LogContext):bjzo */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f123808c = (LinearLayout) layoutInflater.inflate((int) C0126R.C0128layout.fragment_bank_account, viewGroup, false);
        if ((((bmgp) this.f124069w).f129298a & 2) != 0) {
            InfoMessageView infoMessageView = (InfoMessageView) this.f123808c.findViewById(C0126R.C0129id.description);
            this.f123806a = infoMessageView;
            infoMessageView.mo72002a((bkdw) this);
            InfoMessageView infoMessageView2 = this.f123806a;
            bmnr bmnr = ((bmgp) this.f124069w).f129300c;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView2.mo72003a(bmnr);
            this.f123806a.setId(mo65818aq().mo65614a());
        }
        this.f123816k.mo66030a(this.f123812g);
        LinearLayout linearLayout = (LinearLayout) this.f123808c.findViewById(C0126R.C0129id.field_container);
        this.f123807b = new ArrayList(((bmgp) this.f124069w).f129301d.size());
        bxwc bxwc = ((bmgp) this.f124069w).f129301d;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bmqf bmqf = (bmqf) bxwc.get(i);
            bjxv aq = mo65818aq();
            bkfu bkfu = new bkfu(bmqf, layoutInflater, aq, linearLayout);
            bkfu.f124166e = this.f124196aK;
            bkfu.f124162a = getActivity();
            bkfu.f124164c = mo65980at();
            bkfu.f124167f = this;
            bkfu.f124165d = this;
            View a = bkem.m105437a(this.f123962aG, bkfu.mo65971a(), linearLayout, aq.mo65614a());
            this.f123807b.add(a);
            bkde bkde = new bkde(bmqf.f130376e, a, bkft.m105642b(bmqf));
            this.f123812g.mo66027a(bkde);
            this.f123813h.add(bkde);
        }
        this.f123812g.mo66038c();
        bkfr.m105585a(getActivity(), this.f123807b, (bmot[]) ((bmgp) this.f124069w).f129302e.toArray(new bmot[0]), linearLayout);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        if ((((bmgp) this.f124069w).f129298a & 4) != 0) {
            bkag bkag = (bkag) getChildFragmentManager().findFragmentByTag("bankAddress");
            this.f123810e = bkag;
            if (bkag == null) {
                bmbr bmbr = ((bmgp) this.f124069w).f129303f;
                if (bmbr == null) {
                    bmbr = bmbr.f128572L;
                }
                bjzo a2 = bjzo.m105002a(bmbr, this.f123961aF, true, mo65980at());
                this.f123810e = a2;
                beginTransaction.replace(C0126R.C0129id.bank_address, a2, "bankAddress");
            }
            this.f123813h.add(new bkde(this.f123810e));
            this.f123814i.add(this.f123810e);
            this.f123816k.mo66032a(this.f123810e);
            this.f123810e.f124196aK = this.f124196aK;
        }
        if ((((bmgp) this.f124069w).f129298a & 8) != 0) {
            bkag bkag2 = (bkag) getChildFragmentManager().findFragmentByTag("billingAddress");
            this.f123811f = bkag2;
            if (bkag2 == null) {
                bmbr bmbr2 = ((bmgp) this.f124069w).f129304g;
                if (bmbr2 == null) {
                    bmbr2 = bmbr.f128572L;
                }
                bjzo a3 = bjzo.m105002a(bmbr2, this.f123961aF, true, mo65980at());
                this.f123811f = a3;
                beginTransaction.replace(C0126R.C0129id.billing_address, a3, "billingAddress");
            }
            this.f123813h.add(new bkde(this.f123811f));
            this.f123814i.add(this.f123811f);
            this.f123816k.mo66032a(this.f123811f);
            this.f123811f.f124196aK = this.f124196aK;
        }
        beginTransaction.commit();
        this.f123809d = (LinearLayout) this.f123808c.findViewById(C0126R.C0129id.legal_message_container);
        bxwc bxwc2 = ((bmgp) this.f124069w).f129305h;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            View a4 = bkfr.m105548a(this.f123963aH, (int) C0126R.C0128layout.view_legal_message_text, (bmjf) bxwc2.get(i2), (bjxu) null);
            a4.setId(mo65818aq().mo65614a());
            this.f123809d.addView(a4);
        }
        return this.f123808c;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        bkag bkag = this.f123810e;
        if (bkag != null && !bkag.mo52775bR()) {
            return false;
        }
        bkag bkag2 = this.f123811f;
        if (bkag2 == null || bkag2.mo52775bR()) {
            return true;
        }
        return false;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f123816k;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f123814i;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f123813h;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f123815j;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        InfoMessageView infoMessageView = this.f123806a;
        if (infoMessageView != null) {
            infoMessageView.setEnabled(z);
        }
        int size = this.f123813h.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) this.f123813h.get(i)).f124039e;
            if (obj instanceof bkdm) {
                ((bkdm) obj).mo52808n(z);
            } else if (obj instanceof View) {
                ((View) obj).setEnabled(z);
            }
        }
        LinearLayout linearLayout = this.f123809d;
        if (linearLayout != null) {
            bkfr.m105608d(linearLayout, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmgp.f129296i.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmgp) this.f124069w).f129299b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        String str = bmaf.f128438a;
        bmdn bmdn = ((bmgp) this.f124069w).f129299b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (str.equals(bmdn.f128834b)) {
            bmaf bmaf2 = bmas.f128496a;
            if (bmaf2 == null) {
                bmaf2 = bmaf.f128436d;
            }
            if (bmaf2.f128439b == 1) {
                ArrayList arrayList = this.f123807b;
                bmaf bmaf3 = bmas.f128496a;
                if (bmaf3 == null) {
                    bmaf3 = bmaf.f128436d;
                }
                bkft.m105635a((View) arrayList.get(bmaf3.f128440c), bmas.f128497b);
                return true;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            bmaf bmaf4 = bmas.f128496a;
            if (bmaf4 == null) {
                bmaf4 = bmaf.f128436d;
            }
            objArr[0] = Integer.valueOf(bmaf4.f128439b);
            throw new IllegalArgumentException(String.format(locale, "Unknown field id %s.", objArr));
        }
        bkag bkag = this.f123810e;
        if (bkag != null && bkag.mo52281a(bmas)) {
            return true;
        }
        bkag bkag2 = this.f123811f;
        return bkag2 != null && bkag2.mo52281a(bmas);
    }
}
