package p000;

import android.accounts.Account;
import java.util.Map;

/* renamed from: baox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baox implements baqb {

    /* renamed from: a */
    private static final bann f101445a;

    /* renamed from: b */
    private final bamr f101446b;

    /* renamed from: c */
    private final Map f101447c;

    static {
        banm a = bann.m87218a();
        a.mo55807a(':');
        f101445a = a.mo55806a();
    }

    public baox(bamr bamr, Map map) {
        this.f101446b = bamr;
        this.f101447c = map;
    }

    /* renamed from: a */
    public final baqc mo55845a(Account account, bygz bygz) {
        bamr bamr = this.f101446b;
        String a = f101445a.mo55808a(account.type);
        String a2 = f101445a.mo55808a(account.name);
        String a3 = f101445a.mo55808a(((babq) this.f101447c.get(bygy.m124802a(bygz.f166412a))).mo55563a(bygz));
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(a2).length() + String.valueOf(a3).length());
        sb.append(a);
        sb.append(':');
        sb.append(a2);
        sb.append(':');
        sb.append(a3);
        return new baoy(bamr.mo55779a(sb.toString()));
    }
}
