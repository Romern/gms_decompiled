package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ipx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipx {

    /* renamed from: a */
    public final Object f21534a = new Object();

    /* renamed from: b */
    public final SharedPreferences f21535b;

    /* renamed from: c */
    public final Logger f21536c = new Logger(new String[]{"ClientDirectiveStore"}, (byte[]) null);

    /* renamed from: d */
    private final int f21537d;

    public ipx(Context context, Account account) {
        this.f21535b = context.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.ClientDirective", 0);
        this.f21537d = account.name.hashCode();
    }

    /* renamed from: a */
    public final long mo13239a() {
        return this.f21535b.getLong(mo13240a("retryperiod"), ((Long) ipl.f21504n.mo58455c()).longValue());
    }

    /* renamed from: b */
    public final long mo13241b() {
        return this.f21535b.getLong(mo13240a("currentretryattempt"), 0);
    }

    /* renamed from: c */
    public final void mo13242c() {
        synchronized (this.f21534a) {
            this.f21535b.edit().putLong(mo13240a("currentretryattempt"), 0).commit();
        }
    }

    /* renamed from: a */
    public final String mo13240a(String str) {
        int i = this.f21537d;
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }
}
