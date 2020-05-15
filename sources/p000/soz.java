package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: soz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class soz {
    static {
        new sbw("AccountUtils");
    }

    /* renamed from: a */
    public static Account m35782a(Context context, Account account, String str) {
        if (account == null) {
            return null;
        }
        if ("<<default account>>".equals(account.name)) {
            return m35793b(context, str);
        }
        if (!m35796b(context, account, str)) {
            return null;
        }
        return account;
    }

    /* renamed from: b */
    public static Account m35793b(Context context, String str) {
        rtj a = m35786a(context);
        String string = a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            String valueOf = String.valueOf(str);
            Account account = new Account(string, a.getString(valueOf.length() == 0 ? new String("selected_account_type:") : "selected_account_type:".concat(valueOf), "com.google"));
            if (m35796b(context, account, str)) {
                return account;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static List m35798c(Context context, String str, String str2) {
        adyd a = adyd.m51363a(context);
        int i = Build.VERSION.SDK_INT;
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = context.getPackageName();
        clientContext.f30212b = Process.myUid();
        Account[] a2 = sfr.m35174a(context, clientContext).mo25481a("android.permission.INTERACT_ACROSS_USERS") == 0 ? a.mo33917a(str2, str) : a.mo33916a(str2);
        ArrayList arrayList = new ArrayList();
        for (Account account : a2) {
            if (!(account.name == null || account.type == null)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List m35801d(Context context, String str) {
        return m35798c(context, str, "com.google");
    }

    /* renamed from: e */
    public static Account m35804e(Context context) {
        if (context != null) {
            for (Account account : m35801d(context, context.getPackageName())) {
                if (account.name.endsWith("@google.com")) {
                    return account;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m35807f(Context context) {
        return rfx.m33541e(context);
    }

    /* renamed from: g */
    public static List m35809g(Context context, String str) {
        Account[] accountArr;
        Throwable e;
        adyd a = adyd.m51363a(context);
        String a2 = aymh.m84252a(str);
        Account[] accountArr2 = new Account[0];
        try {
            accountArr = (Account[]) a.mo33907a("com.google", new String[]{a2}).getResult();
            try {
                Object[] objArr = {Integer.valueOf(accountArr.length), str, a2};
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                e = e2;
                accountArr2 = accountArr;
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e3) {
            e = e3;
            Log.w("AccountUtils", "Unable to get accounts by type and service flag/feature", e);
            accountArr = accountArr2;
            return Arrays.asList(accountArr);
        }
        return Arrays.asList(accountArr);
    }

    /* renamed from: h */
    public static boolean m35811h(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle()) == 0;
    }

    @Deprecated
    /* renamed from: b */
    public static String m35794b(Context context, String str, String str2) {
        Account a = m35782a(context, str != null ? new Account(str, "com.google") : null, str2);
        if (a != null) {
            return a.name;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m35802d(Context context) {
        if (context == null || m35801d(context, context.getPackageName()).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static List m35805e(Context context, String str) {
        return m35798c(context, str, "cn.google");
    }

    /* renamed from: f */
    public static boolean m35808f(Context context, String str) {
        return m35803d(context, str, "usm");
    }

    /* renamed from: i */
    public static boolean m35813i(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (((UserManager) context.getSystemService("user")).getUserRestrictions().getBoolean("no_modify_accounts")) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        String[] accountTypesWithManagementDisabled = ((DevicePolicyManager) context.getSystemService("device_policy")).getAccountTypesWithManagementDisabled();
        if (accountTypesWithManagementDisabled == null) {
            return true;
        }
        for (String str : accountTypesWithManagementDisabled) {
            if (sqc.m35963b(gik.f18295c, str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static List m35795b(Context context) {
        return m35809g(context, "usm");
    }

    @Deprecated
    /* renamed from: e */
    public static boolean m35806e(Context context, String str, String str2) {
        for (Account account : m35801d(context, str2)) {
            if (account.name.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m35812h(Context context, String str) {
        return m35806e(context, str, context.getPackageName());
    }

    /* renamed from: a */
    public static Intent m35783a() {
        return spn.m35889g("com.google.android.gms.common.service.START_ACCOUNT_SERVICE");
    }

    /* renamed from: b */
    public static boolean m35796b(Context context, Account account, String str) {
        List c = m35798c(context, str, account.type);
        int size = c.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((Account) c.get(i)).name.equals(account.name)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m35803d(Context context, String str, String str2) {
        for (Account account : m35809g(context, str2)) {
            if (str.equals(account.name)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: a */
    public static String m35784a(Context context, String str) {
        Account b = m35793b(context, str);
        if (b != null) {
            return b.name;
        }
        return null;
    }

    /* renamed from: b */
    public static String[] m35797b(List list) {
        String[] a = m35792a(list);
        Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);
        return a;
    }

    /* renamed from: a */
    public static ArrayList m35785a(List list, String str) {
        if (list == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList(list);
        }
        String valueOf = String.valueOf(str.toLowerCase(Locale.US));
        String str2 = valueOf.length() == 0 ? new String("@") : "@".concat(valueOf);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            if (account.name.toLowerCase(Locale.US).endsWith(str2)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static boolean m35810g(Context context) {
        int i = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager != null && userManager.isManagedProfile();
    }

    /* renamed from: c */
    public static void m35799c(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Clearing selected account for ");
        } else {
            "Clearing selected account for ".concat(valueOf);
        }
        SharedPreferences.Editor edit = m35786a(context).edit();
        edit.remove(str);
        String valueOf2 = String.valueOf(str);
        edit.remove(valueOf2.length() == 0 ? new String("selected_account_type:") : "selected_account_type:".concat(valueOf2));
        edit.apply();
    }

    /* renamed from: a */
    public static rtj m35786a(Context context) {
        int i = spn.f44932a;
        return new rtj(context, "common.selected_account_prefs", false);
    }

    /* renamed from: c */
    public static boolean m35800c(Context context) {
        return m35804e(context) != null;
    }

    /* renamed from: a */
    public static void m35787a(Context context, ClientContext clientContext) {
        if (clientContext.mo17805c()) {
            m35788a(context, clientContext.f30215e, clientContext.f30213c);
        }
    }

    /* renamed from: a */
    public static void m35788a(Context context, String str, Account account) {
        if (account != null) {
            SharedPreferences.Editor edit = m35786a(context).edit();
            edit.putString(str, account.name);
            String valueOf = String.valueOf(str);
            edit.putString(valueOf.length() == 0 ? new String("selected_account_type:") : "selected_account_type:".concat(valueOf), account.type);
            edit.apply();
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m35789a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            m35788a(context, str, new Account(str2, "com.google"));
        }
    }

    /* renamed from: a */
    public static boolean m35790a(Account account, String str) {
        return account != null && account.name.equals("<<default account>>") && account.type.equals(str);
    }

    /* renamed from: a */
    public static boolean m35791a(Context context, Account account) {
        return m35796b(context, account, context.getPackageName());
    }

    /* renamed from: a */
    public static String[] m35792a(List list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((Account) list.get(i)).name;
        }
        return strArr;
    }
}
