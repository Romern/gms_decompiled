package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: arpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arpt {
    /* renamed from: a */
    public static HashSet m73276a(Context context, String str) {
        sdo.m34959a(context);
        sdo.m34977c(str);
        Account[] a = asbs.m73758a(context).mo33916a(str);
        int length = a.length;
        HashSet hashSet = new HashSet(length);
        for (Account account : a) {
            hashSet.add(account.name);
        }
        return hashSet;
    }

    /* renamed from: a */
    public static void m73277a(Context context, ArrayList arrayList) {
        sdo.m34959a(context);
        sdo.m34959a(arrayList);
        m73278a(context, (UserCredential[]) arrayList.toArray(new UserCredential[arrayList.size()]));
    }

    /* renamed from: a */
    public static void m73278a(Context context, UserCredential[] userCredentialArr) {
        sdo.m34959a(context);
        sdo.m34959a(userCredentialArr);
        HashSet a = m73276a(context, "com.google");
        for (UserCredential userCredential : userCredentialArr) {
            m73279a(context, userCredential.f108179b, userCredential.f108183f, userCredential.f108184g, userCredential.f108185h, a);
        }
    }

    /* renamed from: a */
    public static boolean m73279a(Context context, String str, String str2, String str3, String str4, HashSet hashSet) {
        sdo.m34959a(context);
        sdo.m34959a((Object) str);
        sdo.m34977c(str2);
        if (hashSet.contains(str)) {
            Account account = new Account(str, "com.google");
            sdo.m34959a(context);
            sdo.m34959a(account);
            sdo.m34977c(str2);
            asbs.m73758a(context).mo33910a(account, str2);
            return true;
        }
        sdo.m34959a(context);
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str2);
        adyd a = asbs.m73758a(context);
        Account account2 = new Account(str, "com.google");
        Bundle bundle = new Bundle();
        bundle.putString("firstName", str3);
        bundle.putString("lastName", str4);
        return a.mo33915a(account2, str2, bundle);
    }
}
