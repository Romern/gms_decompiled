package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: awxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxw {

    /* renamed from: a */
    public final SharedPreferences f95266a;

    public awxw(Context context) {
        this.f95266a = context.getApplicationContext().getSharedPreferences("payments.setupWizardPrefs", 4);
    }

    /* renamed from: b */
    public static String m81465b(Account account) {
        bjwa a = bjwb.m104764a();
        a.mo65582a("initResponse");
        a.mo65582a(account.type);
        a.mo65582a(account.name);
        return a.toString();
    }

    /* renamed from: a */
    public final void mo52732a(Account account) {
        this.f95266a.edit().remove(m81465b(account)).apply();
    }
}
