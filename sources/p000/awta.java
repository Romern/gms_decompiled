package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: awta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awta implements awpi {

    /* renamed from: a */
    public final SharedPreferences f95078a;

    public awta(Context context) {
        this.f95078a = context.getSharedPreferences("com.google.android.gms.wallet.service.ib.UserMerchantDataStorage", 0);
    }

    /* renamed from: b */
    protected static String m80992b(int i, Account account, String str) {
        awgg awgg = new awgg();
        awgg.mo52122a(i);
        awgg.mo52123a(account.name);
        awgg.mo52123a(str);
        return awgg.mo52121a();
    }

    /* renamed from: a */
    public final byal mo52547a(int i, Account account, String str) {
        String string = this.f95078a.getString(m80992b(i, account, str), null);
        if (string != null) {
            return (byal) bjvp.m104732a(string, (bxxk) byal.f165279g.mo74142c(7));
        }
        return null;
    }

    /* renamed from: a */
    public final synchronized Set mo52447a() {
        C1225nr nrVar;
        nrVar = new C1225nr();
        for (String str : this.f95078a.getAll().keySet()) {
            nrVar.add(new Account(new awfv(str).mo52111a(), "com.google"));
        }
        return nrVar;
    }

    /* renamed from: a */
    public final synchronized void mo52448a(Set set) {
        Set<String> keySet = this.f95078a.getAll().keySet();
        SharedPreferences.Editor edit = this.f95078a.edit();
        for (String str : keySet) {
            if (set.contains(new Account(new awfv(str).mo52111a(), "com.google"))) {
                edit.remove(str);
            }
        }
        edit.apply();
    }
}
