package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: bgau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgau {

    /* renamed from: a */
    public final SharedPreferences f115939a;

    public bgau(Context context) {
        this.f115939a = context.getSharedPreferences("locationHistoryUpgradeNotificationPrefs", 0);
    }

    /* renamed from: a */
    public final void mo62571a(Account account) {
        C1225nr nrVar = new C1225nr(this.f115939a.getStringSet("accountsToBeChecked", bnon.f131923a));
        nrVar.remove(account.name);
        this.f115939a.edit().putStringSet("accountsToBeChecked", nrVar).apply();
    }
}
