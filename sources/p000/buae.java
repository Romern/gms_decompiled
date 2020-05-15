package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: buae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class buae implements Collection {
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Abstract implementation does not support adds.");
    }

    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (add(obj)) {
                z = true;
            }
        }
        return z;
    }

    public boolean contains(Object obj) {
        buaf e = iterator();
        while (e.hasNext()) {
            if (e.next().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public abstract buaf iterator();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection.size() == size()) {
                return containsAll(collection);
            }
        }
        return false;
    }

    public int hashCode() {
        buaf e = iterator();
        int i = 0;
        while (e.hasNext()) {
            i += e.next().hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj) {
        buaf e = iterator();
        while (e.hasNext()) {
            if (e.next().equals(obj)) {
                e.remove();
                return true;
            }
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        boolean z = false;
        if (size() > collection.size()) {
            for (Object obj : collection) {
                if (remove(obj)) {
                    z = true;
                }
            }
        } else {
            buaf e = iterator();
            while (e.hasNext()) {
                if (collection.contains(e.next())) {
                    e.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        buaf e = iterator();
        boolean z = false;
        while (e.hasNext()) {
            if (!collection.contains(e.next())) {
                e.remove();
                z = true;
            }
        }
        return z;
    }

    public abstract int size();

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        buaf e = iterator();
        while (true) {
            Object next = e.next();
            if (next == this) {
                next = "(this Collection)";
            }
            sb.append(next);
            if (e.hasNext()) {
                sb.append(", ");
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        try {
            buaf e = iterator();
            int i = 0;
            while (e.hasNext()) {
                objArr[i] = e.next();
                i++;
            }
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            return objArr;
        } catch (ClassCastException e2) {
            throw new ArrayStoreException(e2.getMessage());
        }
    }
}
