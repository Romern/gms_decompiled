package p000;

import android.accounts.Account;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgo implements baoj, babp, bafg {

    /* renamed from: a */
    private final Map f59797a = new HashMap();

    /* renamed from: b */
    private final acgp f59798b;

    public acgo(acgp acgp) {
        this.f59798b = acgp;
    }

    /* renamed from: a */
    private static boolean m49071a(bygz bygz) {
        if (bygz.f166412a != 2) {
            return false;
        }
        byhm a = byhm.m124816a(((byhn) bygz.f166413b).f166483d);
        if (a == null) {
            a = byhm.UNKNOWN;
        }
        return a == byhm.SYNC_FULL_SNAPSHOT;
    }

    /* renamed from: a */
    public final void mo32732a(String str, bygz bygz, Account account) {
    }

    /* renamed from: b */
    public final void mo32733b(bygz bygz, Account account) {
        if (m49071a(bygz)) {
            mo32740a(bygz, account).mo32739a();
        }
    }

    /* renamed from: c */
    public final boolean mo32735c(bygz bygz, Account account) {
        boolean z;
        acgn a = mo32740a(bygz, account);
        synchronized (a.f59789a) {
            z = !a.f59789a.isEmpty();
        }
        return z;
    }

    /* renamed from: b */
    public final void mo32734b(String str, bygz bygz, Account account) {
        if (m49071a(bygz)) {
            mo32740a(bygz, account).mo32739a();
        }
    }

    /* renamed from: a */
    public final acgn mo32740a(bygz bygz, Account account) {
        byhn byhn;
        boolean z;
        acgn acgn;
        if (bygz.f166412a == 2) {
            byhn = (byhn) bygz.f166413b;
        } else {
            byhn = byhn.f166478e;
        }
        byhm a = byhm.m124816a(byhn.f166483d);
        if (a == null) {
            a = byhm.UNKNOWN;
        }
        if (a == byhm.SYNC_FULL_SNAPSHOT) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        babm a2 = babm.m86492a(account, bygz);
        synchronized (this.f59797a) {
            acgn = (acgn) this.f59797a.get(a2);
            if (acgn == null) {
                acgp acgp = this.f59798b;
                achw b = acdj.m48955b();
                acgp.m49079a(b, 1);
                baok baok = (baok) acgp.f59799a.mo6445a();
                acgp.m49079a(baok, 2);
                bafu bafu = (bafu) acgp.f59800b.mo6445a();
                acgp.m49079a(bafu, 3);
                azzy azzy = (azzy) acgp.f59801c.mo6445a();
                acgp.m49079a(azzy, 4);
                cayo cayo = (cayo) acgp.f59802d.mo6445a();
                acgp.m49079a(cayo, 5);
                acgp.m49079a(a2, 6);
                acgn acgn2 = new acgn(b, baok, bafu, azzy, cayo, a2);
                this.f59797a.put(a2, acgn2);
                acgn = acgn2;
            }
        }
        return acgn;
    }

    /* renamed from: a */
    public final void mo32729a(baog baog) {
        baog.mo55814a();
        Account b = baog.mo55815b();
        bygz c = baog.mo55816c();
        if (m49071a(c)) {
            mo32740a(c, b).mo32739a();
        }
    }

    /* renamed from: a */
    public final void mo32730a(baog baog, baog baog2) {
        if ((baog == null || !baog.mo55818e().equals(baog2.mo55818e()) || !baog.mo55817d().equals(baog2.mo55817d())) && m49071a(baog2.mo55816c())) {
            mo32740a(baog2.mo55816c(), baog2.mo55815b()).mo32739a();
        }
    }
}
