package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bxyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxyb implements Iterator {

    /* renamed from: a */
    final /* synthetic */ bxyd f165076a;

    /* renamed from: b */
    private int f165077b = -1;

    /* renamed from: c */
    private boolean f165078c;

    /* renamed from: d */
    private Iterator f165079d;

    public bxyb(bxyd bxyd) {
        this.f165076a = bxyd;
    }

    /* renamed from: a */
    private final Iterator m124394a() {
        if (this.f165079d == null) {
            this.f165079d = this.f165076a.f165082b.entrySet().iterator();
        }
        return this.f165079d;
    }

    public final boolean hasNext() {
        if (this.f165077b + 1 < this.f165076a.f165081a.size()) {
            return true;
        }
        if (this.f165076a.f165082b.isEmpty() || !m124394a().hasNext()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f165078c = true;
        int i = this.f165077b + 1;
        this.f165077b = i;
        if (i >= this.f165076a.f165081a.size()) {
            return (Map.Entry) m124394a().next();
        }
        return (Map.Entry) this.f165076a.f165081a.get(this.f165077b);
    }

    public final void remove() {
        if (this.f165078c) {
            this.f165078c = false;
            this.f165076a.mo74270c();
            if (this.f165077b >= this.f165076a.f165081a.size()) {
                m124394a().remove();
                return;
            }
            bxyd bxyd = this.f165076a;
            int i = this.f165077b;
            this.f165077b = i - 1;
            bxyd.mo74269c(i);
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
