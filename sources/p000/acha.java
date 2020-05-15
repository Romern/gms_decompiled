package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: acha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acha extends acgr {

    /* renamed from: e */
    private final babr f59826e;

    /* renamed from: f */
    private final afmx f59827f;

    /* renamed from: g */
    private final baig f59828g;

    public acha(babr babr, cayo cayo, bafu bafu, baok baok, String str, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter, afmx afmx) {
        super(account, i, i2, byhm.SYNC_FULL_SNAPSHOT);
        this.f59826e = babr;
        this.f59827f = afmx;
        this.f59828g = new baig(babr, cayo, bafu, baok, str, account, i, i2, timeSeriesFootprintsReadFilter.f80008a, timeSeriesFootprintsReadFilter.f80009b, timeSeriesFootprintsReadFilter.f80010c);
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable;
        afmx afmx = this.f59827f;
        if (this.f59826e.mo32674F()) {
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
            this.f59827f.mo34968a(Status.f30107a, new MdhFootprintListSafeParcelable(bnkn.m109668a(this.f59828g.call(), acgz.f59825a)));
        } catch (azzp e) {
            afmx afmx = this.f59827f;
            Status a = ackq.m49338a(getClass().getSimpleName(), e);
            if (this.f59826e.mo32674F()) {
                mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(bngx.m109376e());
            } else {
                mdhFootprintListSafeParcelable = null;
            }
            afmx.mo34968a(a, mdhFootprintListSafeParcelable);
        }
    }
}
