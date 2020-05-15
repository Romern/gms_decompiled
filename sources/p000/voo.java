package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: voo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class voo {
    /* renamed from: a */
    public static int m40936a(Account[] accountArr, String str) {
        for (int i = 0; i < accountArr.length; i++) {
            if (accountArr[i].name.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static Account m40937a(Context context, String str) {
        Account[] a = m40938a(context);
        int a2 = m40936a(a, str);
        if (a2 != -1) {
            return a[a2];
        }
        return null;
    }

    /* renamed from: a */
    public static Account[] m40938a(Context context) {
        adyd a = adyd.m51363a(context);
        Account[] a2 = a.mo33916a("com.google");
        if (!sre.m36080a(context)) {
            return a2;
        }
        return (Account[]) sqc.m35962a((Object[][]) new Account[][]{a2, a.mo33916a("cn.google")});
    }
}
