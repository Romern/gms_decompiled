package p000;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: bnal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnal extends AbstractQueue {

    /* renamed from: a */
    final bncc f131308a = new bnaj();

    /* renamed from: a */
    public final bncc peek() {
        bncc bncc = this.f131308a;
        bncc bncc2 = ((bnaj) bncc).f131305a;
        if (bncc2 == bncc) {
            return null;
        }
        return bncc2;
    }

    public final void clear() {
        bncc bncc = ((bnaj) this.f131308a).f131305a;
        while (true) {
            bncc bncc2 = this.f131308a;
            if (bncc != bncc2) {
                bncc f = bncc.mo67000f();
                bncb.m108949a(bncc);
                bncc = f;
            } else {
                bnaj bnaj = (bnaj) bncc2;
                bnaj.f131305a = bncc2;
                bnaj.f131306b = bncc2;
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        return ((bncc) obj).mo67000f() != bnbd.f131347a;
    }

    public final boolean isEmpty() {
        bncc bncc = this.f131308a;
        return ((bnaj) bncc).f131305a == bncc;
    }

    public final Iterator iterator() {
        return new bnak(this, peek());
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        bncc bncc = (bncc) obj;
        bncb.m108950a(bncc.mo67001g(), bncc.mo67000f());
        bncb.m108950a(((bnaj) this.f131308a).f131306b, bncc);
        bncb.m108950a(bncc, this.f131308a);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        bncc bncc = this.f131308a;
        bncc bncc2 = ((bnaj) bncc).f131305a;
        if (bncc2 == bncc) {
            return null;
        }
        remove(bncc2);
        return bncc2;
    }

    public final boolean remove(Object obj) {
        bncc bncc = (bncc) obj;
        bncc g = bncc.mo67001g();
        bncc f = bncc.mo67000f();
        bncb.m108950a(g, f);
        bncb.m108949a(bncc);
        return f != bnbd.f131347a;
    }

    public final int size() {
        int i = 0;
        for (bncc bncc = ((bnaj) this.f131308a).f131305a; bncc != this.f131308a; bncc = bncc.mo67000f()) {
            i++;
        }
        return i;
    }
}
