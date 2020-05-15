package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: amvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvi {

    /* renamed from: a */
    private final adyd f76012a;

    public amvi(adyd adyd) {
        this.f76012a = adyd;
    }

    /* renamed from: a */
    private final Account[] m63362a() {
        Account[] accountArr = (Account[]) this.f76012a.mo33907a("com.google", new String[]{"service_HOSTED"}).getResult();
        if (cfxe.m143377p()) {
            return accountArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Account account : accountArr) {
            if (!m63364c(account.name)) {
                arrayList.add(account);
            }
        }
        return arrayList.size() != accountArr.length ? (Account[]) arrayList.toArray(new Account[0]) : accountArr;
    }

    /* renamed from: b */
    private final Account[] m63363b() {
        return (Account[]) this.f76012a.mo33907a("com.google", new String[]{"service_uca"}).getResult();
    }

    /* renamed from: c */
    private static boolean m63364c(String str) {
        return str.endsWith("@google.com");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo41375b(String str) {
        try {
            Account[] b = m63363b();
            if (b != null) {
                for (Account account : b) {
                    if (str.equals(account.name)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("FSA2_AccountEligibilityChecker", "Exception checking account types", e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo41373a(String str) {
        if (!cfxe.m143377p() && m63364c(str)) {
            return false;
        }
        try {
            Account[] a = m63362a();
            if (a != null && (r3 = a.length) > 0) {
                for (Account account : a) {
                    if (str.equals(account.name)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("FSA2_AccountEligibilityChecker", "Exception checking account types", e);
            return true;
        }
    }

    /* renamed from: a */
    public final Account[] mo41374a(boolean z, boolean z2) {
        try {
            Account[] a = this.f76012a.mo33916a("com.google");
            HashSet hashSet = new HashSet();
            if (!z) {
                for (Account account : m63362a()) {
                    hashSet.add(account.name);
                }
            }
            if (!z2) {
                for (Account account2 : m63363b()) {
                    hashSet.add(account2.name);
                }
            }
            if (hashSet.isEmpty()) {
                return a;
            }
            ArrayList arrayList = new ArrayList();
            for (Account account3 : a) {
                if (!hashSet.contains(account3.name)) {
                    arrayList.add(account3);
                }
            }
            return (Account[]) arrayList.toArray(new Account[0]);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            return new Account[0];
        }
    }
}
