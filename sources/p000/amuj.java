package p000;

import android.accounts.Account;
import java.util.Iterator;

/* renamed from: amuj */
final /* synthetic */ class amuj implements rkl {

    /* renamed from: a */
    private final amuk f75948a;

    /* renamed from: b */
    private final Account f75949b;

    /* renamed from: c */
    private final C0034at f75950c;

    public amuj(amuk amuk, C0034at atVar, Account account) {
        this.f75948a = amuk;
        this.f75950c = atVar;
        this.f75949b = account;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (p000.cfut.m143114c() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r1.mo2453l(p000.amup.m63318b(r2.name));
        r0.f75951a.remove(r2);
     */
    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        amuk amuk = this.f75948a;
        C0034at atVar = this.f75950c;
        Account account = this.f75949b;
        alky alky = (alky) rkk;
        try {
            if (alky.mo7183bo().mo17710c() && alky.mo12459b() != null) {
                Iterator it = alky.mo12459b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    alzr alzr = (alzr) it.next();
                    if (alzr.mo41063c().equals(account.name)) {
                        bddn g = bddo.m90606g();
                        g.mo57907a(alzr.mo41063c());
                        g.f105375a = alzr.mo41064d();
                        atVar.mo2453l(g.mo57906a());
                        break;
                    }
                }
            } else {
                atVar.mo2453l(amup.m63318b(account.name));
                if (cfut.m143114c()) {
                    amuk.f75951a.remove(account);
                }
            }
        } finally {
            alky.mo12460c();
        }
    }
}
