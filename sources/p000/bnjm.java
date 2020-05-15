package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bnjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjm implements Iterator {

    /* renamed from: a */
    private Iterator f131709a;

    /* renamed from: b */
    private Iterator f131710b = bnjl.f131707a;

    /* renamed from: c */
    private Iterator f131711c;

    /* renamed from: d */
    private Deque f131712d;

    public bnjm(Iterator it) {
        bmxy.m108581a(it);
        this.f131711c = it;
    }

    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.f131710b;
            bmxy.m108581a(it2);
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.f131711c;
                it = null;
                if (it3 == null || !it3.hasNext()) {
                    Deque deque = this.f131712d;
                    if (deque == null || deque.isEmpty()) {
                        break;
                    }
                    this.f131711c = (Iterator) this.f131712d.removeFirst();
                } else {
                    it = this.f131711c;
                    break;
                }
            }
            this.f131711c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.f131710b = it4;
            if (it4 instanceof bnjm) {
                bnjm bnjm = (bnjm) it4;
                this.f131710b = bnjm.f131710b;
                if (this.f131712d == null) {
                    this.f131712d = new ArrayDeque();
                }
                this.f131712d.addFirst(this.f131711c);
                if (bnjm.f131712d != null) {
                    while (!bnjm.f131712d.isEmpty()) {
                        this.f131712d.addFirst((Iterator) bnjm.f131712d.removeLast());
                    }
                }
                this.f131711c = bnjm.f131711c;
            }
        }
    }

    public final Object next() {
        if (hasNext()) {
            Iterator it = this.f131710b;
            this.f131709a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        bndz.m109115a(this.f131709a != null);
        this.f131709a.remove();
        this.f131709a = null;
    }
}
