package p000;

import android.accounts.Account;

/* renamed from: bawv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bawv {
    /* renamed from: a */
    public static String m87644a(Account account) {
        String str = account.type;
        String str2 = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m87645a(String str) {
        return str != null && !str.isEmpty() && !str.contains(":") && !str.contains("|");
    }
}
