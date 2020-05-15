package p000;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;
import java.io.IOException;

/* renamed from: ankz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankz extends anlf implements AccountManagerCallback {

    /* renamed from: a */
    final /* synthetic */ AccountSignUpChimeraActivity f77040a;

    public ankz(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        this.f77040a = accountSignUpChimeraActivity;
    }

    /* renamed from: b */
    public final boolean mo41916b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo41917c() {
        return this.f77040a.f82217d != 2;
    }

    /* renamed from: d */
    public final void mo41918d() {
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.f77040a;
        if (!soz.m35812h(accountSignUpChimeraActivity, accountSignUpChimeraActivity.f82214a)) {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity2 = this.f77040a;
            accountSignUpChimeraActivity2.mo46536a(accountSignUpChimeraActivity2.getString(C0126R.string.plus_invalid_account));
            return;
        }
        adyd.m51363a(this.f77040a).mo33906a(new Account(this.f77040a.f82214a, "com.google"), sam.f43928G, this);
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Boolean bool = (Boolean) accountManagerFuture.getResult();
            if (bool != null) {
                this.f77040a.f82217d = bool.booleanValue() ^ true ? 1 : 0;
                this.f77040a.mo46535a();
                return;
            }
            AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.f77040a;
            accountSignUpChimeraActivity.mo46536a(accountSignUpChimeraActivity.getString(C0126R.string.plus_internal_error));
        } catch (OperationCanceledException e) {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity2 = this.f77040a;
            accountSignUpChimeraActivity2.mo46536a(accountSignUpChimeraActivity2.getString(C0126R.string.plus_internal_error));
        } catch (AuthenticatorException e2) {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity3 = this.f77040a;
            accountSignUpChimeraActivity3.mo46536a(accountSignUpChimeraActivity3.getString(C0126R.string.plus_internal_error));
        } catch (IOException e3) {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity4 = this.f77040a;
            accountSignUpChimeraActivity4.mo46536a(accountSignUpChimeraActivity4.getString(C0126R.string.plus_network_unreliable));
        }
    }
}
