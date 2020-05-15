package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: mzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mzf implements lva {

    /* renamed from: a */
    public static final lvn f35034a = new lvn("GmsBackupAccountManager");

    /* renamed from: b */
    public final Context f35035b;

    /* renamed from: c */
    public final bmxv f35036c;

    /* renamed from: d */
    public final lwb f35037d;

    /* renamed from: e */
    private final mbw f35038e;

    public mzf(Context context) {
        mbw mbw = new mbw(context);
        bmvz bmvz = bmvz.f131120a;
        lwb a = lwb.m24518a(context);
        sdo.m34959a(context);
        this.f35035b = context;
        sdo.m34959a(mbw);
        this.f35038e = mbw;
        sdo.m34959a(bmvz);
        this.f35036c = bmvz;
        sdo.m34959a(a);
        this.f35037d = a;
    }

    /* renamed from: a */
    public final Account mo19624a() {
        Account account;
        SharedPreferences sharedPreferences = this.f35035b.getSharedPreferences("BackupAccount", 0);
        String string = sharedPreferences.getString("accountName", null);
        String string2 = sharedPreferences.getString("accountType", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            account = null;
        } else {
            account = new Account(string, string2);
        }
        if (account == null) {
            f35034a.mo25414c("Backup account not found in gmscore.", new Object[0]);
            Context context = this.f35035b;
            context.startService(mcc.m24852a(context));
            return null;
        } else if (mo20347a(account)) {
            return account;
        } else {
            f35034a.mo25416d("Backup account was not valid.", new Object[0]);
            if (!this.f35035b.getSharedPreferences("BackupAccount", 0).edit().remove("accountName").remove("accountType").commit()) {
                f35034a.mo25418e("Fail to write gms backup account shared preference.", new Object[0]);
            }
            Context context2 = this.f35035b;
            context2.startService(mcc.m24852a(context2));
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo19625b() {
        if (mo19624a() != null) {
            return this.f35035b.getSharedPreferences("BackupAccount", 0).getBoolean("accountInitialized", true);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo20347a(Account account) {
        Account[] accountArr;
        Pattern a;
        if (sre.m36080a(this.f35035b)) {
            accountArr = adyd.m51363a(this.f35035b).mo33916a("cn.google");
        } else {
            accountArr = adyd.m51363a(this.f35035b).mo33916a("com.google");
        }
        int length = accountArr.length;
        if (length != 0) {
            int i = 0;
            while (i < length) {
                Account account2 = accountArr[i];
                if (!account2.equals(account)) {
                    i++;
                } else {
                    mbw mbw = this.f35038e;
                    if (account2 != null && ((a = mbw.mo19819a()) == null || a.matcher(account2.name).matches())) {
                        return true;
                    }
                    lvn lvn = f35034a;
                    String valueOf = String.valueOf(account2.name);
                    lvn.mo25416d(valueOf.length() == 0 ? new String("Account is not allowed for backup due to device policy: ") : "Account is not allowed for backup due to device policy: ".concat(valueOf), new Object[0]);
                    return false;
                }
            }
            return false;
        }
        f35034a.mo25416d("No google accounts found!", new Object[0]);
        return false;
    }
}
