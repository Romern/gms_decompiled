package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: aoxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoxs {
    /* renamed from: a */
    public static Account[] m69789a(Context context) {
        if (soz.m35807f(context)) {
            return new Account[0];
        }
        Account[] a = adyd.m51363a(context).mo33916a("com.google");
        int length = a.length;
        ArrayList arrayList = new ArrayList(length);
        for (Account account : a) {
            if (!"".equals(account.name)) {
                arrayList.add(account);
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    /* renamed from: b */
    public static Set m69790b(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Account account : m69789a(context)) {
            linkedHashSet.add(account.name);
        }
        return linkedHashSet;
    }
}
