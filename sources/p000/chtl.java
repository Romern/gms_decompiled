package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: chtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chtl implements Iterator {

    /* renamed from: a */
    final /* synthetic */ chtm f189122a;

    /* renamed from: b */
    private boolean f189123b = true;

    /* renamed from: c */
    private int f189124c = this.f189122a.f189126b;

    public chtl(chtm chtm) {
        this.f189122a = chtm;
    }

    public final boolean hasNext() {
        if (this.f189123b) {
            return true;
        }
        while (true) {
            int i = this.f189124c;
            chtm chtm = this.f189122a;
            chtr chtr = chtm.f189127c;
            if (i >= chtr.f189137e) {
                return false;
            }
            if (!Arrays.equals(chtm.f189125a.f189130b, chtr.mo85651a(i))) {
                this.f189124c++;
            } else {
                this.f189123b = true;
                return true;
            }
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f189123b = false;
            chtm chtm = this.f189122a;
            chtr chtr = chtm.f189127c;
            int i = this.f189124c;
            this.f189124c = i + 1;
            return chtr.mo85647a(i, chtm.f189125a);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
