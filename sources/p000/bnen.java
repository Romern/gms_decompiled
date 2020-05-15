package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: bnen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnen extends AbstractSet implements Serializable {

    /* renamed from: a */
    transient Object[] f131535a;

    /* renamed from: b */
    public transient int f131536b;

    /* renamed from: c */
    private transient Object f131537c;

    /* renamed from: d */
    private transient int[] f131538d;

    /* renamed from: e */
    private transient int f131539e;

    public bnen() {
        mo67453b(3);
    }

    /* renamed from: a */
    private final int m109148a(int i, int i2, int i3, int i4) {
        Object b = bneo.m109166b(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            bneo.m109165a(b, i3 & i5, i4 + 1);
        }
        Object obj = this.f131537c;
        int[] iArr = this.f131538d;
        for (int i6 = 0; i6 <= i; i6++) {
            int a = bneo.m109162a(obj, i6);
            while (a != 0) {
                int i7 = a - 1;
                int i8 = iArr[i7];
                int a2 = bneo.m109160a(i8, i) | i6;
                int i9 = a2 & i5;
                int a3 = bneo.m109162a(b, i9);
                bneo.m109165a(b, i9, a);
                iArr[i7] = bneo.m109161a(a2, a3, i5);
                a = i8 & i;
            }
        }
        this.f131537c = b;
        m109151d(i5);
        return i5;
    }

    /* renamed from: d */
    private final void m109151d(int i) {
        this.f131536b = bneo.m109161a(this.f131536b, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* renamed from: f */
    private final int m109152f() {
        return (1 << (this.f131536b & 31)) - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo67453b(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public final boolean add(Object obj) {
        int min;
        if (mo67454b()) {
            bmxy.m108601b(mo67454b(), "Arrays already allocated");
            int i = this.f131536b;
            int a = bneo.m109159a(i);
            this.f131537c = bneo.m109166b(a);
            m109151d(a - 1);
            this.f131538d = new int[i];
            this.f131535a = new Object[i];
        }
        Set c = mo67456c();
        if (c != null) {
            return c.add(obj);
        }
        int[] iArr = this.f131538d;
        Object[] objArr = this.f131535a;
        int i2 = this.f131539e;
        int i3 = i2 + 1;
        int a2 = bngg.m109305a(obj);
        int f = m109152f();
        int i4 = a2 & f;
        int a3 = bneo.m109162a(this.f131537c, i4);
        if (a3 != 0) {
            int a4 = bneo.m109160a(a2, f);
            int i5 = 0;
            while (true) {
                int i6 = a3 - 1;
                int i7 = iArr[i6];
                if (bneo.m109160a(i7, f) == a4 && bmxi.m108538a(obj, objArr[i6])) {
                    return false;
                }
                int i8 = i7 & f;
                i5++;
                if (i8 != 0) {
                    a3 = i8;
                } else if (i5 >= 9) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(m109152f() + 1, 1.0f);
                    int e = mo67460e();
                    while (e >= 0) {
                        linkedHashSet.add(this.f131535a[e]);
                        e = mo67455c(e);
                    }
                    this.f131537c = linkedHashSet;
                    this.f131538d = null;
                    this.f131535a = null;
                    mo67459d();
                    return linkedHashSet.add(obj);
                } else if (i3 > f) {
                    f = m109148a(f, bneo.m109167c(f), a2, i2);
                } else {
                    iArr[i6] = bneo.m109161a(i7, i3, f);
                }
            }
        } else if (i3 > f) {
            f = m109148a(f, bneo.m109167c(f), a2, i2);
        } else {
            bneo.m109165a(this.f131537c, i4, i3);
        }
        int length = this.f131538d.length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f131538d = Arrays.copyOf(this.f131538d, min);
            this.f131535a = Arrays.copyOf(this.f131535a, min);
        }
        this.f131538d[i2] = bneo.m109161a(a2, 0, f);
        this.f131535a[i2] = obj;
        this.f131539e = i3;
        mo67459d();
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo67453b(int i) {
        bmxy.m108589a(true, (Object) "Expected size must be >= 0");
        this.f131536b = bqcn.m112577a(i, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo67454b() {
        return this.f131537c == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo67455c(int i) {
        int i2 = i + 1;
        if (i2 >= this.f131539e) {
            return -1;
        }
        return i2;
    }

    public final void clear() {
        if (!mo67454b()) {
            mo67459d();
            Set c = mo67456c();
            if (c != null) {
                this.f131536b = bqcn.m112577a(size(), 3, 1073741823);
                c.clear();
                this.f131537c = null;
                this.f131539e = 0;
                return;
            }
            Arrays.fill(this.f131535a, 0, this.f131539e, (Object) null);
            bneo.m109164a(this.f131537c);
            Arrays.fill(this.f131538d, 0, this.f131539e, 0);
            this.f131539e = 0;
        }
    }

    public final boolean contains(Object obj) {
        if (!mo67454b()) {
            Set c = mo67456c();
            if (c != null) {
                return c.contains(obj);
            }
            int a = bngg.m109305a(obj);
            int f = m109152f();
            int a2 = bneo.m109162a(this.f131537c, a & f);
            if (a2 != 0) {
                int a3 = bneo.m109160a(a, f);
                do {
                    int i = a2 - 1;
                    int i2 = this.f131538d[i];
                    if (bneo.m109160a(i2, f) == a3 && bmxi.m108538a(obj, this.f131535a[i])) {
                        return true;
                    }
                    a2 = i2 & f;
                } while (a2 != 0);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo67459d() {
        this.f131536b += 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo67460e() {
        return isEmpty() ? -1 : 0;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Iterator iterator() {
        Set c = mo67456c();
        if (c != null) {
            return c.iterator();
        }
        return new bnem(this);
    }

    public final boolean remove(Object obj) {
        int i;
        int[] iArr;
        int i2;
        if (!mo67454b()) {
            Set c = mo67456c();
            if (c != null) {
                return c.remove(obj);
            }
            int f = m109152f();
            int a = bneo.m109163a(obj, null, f, this.f131537c, this.f131538d, this.f131535a, null);
            if (a != -1) {
                int size = size() - 1;
                if (a < size) {
                    Object[] objArr = this.f131535a;
                    Object obj2 = objArr[size];
                    objArr[a] = obj2;
                    objArr[size] = null;
                    int[] iArr2 = this.f131538d;
                    iArr2[a] = iArr2[size];
                    iArr2[size] = 0;
                    int a2 = bngg.m109305a(obj2) & f;
                    int a3 = bneo.m109162a(this.f131537c, a2);
                    int i3 = size + 1;
                    if (a3 == i3) {
                        bneo.m109165a(this.f131537c, a2, a + 1);
                    } else {
                        while (true) {
                            i = a3 - 1;
                            iArr = this.f131538d;
                            i2 = iArr[i];
                            int i4 = i2 & f;
                            if (i4 == i3) {
                                break;
                            }
                            a3 = i4;
                        }
                        iArr[i] = bneo.m109161a(i2, a + 1, f);
                    }
                } else {
                    this.f131535a[a] = null;
                    this.f131538d[a] = 0;
                }
                this.f131539e--;
                mo67459d();
                return true;
            }
        }
        return false;
    }

    public final int size() {
        Set c = mo67456c();
        return c == null ? this.f131539e : c.size();
    }

    public final Object[] toArray() {
        if (mo67454b()) {
            return new Object[0];
        }
        Set c = mo67456c();
        return c == null ? Arrays.copyOf(this.f131535a, this.f131539e) : c.toArray();
    }

    public bnen(int i) {
        mo67453b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Set mo67456c() {
        Object obj = this.f131537c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final Object[] toArray(Object[] objArr) {
        if (mo67454b()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set c = mo67456c();
        if (c != null) {
            return c.toArray(objArr);
        }
        Object[] objArr2 = this.f131535a;
        int i = this.f131539e;
        bmxy.m108585a(0, i, objArr2.length);
        int length = objArr.length;
        if (length < i) {
            objArr = bnnz.m109924a(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return objArr;
    }

    /* renamed from: a */
    public static bnen m109149a() {
        return new bnen();
    }

    /* renamed from: a */
    public static bnen m109150a(int i) {
        return new bnen(i);
    }
}
