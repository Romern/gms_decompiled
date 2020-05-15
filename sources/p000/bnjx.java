package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bnjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjx implements Iterator {

    /* renamed from: a */
    final Set f131726a = bnpf.m110048a(this.f131730e.mo67316o().size());

    /* renamed from: b */
    bnjz f131727b;

    /* renamed from: c */
    bnjz f131728c;

    /* renamed from: d */
    int f131729d;

    /* renamed from: e */
    final /* synthetic */ bnkc f131730e;

    public bnjx(bnkc bnkc) {
        this.f131730e = bnkc;
        bnkc bnkc2 = this.f131730e;
        this.f131727b = bnkc2.f131752a;
        this.f131729d = bnkc2.f131756e;
    }

    /* renamed from: a */
    private final void m109628a() {
        if (this.f131730e.f131756e != this.f131729d) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        m109628a();
        return this.f131727b != null;
    }

    public final Object next() {
        bnjz bnjz;
        m109628a();
        bnkc.m109633g(this.f131727b);
        bnjz bnjz2 = this.f131727b;
        this.f131728c = bnjz2;
        this.f131726a.add(bnjz2.f131734a);
        do {
            bnjz = this.f131727b.f131736c;
            this.f131727b = bnjz;
            if (bnjz == null) {
                break;
            }
        } while (!this.f131726a.add(bnjz.f131734a));
        return this.f131728c.f131734a;
    }

    public final void remove() {
        boolean z;
        m109628a();
        if (this.f131728c != null) {
            z = true;
        } else {
            z = false;
        }
        bndz.m109115a(z);
        this.f131730e.mo67903e(this.f131728c.f131734a);
        this.f131728c = null;
        this.f131729d = this.f131730e.f131756e;
    }
}
