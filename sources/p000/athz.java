package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: athz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class athz extends atkj {
    public athz(String str, aswm aswm) {
        super("GetActiveWalletId", str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49621b(status, (String) null);
    }

    /* renamed from: a */
    public final boolean mo50004a() {
        return false;
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        super.mo50005b(context);
        String b = askc.m74272b();
        String b2 = stm.m36300b(atxr.m76516a(asko.m74292a(context).mo49214a(), "SELECT wallet_id from Wallets WHERE is_active_wallet = 1 AND environment = ?;", b));
        if (!bmxx.m108577a(b2)) {
            this.f90414d.mo49621b(Status.f30107a, b2);
        } else {
            this.f90414d.mo49621b(new Status(15002), (String) null);
        }
    }
}
