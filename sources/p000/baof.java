package p000;

import android.accounts.Account;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: baof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baof implements Callable {

    /* renamed from: a */
    public final bygz f101404a;

    /* renamed from: b */
    private final bacu f101405b;

    /* renamed from: c */
    private final baok f101406c;

    /* renamed from: d */
    private final String f101407d;

    /* renamed from: e */
    private final Account f101408e;

    /* renamed from: f */
    private final bygx f101409f;

    public baof(bacu bacu, baok baok, String str, Account account, bygz bygz, bygx bygx) {
        this.f101405b = bacu;
        this.f101406c = baok;
        this.f101407d = str;
        this.f101408e = account;
        this.f101404a = bygz;
        this.f101409f = bygx;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        mo55833a();
        return null;
    }

    /* renamed from: a */
    public final void mo55833a() {
        try {
            this.f101406c.mo55830a(this.f101407d, this.f101408e, this.f101404a, bard.m87433a(this.f101405b), this.f101409f);
        } catch (baoh e) {
            throw new azzp(3, String.format(Locale.ENGLISH, "Failed to set/update subscription for app=%s on %s", this.f101407d, this.f101404a), e);
        }
    }
}
