package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: achm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achm extends acgr {

    /* renamed from: e */
    private final acgo f59858e;

    /* renamed from: f */
    private final rnt f59859f;

    /* renamed from: g */
    private final afnj f59860g;

    public achm(acgo acgo, Account account, int i, int i2, afnj afnj, rnt rnt) {
        super(account, i, i2, byhm.SYNC_FULL_SNAPSHOT);
        this.f59858e = acgo;
        this.f59860g = afnj;
        this.f59859f = rnt;
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59859f.mo11797a(status);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: e */
    public final void mo32668e() {
        acgo acgo = this.f59858e;
        bygz a = mo32663a();
        Account account = this.f59808a;
        afnj afnj = this.f59860g;
        acgn a2 = acgo.mo32740a(a, account);
        synchronized (a2.f59789a) {
            acgl acgl = (acgl) a2.f59789a.remove(afnj.f12819a);
            if (acgl != null) {
                acgl.mo32738a();
            }
        }
        this.f59859f.mo11797a(Status.f30107a);
    }
}
