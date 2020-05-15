package p000;

import android.accounts.Account;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: baks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baks implements bakr, babs {

    /* renamed from: b */
    private static final bygx f101144b = bygx.f166401c;

    /* renamed from: c */
    private final Object f101145c = new Object();

    /* renamed from: d */
    private final cayo f101146d;

    /* renamed from: e */
    private final babr f101147e;

    /* renamed from: f */
    private final baqf f101148f;

    /* renamed from: g */
    private final baok f101149g;

    /* renamed from: h */
    private final byjh f101150h;

    /* renamed from: i */
    private final bqej f101151i = bqej.m112702a();

    public baks(cayo cayo, babr babr, baok baok, baqf baqf) {
        this.f101146d = cayo;
        this.f101147e = babr;
        this.f101148f = baqf;
        this.f101149g = baok;
        bacw c = bacx.m86611c();
        c.mo55602a(true);
        c.mo55601a((int) TimeUnit.DAYS.toSeconds(1));
        bacx a = c.mo55600a();
        bacw c2 = bacx.m86611c();
        c2.mo55602a(true);
        c2.mo55601a(((Integer) abzv.f59010D.mo58455c()).intValue());
        bacx a2 = c2.mo55600a();
        bact i = bacu.m86595i();
        i.mo55593a(2);
        i.mo55594a(a);
        i.mo55596b(a);
        i.mo55598c(a2);
        i.mo55599d(a2);
        i.mo55595a(false);
        i.mo55597b(false);
        this.f101150h = bard.m87433a(i.mo55592a());
    }

    /* renamed from: a */
    public final void mo55564a() {
    }

    /* renamed from: a */
    public final void mo55565a(Account account, bygz bygz) {
    }

    /* renamed from: b */
    public final void mo55730b(Account account) {
        mo55733e(account);
    }

    /* renamed from: c */
    public final long mo55731c(Account account) {
        return this.f101151i.mo69170a(account);
    }

    /* renamed from: d */
    public final boolean mo55732d(Account account) {
        return !this.f101148f.mo55878b(f101143a, account);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo55733e(Account account) {
        if (this.f101147e.mo32695q()) {
            achw achw = (achw) this.f101146d.mo16713a();
            new Object[1][0] = account;
            synchronized (this.f101145c) {
                this.f101149g.mo55830a("", account, f101143a, this.f101150h, f101144b);
                this.f101151i.mo69174c(account);
            }
            this.f101148f.mo55877b("", f101143a, account);
        }
    }

    /* renamed from: a */
    public final void mo55728a(Account account) {
        mo55733e(account);
    }

    /* renamed from: a */
    public final void mo55729a(Account account, long j) {
        byjh d;
        synchronized (this.f101145c) {
            if (this.f101151i.mo69170a(account) == j) {
                Iterator it = this.f101149g.mo55825a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        baog baog = (baog) it.next();
                        if (account.equals(baog.mo55815b()) && (d = baog.mo55817d()) != null && bard.m87434a(d)) {
                            break;
                        }
                    } else {
                        achw achw = (achw) this.f101146d.mo16713a();
                        new Object[1][0] = account;
                        this.f101149g.mo55829a("", account, f101143a, baoi.REGISTRATION_CLEANUP);
                        break;
                    }
                }
            }
        }
    }
}
