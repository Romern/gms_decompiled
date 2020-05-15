package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: ok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1245ok {

    /* renamed from: b */
    static Object[] f26803b;

    /* renamed from: c */
    static int f26804c;

    /* renamed from: d */
    static Object[] f26805d;

    /* renamed from: e */
    static int f26806e;

    /* renamed from: f */
    int[] f26807f;

    /* renamed from: g */
    Object[] f26808g;

    /* renamed from: h */
    public int f26809h;

    public C1245ok() {
        this.f26807f = C1229nv.f26767a;
        this.f26808g = C1229nv.f26769c;
        this.f26809h = 0;
    }

    /* renamed from: a */
    private static int m19768a(int[] iArr, int i, int i2) {
        try {
            return C1229nv.m19714a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private final void m19770e(int i) {
        if (i == 8) {
            synchronized (C1245ok.class) {
                if (f26805d != null) {
                    Object[] objArr = f26805d;
                    this.f26808g = objArr;
                    f26805d = (Object[]) objArr[0];
                    this.f26807f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f26806e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1245ok.class) {
                if (f26803b != null) {
                    Object[] objArr2 = f26803b;
                    this.f26808g = objArr2;
                    f26803b = (Object[]) objArr2[0];
                    this.f26807f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f26804c--;
                    return;
                }
            }
        }
        this.f26807f = new int[i];
        this.f26808g = new Object[(i + i)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo15619b(Object obj) {
        int i = this.f26809h;
        int i2 = i + i;
        Object[] objArr = this.f26808g;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final Object mo15621c(int i) {
        return this.f26808g[i + i + 1];
    }

    public void clear() {
        int i = this.f26809h;
        if (i > 0) {
            int[] iArr = this.f26807f;
            Object[] objArr = this.f26808g;
            this.f26807f = C1229nv.f26767a;
            this.f26808g = C1229nv.f26769c;
            this.f26809h = 0;
            m19769a(iArr, objArr, i);
        }
        if (this.f26809h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return mo15616a(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return mo15619b(obj) >= 0;
    }

    /* renamed from: d */
    public Object mo8152d(int i) {
        Object[] objArr = this.f26808g;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.f26809h;
        int i4 = 0;
        if (i3 <= 1) {
            m19769a(this.f26807f, objArr, i3);
            this.f26807f = C1229nv.f26767a;
            this.f26808g = C1229nv.f26769c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f26807f;
            int length = iArr.length;
            int i6 = 8;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f26808g;
                    System.arraycopy(objArr2, i7 + i7, objArr2, i2, i8 + i8);
                }
                Object[] objArr3 = this.f26808g;
                int i9 = i5 + i5;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m19770e(i6);
                if (i3 == this.f26809h) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f26807f, 0, i);
                        System.arraycopy(objArr, 0, this.f26808g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f26807f, i, i11);
                        System.arraycopy(objArr, i10 + i10, this.f26808g, i2, i11 + i11);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f26809h) {
            this.f26809h = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1245ok) {
            C1245ok okVar = (C1245ok) obj;
            if (this.f26809h != okVar.f26809h) {
                return false;
            }
            int i = 0;
            while (i < this.f26809h) {
                try {
                    Object b = mo15620b(i);
                    Object c = mo15621c(i);
                    Object obj2 = okVar.get(b);
                    if (c != null) {
                        if (!c.equals(obj2)) {
                            return false;
                        }
                    } else if (obj2 != null || !okVar.containsKey(b)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e) {
                    return false;
                } catch (ClassCastException e2) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f26809h == map.size()) {
                int i2 = 0;
                while (i2 < this.f26809h) {
                    try {
                        Object b2 = mo15620b(i2);
                        Object c2 = mo15621c(i2);
                        Object obj3 = map.get(b2);
                        if (c2 != null) {
                            if (!c2.equals(obj3)) {
                                return false;
                            }
                        } else if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                        i2++;
                    } catch (NullPointerException e3) {
                    } catch (ClassCastException e4) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int a = mo15616a(obj);
        return a >= 0 ? this.f26808g[a + a + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f26807f;
        Object[] objArr = this.f26808g;
        int i = this.f26809h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.f26809h <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.f26809h;
        if (obj != null) {
            i2 = obj.hashCode();
            i = mo15617a(obj, i2);
        } else {
            i = mo15615a();
            i2 = 0;
        }
        if (i >= 0) {
            int i4 = i + i + 1;
            Object[] objArr = this.f26808g;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = i ^ -1;
        int[] iArr = this.f26807f;
        int length = iArr.length;
        if (i3 >= length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f26808g;
            m19770e(i6);
            if (i3 == this.f26809h) {
                int[] iArr2 = this.f26807f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr2, 0, this.f26808g, 0, objArr2.length);
                }
                m19769a(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f26807f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f26808g;
            int i8 = this.f26809h - i5;
            System.arraycopy(objArr3, i5 + i5, objArr3, i7 + i7, i8 + i8);
        }
        int i9 = this.f26809h;
        if (i3 == i9) {
            int[] iArr4 = this.f26807f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f26808g;
                int i10 = i5 + i5;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f26809h = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int a = mo15616a(obj);
        if (a >= 0) {
            return mo8152d(a);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int a = mo15616a(obj);
        if (a >= 0) {
            return mo8149a(a, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f26809h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f26809h * 28);
        sb.append('{');
        for (int i = 0; i < this.f26809h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo15620b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo15621c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1245ok(int i) {
        if (i == 0) {
            this.f26807f = C1229nv.f26767a;
            this.f26808g = C1229nv.f26769c;
        } else {
            m19770e(i);
        }
        this.f26809h = 0;
    }

    /* renamed from: a */
    private static void m19769a(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (C1245ok.class) {
                if (f26806e < 10) {
                    objArr[0] = f26805d;
                    objArr[1] = iArr;
                    for (int i2 = (i + i) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f26805d = objArr;
                    f26806e++;
                }
            }
        } else if (length == 4) {
            synchronized (C1245ok.class) {
                if (f26804c < 10) {
                    objArr[0] = f26803b;
                    objArr[1] = iArr;
                    for (int i3 = (i + i) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f26803b = objArr;
                    f26804c++;
                }
            }
        }
    }

    /* renamed from: b */
    public final Object mo15620b(int i) {
        return this.f26808g[i + i];
    }

    public final boolean remove(Object obj, Object obj2) {
        int a = mo15616a(obj);
        if (a < 0) {
            return false;
        }
        Object c = mo15621c(a);
        if (obj2 != c && (obj2 == null || !obj2.equals(c))) {
            return false;
        }
        mo8152d(a);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int a = mo15616a(obj);
        if (a < 0) {
            return false;
        }
        Object c = mo15621c(a);
        if (c != obj2 && (obj2 == null || !obj2.equals(c))) {
            return false;
        }
        mo8149a(a, obj3);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo15615a() {
        int i = this.f26809h;
        if (i == 0) {
            return -1;
        }
        int a = m19768a(this.f26807f, i, 0);
        if (a < 0 || this.f26808g[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f26807f[i2] == 0) {
            if (this.f26808g[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f26807f[i3] == 0) {
            if (this.f26808g[i3 + i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    public final int mo15616a(Object obj) {
        return obj != null ? mo15617a(obj, obj.hashCode()) : mo15615a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo15617a(Object obj, int i) {
        int i2 = this.f26809h;
        if (i2 == 0) {
            return -1;
        }
        int a = m19768a(this.f26807f, i2, i);
        if (a < 0 || obj.equals(this.f26808g[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f26807f[i3] == i) {
            if (obj.equals(this.f26808g[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f26807f[i4] == i) {
            if (obj.equals(this.f26808g[i4 + i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public Object mo8149a(int i, Object obj) {
        int i2 = i + i + 1;
        Object[] objArr = this.f26808g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* renamed from: a */
    public final void mo15618a(int i) {
        int i2 = this.f26809h;
        int[] iArr = this.f26807f;
        if (iArr.length < i) {
            Object[] objArr = this.f26808g;
            m19770e(i);
            if (this.f26809h > 0) {
                System.arraycopy(iArr, 0, this.f26807f, 0, i2);
                System.arraycopy(objArr, 0, this.f26808g, 0, i2 + i2);
            }
            m19769a(iArr, objArr, i2);
        }
        if (this.f26809h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public void mo8150a(C1245ok okVar) {
        int i = okVar.f26809h;
        mo15618a(this.f26809h + i);
        if (this.f26809h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(okVar.mo15620b(i2), okVar.mo15621c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(okVar.f26807f, 0, this.f26807f, 0, i);
            System.arraycopy(okVar.f26808g, 0, this.f26808g, 0, i + i);
            this.f26809h = i;
        }
    }
}
