package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;

/* renamed from: bgyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyc {

    /* renamed from: a */
    public final Context f117992a;

    public bgyc(Context context) {
        this.f117992a = context;
    }

    /* renamed from: a */
    public static Account m100305a(Intent intent) {
        if (intent.hasExtra("account")) {
            return (Account) intent.getParcelableExtra("account");
        }
        return null;
    }

    /* renamed from: a */
    public final void mo63352a(Account account, int i) {
        Intent intent = new Intent("com.google.android.gms.location.reporting.INITIALIZATION_CHANGED");
        intent.putExtra("initialization", i);
        intent.putExtra("account", account);
        this.f117992a.sendBroadcast(intent);
    }
}
