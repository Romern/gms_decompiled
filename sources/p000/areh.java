package p000;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;

/* renamed from: areh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class areh implements arel {

    /* renamed from: a */
    private final ardy f87508a;

    /* renamed from: b */
    private final AccountTransferPayload f87509b;

    public areh(ardy ardy, AccountTransferPayload accountTransferPayload) {
        this.f87508a = ardy;
        this.f87509b = accountTransferPayload;
    }

    /* renamed from: a */
    public final void mo48472a() {
        AccountTransferMsg b = this.f87509b.mo59088b();
        if (b == null) {
            arem.f87517d.mo25418e("Could not import accounts because AccountTransferMsg is null", new Object[0]);
        } else {
            this.f87508a.mo48450a(b);
        }
    }
}
