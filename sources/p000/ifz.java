package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.authzen.AuthzenPublicKey;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: ifz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifz extends ify {

    /* renamed from: a */
    private final iie f20896a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ifz(iie iie) {
        super("GetAsymmetricPublicKey");
        long j = ifj.f20859a;
        this.f20896a = iie;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f20896a.mo13040a(new iij(status, null).mo13041b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12979b(Context context) {
        Account[] a = adyd.m51363a(context).mo33916a("com.google");
        if (a.length > 0) {
            try {
                this.f20896a.mo13040a(new iij(Status.f30107a, new AuthzenPublicKey(1, ifj.m15366a(context, a[0]).f10517b)).mo13041b());
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                throw new aaaj(8, e.getMessage());
            }
        } else {
            throw new aaaj(8, "No account found");
        }
    }
}
