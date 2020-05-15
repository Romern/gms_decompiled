package p000;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqmr */
public final /* synthetic */ class aqmr implements bmxj {

    /* renamed from: a */
    private final SignInChimeraActivity f86372a;

    public aqmr(SignInChimeraActivity signInChimeraActivity) {
        this.f86372a = signInChimeraActivity;
    }

    public final Object apply(Object obj) {
        Intent intent;
        SignInChimeraActivity signInChimeraActivity = this.f86372a;
        adak adak = (adak) obj;
        if (!signInChimeraActivity.getIntent().getBooleanExtra("complete_sign_in_process", false) || adak.f61209a != -1 || (intent = adak.f61210b) == null) {
            signInChimeraActivity.mo58979a(adak.f61209a, signInChimeraActivity.f107682f ? adak.f61210b : null);
            return bmvz.f131120a;
        }
        String stringExtra = intent.getStringExtra("authAccount");
        bmxy.m108581a(stringExtra);
        String stringExtra2 = adak.f61210b.getStringExtra("accountType");
        bmxy.m108581a(stringExtra2);
        signInChimeraActivity.f107683g = new Account(stringExtra, stringExtra2);
        return bmxv.m108566b(3);
    }
}
