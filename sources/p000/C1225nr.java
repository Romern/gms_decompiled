package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: nr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1225nr implements Collection, Set {

    /* renamed from: c */
    private static Object[] f26751c;

    /* renamed from: d */
    private static int f26752d;

    /* renamed from: e */
    private static Object[] f26753e;

    /* renamed from: f */
    private static int f26754f;

    /* renamed from: g */
    private static final Object f26755g = new Object();

    /* renamed from: h */
    private static final Object f26756h = new Object();

    /* renamed from: a */
    Object[] f26757a;

    /* renamed from: b */
    public int f26758b;

    /* renamed from: i */
    private int[] f26759i;

    /* renamed from: j */
    private C1238od f26760j;

    public C1225nr() {
        this(0);
    }

    /* renamed from: a */
    private final int m19698a() {
        int i = this.f26758b;
        if (i == 0) {
            return -1;
        }
        int d = m19701d(0);
        if (d < 0 || this.f26757a[d] == null) {
            return d;
        }
        int i2 = d + 1;
        while (i2 < i && this.f26759i[i2] == 0) {
            if (this.f26757a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = d - 1;
        while (i3 >= 0 && this.f26759i[i3] == 0) {
            if (this.f26757a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: d */
    private final int m19701d(int i) {
        try {
            return C1229nv.m19714a(this.f26759i, this.f26758b, i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private final void m19702e(int i) {
        if (i == 8) {
            synchronized (f26756h) {
                if (f26753e != null) {
                    Object[] objArr = f26753e;
                    try {
                        this.f26757a = objArr;
                        f26753e = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f26759i = iArr;
                        if (iArr == null) {
                            System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                            f26753e = null;
                            f26754f = 0;
                        } else {
                            objArr[1] = null;
                            objArr[0] = null;
                            f26754f--;
                            return;
                        }
                    } catch (ClassCastException e) {
                    }
                }
            }
        } else if (i == 4) {
            synchronized (f26755g) {
                if (f26751c != null) {
                    Object[] objArr2 = f26751c;
                    try {
                        this.f26757a = objArr2;
                        f26751c = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f26759i = iArr2;
                        if (iArr2 == null) {
                            System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                            f26751c = null;
                            f26752d = 0;
                        } else {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f26752d--;
                            return;
                        }
                    } catch (ClassCastException e2) {
                    }
                }
            }
        }
        this.f26759i = new int[i];
        this.f26757a = new Object[i];
    }

    public final boolean add(Object obj) {
        int i;
        int i2;
        int i3 = this.f26758b;
        if (obj != null) {
            i2 = obj.hashCode();
            i = m19699a(obj, i2);
        } else {
            i = m19698a();
            i2 = 0;
        }
        if (i >= 0) {
            return false;
        }
        int i4 = i ^ -1;
        int[] iArr = this.f26759i;
        int length = iArr.length;
        if (i3 >= length) {
            int i5 = 4;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f26757a;
            m19702e(i5);
            if (i3 == this.f26758b) {
                int[] iArr2 = this.f26759i;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr, 0, this.f26757a, 0, objArr.length);
                }
                m19700a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f26759i;
            int i6 = i4 + 1;
            int i7 = i3 - i4;
            System.arraycopy(iArr3, i4, iArr3, i6, i7);
            Object[] objArr2 = this.f26757a;
            System.arraycopy(objArr2, i4, objArr2, i6, i7);
        }
        int i8 = this.f26758b;
        if (i3 == i8) {
            int[] iArr4 = this.f26759i;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.f26757a[i4] = obj;
                this.f26758b = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection collection) {
        mo15510a(this.f26758b + collection.size());
        boolean z = false;
        for (Object obj : collection) {
            z |= add(obj);
        }
        return z;
    }

    /* renamed from: b */
    public final Object mo15513b(int i) {
        return this.f26757a[i];
    }

    /* renamed from: c */
    public final void mo15514c(int i) {
        int i2 = this.f26758b;
        Object[] objArr = this.f26757a;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f26759i;
        int length = iArr.length;
        int i4 = 8;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i5 = i + 1;
                int i6 = i3 - i;
                System.arraycopy(iArr, i5, iArr, i, i6);
                Object[] objArr2 = this.f26757a;
                System.arraycopy(objArr2, i5, objArr2, i, i6);
            }
            this.f26757a[i3] = null;
        } else {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            m19702e(i4);
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f26759i, 0, i);
                System.arraycopy(objArr, 0, this.f26757a, 0, i);
            }
            if (i < i3) {
                int i7 = i + 1;
                int i8 = i3 - i;
                System.arraycopy(iArr, i7, this.f26759i, i, i8);
                System.arraycopy(objArr, i7, this.f26757a, i, i8);
            }
        }
        if (i2 == this.f26758b) {
            this.f26758b = i3;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        int i = this.f26758b;
        if (i != 0) {
            int[] iArr = this.f26759i;
            Object[] objArr = this.f26757a;
            this.f26759i = C1229nv.f26767a;
            this.f26757a = C1229nv.f26769c;
            this.f26758b = 0;
            m19700a(iArr, objArr, i);
        }
        if (this.f26758b != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        return mo15509a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f26758b == set.size()) {
                int i = 0;
                while (i < this.f26758b) {
                    try {
                        if (!set.contains(mo15513b(i))) {
                            return false;
                        }
                        i++;
                    } catch (NullPointerException e) {
                    } catch (ClassCastException e2) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f26759i;
        int i = this.f26758b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.f26758b <= 0;
    }

    public final Iterator iterator() {
        if (this.f26760j == null) {
            this.f26760j = new C1224nq(this);
        }
        C1238od odVar = this.f26760j;
        odVar.getClass();
        return new C1232ny(odVar, 0);
    }

    public final boolean remove(Object obj) {
        int a = mo15509a(obj);
        if (a < 0) {
            return false;
        }
        mo15514c(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f26758b - 1; i >= 0; i--) {
            if (!collection.contains(this.f26757a[i])) {
                mo15514c(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f26758b;
    }

    public final Object[] toArray() {
        int i = this.f26758b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f26757a, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f26758b * 14);
        sb.append('{');
        for (int i = 0; i < this.f26758b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo15513b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1225nr(int i) {
        if (i == 0) {
            this.f26759i = C1229nv.f26767a;
            this.f26757a = C1229nv.f26769c;
        } else {
            m19702e(i);
        }
        this.f26758b = 0;
    }

    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f26758b) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f26758b);
        }
        System.arraycopy(this.f26757a, 0, objArr, 0, this.f26758b);
        int length = objArr.length;
        int i = this.f26758b;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public C1225nr(Collection collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    /* renamed from: a */
    private final int m19699a(Object obj, int i) {
        int i2 = this.f26758b;
        if (i2 == 0) {
            return -1;
        }
        int d = m19701d(i);
        if (d < 0 || obj.equals(this.f26757a[d])) {
            return d;
        }
        int i3 = d + 1;
        while (i3 < i2 && this.f26759i[i3] == i) {
            if (obj.equals(this.f26757a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = d - 1;
        while (i4 >= 0 && this.f26759i[i4] == i) {
            if (obj.equals(this.f26757a[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public C1225nr(C1225nr nrVar) {
        this();
        if (nrVar != null) {
            int i = nrVar.f26758b;
            mo15510a(this.f26758b + i);
            if (this.f26758b != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    add(nrVar.mo15513b(i2));
                }
            } else if (i > 0) {
                System.arraycopy(nrVar.f26759i, 0, this.f26759i, 0, i);
                System.arraycopy(nrVar.f26757a, 0, this.f26757a, 0, i);
                if (this.f26758b == 0) {
                    this.f26758b = i;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        }
    }

    /* renamed from: a */
    private static void m19700a(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (f26756h) {
                if (f26754f < 10) {
                    objArr[0] = f26753e;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f26753e = objArr;
                    f26754f++;
                }
            }
        } else if (length == 4) {
            synchronized (f26755g) {
                if (f26752d < 10) {
                    objArr[0] = f26751c;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f26751c = objArr;
                    f26752d++;
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo15509a(Object obj) {
        return obj != null ? m19699a(obj, obj.hashCode()) : m19698a();
    }

    /* renamed from: a */
    public final void mo15510a(int i) {
        int i2 = this.f26758b;
        int[] iArr = this.f26759i;
        if (iArr.length < i) {
            Object[] objArr = this.f26757a;
            m19702e(i);
            int i3 = this.f26758b;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f26759i, 0, i3);
                System.arraycopy(objArr, 0, this.f26757a, 0, this.f26758b);
            }
            m19700a(iArr, objArr, this.f26758b);
        }
        if (this.f26758b != i2) {
            throw new ConcurrentModificationException();
        }
    }
}
