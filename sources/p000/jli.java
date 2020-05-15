package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.List;

/* renamed from: jli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jli {

    /* renamed from: a */
    private final jtv f22753a;

    /* renamed from: b */
    private final Context f22754b;

    public jli(Context context) {
        this.f22753a = new jtv(context, ccig.f179039a.mo6606a().mo76009f());
        this.f22754b = context;
    }

    /* renamed from: a */
    public final List mo13854a(Account account) {
        return this.f22753a.mo14089a(account);
    }

    /* renamed from: a */
    public final boolean mo13855a(Account account, bsni bsni, boolean z) {
        if (!soz.m35791a(this.f22754b, account) || this.f22753a.mo14090a(account, bsni) == z) {
            return false;
        }
        if (!z) {
            this.f22753a.mo14093c(account, bsni);
            return true;
        }
        this.f22753a.mo14092b(account, bsni);
        return true;
    }
}
