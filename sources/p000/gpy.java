package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: gpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gpy {

    /* renamed from: a */
    public static final imn f18805a = new gpx();

    /* renamed from: b */
    public final SharedPreferences f18806b;

    public gpy(Context context) {
        this.f18806b = context.getSharedPreferences("work_account_owner_uid_prefs", 0);
    }

    /* renamed from: a */
    public final int mo12126a(Account account) {
        if ("com.google.work".equals(account.type)) {
            return this.f18806b.getInt(account.name, -1);
        }
        throw new IllegalArgumentException("not a work account");
    }
}
