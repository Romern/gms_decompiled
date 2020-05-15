package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aoyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoyf extends aoye {

    /* renamed from: a */
    private static final aoyh f83838a = aoyh.m69805a("DasherAccountLookupImpl");

    /* renamed from: b */
    private Set f83839b = null;

    /* renamed from: c */
    private final adyd f83840c;

    public aoyf(adyd adyd) {
        this.f83840c = adyd;
        try {
            Account[] accountArr = (Account[]) adyd.mo33907a("com.google", new String[]{"service_HOSTED"}).getResult();
            HashSet hashSet = new HashSet();
            for (Account account : accountArr) {
                if (!account.name.endsWith("@google.com")) {
                    hashSet.add(account.name);
                }
            }
            this.f83839b = hashSet;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            f83838a.mo46985d("Cannot query dasher account from GmsAccountmanager, fall back to legacy dasher lookup.");
        }
    }

    /* renamed from: a */
    public final boolean mo46978a(String str) {
        Set set = this.f83839b;
        if (set == null) {
            return aoyi.m69817b(str);
        }
        return set.contains(str);
    }
}
