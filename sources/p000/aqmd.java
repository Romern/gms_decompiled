package p000;

import android.accounts.Account;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqmd */
public final /* synthetic */ class aqmd implements bmzi {

    /* renamed from: a */
    private final SignInChimeraActivity f86356a;

    public aqmd(SignInChimeraActivity signInChimeraActivity) {
        this.f86356a = signInChimeraActivity;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        SignInChimeraActivity signInChimeraActivity = this.f86356a;
        rkb rkb = signInChimeraActivity.f107688l;
        Account account = signInChimeraActivity.f107683g;
        bmxy.m108581a(account);
        return adbb.m50102a(rkb.mo24787a((rle) new aqnk(rkb, new AuthAccountRequest(account, signInChimeraActivity.f107684h))));
    }
}
