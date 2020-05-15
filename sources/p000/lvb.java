package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: lvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lvb implements lva {

    /* renamed from: a */
    public static final lvn f33019a = new lvn("LegacyBackupAccountManager");

    /* renamed from: b */
    private final Context f33020b;

    public lvb() {
        Context context = null;
        try {
            this.f33020b = rpr.m34216b().createPackageContext("com.google.android.backuptransport", 0);
        } catch (PackageManager.NameNotFoundException e) {
            try {
                context = rpr.m34216b().createPackageContext("com.google.android.backup", 0);
            } catch (PackageManager.NameNotFoundException e2) {
                f33019a.mo25417e("Fail to get legacy transport context.", e2, new Object[0]);
            } catch (Throwable th) {
                this.f33020b = null;
                throw th;
            }
            this.f33020b = context;
        }
    }

    /* renamed from: d */
    private static final Account m24451d() {
        Account[] a = adyd.m51363a(rpr.m34216b()).mo33916a("com.google");
        int length = a.length;
        if (length == 0) {
            f33019a.mo25416d("No google accounts found!", new Object[0]);
            return null;
        } else if (length == 1) {
            return a[0];
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final Account mo19624a() {
        SharedPreferences c = mo19626c();
        if (c == null) {
            return m24451d();
        }
        String string = c.getString("accountName", null);
        String string2 = c.getString("accountType", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return m24451d();
        }
        return new Account(string, string2);
    }

    /* renamed from: b */
    public final boolean mo19625b() {
        throw null;
    }

    /* renamed from: c */
    public final SharedPreferences mo19626c() {
        Context context = this.f33020b;
        if (context != null) {
            return context.getSharedPreferences("BackupTransport.backupAccount", 0);
        }
        return null;
    }
}
