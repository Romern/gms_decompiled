package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: achg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achg extends acgr {

    /* renamed from: e */
    private final acgi f59843e;

    /* renamed from: f */
    private final rnt f59844f;

    /* renamed from: g */
    private final String f59845g;

    /* renamed from: h */
    private final LatestFootprintFilter f59846h;

    /* renamed from: i */
    private final afmu f59847i;

    public achg(acgi acgi, String str, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, afmu afmu, rnt rnt) {
        super(account, i, i2, byhm.SYNC_LATEST_PER_SECONDARY_ID);
        this.f59845g = str;
        this.f59843e = acgi;
        this.f59846h = latestFootprintFilter;
        this.f59847i = afmu;
        this.f59844f = rnt;
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59844f.mo11797a(status);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: e */
    public final void mo32668e() {
        this.f59843e.mo32731a(mo32663a(), this.f59808a, this.f59845g, this.f59846h, this.f59847i);
        this.f59844f.mo11797a(Status.f30107a);
    }
}
