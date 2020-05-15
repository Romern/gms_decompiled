package p000;

import android.accounts.Account;
import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import java.security.UnrecoverableKeyException;

/* renamed from: nce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nce {

    /* renamed from: a */
    public static final lvn f35237a = new lvn("ClearCryptoStateTask");

    /* renamed from: b */
    public final Context f35238b;

    /* renamed from: c */
    public final lwc f35239c;

    /* renamed from: d */
    public final Account f35240d;

    /* renamed from: e */
    private lwr f35241e = null;

    /* renamed from: b */
    private final synchronized lwr m25913b() {
        if (this.f35241e == null) {
            this.f35241e = lwr.m24571a(this.f35238b);
        }
        return this.f35241e;
    }

    /* renamed from: a */
    public final boolean mo20450a() {
        if (cclp.f179364a.mo6606a().mo76303f() && this.f35239c.mo19694a(this.f35240d)) {
            bmxv a = this.f35239c.mo19691a();
            if (a.mo66813a()) {
                try {
                    bmxv b = m25913b().mo19713b((String) a.mo66814b());
                    if (!b.mo66813a() || ((lwp) b.mo66814b()).mo19710a(this.f35238b) != 2) {
                        return true;
                    }
                    return false;
                } catch (InternalRecoveryServiceException | UnrecoverableKeyException e) {
                    f35237a.mo25415d("Problem with current key", e, new Object[0]);
                    return true;
                }
            }
        }
        return true;
    }

    public nce(Context context, lwc lwc, Account account) {
        this.f35238b = context;
        this.f35239c = lwc;
        this.f35240d = account;
    }
}
