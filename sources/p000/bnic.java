package p000;

import com.google.android.cast.JGCastService;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: bnic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnic extends bngm implements Set {

    /* renamed from: a */
    private transient bngx f131656a;

    /* renamed from: a */
    public static bnic m109487a(int i, Object... objArr) {
        if (i == 0) {
            return bnon.f131923a;
        }
        if (i == 1) {
            return m109489a(objArr[0]);
        }
        int b = m109498b(i);
        Object[] objArr2 = new Object[b];
        int i2 = b - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            bnnw.m109884a(obj, i5);
            int hashCode = obj.hashCode();
            int a = bngg.m109304a(hashCode);
            while (true) {
                int i6 = a & i2;
                Object obj2 = objArr2[i6];
                if (obj2 != null) {
                    if (obj2.equals(obj)) {
                        break;
                    }
                    a++;
                } else {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4++;
                    break;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new bnpg(objArr[0], i3);
        }
        if (m109498b(i4) < b / 2) {
            return m109487a(i4, objArr);
        }
        return new bnon(m109497a(i4, objArr.length) ? Arrays.copyOf(objArr, i4) : objArr, i3, objArr2, i2, i4);
    }

    /* renamed from: a */
    public static boolean m109497a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: b */
    static int m109498b(int i) {
        boolean z;
        double d;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                d = (double) highestOneBit;
                Double.isNaN(d);
            } while (d * 0.7d < ((double) max));
            return highestOneBit;
        }
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "collection too large");
        return JGCastService.FLAG_PRIVATE_DISPLAY;
    }

    /* renamed from: c */
    public static bnia m109499c(int i) {
        bndz.m109113a(i, "expectedSize");
        return new bnia(i);
    }

    /* renamed from: j */
    public static bnia m109500j() {
        return new bnia();
    }

    /* renamed from: a */
    public abstract bnrd iterator();

    /* renamed from: d */
    public boolean mo67658d() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnic) || !mo67658d() || !((bnic) obj).mo67658d() || hashCode() == obj.hashCode()) {
            return bnpf.m110052a(this, obj);
        }
        return false;
    }

    /* renamed from: g */
    public bngx mo67639g() {
        bngx bngx = this.f131656a;
        if (bngx != null) {
            return bngx;
        }
        bngx i = mo67756i();
        this.f131656a = i;
        return i;
    }

    public int hashCode() {
        return bnpf.m110044a((Set) this);
    }

    /* renamed from: i */
    public bngx mo67756i() {
        return bngx.m109373b(toArray());
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnib(toArray());
    }

    /* renamed from: a */
    public static bnic m109488a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return m109495a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return bnon.f131923a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m109489a(next);
        }
        bnia bnia = new bnia();
        bnia.mo67629b(next);
        bmxy.m108581a(it);
        while (it.hasNext()) {
            bnia.mo67629b(it.next());
        }
        return bnia.mo67751a();
    }

    /* renamed from: a */
    public static bnic m109489a(Object obj) {
        return new bnpg(obj);
    }

    /* renamed from: a */
    public static bnic m109490a(Object obj, Object obj2) {
        return m109487a(2, obj, obj2);
    }

    /* renamed from: a */
    public static bnic m109491a(Object obj, Object obj2, Object obj3) {
        return m109487a(3, obj, obj2, obj3);
    }

    /* renamed from: a */
    public static bnic m109492a(Object obj, Object obj2, Object obj3, Object obj4) {
        return m109487a(4, obj, obj2, obj3, obj4);
    }

    /* renamed from: a */
    public static bnic m109493a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m109487a(5, obj, obj2, obj3, obj4, obj5);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    @SafeVarargs
    /* renamed from: a */
    public static bnic m109494a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        bmxy.m108589a(true, (Object) "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return m109487a(i, objArr2);
    }

    /* renamed from: a */
    public static bnic m109495a(Collection collection) {
        if ((collection instanceof bnic) && !(collection instanceof SortedSet)) {
            bnic bnic = (bnic) collection;
            if (!bnic.mo67640h()) {
                return bnic;
            }
        }
        Object[] array = collection.toArray();
        return m109487a(array.length, array);
    }

    /* renamed from: a */
    public static bnic m109496a(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return bnon.f131923a;
        }
        if (length != 1) {
            return m109487a(length, (Object[]) objArr.clone());
        }
        return m109489a(objArr[0]);
    }
}
