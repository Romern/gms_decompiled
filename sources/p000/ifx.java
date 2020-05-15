package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.authzen.AuthzenPublicKey;
import com.google.android.gms.auth.authzen.EncryptionKey;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: ifx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifx extends ift {

    /* renamed from: a */
    private final AuthzenPublicKey f20893a;

    /* renamed from: b */
    private final iie f20894b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ifx(iie iie, AuthzenPublicKey authzenPublicKey) {
        super("PerformKeyAgreementForProximity");
        long j = ifj.f20859a;
        sdo.m34959a(iie);
        this.f20894b = iie;
        this.f20893a = authzenPublicKey;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f20894b.mo13040a(new iij(status, null).mo13041b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12978b(Context context) {
        Account[] a = adyd.m51363a(context).mo33916a("com.google");
        if (a.length > 0) {
            try {
                this.f20894b.mo13040a(new iij(Status.f30107a, new EncryptionKey(1, ((ExportedSymmetricKey) ifj.m15368a(inl.m15759a(context).mo13181a("PublicKey", a[0], new ClientPublicKey(this.f20893a.f10375b)))).f10531b)).mo13041b());
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                throw new aaaj(8, e.getMessage());
            }
        } else {
            throw new aaaj(8, "No account found");
        }
    }
}
