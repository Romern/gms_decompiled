package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;

/* renamed from: ashf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashf {

    /* renamed from: a */
    private String f88964a = null;

    /* renamed from: b */
    private final String f88965b;

    /* renamed from: c */
    private final Account f88966c;

    /* renamed from: d */
    private final adyd f88967d;

    public ashf(Account account, String str, adyd adyd) {
        this.f88965b = str;
        this.f88966c = account;
        this.f88967d = adyd;
    }

    /* renamed from: a */
    public final synchronized String mo49154a() {
        if (this.f88964a == null) {
            try {
                this.f88964a = this.f88967d.mo33924c(this.f88966c, this.f88965b);
            } catch (IllegalArgumentException e) {
                throw new AuthenticatorException(e);
            }
        }
        return this.f88964a;
    }

    /* renamed from: b */
    public final synchronized void mo49155b() {
        this.f88967d.mo33921b(this.f88966c.type, this.f88964a);
        this.f88964a = null;
    }
}
