package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbk {

    /* renamed from: c */
    private static final sek f51875c = new sek(new String[]{"AccountEnrollStatusChecker"}, (short[]) null);

    /* renamed from: a */
    public final xbo f51876a = ((xbo) xbo.f51879a.mo33309a());

    /* renamed from: b */
    private final Context f51877b;

    public xbk(Context context) {
        this.f51877b = context;
    }

    /* renamed from: a */
    public final Set mo29609a() {
        HashSet a = bnpf.m110047a();
        try {
            Account[] d = gie.m13199d(this.f51877b, "com.google");
            if (d != null) {
                int length = d.length;
                if (length != 0) {
                    for (Account account : d) {
                        a.add(account.name);
                    }
                    return a;
                }
            }
            f51875c.mo25412b("No account is signed in", new Object[0]);
            return bnpf.m110047a();
        } catch (RemoteException | rfv | rfw e) {
            f51875c.mo25417e("Error while fetching Google accounts", e, new Object[0]);
            return bnpf.m110047a();
        }
    }

    /* renamed from: a */
    public final Set mo29610a(xka xka) {
        return bnpf.m110057c(mo29609a(), new HashSet(this.f51876a.mo29614a(xka)));
    }
}
