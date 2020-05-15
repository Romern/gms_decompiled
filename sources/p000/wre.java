package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsPayload;

/* renamed from: wre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wre implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wrg f51169a;

    public wre(wrg wrg) {
        this.f51169a = wrg;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f51169a.getActivity();
        wrg wrg = this.f51169a;
        String str = wrg.f51170a;
        wgh p = wrg.f51173d.mo18459p();
        Context context = this.f51169a.getContext();
        awbt awbt = new awbt();
        awbt.mo51835a(1);
        awkh a = awbv.m79579a(context, awbt.mo51834a());
        wrg wrg2 = this.f51169a;
        WalletCustomTheme walletCustomTheme = wrg2.f51174e;
        wgj w = wrg2.f51173d.mo18466w();
        wrg wrg3 = this.f51169a;
        return new wnm(activity, str, p, a, walletCustomTheme, w, wrg3.f51171b, wrg3.f51176g);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (!why.f50696b) {
            wgn.m41926f("UpgradePreconditionsFragment", "CanUpgradeFamilyLoader failure.", new Object[0]);
            this.f51169a.mo29310b();
            return;
        }
        brbb brbb = (brbb) why.f50695a;
        String valueOf = String.valueOf(brbb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("CanUpgradeFamily response: ");
        sb.append(valueOf);
        sb.toString();
        sbw sbw = wgn.f50624a;
        this.f51169a.mo9306a();
        if (brbb.f142225c.size() != 0 && brbb.f142225c.size() == 1 && ((brej) brbb.f142220d.mo14948a(Integer.valueOf(brbb.f142225c.mo74151b(0)))) == brej.CVN_CHALLENGE_REQUIRED) {
            awlh awlh = new awlh(this.f51169a.getActivity());
            awlh.mo52187a(cdsw.m134870c() ^ true ? 1 : 0);
            awlh.mo52190a(this.f51169a.f51174e);
            awlh.mo52188a(new Account(this.f51169a.f51170a, "com.google"));
            awlh.mo52235a(new SecurePaymentsPayload(brbb.f142227f.mo73780k(), new SecurePaymentsData[0]));
            this.f51169a.startActivityForResult(awlh.mo52186a(), 1);
            this.f51169a.f51175f = true;
        } else if (!brbb.f142224b) {
            wgn.m41926f("UpgradePreconditionsFragment", "CanUpgradeFamily false without CVN Verification precondition", new Object[0]);
            wrf wrf = this.f51169a.f51173d;
            bree bree = ((brbb) why.f50695a).f142226e;
            if (bree == null) {
                bree = bree.f142590e;
            }
            wrf.mo18439a(new PageData(bree));
        } else {
            wrg wrg = this.f51169a;
            wrg.f51173d.mo18448d(wrg.f51172c);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
