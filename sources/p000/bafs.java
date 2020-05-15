package p000;

import android.accounts.Account;

/* renamed from: bafs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bafs implements babs {

    /* renamed from: a */
    private final cayo f100741a;

    /* renamed from: b */
    private final bafj f100742b;

    /* renamed from: c */
    private final bafu f100743c;

    public bafs(cayo cayo, bafj bafj, bafu bafu) {
        this.f100741a = cayo;
        this.f100742b = bafj;
        this.f100743c = bafu;
    }

    /* renamed from: a */
    public final void mo55564a() {
        this.f100742b.mo55663a();
        this.f100743c.mo55682a();
    }

    /* renamed from: a */
    public final void mo55565a(Account account, bygz bygz) {
        boolean z;
        byhn byhn;
        bany b;
        bany b2;
        if (bygy.m124802a(bygz.f166412a) == bygy.FOOTPRINTS) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (bygz.f166412a == 2) {
            byhn = (byhn) bygz.f166413b;
        } else {
            byhn = byhn.f166478e;
        }
        byhm byhm = byhm.UNKNOWN;
        byhm a = byhm.m124816a(byhn.f166483d);
        if (a == null) {
            a = byhm.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            bafv a2 = this.f100743c.mo55681a(account, byhn.f166481b, byhn.f166482c);
            try {
                b = a2.mo55696c().mo55799b();
                a2.mo55694b(b);
                b.mo55796b();
                b.close();
                if (a2 != null) {
                    a2.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                }
                throw th;
            }
        } else if (ordinal != 2) {
            ((bads) this.f100741a.mo16713a()).mo32744a(10009, baqz.m87422a(bygz));
            return;
        } else {
            bafl a3 = this.f100742b.mo55662a(account, byhn.f166481b, byhn.f166482c);
            try {
                b2 = a3.mo55677c().mo55799b();
                a3.mo55675b(b2);
                b2.mo55796b();
                b2.close();
                if (a3 != null) {
                    a3.close();
                    return;
                }
                return;
            } catch (Throwable th3) {
                if (a3 != null) {
                    try {
                        a3.close();
                    } catch (Throwable th4) {
                        bqye.m113761a(th3, th4);
                    }
                }
                throw th3;
            }
        }
        throw th;
        throw th;
    }
}
