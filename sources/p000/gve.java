package p000;

import android.content.Context;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.DeviceAuthInfo;
import java.util.ArrayList;

/* renamed from: gve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gve extends guz {
    public gve(int i, guk guk, AccountTransferMsg accountTransferMsg, DeviceAuthInfo deviceAuthInfo, ArrayList arrayList) {
        super(i, guk, "ImportSetupAccountsOperation", accountTransferMsg, deviceAuthInfo, arrayList, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (mo12255c()) {
            return;
        }
        if (this.f19054e.f10043d == 1) {
            mo12253b(context);
            mo12254c(context);
            return;
        }
        super.mo6502a(context);
    }
}
