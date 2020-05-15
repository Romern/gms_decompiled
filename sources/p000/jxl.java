package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

/* renamed from: jxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jxl extends jxi {

    /* renamed from: a */
    private static final Logger f23452a = ght.m13171a("WebLoginCookieLoader");

    /* renamed from: b */
    private final Account f23453b;

    /* renamed from: c */
    private final String[] f23454c;

    /* renamed from: d */
    private final giu f23455d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jxl(Context context, Account account, String[] strArr) {
        super(context);
        giu a = giu.m13225a(context);
        sdo.m34959a(account);
        this.f23453b = account;
        this.f23454c = (String[]) sdo.m34959a(strArr);
        sdo.m34959a(a);
        this.f23455d = a;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        try {
            this.f23455d.mo11918a(this.f23453b, this.f23454c);
            return true;
        } catch (git e) {
            Logger Logger = f23452a;
            String valueOf = String.valueOf(e.f18313a);
            Logger.mo25414c(valueOf.length() == 0 ? new String("Found recovery URL: ") : "Found recovery URL: ".concat(valueOf), new Object[0]);
            return false;
        } catch (gid | IOException e2) {
            f23452a.mo25410a(e2);
            return false;
        }
    }
}
