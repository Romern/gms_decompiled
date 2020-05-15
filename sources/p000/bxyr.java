package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: bxyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxyr extends AbstractList implements RandomAccess, bxwm {

    /* renamed from: a */
    public final bxwm f165113a;

    public bxyr(bxwm bxwm) {
        this.f165113a = bxwm;
    }

    /* renamed from: a */
    public final void mo74189a(ByteString bxtx) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object mo74190b(int i) {
        return this.f165113a.mo74190b(i);
    }

    /* renamed from: d */
    public final List mo74191d() {
        return this.f165113a.mo74191d();
    }

    /* renamed from: e */
    public final bxwm mo74192e() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((bxwl) this.f165113a).get(i);
    }

    public final Iterator iterator() {
        return new bxyq(this);
    }

    public final ListIterator listIterator(int i) {
        return new bxyp(this, i);
    }

    public final int size() {
        return this.f165113a.size();
    }
}
