package p000;

import android.accounts.Account;
import com.google.android.gms.auth.TokenData;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: brvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brvh implements brux {

    /* renamed from: c */
    private static final bmxr f143445c = bmxr.m108544a(" ");

    /* renamed from: a */
    public final Map f143446a = new HashMap();

    /* renamed from: b */
    public final Map f143447b = new HashMap();

    /* renamed from: d */
    private final bqgj f143448d = bqgs.m112810a();

    /* renamed from: e */
    private final brvj f143449e;

    public brvh(brvj brvj) {
        this.f143449e = brvj;
    }

    /* renamed from: a */
    private static final String m114745a(Set set) {
        String valueOf = String.valueOf(f143445c.mo66874a((Iterable) set));
        return valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqgh.a(java.lang.Runnable, java.util.concurrent.Executor):void
     arg types: [brvf, bqgj]
     candidates:
      bqgh.a(java.lang.Runnable, java.lang.Object):bqgh
      bqgh.a(java.lang.Runnable, java.util.concurrent.Executor):void */
    /* renamed from: b */
    public final bruz mo69995b(bruw bruw, Set set) {
        bqgh bqgh;
        bqgh bqgh2;
        brvg a = brvg.m114742a(new Account(bruw.mo69993a(), "com.google"), m114745a(set));
        synchronized (this.f143447b) {
            bqgg bqgg = (bqgg) this.f143447b.get(a);
            if (bqgg == null) {
                bqgh2 = bqgh.m112796a(new brve(this, a));
                bqgh2.mo741a((Runnable) new brvf(this, a), (Executor) this.f143448d);
                this.f143447b.put(a, bqgh2);
                bqgh = bqgh2;
            } else {
                bqgh2 = null;
                bqgh = bqgg;
            }
        }
        if (bqgh2 != null) {
            bqgh2.run();
        }
        try {
            return (bruz) bqgh.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof bruy) {
                throw ((bruy) cause);
            }
            throw new bruy("Failed to refresh token", cause);
        }
    }

    /* renamed from: a */
    public final bruz mo69994a(bruw bruw, Set set) {
        bruz a;
        try {
            brvg a2 = brvg.m114742a(new Account(bruw.mo69993a(), "com.google"), m114745a(set));
            synchronized (this.f143446a) {
                a = mo70003a(a2);
            }
            return a;
        } catch (bruy e) {
            throw e;
        } catch (Throwable th) {
            throw new bruy("Failed to get auth token", th);
        }
    }

    /* renamed from: a */
    public final bruz mo70003a(brvg brvg) {
        bruz bruz = (bruz) this.f143446a.get(brvg);
        if (bruz != null) {
            Long l = bruz.f143436c;
            if (l == null || System.currentTimeMillis() < TimeUnit.SECONDS.toMillis(l.longValue())) {
                return bruz;
            }
            mo70004a(bruz);
        }
        return mo70005b(brvg);
    }

    /* renamed from: b */
    public final bruz mo70005b(brvg brvg) {
        brvj brvj = this.f143449e;
        brvi brvi = (brvi) brvg;
        try {
            TokenData c = gie.m13197c(brvj.f143452a, brvi.f143450a, brvi.f143451b);
            bruz bruz = new bruz(c.f9944b, System.currentTimeMillis(), c.f9945c);
            this.f143446a.put(brvg, bruz);
            return bruz;
        } catch (gid e) {
            throw new bruy(e);
        }
    }

    /* renamed from: a */
    public final void mo70004a(bruz bruz) {
        brvj brvj = this.f143449e;
        try {
            gie.m13196b(brvj.f143452a, bruz.f143434a);
        } catch (gid e) {
            throw new bruy(e);
        }
    }
}
