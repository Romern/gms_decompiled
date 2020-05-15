package p000;

import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;

/* renamed from: arwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arwj {

    /* renamed from: a */
    public final adyd f88359a;

    public arwj(Context context) {
        this.f88359a = asbs.m73758a(context);
    }

    /* renamed from: a */
    static final /* synthetic */ void m73622a(aic aic, AccountManagerFuture accountManagerFuture) {
        try {
            aic.mo749a((Boolean) accountManagerFuture.getResult());
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            aic.mo750a(e);
        }
    }

    /* renamed from: a */
    public final bqgg mo48874a(Account account, String str) {
        return aih.m807a(new arwh(this, account, str));
    }
}
