package p000;

import android.content.Context;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;

/* renamed from: gvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gvd extends gvc {

    /* renamed from: f */
    private static final sbw f19066f = new sbw("AccountTransfer", "[ATImportExternalAccountsOperation]");

    public gvd(int i, guk guk, AuthenticatorTransferInfo authenticatorTransferInfo, boolean z) {
        super(i, guk, "ImportExternalAccountsOperation", authenticatorTransferInfo, 1, z);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (mo12263f(context)) {
            int i = this.f19065e.f10063d;
            switch (i) {
                case 1:
                    mo12260c(context);
                    return;
                case 2:
                    if (!gub.m13906a().mo12229b(context, 1)) {
                        gtv.m13887a();
                    }
                    mo12261d(context);
                    return;
                case 3:
                case 5:
                case 6:
                    break;
                case 4:
                    if (!mo12262e(context)) {
                        return;
                    }
                    break;
                default:
                    sbw sbw = f19066f;
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Should not have happened. WTF. Status is ");
                    sb.append(i);
                    sbw.mo25380d("AccountTransfer", sb.toString(), new IllegalArgumentException());
                    return;
            }
            mo12258b(context);
        }
    }
}
