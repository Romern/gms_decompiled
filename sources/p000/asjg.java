package p000;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.Intent;
import android.util.ArrayMap;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: asjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjg {

    /* renamed from: a */
    static final Map f89065a = new ArrayMap();

    /* renamed from: b */
    private static final srn f89066b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    private asjg() {
    }

    /* renamed from: a */
    public static Boolean m74210a(String str, Context context, String str2) {
        Account account = new Account(str, "com.google");
        try {
            return (Boolean) adyd.m51363a(context).mo33906a(account, new String[]{str2}, (AccountManagerCallback) null).getResult(1, TimeUnit.SECONDS);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            bnsl bnsl = (bnsl) f89066b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asjg", "a", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Waiting for AccountManagerFuture threw an exception");
            return null;
        }
    }

    /* renamed from: b */
    public static String m74215b(Context context, String str) {
        String str2;
        Throwable e;
        sdo.m34960a();
        try {
            str2 = gie.m13198c(context, str);
            try {
                synchronized (asjg.class) {
                    f89065a.put(str2, str);
                }
            } catch (gid | IOException | IllegalStateException e2) {
                e = e2;
            }
        } catch (gid | IOException | IllegalStateException e3) {
            e = e3;
            str2 = null;
            bnsl bnsl = (bnsl) f89066b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asjg", "b", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get accountId.");
            return str2;
        }
        return str2;
    }

    /* renamed from: c */
    public static Intent m74217c(Context context) {
        sre.m36089i(context);
        return new Intent("android.settings.ADD_ACCOUNT_SETTINGS").putExtra("account_types", new String[]{"com.google"});
    }

    /* renamed from: d */
    public static synchronized void m74218d(Context context) {
        synchronized (asjg.class) {
            if (f89065a.isEmpty()) {
                sdo.m34960a();
                ArrayMap arrayMap = new ArrayMap();
                Account[] b = m74216b(context);
                for (Account account : b) {
                    try {
                        arrayMap.put(gie.m13198c(context, account.name), account.name);
                    } catch (gid | IOException | IllegalStateException e) {
                        bnsl bnsl = (bnsl) f89066b.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("asjg", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Failed to get accountId.");
                    }
                }
                synchronized (asjg.class) {
                    f89065a.putAll(arrayMap);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized String m74211a(Context context, String str) {
        synchronized (asjg.class) {
            sdo.m34959a((Object) str);
            sdo.m34960a();
            Account[] b = m74216b(context);
            int length = b.length;
            int i = 0;
            while (i < length) {
                Account account = b[i];
                try {
                    String c = gie.m13198c(context, account.name);
                    f89065a.put(c, account.name);
                    if (!str.equals(c)) {
                        i++;
                    } else {
                        String str2 = account.name;
                        return str2;
                    }
                } catch (gid | IOException | IllegalStateException e) {
                    bnsl bnsl = (bnsl) f89066b.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("asjg", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to get accountId.");
                }
            }
            f89065a.put(str, null);
            return null;
        }
    }

    /* renamed from: b */
    public static Account[] m74216b(Context context) {
        return adyd.m51363a(context).mo33916a("com.google");
    }

    /* renamed from: a */
    public static synchronized String m74212a(String str) {
        String str2;
        synchronized (asjg.class) {
            str2 = (String) f89065a.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    public static Map m74213a(Context context) {
        sdo.m34960a();
        ArrayMap arrayMap = new ArrayMap();
        Account[] b = m74216b(context);
        for (Account account : b) {
            try {
                arrayMap.put(gie.m13198c(context, account.name), account.name);
            } catch (gid | IOException | IllegalStateException e) {
                bnsl bnsl = (bnsl) f89066b.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("asjg", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to get accountId.");
            }
        }
        synchronized (asjg.class) {
            f89065a.putAll(arrayMap);
        }
        return arrayMap;
    }

    /* renamed from: a */
    public static boolean m74214a(Context context, String str, String str2) {
        sdo.m34959a((Object) str);
        sdo.m34960a();
        try {
            gie.m13194b(context, new Account(str, "com.google"), askc.m74270a(str2));
            return true;
        } catch (gid | IOException | IllegalStateException e) {
            return false;
        }
    }
}
