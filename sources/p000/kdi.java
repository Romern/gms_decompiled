package p000;

import android.accounts.Account;
import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* renamed from: kdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdi {

    /* renamed from: a */
    public static final kdi f23885a = new kdi("none", null);
    @Deprecated

    /* renamed from: b */
    public static final kdi f23886b = new kdi("local", null);

    /* renamed from: c */
    public final String f23887c;

    /* renamed from: d */
    public final Account f23888d;

    public kdi(String str, Account account) {
        this.f23887c = str;
        this.f23888d = account;
    }

    /* renamed from: a */
    public static String m17667a(String str) {
        try {
            return new String(Base64.decode(str, 3), StandardCharsets.UTF_8);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m17669b(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kdi) {
            return this.f23887c.equals(((kdi) obj).f23887c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23887c.hashCode();
    }

    public final String toString() {
        return String.format("Profile[id=%s]", this.f23887c);
    }

    /* renamed from: a */
    public static kdi m17668a(Account account) {
        return new kdi(String.format("account|%s|%s", m17669b(account.type), m17669b(account.name)), account);
    }
}
