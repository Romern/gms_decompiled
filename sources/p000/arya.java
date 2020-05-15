package p000;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import com.google.android.gms.smartdevice.setup.p066ui.D2DSetupChimeraActivity;

/* renamed from: arya */
public final /* synthetic */ class arya implements AccountManagerCallback {

    /* renamed from: a */
    private final D2DSetupChimeraActivity f88442a;

    public arya(D2DSetupChimeraActivity d2DSetupChimeraActivity) {
        this.f88442a = d2DSetupChimeraActivity;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.f88442a.mo59170a(accountManagerFuture);
    }
}
