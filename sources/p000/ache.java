package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: ache */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ache extends acgr {

    /* renamed from: e */
    private static final int f59836e = byip.f166588d.mo73900a();

    /* renamed from: f */
    private final acgi f59837f;

    /* renamed from: g */
    private final rnt f59838g;

    /* renamed from: h */
    private final String f59839h;

    /* renamed from: i */
    private final afmu f59840i;

    /* renamed from: j */
    private final LatestFootprintFilter f59841j;

    public ache(acgi acgi, String str, Account account, int i, afmu afmu, rnt rnt) {
        super(account, 553, f59836e, byhm.SYNC_LATEST_PER_SECONDARY_ID);
        this.f59839h = str;
        this.f59837f = acgi;
        this.f59838g = rnt;
        byte[] bytes = String.valueOf(i).getBytes(bmwy.f131158c);
        afkp a = LatestFootprintFilter.m67177a();
        a.mo34926a(bytes, 1);
        this.f59841j = a.mo34925a();
        this.f59840i = afmu;
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59838g.mo11797a(status);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: e */
    public final void mo32668e() {
        this.f59837f.mo32731a(mo32663a(), this.f59808a, this.f59839h, this.f59841j, this.f59840i);
        this.f59838g.mo11797a(Status.f30107a);
    }
}
