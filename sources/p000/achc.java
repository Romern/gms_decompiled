package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;

/* renamed from: achc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achc extends acgr {

    /* renamed from: e */
    private final afna f59833e;

    /* renamed from: f */
    private final baih f59834f;

    public achc(baii baii, String str, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter, afna afna) {
        super(account, i, i2, byhm.SYNC_FULL_SNAPSHOT);
        int i3 = timeSeriesFootprintsReadFilter.f80008a;
        Long l = timeSeriesFootprintsReadFilter.f80009b;
        Long l2 = timeSeriesFootprintsReadFilter.f80010c;
        babr babr = (babr) baii.f100982a.mo6445a();
        baii.m86936a(babr, 1);
        cayo cayo = (cayo) baii.f100983b.mo6445a();
        baii.m86936a(cayo, 2);
        bafu bafu = (bafu) baii.f100984c.mo6445a();
        baii.m86936a(bafu, 3);
        baok baok = (baok) baii.f100985d.mo6445a();
        baii.m86936a(baok, 4);
        baii.m86936a(str, 5);
        baii.m86936a(account, 6);
        this.f59834f = new baih(babr, cayo, bafu, baok, str, account, i, i2, i3, l, l2);
        this.f59833e = afna;
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59833e.mo34969a(status, null);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: e */
    public final void mo32668e() {
        try {
            this.f59833e.mo34969a(Status.f30107a, acfw.m49039a(this.f59834f.call()));
        } catch (azzp e) {
            this.f59833e.mo34969a(ackq.m49338a(getClass().getSimpleName(), e), null);
        }
    }
}
