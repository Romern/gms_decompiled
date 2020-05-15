package p000;

import android.accounts.Account;

/* renamed from: befd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befd {

    /* renamed from: a */
    public static final Account f111477a = new Account("shared", "mobstore");

    /* renamed from: a */
    public static Account m94935a(String str) {
        if (m94938b(str)) {
            return f111477a;
        }
        int indexOf = str.indexOf(58);
        behg.m95044a(indexOf >= 0, "Malformed account", new Object[0]);
        return new Account(str.substring(indexOf + 1), str.substring(0, indexOf));
    }

    /* renamed from: b */
    static boolean m94937b(Account account) {
        return f111477a.equals(account);
    }

    /* renamed from: b */
    static boolean m94938b(String str) {
        return "shared".equals(str);
    }

    /* renamed from: a */
    public static String m94936a(Account account) {
        boolean z;
        boolean z2;
        boolean z3;
        if (account.type.indexOf(58) == -1) {
            z = true;
        } else {
            z = false;
        }
        behg.m95044a(z, "Account type contains ':'.", new Object[0]);
        if (account.type.indexOf(47) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        behg.m95044a(z2, "Account type contains '/'.", new Object[0]);
        if (account.name.indexOf(47) == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        behg.m95044a(z3, "Account name contains '/'.", new Object[0]);
        if (m94937b(account)) {
            return "shared";
        }
        String str = account.type;
        String str2 = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
