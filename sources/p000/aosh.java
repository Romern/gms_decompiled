package p000;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;

/* renamed from: aosh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aosh implements OnAccountsUpdateListener {

    /* renamed from: a */
    private final Context f83506a;

    public aosh(Context context) {
        this.f83506a = context;
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        new aosg(this.f83506a, accountArr).execute(new Void[0]);
    }
}
