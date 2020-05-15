package p000;

import android.accounts.Account;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: aqlg */
public final /* synthetic */ class aqlg implements Callable {

    /* renamed from: a */
    private final ConsentChimeraActivity f86329a;

    /* renamed from: b */
    private final Account f86330b;

    public aqlg(ConsentChimeraActivity consentChimeraActivity, Account account) {
        this.f86329a = consentChimeraActivity;
        this.f86330b = account;
    }

    public final Object call() {
        return Boolean.valueOf(soz.m35808f(this.f86329a, this.f86330b.name));
    }
}
