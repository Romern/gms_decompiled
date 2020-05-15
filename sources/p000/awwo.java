package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;

/* renamed from: awwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awwo implements awpi {

    /* renamed from: a */
    private final SharedPreferences f95205a;

    public awwo(Context context) {
        this.f95205a = context.getSharedPreferences("com.google.android.gms.wallet.service.ib.UserDataStorage", 0);
    }

    /* renamed from: b */
    protected static String m81318b(int i, Account account) {
        awgg awgg = new awgg();
        awgg.mo52122a(i);
        awgg.mo52123a(account.name);
        return awgg.mo52121a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        return null;
     */
    /* renamed from: a */
    public final synchronized byah mo52680a(int i, Account account) {
        if (account != null) {
            String b = m81318b(i, account);
            String string = this.f95205a.getString(b, null);
            if (string != null) {
                try {
                    return (byah) bjvp.m104732a(string, (bxxk) byah.f165256g.mo74142c(7));
                } catch (Throwable th) {
                    Log.e("UserDataStorage", "Failed to clear corrupted shared preferences key", th);
                }
            }
        }
        throw th;
    }

    /* renamed from: a */
    public final synchronized Set mo52447a() {
        C1225nr nrVar;
        nrVar = new C1225nr();
        for (String str : this.f95205a.getAll().keySet()) {
            nrVar.add(new Account(new awfv(str).mo52111a(), "com.google"));
        }
        return nrVar;
    }

    /* renamed from: a */
    public final synchronized void mo52681a(int i, Account account, byah byah) {
        if (account != null) {
            String a = bjvp.m104734a(byah);
            SharedPreferences.Editor edit = this.f95205a.edit();
            edit.putString(m81318b(i, account), a);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final synchronized void mo52448a(Set set) {
        Set<String> keySet = this.f95205a.getAll().keySet();
        SharedPreferences.Editor edit = this.f95205a.edit();
        for (String str : keySet) {
            if (set.contains(new Account(new awfv(str).mo52111a(), "com.google"))) {
                edit.remove(str);
            }
        }
        edit.apply();
    }
}
