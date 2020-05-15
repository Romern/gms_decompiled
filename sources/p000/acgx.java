package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: acgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgx extends acgr {

    /* renamed from: e */
    private final afna f59822e;

    /* renamed from: f */
    private final baie f59823f;

    public acgx(baif baif, String str, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, afna afna) {
        super(account, i, i2, byhm.SYNC_LATEST_PER_SECONDARY_ID);
        badj a = acfw.m49036a(latestFootprintFilter);
        cijl cijl = baif.f100956a;
        accv b = accx.m48946b();
        baif.m86933a(b, 1);
        cayo cayo = (cayo) baif.f100957b.mo6445a();
        baif.m86933a(cayo, 2);
        bafj bafj = (bafj) baif.f100958c.mo6445a();
        baif.m86933a(bafj, 3);
        baok baok = (baok) baif.f100959d.mo6445a();
        baif.m86933a(baok, 4);
        baif.m86933a(str, 5);
        baif.m86933a(account, 6);
        baif.m86933a(a, 9);
        this.f59823f = new baie(b, cayo, bafj, baok, str, account, i, i2, a);
        this.f59822e = afna;
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59822e.mo34969a(status, null);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: e */
    public final void mo32668e() {
        try {
            this.f59822e.mo34969a(Status.f30107a, acfw.m49039a(this.f59823f.call()));
        } catch (azzp e) {
            this.f59822e.mo34969a(ackq.m49338a(getClass().getSimpleName(), e), null);
        }
    }
}
