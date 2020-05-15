package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bnel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bnel extends AbstractMap implements Serializable {

    /* renamed from: a */
    public static final Object f131521a = new Object();

    /* renamed from: b */
    public transient Object f131522b;

    /* renamed from: c */
    transient int[] f131523c;

    /* renamed from: d */
    transient Object[] f131524d;

    /* renamed from: e */
    transient Object[] f131525e;

    /* renamed from: f */
    public transient int f131526f;

    /* renamed from: g */
    public transient int f131527g;

    /* renamed from: h */
    private transient Set f131528h;

    /* renamed from: i */
    private transient Set f131529i;

    /* renamed from: j */
    private transient Collection f131530j;

    public bnel() {
        mo67426b(3);
    }

    /* renamed from: a */
    private final int m109126a(int i, int i2, int i3, int i4) {
        Object b = bneo.m109166b(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            bneo.m109165a(b, i3 & i5, i4 + 1);
        }
        Object obj = this.f131522b;
        int[] iArr = this.f131523c;
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
        this.f131522b = b;
        m109129f(i5);
        return i5;
    }

    /* renamed from: f */
    private final void m109129f(int i) {
        this.f131526f = bneo.m109161a(this.f131526f, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo67426b(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
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
        Iterator i = mo67442i();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: b */
    public int mo67424b(int i, int i2) {
        return i - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo67427b() {
        return this.f131522b == null;
    }

    /* renamed from: c */
    public int mo67428c() {
        bmxy.m108601b(mo67427b(), "Arrays already allocated");
        int i = this.f131526f;
        int a = bneo.m109159a(i);
        this.f131522b = bneo.m109166b(a);
        m109129f(a - 1);
        this.f131523c = new int[i];
        this.f131524d = new Object[i];
        this.f131525e = new Object[i];
        return i;
    }

    public void clear() {
        if (!mo67427b()) {
            mo67439g();
            Map d = mo67433d();
            if (d != null) {
                this.f131526f = bqcn.m112577a(size(), 3, 1073741823);
                d.clear();
                this.f131522b = null;
                this.f131527g = 0;
                return;
            }
            Arrays.fill(this.f131524d, 0, this.f131527g, (Object) null);
            Arrays.fill(this.f131525e, 0, this.f131527g, (Object) null);
            bneo.m109164a(this.f131522b);
            Arrays.fill(this.f131523c, 0, this.f131527g, 0);
            this.f131527g = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map d = mo67433d();
        return d == null ? mo67421a(obj) != -1 : d.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        Map d = mo67433d();
        if (d != null) {
            return d.containsValue(obj);
        }
        for (int i = 0; i < this.f131527g; i++) {
            if (bmxi.m108538a(obj, this.f131525e[i])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map mo67433d() {
        Object obj = this.f131522b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: e */
    public int mo67435e(int i) {
        int i2 = i + 1;
        if (i2 >= this.f131527g) {
            return -1;
        }
        return i2;
    }

    public final Set entrySet() {
        Set set = this.f131529i;
        if (set != null) {
            return set;
        }
        bneg bneg = new bneg(this);
        this.f131529i = bneg;
        return bneg;
    }

    /* renamed from: f */
    public final int mo67438f() {
        return (1 << (this.f131526f & 31)) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo67439g() {
        this.f131526f += 32;
    }

    public final Object get(Object obj) {
        Map d = mo67433d();
        if (d != null) {
            return d.get(obj);
        }
        int a = mo67421a(obj);
        if (a != -1) {
            return this.f131525e[a];
        }
        return null;
    }

    /* renamed from: h */
    public int mo67441h() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Iterator mo67442i() {
        Map d = mo67433d();
        if (d != null) {
            return d.entrySet().iterator();
        }
        return new bnee(this);
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set keySet() {
        Set set = this.f131528h;
        if (set != null) {
            return set;
        }
        bnei bnei = new bnei(this);
        this.f131528h = bnei;
        return bnei;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int min;
        if (mo67427b()) {
            mo67428c();
        }
        Map d = mo67433d();
        if (d != null) {
            return d.put(obj, obj2);
        }
        int[] iArr = this.f131523c;
        Object[] objArr = this.f131524d;
        Object[] objArr2 = this.f131525e;
        int i2 = this.f131527g;
        int i3 = i2 + 1;
        int a = bngg.m109305a(obj);
        int f = mo67438f();
        int i4 = a & f;
        int a2 = bneo.m109162a(this.f131522b, i4);
        if (a2 != 0) {
            int a3 = bneo.m109160a(a, f);
            int i5 = 0;
            while (true) {
                int i6 = a2 - 1;
                int i7 = iArr[i6];
                if (bneo.m109160a(i7, f) == a3 && bmxi.m108538a(obj, objArr[i6])) {
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = obj2;
                    return obj3;
                }
                int i8 = i7 & f;
                i5++;
                if (i8 != 0) {
                    a2 = i8;
                } else if (i5 >= 9) {
                    return mo67436e().put(obj, obj2);
                } else {
                    if (i3 > f) {
                        i = m109126a(f, bneo.m109167c(f), a, i2);
                    } else {
                        iArr[i6] = bneo.m109161a(i7, i3, f);
                    }
                }
            }
            int length = this.f131523c.length;
            if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                mo67434d(min);
            }
            mo67423a(i2, obj, obj2, a, i);
            this.f131527g = i3;
            mo67439g();
            return null;
        } else if (i3 > f) {
            i = m109126a(f, bneo.m109167c(f), a, i2);
            int length2 = this.f131523c.length;
            mo67434d(min);
            mo67423a(i2, obj, obj2, a, i);
            this.f131527g = i3;
            mo67439g();
            return null;
        } else {
            bneo.m109165a(this.f131522b, i4, i3);
        }
        i = f;
        int length22 = this.f131523c.length;
        mo67434d(min);
        mo67423a(i2, obj, obj2, a, i);
        this.f131527g = i3;
        mo67439g();
        return null;
    }

    public final Object remove(Object obj) {
        Map d = mo67433d();
        if (d != null) {
            return d.remove(obj);
        }
        Object b = mo67425b(obj);
        if (b == f131521a) {
            return null;
        }
        return b;
    }

    public final int size() {
        Map d = mo67433d();
        return d == null ? this.f131527g : d.size();
    }

    public final Collection values() {
        Collection collection = this.f131530j;
        if (collection != null) {
            return collection;
        }
        bnek bnek = new bnek(this);
        this.f131530j = bnek;
        return bnek;
    }

    public bnel(int i) {
        mo67426b(i);
    }

    /* renamed from: b */
    public final Object mo67425b(Object obj) {
        if (!mo67427b()) {
            int f = mo67438f();
            int a = bneo.m109163a(obj, null, f, this.f131522b, this.f131523c, this.f131524d, null);
            if (a != -1) {
                Object obj2 = this.f131525e[a];
                mo67422a(a, f);
                this.f131527g--;
                mo67439g();
                return obj2;
            }
        }
        return f131521a;
    }

    /* renamed from: d */
    public void mo67434d(int i) {
        this.f131523c = Arrays.copyOf(this.f131523c, i);
        this.f131524d = Arrays.copyOf(this.f131524d, i);
        this.f131525e = Arrays.copyOf(this.f131525e, i);
    }

    /* renamed from: e */
    public Map mo67436e() {
        Map c = mo67429c(mo67438f() + 1);
        int h = mo67441h();
        while (h >= 0) {
            c.put(this.f131524d[h], this.f131525e[h]);
            h = mo67435e(h);
        }
        this.f131522b = c;
        this.f131523c = null;
        this.f131524d = null;
        this.f131525e = null;
        mo67439g();
        return c;
    }

    /* renamed from: c */
    public Map mo67429c(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    /* renamed from: a */
    public static bnel m109127a() {
        return new bnel();
    }

    /* renamed from: b */
    public void mo67426b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Expected size must be >= 0");
        this.f131526f = bqcn.m112577a(i, 1, 1073741823);
    }

    /* renamed from: a */
    public static bnel m109128a(int i) {
        return new bnel(i);
    }

    /* renamed from: a */
    public final int mo67421a(Object obj) {
        if (!mo67427b()) {
            int a = bngg.m109305a(obj);
            int f = mo67438f();
            int a2 = bneo.m109162a(this.f131522b, a & f);
            if (a2 != 0) {
                int a3 = bneo.m109160a(a, f);
                do {
                    int i = a2 - 1;
                    int i2 = this.f131523c[i];
                    if (bneo.m109160a(i2, f) == a3 && bmxi.m108538a(obj, this.f131524d[i])) {
                        return i;
                    }
                    a2 = i2 & f;
                } while (a2 != 0);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo67422a(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f131524d;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f131525e;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f131523c;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int a = bngg.m109305a(obj) & i2;
            int a2 = bneo.m109162a(this.f131522b, a);
            int i3 = size + 1;
            if (a2 != i3) {
                while (true) {
                    int i4 = a2 - 1;
                    int[] iArr2 = this.f131523c;
                    int i5 = iArr2[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        a2 = i6;
                    } else {
                        iArr2[i4] = bneo.m109161a(i5, i + 1, i2);
                        return;
                    }
                }
            } else {
                bneo.m109165a(this.f131522b, a, i + 1);
            }
        } else {
            this.f131524d[i] = null;
            this.f131525e[i] = null;
            this.f131523c[i] = 0;
        }
    }

    /* renamed from: a */
    public void mo67423a(int i, Object obj, Object obj2, int i2, int i3) {
        this.f131523c[i] = bneo.m109161a(i2, 0, i3);
        this.f131524d[i] = obj;
        this.f131525e[i] = obj2;
    }
}
