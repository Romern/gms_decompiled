package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bnnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnnr implements Iterator {

    /* renamed from: a */
    private final bnnn f131871a;

    /* renamed from: b */
    private final Iterator f131872b;

    /* renamed from: c */
    private int f131873c;

    /* renamed from: d */
    private int f131874d;

    /* renamed from: e */
    private boolean f131875e;

    /* renamed from: f */
    private bnno f131876f;

    public bnnr(bnnn bnnn, Iterator it) {
        this.f131871a = bnnn;
        this.f131872b = it;
    }

    public final boolean hasNext() {
        return this.f131873c > 0 || this.f131872b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f131873c;
            if (i == 0) {
                bnno bnno = (bnno) this.f131872b.next();
                this.f131876f = bnno;
                i = bnno.mo68118a();
                this.f131874d = i;
            }
            this.f131873c = i - 1;
            this.f131875e = true;
            return this.f131876f.f131866a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        bndz.m109115a(this.f131875e);
        if (this.f131874d != 1) {
            this.f131871a.remove(this.f131876f.f131866a);
        } else {
            this.f131872b.remove();
        }
        this.f131874d--;
        this.f131875e = false;
    }
}
