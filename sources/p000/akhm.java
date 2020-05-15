package p000;

import android.accounts.Account;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: akhm */
final /* synthetic */ class akhm implements Callable {

    /* renamed from: a */
    private final Account f72013a;

    /* renamed from: b */
    private final rjx f72014b;

    public akhm(rjx rjx, Account account) {
        this.f72014b = rjx;
        this.f72013a = account;
    }

    public final Object call() {
        amey b;
        rjx rjx = this.f72014b;
        Account account = this.f72013a;
        alkx alkx = new alkx();
        alkx.f73613b = false;
        alky alky = (alky) rjx.mo24710a(alkx).mo9455a();
        if (alky != null) {
            try {
                b = alky.mo12459b();
                if (b != null) {
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        alzr alzr = (alzr) it.next();
                        if (TextUtils.equals(account.name, alzr.mo41063c())) {
                            akhs akhs = new akhs();
                            String d = alzr.mo41064d();
                            if (d != null) {
                                akhs.f72024a = d;
                                String g = alzr.mo41066g();
                                if (g != null) {
                                    akhs.f72025b = g;
                                    String str = "";
                                    if (akhs.f72024a == null) {
                                        str = " displayName";
                                    }
                                    if (akhs.f72025b == null) {
                                        str = str.concat(" givenName");
                                    }
                                    if (!str.isEmpty()) {
                                        String valueOf = String.valueOf(str);
                                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                                    }
                                    akhw akhw = new akhw(akhs.f72024a, akhs.f72025b);
                                    b.mo12460c();
                                    alky.mo12460c();
                                    return akhw;
                                }
                                throw new NullPointerException("Null givenName");
                            }
                            throw new NullPointerException("Null displayName");
                        }
                    }
                    b.mo12460c();
                    alky.mo12460c();
                    String str2 = account.name;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 57);
                    sb.append("Failed to find account ");
                    sb.append(str2);
                    sb.append(" in the list of on device accounts");
                    throw new Exception(sb.toString());
                }
                throw new Exception("Failed to load owners from People.Graph API");
            } catch (Throwable th) {
                alky.mo12460c();
                throw th;
            }
        } else {
            throw new Exception("Failed to load owners from People.Graph API");
        }
    }
}
