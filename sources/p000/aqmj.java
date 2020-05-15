package p000;

import android.accounts.Account;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqmj */
public final /* synthetic */ class aqmj implements bmzi {

    /* renamed from: a */
    private final SignInChimeraActivity f86363a;

    /* renamed from: b */
    private final int f86364b;

    public aqmj(SignInChimeraActivity signInChimeraActivity, int i) {
        this.f86363a = signInChimeraActivity;
        this.f86364b = i;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        SignInChimeraActivity signInChimeraActivity = this.f86363a;
        int i = this.f86364b;
        rkb rkb = signInChimeraActivity.f107688l;
        Account account = signInChimeraActivity.f107683g;
        bmxy.m108581a(account);
        return adbb.m50102a(rkb.mo24787a((rle) new aqng(rkb, i, account)));
    }
}
