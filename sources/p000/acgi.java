package p000;

import android.accounts.Account;
import com.google.android.gms.mdh.LatestFootprintFilter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgi implements baoj, babp, bafg {

    /* renamed from: a */
    private final Map f59772a = new HashMap();

    /* renamed from: b */
    private final acgg f59773b;

    public acgi(acgg acgg) {
        this.f59773b = acgg;
    }

    /* renamed from: a */
    private static boolean m49056a(bygz bygz) {
        if (bygz.f166412a != 2) {
            return false;
        }
        byhm a = byhm.m124816a(((byhn) bygz.f166413b).f166483d);
        if (a == null) {
            a = byhm.UNKNOWN;
        }
        return a == byhm.SYNC_LATEST_PER_SECONDARY_ID;
    }

    /* renamed from: a */
    public final void mo32732a(String str, bygz bygz, Account account) {
    }

    /* renamed from: b */
    public final void mo32733b(bygz bygz, Account account) {
        if (m49056a(bygz)) {
            mo32728a(bygz, account).mo32726a();
        }
    }

    /* renamed from: c */
    public final boolean mo32735c(bygz bygz, Account account) {
        boolean z;
        acgf a = mo32728a(bygz, account);
        synchronized (a.f59756a) {
            z = !a.f59756a.isEmpty();
        }
        return z;
    }

    /* renamed from: b */
    public final void mo32734b(String str, bygz bygz, Account account) {
        if (m49056a(bygz)) {
            mo32728a(bygz, account).mo32726a();
        }
    }

    /* renamed from: a */
    public final acgf mo32728a(bygz bygz, Account account) {
        byhn byhn;
        boolean z;
        acgf acgf;
        if (bygz.f166412a == 2) {
            byhn = (byhn) bygz.f166413b;
        } else {
            byhn = byhn.f166478e;
        }
        byhm a = byhm.m124816a(byhn.f166483d);
        if (a == null) {
            a = byhm.UNKNOWN;
        }
        if (a == byhm.SYNC_LATEST_PER_SECONDARY_ID) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        babm a2 = babm.m86492a(account, bygz);
        synchronized (this.f59772a) {
            acgf = (acgf) this.f59772a.get(a2);
            if (acgf == null) {
                acgg acgg = this.f59773b;
                achw b = acdj.m48955b();
                acgg.m49053a(b, 1);
                baok baok = (baok) acgg.f59763a.mo6445a();
                acgg.m49053a(baok, 2);
                bafj bafj = (bafj) acgg.f59764b.mo6445a();
                acgg.m49053a(bafj, 3);
                azzy azzy = (azzy) acgg.f59765c.mo6445a();
                acgg.m49053a(azzy, 4);
                cayo cayo = (cayo) acgg.f59766d.mo6445a();
                acgg.m49053a(cayo, 5);
                acgg.m49053a(a2, 6);
                acgf acgf2 = new acgf(b, baok, bafj, azzy, cayo, a2);
                this.f59772a.put(a2, acgf2);
                acgf = acgf2;
            }
        }
        return acgf;
    }

    /* renamed from: a */
    public final void mo32729a(baog baog) {
        baog.mo55814a();
        Account b = baog.mo55815b();
        bygz c = baog.mo55816c();
        if (m49056a(c)) {
            mo32728a(c, b).mo32726a();
        }
    }

    /* renamed from: a */
    public final void mo32730a(baog baog, baog baog2) {
        if ((baog == null || !baog.mo55818e().equals(baog2.mo55818e()) || !baog.mo55817d().equals(baog2.mo55817d())) && m49056a(baog2.mo55816c())) {
            mo32728a(baog2.mo55816c(), baog2.mo55815b()).mo32726a();
        }
    }

    /* renamed from: a */
    public final void mo32731a(bygz bygz, Account account, String str, LatestFootprintFilter latestFootprintFilter, afmu afmu) {
        acgf a = mo32728a(bygz, account);
        badj a2 = acfw.m49036a(latestFootprintFilter);
        synchronized (a.f59756a) {
            acgd acgd = (acgd) a.f59756a.get(afmu.asBinder());
            if (acgd == null) {
                a.f59756a.put(afmu.asBinder(), new acgd(a, str, a2, afmu));
            } else {
                bmxy.m108588a(str.equals(acgd.f59745a));
                if (!a2.equals(acgd.f59748d)) {
                    acgd.f59748d = a2;
                    acgd.mo32725a();
                }
            }
        }
        a.mo32726a();
    }
}
