package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

/* renamed from: aftt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aftt {

    /* renamed from: a */
    public final Context f64731a;

    /* renamed from: b */
    public final bats f64732b;

    public aftt(Context context, bats bats) {
        this.f64731a = context;
        this.f64732b = bats;
    }

    /* renamed from: a */
    public final String mo35024a(Account account) {
        try {
            return gik.m13218f(this.f64731a, account.name);
        } catch (gid | IOException e) {
            bnsi b = this.f64732b.mo55956b();
            b.mo68437a(e);
            bnsl bnsl = (bnsl) b;
            bnsl.mo68432a("aftt", "a", 43, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to convert account to obfuscated Gaia id!");
            return null;
        } catch (RuntimeException e2) {
            bnsi c = this.f64732b.mo55957c();
            c.mo68437a(e2);
            bnsl bnsl2 = (bnsl) c;
            bnsl2.mo68432a("aftt", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to convert account to obfuscated Gaia id!");
            return null;
        }
    }
}
