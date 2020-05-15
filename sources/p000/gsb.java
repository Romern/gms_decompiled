package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: gsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gsb extends aaab {

    /* renamed from: a */
    private static final sek f18930a = ght.m13171a("RemoveWorkAccountAsyncOp");

    /* renamed from: b */
    private final adyd f18931b;

    /* renamed from: c */
    private final Account f18932c;

    /* renamed from: d */
    private final giz f18933d;

    public gsb(adyd adyd, Account account, giz giz) {
        super(120, "RemoveWorkAccountAsyncOp");
        this.f18931b = adyd;
        this.f18932c = account;
        this.f18933d = giz;
    }

    /* renamed from: a */
    private final boolean m13801a(Account account) {
        try {
            return ((Bundle) this.f18931b.mo33923c(account).getResult(5, TimeUnit.SECONDS)).getBoolean("booleanResult");
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            f18930a.mo25415d("Failed to remove %s account", e, account);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i = Build.VERSION.SDK_INT;
        boolean a = m13801a(this.f18932c);
        giz giz = this.f18933d;
        Parcel bj = giz.mo8529bj();
        dcl.m8166a(bj, a);
        giz.mo8530c(2, bj);
    }
}
