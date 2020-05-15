package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.net.URL;

/* renamed from: agkd */
final /* synthetic */ class agkd implements Runnable {

    /* renamed from: a */
    private final agkm f65775a;

    public agkd(agkm agkm) {
        this.f65775a = agkm;
    }

    public final void run() {
        NetworkInfo networkInfo;
        agkm agkm = this.f65775a;
        agkm.mo35241h();
        if (agkm.mo35539w().f65635t.mo35457a()) {
            agkm.mo35497E().f65571j.mo35435a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = agkm.mo35539w().f65636u.mo35458a();
        agkm.mo35539w().f65636u.mo35459a(1 + a);
        agkm.mo35538v();
        if (a >= 5) {
            agkm.mo35497E().f65567f.mo35435a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            agkm.mo35539w().f65635t.mo35456a(true);
            return;
        }
        agje agje = agkm.f65756y;
        agje.mo35512p();
        agje.m54357a((agjv) agje.mo35505i());
        String o = agje.mo35510n().mo35404o();
        Pair a2 = agje.mo35499a().mo35465a(o);
        if (!agje.f65691g.mo35325f().booleanValue() || ((Boolean) a2.second).booleanValue() || TextUtils.isEmpty((CharSequence) a2.first)) {
            agje.mo35497E().f65571j.mo35435a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        agkq i = agje.mo35505i();
        i.mo35544k();
        try {
            networkInfo = ((ConnectivityManager) i.mo35542z().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            URL a3 = agje.mo35502f().mo35728a(agje.mo35510n().mo35408s(), o, (String) a2.first, agje.mo35499a().f65636u.mo35458a() - 1);
            agkq i2 = agje.mo35505i();
            agjc agjc = new agjc(agje);
            i2.mo35241h();
            i2.mo35544k();
            sdo.m34959a(a3);
            sdo.m34959a(agjc);
            i2.mo35498F().mo35494b(new agkp(i2, o, a3, agjc));
            return;
        }
        agje.mo35497E().f65567f.mo35435a("Network is not available for Deferred Deep Link request. Skipping");
    }
}
