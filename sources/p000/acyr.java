package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyr {

    /* renamed from: a */
    public static final acyr f61086a = new acyr("-", "-", "-");

    /* renamed from: e */
    private static final Map f61087e = new HashMap();

    /* renamed from: b */
    public final String f61088b;

    /* renamed from: c */
    public final String f61089c;

    /* renamed from: d */
    public final String f61090d;

    private acyr(String str, String str2, String str3) {
        sdo.m34977c(str);
        this.f61088b = str;
        sdo.m34977c(str2);
        this.f61089c = str2;
        sdo.m34977c(str3);
        this.f61090d = str3;
    }

    /* renamed from: a */
    public static synchronized acyr m50017a(Context context, Account account) {
        synchronized (acyr.class) {
            sdo.m34973b("Should not call create() on the main thread.");
            sdo.m34959a(context);
            sdo.m34959a(account);
            if (f61087e.containsKey(account)) {
                acyr acyr = (acyr) f61087e.get(account);
                return acyr;
            }
            try {
                String f = gik.m13218f(context, account.name);
                if (!TextUtils.isEmpty(f)) {
                    acyr acyr2 = new acyr(account.name, account.type, f);
                    f61087e.put(account, acyr2);
                    return acyr2;
                }
                throw new gid("Invalid account id.");
            } catch (IOException e) {
                throw new gid("Unable to get account id.");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acyr) {
            acyr acyr = (acyr) obj;
            return TextUtils.equals(this.f61088b, acyr.f61088b) && TextUtils.equals(this.f61089c, acyr.f61089c) && TextUtils.equals(this.f61090d, acyr.f61090d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f61088b, this.f61089c, this.f61090d});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("name", this.f61088b);
        a.mo25396a("type", this.f61089c);
        a.mo25396a("account_id", this.f61090d);
        return a.toString();
    }

    /* renamed from: a */
    public final Account mo33252a() {
        return new Account(this.f61088b, this.f61089c);
    }
}
