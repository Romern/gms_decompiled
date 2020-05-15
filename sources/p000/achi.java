package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: achi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achi extends acgr {

    /* renamed from: e */
    private final acgo f59849e;

    /* renamed from: f */
    private final rnt f59850f;

    /* renamed from: g */
    private final String f59851g;

    /* renamed from: h */
    private final afnj f59852h;

    public achi(acgo acgo, String str, Account account, int i, int i2, afnj afnj, rnt rnt) {
        super(account, i, i2, byhm.SYNC_FULL_SNAPSHOT);
        this.f59851g = str;
        this.f59849e = acgo;
        this.f59852h = afnj;
        this.f59850f = rnt;
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59850f.mo11797a(status);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: e */
    public final void mo32668e() {
        acgo acgo = this.f59849e;
        bygz a = mo32663a();
        Account account = this.f59808a;
        String str = this.f59851g;
        afnj afnj = this.f59852h;
        acgn a2 = acgo.mo32740a(a, account);
        synchronized (a2.f59789a) {
            acgl acgl = (acgl) a2.f59789a.get(afnj.f12819a);
            if (acgl == null) {
                a2.f59789a.put(afnj.f12819a, new acgl(a2, str, afnj));
            } else {
                bmxy.m108588a(str.equals(acgl.f59779a));
            }
        }
        a2.mo32739a();
        this.f59850f.mo11797a(Status.f30107a);
    }
}
