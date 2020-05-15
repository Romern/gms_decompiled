package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: acyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyo {
    static {
        new Logger("CommonAccount", "AccountUtil");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.List, bmxz]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    public static ArrayList m50004a(adyd adyd, String[] strArr, ArrayList arrayList, String str) {
        Account[] accountArr;
        HashSet hashSet;
        ArrayList arrayList2 = new ArrayList();
        Set<String> a = m50005a(adyd, strArr);
        if (a == null) {
            a = new HashSet(Arrays.asList(rzx.f43912a));
        }
        for (String str2 : a) {
            int i = Build.VERSION.SDK_INT;
            if (bnjd.m109592c((Iterable) Arrays.asList(rzx.f43912a), bmyf.m108614a(str2))) {
                accountArr = adyd.mo33917a(str2, str);
            } else {
                accountArr = new Account[0];
            }
            ArrayList arrayList3 = new ArrayList(accountArr.length);
            if (arrayList != null) {
                hashSet = new HashSet(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    hashSet.add((Account) ((Parcelable) arrayList.get(i2)));
                }
            } else {
                hashSet = null;
            }
            for (Account account : accountArr) {
                if (hashSet == null || hashSet.contains(account)) {
                    arrayList3.add(account);
                }
            }
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static Set m50005a(adyd adyd, String[] strArr) {
        if (strArr == null) {
            return null;
        }
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        AuthenticatorDescription[] a = adyd.mo33918a();
        int length = a.length;
        HashSet hashSet2 = new HashSet(length);
        for (AuthenticatorDescription authenticatorDescription : a) {
            hashSet2.add(authenticatorDescription.type);
        }
        hashSet.retainAll(hashSet2);
        return hashSet;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.List, bmxz]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    public static boolean m50006a(Context context, adyd adyd, Account account, String str) {
        int i = Build.VERSION.SDK_INT;
        if (!bnjd.m109592c((Iterable) Arrays.asList(rzx.f43912a), bmyf.m108614a(account.type))) {
            return false;
        }
        int b = adyd.mo33919b(account, str);
        if (b == 2 || b == 1 || (b == 4 && adbx.m50146a(context, spn.m35897i(context, str)))) {
            return true;
        }
        return false;
    }
}
