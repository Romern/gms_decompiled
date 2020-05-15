package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: bncz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bncz extends bncx implements List {

    /* renamed from: f */
    final /* synthetic */ bndd f131473f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bncz(bndd bndd, Object obj, List list, bncx bncx) {
        super(bndd, obj, list, bncx);
        this.f131473f = bndd;
    }

    public final void add(int i, Object obj) {
        mo67214a();
        boolean isEmpty = this.f131468b.isEmpty();
        mo67238d().add(i, obj);
        bndd.m109026a(this.f131473f);
        if (isEmpty) {
            mo67218c();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = mo67238d().addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        bndd.m109027a(this.f131473f, this.f131468b.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo67218c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo67238d() {
        return (List) this.f131468b;
    }

    public final Object get(int i) {
        mo67214a();
        return mo67238d().get(i);
    }

    public final int indexOf(Object obj) {
        mo67214a();
        return mo67238d().indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        mo67214a();
        return mo67238d().lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        mo67214a();
        return new bncy(this);
    }

    public final Object remove(int i) {
        mo67214a();
        Object remove = mo67238d().remove(i);
        bndd.m109028b(this.f131473f);
        mo67217b();
        return remove;
    }

    public final Object set(int i, Object obj) {
        mo67214a();
        return mo67238d().set(i, obj);
    }

    public final List subList(int i, int i2) {
        mo67214a();
        bndd bndd = this.f131473f;
        Object obj = this.f131467a;
        List subList = mo67238d().subList(i, i2);
        bncx bncx = this.f131469c;
        if (bncx == null) {
            bncx = this;
        }
        return bndd.mo67266a(obj, subList, bncx);
    }

    public final ListIterator listIterator(int i) {
        mo67214a();
        return new bncy(this, i);
    }
}
