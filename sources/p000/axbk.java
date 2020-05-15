package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: axbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbk extends bkdx {

    /* renamed from: a */
    bjzo f95688a;

    /* renamed from: b */
    axbf f95689b;

    /* renamed from: c */
    bkdx f95690c;

    /* renamed from: d */
    final ArrayList f95691d = new ArrayList(3);

    /* renamed from: e */
    private final bkip f95692e = new bkip();

    /* renamed from: f */
    private String f95693f;

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
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0114, code lost:
        if (p000.awia.m79987a(r0, r1) == false) goto L_0x0116;
     */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_fix_info_form, viewGroup, false);
        FragmentManager childFragmentManager = getChildFragmentManager();
        bmge bmge = (bmge) this.f124069w;
        if ((bmge.f129227a & 4) != 0) {
            bmbr bmbr = bmge.f129229c;
            if (bmbr == null) {
                bmbr = bmbr.f128572L;
            }
            bjzo bjzo = (bjzo) childFragmentManager.findFragmentByTag(bmbr.f128586c);
            this.f95688a = bjzo;
            if (bjzo == null) {
                bmbr bmbr2 = ((bmge) this.f124069w).f129229c;
                if (bmbr2 == null) {
                    bmbr2 = bmbr.f128572L;
                }
                this.f95688a = bjzo.m105001a(bmbr2, this.f123961aF, mo65980at());
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                bjzo bjzo2 = this.f95688a;
                bmbr bmbr3 = ((bmge) this.f124069w).f129229c;
                if (bmbr3 == null) {
                    bmbr3 = bmbr.f128572L;
                }
                beginTransaction.replace(C0126R.C0129id.address_fragment_holder, bjzo2, bmbr3.f128586c).commit();
            }
            this.f95692e.mo66032a(this.f95688a);
            this.f95691d.add(new bkde(this.f95688a));
            OrchestrationViewEvent.m93828c(getActivity(), this.f95693f, this.f95688a.f123709i);
        }
        bmge bmge2 = (bmge) this.f124069w;
        if ((bmge2.f129227a & 8) != 0) {
            bmie bmie = bmge2.f129230d;
            if (bmie == null) {
                bmie = bmie.f129546r;
            }
            axbf axbf = (axbf) childFragmentManager.findFragmentByTag(bmie.f129550c);
            this.f95689b = axbf;
            if (axbf == null) {
                bmie bmie2 = ((bmge) this.f124069w).f129230d;
                if (bmie2 == null) {
                    bmie2 = bmie.f129546r;
                }
                this.f95689b = axbf.m82146a(bmie2, this.f123961aF, mo65980at());
                FragmentTransaction beginTransaction2 = childFragmentManager.beginTransaction();
                axbf axbf2 = this.f95689b;
                bmie bmie3 = ((bmge) this.f124069w).f129230d;
                if (bmie3 == null) {
                    bmie3 = bmie.f129546r;
                }
                beginTransaction2.replace(C0126R.C0129id.credit_card_update_fragment_holder, axbf2, bmie3.f129550c).commit();
            }
            this.f95692e.mo66032a(this.f95689b);
            this.f95691d.add(new bkde(this.f95689b));
            OrchestrationViewEvent.m93828c(getActivity(), this.f95693f, this.f95689b.f95680e);
        }
        if ((((bmge) this.f124069w).f129227a & 16) != 0) {
            bkdx bkdx = (bkdx) childFragmentManager.findFragmentById(C0126R.C0129id.instrument_fragment_holder);
            this.f95690c = bkdx;
            if (bkdx != null) {
                bmfu bmfu = ((bmge) this.f124069w).f129231e;
                if (bmfu == null) {
                    bmfu = bmfu.f129167j;
                }
            }
            bmfu bmfu2 = ((bmge) this.f124069w).f129231e;
            bmfu bmfu3 = bmfu2 != null ? bmfu2 : bmfu.f129167j;
            int i = this.f123961aF;
            bmdn bmdn = ((bmge) this.f124069w).f129228b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            this.f95690c = awia.m79969a(bmfu3, i, bmdn.f128837e, this.f95693f, bpis.FLOW_TYPE_BUYFLOW, mo65980at(), null);
            childFragmentManager.beginTransaction().replace(C0126R.C0129id.instrument_fragment_holder, this.f95690c).commit();
            this.f95692e.mo66032a(this.f95690c);
            this.f95691d.add(new bkde(this.f95690c));
            OrchestrationViewEvent.m93828c(getActivity(), this.f95693f, this.f95690c.mo51919co());
        }
        return inflate;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        axbf axbf = this.f95689b;
        if (axbf != null && !axbf.mo52775bR()) {
            return false;
        }
        bkdx bkdx = this.f95690c;
        return bkdx == null || bkdx.mo52775bR();
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95692e;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        ArrayList arrayList = new ArrayList(3);
        bjzo bjzo = this.f95688a;
        if (bjzo != null) {
            arrayList.add(bjzo);
        }
        axbf axbf = this.f95689b;
        if (axbf != null) {
            arrayList.add(axbf);
        }
        bkdx bkdx = this.f95690c;
        if (bkdx != null) {
            arrayList.add(bkdx);
        }
        return arrayList;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95691d;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        super.mo52947bY();
        bjzo bjzo = this.f95688a;
        if (bjzo != null) {
            bjzo.mo52947bY();
        }
        axbf axbf = this.f95689b;
        if (axbf != null) {
            axbf.mo52947bY();
        }
        bkdx bkdx = this.f95690c;
        if (bkdx != null) {
            bkdx.mo52947bY();
        }
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return null;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        bjzo bjzo = this.f95688a;
        if (bjzo != null) {
            bjzo.mo52808n(z);
        }
        axbf axbf = this.f95689b;
        if (axbf != null) {
            axbf.mo52808n(z);
        }
        bkdx bkdx = this.f95690c;
        if (bkdx != null) {
            bkdx.mo52808n(z);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f95693f = getArguments().getString("analyticsSessionId");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmge.f129225f.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmge) this.f124069w).f129228b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bjzo bjzo = this.f95688a;
        if (bjzo != null && bjzo.mo52281a(bmas)) {
            return true;
        }
        axbf axbf = this.f95689b;
        if (axbf != null && axbf.mo52281a(bmas)) {
            return true;
        }
        bkdx bkdx = this.f95690c;
        if (bkdx == null || !bkdx.mo52281a(bmas)) {
            return false;
        }
        return true;
    }
}
