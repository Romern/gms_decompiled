package p000;

import java.util.Iterator;

/* renamed from: bnwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnwl implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f132309a;

    /* renamed from: b */
    private bnwm f132310b = ((bnwm) this.f132309a.next());

    /* renamed from: c */
    private int f132311c = 0;

    public bnwl(Iterator it) {
        this.f132309a = it;
    }

    public final boolean hasNext() {
        return this.f132311c < this.f132310b.f132313b || this.f132309a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f132311c;
        if (i >= this.f132310b.f132313b) {
            this.f132311c = 1;
            this.f132310b = (bnwm) this.f132309a.next();
        } else {
            this.f132311c = i + 1;
        }
        return Integer.valueOf(this.f132310b.f132312a);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
