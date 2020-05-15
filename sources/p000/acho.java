package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: acho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acho extends acgr {

    /* renamed from: e */
    private final baik f59862e;

    /* renamed from: f */
    private final rnt f59863f;

    public acho(cayo cayo, bafj bafj, String str, Account account, int i, int i2, byte[] bArr, byte[] bArr2, rnt rnt) {
        super(account, i, i2, byhm.SYNC_LATEST_PER_SECONDARY_ID);
        this.f59862e = new baik(cayo, bafj, str, account, i, i2, bArr, bArr2);
        this.f59863f = rnt;
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59863f.mo11797a(status);
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.WRITE;
    }

    /* renamed from: e */
    public final void mo32668e() {
        try {
            this.f59862e.mo55711a();
            this.f59863f.mo11797a(Status.f30107a);
        } catch (azzp e) {
            this.f59863f.mo11797a(ackq.m49338a(getClass().getSimpleName(), e));
        }
    }
}
