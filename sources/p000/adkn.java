package p000;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: adkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adkn {

    /* renamed from: b */
    private static final adfs f62065b = new adfs("AccountPreferences");

    /* renamed from: a */
    public final SharedPreferences f62066a;

    /* renamed from: c */
    private final adyd f62067c;

    public adkn(adyd adyd, SharedPreferences sharedPreferences) {
        this.f62067c = adyd;
        this.f62066a = sharedPreferences;
    }

    /* renamed from: a */
    public final Account mo33600a() {
        String string = this.f62066a.getString("accountName", null);
        if (!TextUtils.isEmpty(string)) {
            Account[] d = mo33604d();
            for (Account account : d) {
                if (string.equals(account.name)) {
                    return account;
                }
            }
            mo33602b();
            f62065b.mo33423a("Opted-in account removed from device. Starting fresh", new Object[0]);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo33602b() {
        this.f62066a.edit().remove("accountName").apply();
    }

    /* renamed from: c */
    public final Account mo33603c() {
        Account a = mo33600a();
        if (a != null) {
            return a;
        }
        Account[] d = mo33604d();
        if (d == null || d.length <= 0) {
            return null;
        }
        return d[0];
    }

    /* renamed from: d */
    public final Account[] mo33604d() {
        return this.f62067c.mo33916a("com.google");
    }

    /* renamed from: a */
    public final void mo33601a(String str) {
        this.f62066a.edit().putString("accountName", str).apply();
    }
}
