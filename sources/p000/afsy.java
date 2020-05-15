package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: afsy */
final /* synthetic */ class afsy implements Callable {

    /* renamed from: a */
    private final aftc f64695a;

    /* renamed from: b */
    private final String f64696b;

    public afsy(aftc aftc, String str) {
        this.f64695a = aftc;
        this.f64696b = str;
    }

    public final Object call() {
        String str;
        Account account;
        aftc aftc = this.f64695a;
        String str2 = this.f64696b;
        afts afts = aftc.f64703d;
        Iterator it = ((List) afts.f64729a.mo6606a()).iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                return null;
            }
            account = (Account) it.next();
            aftt aftt = afts.f64730b;
            try {
                str = gik.m13218f(aftt.f64731a, account.name);
            } catch (gid | IOException e) {
                bnsi b = aftt.f64732b.mo55956b();
                b.mo68437a(e);
                bnsl bnsl = (bnsl) b;
                bnsl.mo68432a("aftt", "a", 43, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to convert account to obfuscated Gaia id!");
            } catch (RuntimeException e2) {
                bnsi c = aftt.f64732b.mo55957c();
                c.mo68437a(e2);
                bnsl bnsl2 = (bnsl) c;
                bnsl2.mo68432a("aftt", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to convert account to obfuscated Gaia id!");
            }
        } while (!str2.equals(str));
        return account;
    }
}
