package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.FootprintsRecordingSetting;

/* renamed from: acgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgs extends acgr {

    /* renamed from: e */
    private static final int f59812e = byip.f166588d.mo73900a();

    /* renamed from: f */
    private final bahz f59813f;

    /* renamed from: g */
    private final afnb f59814g;

    public acgs(baia baia, String str, Account account, int i, afnb afnb) {
        super(account, 553, f59812e, byhm.SYNC_LATEST_PER_SECONDARY_ID);
        baic baic = (baic) baia.f100929a.mo6445a();
        baia.m86926a(baic, 1);
        baia.m86926a(str, 2);
        baia.m86926a(account, 3);
        this.f59813f = new bahz(baic, str, account, i);
        this.f59814g = afnb;
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59814g.mo34970a(status, (FootprintsRecordingSetting) null);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: e */
    public final void mo32668e() {
        FootprintsRecordingSetting footprintsRecordingSetting;
        try {
            afnb afnb = this.f59814g;
            Status status = Status.f30107a;
            badn a = this.f59813f.call();
            if (a != null) {
                footprintsRecordingSetting = new FootprintsRecordingSetting(((badd) a).f100516a, ((badd) a).f100517b, ((badd) a).f100518c, ((badd) a).f100519d);
            } else {
                footprintsRecordingSetting = null;
            }
            afnb.mo34970a(status, footprintsRecordingSetting);
        } catch (azzp e) {
            this.f59814g.mo34970a(ackq.m49338a(getClass().getSimpleName(), e), (FootprintsRecordingSetting) null);
        }
    }
}
