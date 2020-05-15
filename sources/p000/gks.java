package p000;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: gks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gks {

    /* renamed from: a */
    public final Account f18430a;

    /* renamed from: b */
    public final String f18431b;

    /* renamed from: c */
    public final String f18432c;

    public gks(Account account, String str, String str2) {
        this.f18430a = account;
        this.f18431b = str;
        this.f18432c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gks) {
            gks gks = (gks) obj;
            if (!sdg.m34949a(this.f18430a, gks.f18430a) || !sdg.m34949a(this.f18431b, gks.f18431b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18430a, this.f18431b});
    }
}
