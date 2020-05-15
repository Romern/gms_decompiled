package p000;

import android.accounts.Account;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: afmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afmp {

    /* renamed from: a */
    public final Executor f64393a;

    /* renamed from: b */
    public final Executor f64394b;

    /* renamed from: c */
    public final afno f64395c;

    /* renamed from: d */
    public final afnr f64396d;

    /* renamed from: e */
    public final Account f64397e;

    /* renamed from: f */
    public final int f64398f;

    /* renamed from: g */
    public final int f64399g;

    /* renamed from: h */
    public final Deque f64400h = new ArrayDeque();

    /* renamed from: i */
    public final WeakHashMap f64401i = new WeakHashMap();

    public afmp(Executor executor, Executor executor2, afno afno, afnr afnr, Account account, int i, int i2) {
        this.f64393a = executor;
        this.f64394b = executor2;
        this.f64395c = afno;
        this.f64396d = afnr;
        this.f64397e = account;
        this.f64398f = i;
        this.f64399g = i2;
    }

    /* renamed from: a */
    public static void m53240a(aucf aucf, aucb aucb) {
        if (aucb.mo50384b()) {
            aucf.mo50393b(aucb.mo50386d());
        } else {
            aucf.mo50392b(aucb.mo50387e());
        }
    }

    /* renamed from: a */
    public final void mo34966a(afmk afmk) {
        synchronized (this.f64400h) {
            if (!this.f64400h.isEmpty()) {
                afmm afmm = (afmm) this.f64400h.getLast();
                afmm.f64384a.add(afmk);
                if (!afmm.f64385b && afmm == afmm.f64387d.f64400h.getFirst()) {
                    afmm.mo34965a();
                }
            } else {
                afmk.mo34964a();
            }
        }
    }
}
