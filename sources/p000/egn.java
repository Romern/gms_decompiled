package p000;

import android.util.SparseArray;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: egn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egn implements Iterator {

    /* renamed from: a */
    private final SparseArray f14867a;

    /* renamed from: b */
    private final int f14868b;

    /* renamed from: c */
    private int f14869c = 0;

    public egn(SparseArray sparseArray) {
        this.f14867a = sparseArray;
        this.f14868b = sparseArray.size();
    }

    public final boolean hasNext() {
        if (this.f14868b == this.f14867a.size()) {
            return this.f14869c < this.f14868b;
        }
        throw new ConcurrentModificationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f14868b != this.f14867a.size()) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int keyAt = this.f14867a.keyAt(this.f14869c);
            this.f14869c++;
            return Integer.valueOf(keyAt);
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
