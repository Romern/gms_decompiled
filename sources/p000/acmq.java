package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: acmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class acmq implements Iterator {

    /* renamed from: a */
    private Object f60166a;

    /* renamed from: a */
    private final void mo32887a() {
        if (this.f60166a == null) {
            this.f60166a = mo32890d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Object mo32890d();

    public final boolean hasNext() {
        mo32887a();
        return this.f60166a != null;
    }

    public final Object next() {
        mo32887a();
        Object obj = this.f60166a;
        if (obj != null) {
            this.f60166a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
