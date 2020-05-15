package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: achk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achk extends acgr {

    /* renamed from: e */
    private final acgi f59854e;

    /* renamed from: f */
    private final rnt f59855f;

    /* renamed from: g */
    private final afmu f59856g;

    public achk(acgi acgi, Account account, int i, int i2, afmu afmu, rnt rnt) {
        super(account, i, i2, byhm.SYNC_LATEST_PER_SECONDARY_ID);
        this.f59854e = acgi;
        this.f59856g = afmu;
        this.f59855f = rnt;
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59855f.mo11797a(status);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: e */
    public final void mo32668e() {
        acgi acgi = this.f59854e;
        bygz a = mo32663a();
        Account account = this.f59808a;
        afmu afmu = this.f59856g;
        acgf a2 = acgi.mo32728a(a, account);
        synchronized (a2.f59756a) {
            acgd acgd = (acgd) a2.f59756a.remove(afmu.asBinder());
            if (acgd != null) {
                acgd.mo32725a();
            }
        }
        this.f59855f.mo11797a(Status.f30107a);
    }
}
