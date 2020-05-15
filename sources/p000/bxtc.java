package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bxtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bxtc extends AbstractList implements bxwc {

    /* renamed from: a */
    public boolean f164760a = true;

    /* renamed from: a */
    public final boolean mo73666a() {
        return this.f164760a;
    }

    public void add(int i, Object obj) {
        mo73672c();
        super.add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo73672c();
        return super.addAll(i, collection);
    }

    /* renamed from: b */
    public final void mo73671b() {
        this.f164760a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo73672c() {
        if (!this.f164760a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo73672c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                for (int i = 0; i < size; i++) {
                    if (!get(i).equals(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public Object remove(int i) {
        mo73672c();
        return super.remove(i);
    }

    public final boolean removeAll(Collection collection) {
        mo73672c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo73672c();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        mo73672c();
        return super.set(i, obj);
    }

    public boolean add(Object obj) {
        mo73672c();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        mo73672c();
        return super.addAll(collection);
    }

    public boolean remove(Object obj) {
        mo73672c();
        return super.remove(obj);
    }
}
