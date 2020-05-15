package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.List;

/* renamed from: hea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hea {

    /* renamed from: a */
    private static final sek f19575a = ght.m13172b("GoogleSignInAccountCreator");

    /* renamed from: a */
    public static GoogleSignInAccount m14254a(Context context, String str, Account account, List list, String str2, String str3) {
        String str4;
        GoogleSignInAccount googleSignInAccount;
        Account account2 = account;
        List list2 = list;
        String str5 = str3;
        if (str2 == null) {
            try {
                String c = gie.m13198c(context, account2.name);
                MessageDigest a = spo.m35903a("MD5");
                if (a != null) {
                    a.update(String.format("%s:%s", c, str).getBytes(Charset.forName("UTF-8")));
                    str4 = srv.m36164d(a.digest());
                } else {
                    f19575a.mo25416d("No MD5 digest instance was found", new Object[0]);
                    str4 = null;
                }
            } catch (gid | IOException | IllegalStateException e) {
                f19575a.mo25415d("Failed to get the account id", e, new Object[0]);
                str4 = null;
            }
            if (str4 == null) {
                return null;
            }
            GoogleSignInAccount a2 = GoogleSignInAccount.m6413a(null, null, null, null, null, null, null, null, str4, new HashSet(list2));
            if (str5 != null) {
                a2.f10320g = str5;
            }
            return a2;
        } else if (!adad.m50067a(str2).mo66813a()) {
            return null;
        } else {
            if (list.size() == 1) {
                googleSignInAccount = GoogleSignInAccount.m6412a(account2, (Scope) list2.get(0), new Scope[0]);
            } else {
                googleSignInAccount = GoogleSignInAccount.m6412a(account2, (Scope) list2.get(0), (Scope[]) list2.subList(1, list.size()).toArray(new Scope[0]));
            }
            if (str5 != null) {
                googleSignInAccount.f10320g = str5;
            }
            return googleSignInAccount;
        }
    }
}
