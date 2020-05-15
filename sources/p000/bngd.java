package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: bngd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bngd extends AbstractMap implements Serializable, bndw {

    /* renamed from: a */
    transient Object[] f131578a;

    /* renamed from: b */
    transient Object[] f131579b;

    /* renamed from: c */
    transient int f131580c;

    /* renamed from: d */
    transient int f131581d;

    /* renamed from: e */
    public transient int f131582e;

    /* renamed from: f */
    public transient int[] f131583f;

    /* renamed from: g */
    public transient bndw f131584g;

    /* renamed from: h */
    private transient int[] f131585h;

    /* renamed from: i */
    private transient int[] f131586i;

    /* renamed from: j */
    private transient int[] f131587j;

    /* renamed from: k */
    private transient int[] f131588k;

    /* renamed from: l */
    private transient int f131589l;

    /* renamed from: m */
    private transient int[] f131590m;

    /* renamed from: n */
    private transient Set f131591n;

    /* renamed from: o */
    private transient Set f131592o;

    /* renamed from: p */
    private transient Set f131593p;

    public bngd() {
        mo67606c();
    }

    /* renamed from: a */
    private final void m109276a(int i, int i2, int i3) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        m109284f(i, i2);
        m109285g(i, i3);
        m109281c(this.f131590m[i], this.f131583f[i]);
        int i4 = this.f131580c - 1;
        if (i4 != i) {
            int i5 = this.f131590m[i4];
            int i6 = this.f131583f[i4];
            m109281c(i5, i);
            m109281c(i, i6);
            Object[] objArr = this.f131578a;
            Object obj = objArr[i4];
            Object[] objArr2 = this.f131579b;
            Object obj2 = objArr2[i4];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int c = m109280c(bngg.m109305a(obj));
            int[] iArr = this.f131585h;
            int i7 = iArr[c];
            if (i7 == i4) {
                iArr[c] = i;
            } else {
                int i8 = this.f131587j[i7];
                int i9 = i7;
                while (i8 != i4) {
                    i8 = this.f131587j[i8];
                    i9 = i8;
                }
                this.f131587j[i9] = i;
            }
            int[] iArr2 = this.f131587j;
            iArr2[i] = iArr2[i4];
            iArr2[i4] = -1;
            int c2 = m109280c(bngg.m109305a(obj2));
            int[] iArr3 = this.f131586i;
            int i10 = iArr3[c2];
            if (i10 == i4) {
                iArr3[c2] = i;
            } else {
                int i11 = this.f131588k[i10];
                int i12 = i10;
                while (i11 != i4) {
                    i11 = this.f131588k[i11];
                    i12 = i11;
                }
                this.f131588k[i12] = i;
            }
            int[] iArr4 = this.f131588k;
            iArr4[i] = iArr4[i4];
            iArr4[i4] = -1;
        }
        Object[] objArr3 = this.f131578a;
        int i13 = this.f131580c - 1;
        objArr3[i13] = null;
        this.f131579b[i13] = null;
        this.f131580c = i13;
        this.f131581d++;
    }

    /* renamed from: b */
    private final void m109279b(int i) {
        int length = this.f131587j.length;
        if (length < i) {
            int a = bngl.m109321a(length, i);
            this.f131578a = Arrays.copyOf(this.f131578a, a);
            this.f131579b = Arrays.copyOf(this.f131579b, a);
            this.f131587j = m109278a(this.f131587j, a);
            this.f131588k = m109278a(this.f131588k, a);
            this.f131590m = m109278a(this.f131590m, a);
            this.f131583f = m109278a(this.f131583f, a);
        }
        if (this.f131585h.length < i) {
            int b = bngg.m109306b(i);
            this.f131585h = m109277a(b);
            this.f131586i = m109277a(b);
            for (int i2 = 0; i2 < this.f131580c; i2++) {
                int c = m109280c(bngg.m109305a(this.f131578a[i2]));
                int[] iArr = this.f131587j;
                int[] iArr2 = this.f131585h;
                iArr[i2] = iArr2[c];
                iArr2[c] = i2;
                int c2 = m109280c(bngg.m109305a(this.f131579b[i2]));
                int[] iArr3 = this.f131588k;
                int[] iArr4 = this.f131586i;
                iArr3[i2] = iArr4[c2];
                iArr4[c2] = i2;
            }
        }
    }

    /* renamed from: c */
    private final int m109280c(int i) {
        return i & (this.f131585h.length - 1);
    }

    /* renamed from: d */
    private final void m109282d(int i, int i2) {
        bmxy.m108588a(i != -1);
        int c = m109280c(i2);
        int[] iArr = this.f131587j;
        int[] iArr2 = this.f131585h;
        iArr[i] = iArr2[c];
        iArr2[c] = i;
    }

    /* renamed from: e */
    private final void m109283e(int i, int i2) {
        bmxy.m108588a(i != -1);
        int c = m109280c(i2);
        int[] iArr = this.f131588k;
        int[] iArr2 = this.f131586i;
        iArr[i] = iArr2[c];
        iArr2[c] = i;
    }

    /* renamed from: f */
    private final void m109284f(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        int c = m109280c(i2);
        int[] iArr = this.f131585h;
        int i3 = iArr[c];
        if (i3 == i) {
            int[] iArr2 = this.f131587j;
            iArr[c] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f131587j[i3];
        int i5 = i3;
        while (i4 != -1) {
            if (i4 != i) {
                i4 = this.f131587j[i4];
                i5 = i4;
            } else {
                int[] iArr3 = this.f131587j;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
        }
        String valueOf = String.valueOf(this.f131578a[i]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("Expected to find entry with key ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: g */
    private final void m109285g(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        int c = m109280c(i2);
        int[] iArr = this.f131586i;
        int i3 = iArr[c];
        if (i3 == i) {
            int[] iArr2 = this.f131588k;
            iArr[c] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f131588k[i3];
        int i5 = i3;
        while (i4 != -1) {
            if (i4 != i) {
                i4 = this.f131588k[i4];
                i5 = i4;
            } else {
                int[] iArr3 = this.f131588k;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
        }
        String valueOf = String.valueOf(this.f131579b[i]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Expected to find entry with value ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        mo67606c();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f131580c);
        for (Map.Entry entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final void clear() {
        Arrays.fill(this.f131578a, 0, this.f131580c, (Object) null);
        Arrays.fill(this.f131579b, 0, this.f131580c, (Object) null);
        Arrays.fill(this.f131585h, -1);
        Arrays.fill(this.f131586i, -1);
        Arrays.fill(this.f131587j, 0, this.f131580c, -1);
        Arrays.fill(this.f131588k, 0, this.f131580c, -1);
        Arrays.fill(this.f131590m, 0, this.f131580c, -1);
        Arrays.fill(this.f131583f, 0, this.f131580c, -1);
        this.f131580c = 0;
        this.f131582e = -2;
        this.f131589l = -2;
        this.f131581d++;
    }

    public final boolean containsKey(Object obj) {
        return mo67595a(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        return mo67601b(obj) != -1;
    }

    public final Set entrySet() {
        Set set = this.f131593p;
        if (set != null) {
            return set;
        }
        bnfw bnfw = new bnfw(this);
        this.f131593p = bnfw;
        return bnfw;
    }

    public final Object get(Object obj) {
        int a = mo67595a(obj);
        if (a != -1) {
            return this.f131579b[a];
        }
        return null;
    }

    public final Set keySet() {
        Set set = this.f131591n;
        if (set != null) {
            return set;
        }
        bnfz bnfz = new bnfz(this);
        this.f131591n = bnfz;
        return bnfz;
    }

    public final Object remove(Object obj) {
        int a = bngg.m109305a(obj);
        int a2 = mo67596a(obj, a);
        if (a2 == -1) {
            return null;
        }
        Object obj2 = this.f131579b[a2];
        mo67599a(a2, a);
        return obj2;
    }

    public final int size() {
        return this.f131580c;
    }

    /* renamed from: c */
    private final void m109281c(int i, int i2) {
        if (i != -2) {
            this.f131583f[i] = i2;
        } else {
            this.f131582e = i2;
        }
        if (i2 != -2) {
            this.f131590m[i2] = i;
        } else {
            this.f131589l = i;
        }
    }

    public final Object put(Object obj, Object obj2) {
        boolean z;
        int a = bngg.m109305a(obj);
        int a2 = mo67596a(obj, a);
        if (a2 != -1) {
            Object obj3 = this.f131579b[a2];
            if (bmxi.m108538a(obj3, obj2)) {
                return obj2;
            }
            mo67605b(a2, obj2);
            return obj3;
        }
        int a3 = bngg.m109305a(obj2);
        if (mo67602b(obj2, a3) == -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108596a(z, "Value already present: %s", obj2);
        m109279b(this.f131580c + 1);
        Object[] objArr = this.f131578a;
        int i = this.f131580c;
        objArr[i] = obj;
        this.f131579b[i] = obj2;
        m109282d(i, a);
        m109283e(this.f131580c, a3);
        m109281c(this.f131589l, this.f131580c);
        m109281c(this.f131580c, -2);
        this.f131580c++;
        this.f131581d++;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo67606c() {
        bndz.m109113a(16, "expectedSize");
        int b = bngg.m109306b(16);
        this.f131580c = 0;
        this.f131578a = new Object[16];
        this.f131579b = new Object[16];
        this.f131585h = m109277a(b);
        this.f131586i = m109277a(b);
        this.f131587j = m109277a(16);
        this.f131588k = m109277a(16);
        this.f131582e = -2;
        this.f131589l = -2;
        this.f131590m = m109277a(16);
        this.f131583f = m109277a(16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo67601b(Object obj) {
        return mo67602b(obj, bngg.m109305a(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo67602b(Object obj, int i) {
        return mo67597a(obj, i, this.f131586i, this.f131588k, this.f131579b);
    }

    /* renamed from: b */
    public final Set values() {
        Set set = this.f131592o;
        if (set != null) {
            return set;
        }
        bnga bnga = new bnga(this);
        this.f131592o = bnga;
        return bnga;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo67604b(int i, int i2) {
        m109276a(i, bngg.m109305a(this.f131578a[i]), i2);
    }

    /* renamed from: b */
    public final void mo67605b(int i, Object obj) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        int a = bngg.m109305a(obj);
        if (mo67602b(obj, a) == -1) {
            m109285g(i, bngg.m109305a(this.f131579b[i]));
            this.f131579b[i] = obj;
            m109283e(i, a);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Value already present in map: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static int[] m109277a(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: a */
    private static int[] m109278a(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo67595a(Object obj) {
        return mo67596a(obj, bngg.m109305a(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo67596a(Object obj, int i) {
        return mo67597a(obj, i, this.f131585h, this.f131587j, this.f131578a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo67597a(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[m109280c(i)];
        while (i2 != -1) {
            if (bmxi.m108538a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* renamed from: a */
    public final bndw mo67382a() {
        bndw bndw = this.f131584g;
        if (bndw != null) {
            return bndw;
        }
        bnfx bnfx = new bnfx(this);
        this.f131584g = bnfx;
        return bnfx;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo67598a(Object obj, Object obj2) {
        boolean z;
        int a = bngg.m109305a(obj);
        int b = mo67602b(obj, a);
        if (b != -1) {
            Object obj3 = this.f131578a[b];
            if (bmxi.m108538a(obj3, obj2)) {
                return obj2;
            }
            mo67600a(b, obj2);
            return obj3;
        }
        int i = this.f131589l;
        int a2 = bngg.m109305a(obj2);
        if (mo67596a(obj2, a2) == -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108596a(z, "Key already present: %s", obj2);
        m109279b(this.f131580c + 1);
        Object[] objArr = this.f131578a;
        int i2 = this.f131580c;
        objArr[i2] = obj2;
        this.f131579b[i2] = obj;
        m109282d(i2, a2);
        m109283e(this.f131580c, a);
        int i3 = i != -2 ? this.f131583f[i] : this.f131582e;
        m109281c(i, this.f131580c);
        m109281c(this.f131580c, i3);
        this.f131580c++;
        this.f131581d++;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67599a(int i, int i2) {
        m109276a(i, i2, bngg.m109305a(this.f131579b[i]));
    }

    /* renamed from: a */
    public final void mo67600a(int i, Object obj) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        int a = mo67596a(obj, bngg.m109305a(obj));
        int i2 = this.f131589l;
        if (a == -1) {
            if (i2 == i) {
                i2 = this.f131590m[i];
            } else if (i2 == this.f131580c) {
                i2 = a;
            }
            if (i == -2) {
                a = this.f131583f[-2];
            } else if (this.f131580c != -2) {
                a = -2;
            }
            m109281c(this.f131590m[i], this.f131583f[i]);
            m109284f(i, bngg.m109305a(this.f131578a[i]));
            this.f131578a[i] = obj;
            m109282d(i, bngg.m109305a(obj));
            m109281c(i2, i);
            m109281c(i, a);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Key already present in map: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
