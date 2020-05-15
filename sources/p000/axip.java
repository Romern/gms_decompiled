package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.AuthFailureError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.firstparty.ConfirmTransactionRequest;
import com.google.android.gms.walletp2p.internal.firstparty.ConfirmTransactionResponse;
import java.util.concurrent.ExecutionException;

/* renamed from: axip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axip extends axeq {

    /* renamed from: e */
    private final ConfirmTransactionRequest f96020e;

    public axip(ConfirmTransactionRequest confirmTransactionRequest, Account account, Bundle bundle, axnc axnc) {
        super("ConfirmTransactionOperation", confirmTransactionRequest, account, bundle, axnc);
        this.f96020e = confirmTransactionRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((axnc) this.f95864c).mo53262a((ConfirmTransactionResponse) null, status);
    }

    /* renamed from: b */
    public final void mo53072b(Context context) {
        Account[] a = axlr.m82700a(context, this.f95862a);
        int length = a.length;
        int i = 0;
        while (i < length) {
            Account account = a[i];
            try {
                String str = this.f96020e.f110779a;
                int a2 = mo53071a();
                bxvd da = btuc.f150450c.mo74144da();
                bxvd da2 = btsi.f150214c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btsi btsi = (btsi) da2.f164949b;
                str.getClass();
                btsi.f150216a |= 1;
                btsi.f150217b = str;
                btsi btsi2 = (btsi) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btuc btuc = (btuc) da.f164949b;
                btsi2.getClass();
                btuc.f150453b = btsi2;
                btuc.f150452a |= 1;
                btud btud = (btud) axmo.m82727a("b/fundstransferv2/confirmTransaction", account, da.mo74062i(), btud.f150454b, a2).get();
                if (btud != null && (btud.f150456a & 1) == 0) {
                    ((axnc) this.f95864c).mo53262a(new ConfirmTransactionResponse(), Status.f30107a);
                    return;
                }
                i++;
            } catch (ExecutionException e) {
                if (!(e.getCause() instanceof AuthFailureError)) {
                    throw e;
                }
            }
        }
        mo6503a(new Status(13));
    }
}
