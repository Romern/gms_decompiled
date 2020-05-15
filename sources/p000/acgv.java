package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: acgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgv extends acgr {

    /* renamed from: e */
    private final babr f59817e;

    /* renamed from: f */
    private final afmx f59818f;

    /* renamed from: g */
    private final baib f59819g;

    public acgv(babr babr, baic baic, String str, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, afmx afmx) {
        super(account, i, i2, byhm.SYNC_LATEST_PER_SECONDARY_ID);
        this.f59817e = babr;
        this.f59818f = afmx;
        this.f59819g = baic.mo55704a(str, account, i, i2, acfw.m49036a(latestFootprintFilter));
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable;
        afmx afmx = this.f59818f;
        if (this.f59817e.mo32674F()) {
            mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(bngx.m109376e());
        } else {
            mdhFootprintListSafeParcelable = null;
        }
        afmx.mo34968a(status, mdhFootprintListSafeParcelable);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: e */
    public final void mo32668e() {
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable;
        try {
            this.f59818f.mo34968a(Status.f30107a, new MdhFootprintListSafeParcelable(bnkn.m109668a(this.f59819g.call(), acgu.f59816a)));
        } catch (azzp e) {
            afmx afmx = this.f59818f;
            Status a = ackq.m49338a(getClass().getSimpleName(), e);
            if (this.f59817e.mo32674F()) {
                mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(bngx.m109376e());
            } else {
                mdhFootprintListSafeParcelable = null;
            }
            afmx.mo34968a(a, mdhFootprintListSafeParcelable);
        }
    }
}
