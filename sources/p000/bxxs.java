package p000;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bxxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxxs implements Iterator {

    /* renamed from: a */
    private final ArrayDeque f165051a;

    /* renamed from: b */
    private bxtt f165052b;

    public bxxs(bxtx bxtx) {
        if (bxtx instanceof bxxu) {
            bxxu bxxu = (bxxu) bxtx;
            ArrayDeque arrayDeque = new ArrayDeque(bxxu.f165065g);
            this.f165051a = arrayDeque;
            arrayDeque.push(bxxu);
            int i = bxxu.f165061h;
            this.f165052b = m124307a(bxxu.f165063e);
            return;
        }
        this.f165051a = null;
        this.f165052b = (bxtt) bxtx;
    }

    /* renamed from: a */
    private final bxtt m124307a(bxtx bxtx) {
        while (bxtx instanceof bxxu) {
            bxxu bxxu = (bxxu) bxtx;
            this.f165051a.push(bxxu);
            int i = bxxu.f165061h;
            bxtx = bxxu.f165063e;
        }
        return (bxtt) bxtx;
    }

    public final boolean hasNext() {
        return this.f165052b != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final bxtt next() {
        bxtt bxtt;
        bxtt bxtt2 = this.f165052b;
        if (bxtt2 != null) {
            do {
                ArrayDeque arrayDeque = this.f165051a;
                bxtt = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.f165052b = bxtt;
                } else {
                    int i = bxxu.f165061h;
                    bxtt = m124307a(((bxxu) this.f165051a.pop()).f165064f);
                }
            } while (bxtt.mo73779j());
            this.f165052b = bxtt;
            return bxtt2;
        }
        throw new NoSuchElementException();
    }
}
