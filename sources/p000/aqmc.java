package p000;

import android.accounts.Account;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqmc */
public final /* synthetic */ class aqmc implements bmzi {

    /* renamed from: a */
    private final SignInChimeraActivity f86355a;

    public aqmc(SignInChimeraActivity signInChimeraActivity) {
        this.f86355a = signInChimeraActivity;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        SignInChimeraActivity signInChimeraActivity = this.f86355a;
        aqnv aqnv = signInChimeraActivity.f107691p;
        Account account = signInChimeraActivity.f107683g;
        bmxy.m108581a(account);
        AuthAccountRequest authAccountRequest = new AuthAccountRequest(account, signInChimeraActivity.f107684h);
        roz b = rpa.m34196b();
        b.f43472a = new aqnq(authAccountRequest);
        return adbb.m50100a(aqnv.mo24701a(b.mo24977a()));
    }
}
