package p000;

import android.accounts.Account;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: doh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class doh {

    /* renamed from: a */
    public static final doh f13688a = new doh("@@ContextManagerNullAccount@@");

    /* renamed from: c */
    private static dog f13689c = null;

    /* renamed from: b */
    public final String f13690b;

    public doh(String str) {
        sdo.m34977c(str);
        this.f13690b = str;
    }

    /* renamed from: a */
    static synchronized void m8933a(dog dog) {
        synchronized (doh.class) {
            f13689c = dog;
        }
    }

    /* renamed from: b */
    public final boolean mo9338b() {
        return "@@ContextManagerNullAccount@@".equals(this.f13690b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof doh) {
            return TextUtils.equals(this.f13690b, ((doh) obj).f13690b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13690b});
    }

    public final String toString() {
        return f13689c != null ? dof.m8923a(this.f13690b) : "#account#";
    }

    /* renamed from: a */
    public final Account mo9337a() {
        return new Account(this.f13690b, "com.google");
    }
}
