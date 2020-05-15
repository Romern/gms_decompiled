package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.HashSet;

/* renamed from: awec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awec {

    /* renamed from: a */
    static awec f94195a;

    /* renamed from: b */
    public final HashSet f94196b = new HashSet();

    /* renamed from: a */
    public static awec m79679a() {
        if (f94195a == null) {
            f94195a = new awec();
        }
        return f94195a;
    }

    /* renamed from: a */
    public static String m79680a(Account account, String str) {
        String str2 = account.type;
        String str3 = account.name;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str3).length() + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static final Account[] m79681a(Context context) {
        return adyd.m51363a(context).mo33916a("com.google");
    }
}
