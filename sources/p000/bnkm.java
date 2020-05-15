package p000;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: bnkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnkm extends AbstractSequentialList implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final List f131767a;

    /* renamed from: b */
    final bmxj f131768b;

    public bnkm(List list, bmxj bmxj) {
        bmxy.m108581a(list);
        this.f131767a = list;
        bmxy.m108581a(bmxj);
        this.f131768b = bmxj;
    }

    public final void clear() {
        this.f131767a.clear();
    }

    public final ListIterator listIterator(int i) {
        return new bnkl(this, this.f131767a.listIterator(i));
    }

    public final int size() {
        return this.f131767a.size();
    }
}
