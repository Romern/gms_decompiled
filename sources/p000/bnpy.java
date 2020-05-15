package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: bnpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnpy extends bnqd implements Collection {
    private static final long serialVersionUID = 0;

    public bnpy(Collection collection, Object obj) {
        super(collection, obj);
    }

    /* renamed from: a */
    public Collection mo68281a() {
        return (Collection) this.f131983f;
    }

    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.f131984g) {
            add = mo68281a().add(obj);
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.f131984g) {
            addAll = mo68281a().addAll(collection);
        }
        return addAll;
    }

    public final void clear() {
        synchronized (this.f131984g) {
            mo68281a().clear();
        }
    }

    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f131984g) {
            contains = mo68281a().contains(obj);
        }
        return contains;
    }

    public boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.f131984g) {
            containsAll = mo68281a().containsAll(collection);
        }
        return containsAll;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f131984g) {
            isEmpty = mo68281a().isEmpty();
        }
        return isEmpty;
    }

    public Iterator iterator() {
        return mo68281a().iterator();
    }

    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f131984g) {
            remove = mo68281a().remove(obj);
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.f131984g) {
            removeAll = mo68281a().removeAll(collection);
        }
        return removeAll;
    }

    public boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.f131984g) {
            retainAll = mo68281a().retainAll(collection);
        }
        return retainAll;
    }

    public final int size() {
        int size;
        synchronized (this.f131984g) {
            size = mo68281a().size();
        }
        return size;
    }

    public Object[] toArray() {
        Object[] array;
        synchronized (this.f131984g) {
            array = mo68281a().toArray();
        }
        return array;
    }

    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f131984g) {
            array = mo68281a().toArray(objArr);
        }
        return array;
    }
}
