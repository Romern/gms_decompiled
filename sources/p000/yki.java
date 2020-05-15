package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: yki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yki extends bnch {

    /* renamed from: a */
    final /* synthetic */ ykj f53966a;

    /* renamed from: b */
    private final Iterator f53967b;

    /* renamed from: c */
    private final Deque f53968c = new ArrayDeque();

    /* renamed from: d */
    private final bnjq f53969d;

    public yki(ykj ykj, Iterator it, Iterator it2) {
        this.f53966a = ykj;
        this.f53967b = it;
        this.f53969d = bnjr.m109626h(it2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        if (!this.f53967b.hasNext()) {
            return (Iterator) mo67118d();
        }
        yhg yhg = (yhg) this.f53967b.next();
        Deque deque = this.f53968c;
        long a = yhg.mo30385a();
        Iterator it = deque.iterator();
        while (it.hasNext() && ((yhg) it.next()).mo30387b() <= a) {
            it.remove();
        }
        while (this.f53969d.hasNext() && ((yhg) this.f53969d.mo67862a()).mo30385a() < yhg.mo30387b()) {
            yhg yhg2 = (yhg) this.f53969d.next();
            if (yhg2.mo30385a() < yhg.mo30387b() && yhg.mo30385a() < yhg2.mo30387b()) {
                this.f53968c.add(yhg2);
            }
        }
        return this.f53966a.f53970a.mo30577a(yhg, this.f53968c).iterator();
    }
}
