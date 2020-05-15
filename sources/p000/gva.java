package p000;

import android.content.Context;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;

/* renamed from: gva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gva extends gvc {

    /* renamed from: f */
    private static final sbw f19062f = new sbw("AccountTransfer", "[ATExportExternalAccountsOperation]");

    public gva(int i, guk guk, AuthenticatorTransferInfo authenticatorTransferInfo, boolean z) {
        super(i, guk, "AccountTransfer", authenticatorTransferInfo, 2, z);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f19062f.mo25379d("execute()");
        if (mo12263f(context)) {
            switch (this.f19065e.f10063d) {
                case 1:
                    mo12260c(context);
                    return;
                case 2:
                    mo12261d(context);
                    return;
                case 3:
                    break;
                case 4:
                    if (!mo12262e(context)) {
                        return;
                    }
                    break;
                case 5:
                case 6:
                    mo12258b(context);
                    return;
                default:
                    f19062f.mo25380d("AccountTransfer", "Should not have happened. WTF", new IllegalArgumentException());
                    return;
            }
            mo12258b(context);
        }
    }
}
