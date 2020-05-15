package p000;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: aqlo */
final /* synthetic */ class aqlo implements AccountManagerCallback {

    /* renamed from: a */
    private final ConsentChimeraActivity f86340a;

    /* renamed from: b */
    private final bqgy f86341b;

    public aqlo(ConsentChimeraActivity consentChimeraActivity, bqgy bqgy) {
        this.f86340a = consentChimeraActivity;
        this.f86341b = bqgy;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.f86340a.mo58975a(this.f86341b, accountManagerFuture);
    }
}
