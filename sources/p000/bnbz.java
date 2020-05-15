package p000;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: bnbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnbz extends AbstractQueue {

    /* renamed from: a */
    final bncc f131409a = new bnbx();

    /* renamed from: a */
    public final bncc peek() {
        bncc bncc = this.f131409a;
        bncc bncc2 = ((bnbx) bncc).f131406a;
        if (bncc2 == bncc) {
            return null;
        }
        return bncc2;
    }

    public final void clear() {
        bncc bncc = ((bnbx) this.f131409a).f131406a;
        while (true) {
            bncc bncc2 = this.f131409a;
            if (bncc != bncc2) {
                bncc i = bncc.mo67003i();
                bncb.m108951b(bncc);
                bncc = i;
            } else {
                bnbx bnbx = (bnbx) bncc2;
                bnbx.f131406a = bncc2;
                bnbx.f131407b = bncc2;
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        return ((bncc) obj).mo67003i() != bnbd.INSTANCE;
    }

    public final boolean isEmpty() {
        bncc bncc = this.f131409a;
        return ((bnbx) bncc).f131406a == bncc;
    }

    public final Iterator iterator() {
        return new bnby(this, peek());
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        bncc bncc = (bncc) obj;
        bncb.m108952b(bncc.mo67004j(), bncc.mo67003i());
        bncb.m108952b(((bnbx) this.f131409a).f131407b, bncc);
        bncb.m108952b(bncc, this.f131409a);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        bncc bncc = this.f131409a;
        bncc bncc2 = ((bnbx) bncc).f131406a;
        if (bncc2 == bncc) {
            return null;
        }
        remove(bncc2);
        return bncc2;
    }

    public final boolean remove(Object obj) {
        bncc bncc = (bncc) obj;
        bncc j = bncc.mo67004j();
        bncc i = bncc.mo67003i();
        bncb.m108952b(j, i);
        bncb.m108951b(bncc);
        return i != bnbd.INSTANCE;
    }

    public final int size() {
        int i = 0;
        for (bncc bncc = ((bnbx) this.f131409a).f131406a; bncc != this.f131409a; bncc = bncc.mo67003i()) {
            i++;
        }
        return i;
    }
}
