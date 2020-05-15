package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: achq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achq extends acgr {

    /* renamed from: e */
    private final bail f59866e;

    /* renamed from: f */
    private final afnc f59867f;

    public achq(cayo cayo, bafu bafu, String str, Account account, int i, int i2, byte[] bArr, afnc afnc) {
        super(account, i, i2, byhm.SYNC_FULL_SNAPSHOT);
        this.f59866e = new bail(cayo, bafu, str, account, i, i2, bArr);
        this.f59867f = afnc;
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59867f.mo34971a(status, -1);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.WRITE;
    }

    /* renamed from: e */
    public final void mo32668e() {
        try {
            this.f59867f.mo34971a(Status.f30107a, this.f59866e.call().longValue());
        } catch (azzp e) {
            this.f59867f.mo34971a(ackq.m49338a(getClass().getSimpleName(), e), -1);
        }
    }
}
