package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tdk {

    /* renamed from: a */
    private static final sek f45698a = tea.m36798a("gaia_util");

    /* renamed from: b */
    private static WeakReference f45699b = new WeakReference(null);

    /* renamed from: a */
    public static final Map m36756a(tdx tdx, String str, Context context, Bundle bundle) {
        try {
            Account[] d = gie.m13199d(context, "com.google");
            HashMap hashMap = new HashMap();
            for (Account account : d) {
                try {
                    hashMap.put(gie.m13198c(context, account.name), gie.m13188a(context, account, str, bundle));
                } catch (gid | IOException e) {
                    tds.m36774a(context).mo26410a(tdx, 17, e);
                    sek sek = f45698a;
                    String valueOf = String.valueOf(account.name);
                    sek.mo25416d(valueOf.length() == 0 ? new String("Account id cannot be obtained for account ") : "Account id cannot be obtained for account ".concat(valueOf), new Object[0]);
                }
            }
            return hashMap;
        } catch (RemoteException | rfv | rfw e2) {
            tds.m36774a(context).mo26410a(tdx, 17, e2);
            f45698a.mo25417e("getAccounts fails.", e2, new Object[0]);
            return new HashMap();
        }
    }

    /* renamed from: a */
    public static synchronized void m36757a() {
        synchronized (tdk.class) {
            if (((tdk) f45699b.get()) == null) {
                f45699b = new WeakReference(new tdk());
            }
        }
    }
}
