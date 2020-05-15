package p000;

import android.accounts.Account;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqmg */
public final /* synthetic */ class aqmg implements bmzi {

    /* renamed from: a */
    private final SignInChimeraActivity f86359a;

    /* renamed from: b */
    private final int f86360b;

    public aqmg(SignInChimeraActivity signInChimeraActivity, int i) {
        this.f86359a = signInChimeraActivity;
        this.f86360b = i;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        SignInChimeraActivity signInChimeraActivity = this.f86359a;
        int i = this.f86360b;
        aqnv aqnv = signInChimeraActivity.f107691p;
        Account account = signInChimeraActivity.f107683g;
        bmxy.m108581a(account);
        roz b = rpa.m34196b();
        b.f43472a = new aqnn(i, account);
        return adbb.m50100a(aqnv.mo24732b(b.mo24977a()));
    }
}
