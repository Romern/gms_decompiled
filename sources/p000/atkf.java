package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.TokenizeAccountRequest;
import com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity;

/* renamed from: atkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atkf extends atki {
    public atkf(TokenizeAccountRequest tokenizeAccountRequest, String str, aswm aswm) {
        super("TokenizeAccount", tokenizeAccountRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        try {
            askf b = askg.m74283b(context, null);
            if (b != null) {
                TokenizeAccountRequest tokenizeAccountRequest = (TokenizeAccountRequest) this.f90410b;
                if (tokenizeAccountRequest.f108562a == 2) {
                    if (!b.f89124b.equals(tokenizeAccountRequest.f108564c)) {
                        throw new aaaj(5, null);
                    }
                }
                TokenizeAccountRequest tokenizeAccountRequest2 = (TokenizeAccountRequest) this.f90410b;
                this.f90414d.mo49607a(new Status(6, null, atrq.m76258a(context, AccountSetupChimeraActivity.m93191a(b, tokenizeAccountRequest2.f108562a, tokenizeAccountRequest2.f108563b, tokenizeAccountRequest2.f108565d, this.f90413c))), Bundle.EMPTY);
                return;
            }
            this.f90414d.mo49607a(new Status(15002), Bundle.EMPTY);
        } catch (asks e) {
            this.f90414d.mo49607a(Status.f30109c, Bundle.EMPTY);
        }
    }
}
