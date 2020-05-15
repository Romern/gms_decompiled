package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: aqlh */
public final /* synthetic */ class aqlh implements bmxj {

    /* renamed from: a */
    private final ConsentChimeraActivity f86331a;

    /* renamed from: b */
    private final Account f86332b;

    /* renamed from: c */
    private final String f86333c;

    public aqlh(ConsentChimeraActivity consentChimeraActivity, Account account, String str) {
        this.f86331a = consentChimeraActivity;
        this.f86332b = account;
        this.f86333c = str;
    }

    public final Object apply(Object obj) {
        return bmxv.m108567c(rrk.m34291a(this.f86331a, this.f86332b, false, false, Bundle.EMPTY, false, null, true, this.f86333c, ((Boolean) obj).booleanValue(), 1, Bundle.EMPTY));
    }
}
