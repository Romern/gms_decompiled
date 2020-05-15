package p000;

import com.google.android.cast.JGCastService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bnlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnlw extends AbstractMap implements ConcurrentMap, Serializable {

    /* renamed from: g */
    static final bnlt f131822g = new bnkp();
    private static final long serialVersionUID = 5;

    /* renamed from: a */
    final transient int f131823a;

    /* renamed from: b */
    final transient int f131824b;

    /* renamed from: c */
    final transient bnlc[] f131825c;

    /* renamed from: d */
    final int f131826d;

    /* renamed from: e */
    final bmxh f131827e;

    /* renamed from: f */
    final transient bnky f131828f;

    /* renamed from: h */
    transient Set f131829h;

    /* renamed from: i */
    transient Collection f131830i;

    /* renamed from: j */
    transient Set f131831j;

    public bnlw(bnko bnko, bnky bnky) {
        this.f131826d = Math.min(bnko.mo67939b(), (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        this.f131827e = (bmxh) bmxu.m108565a(bnko.f131774f, bnko.mo67941c().mo67994a());
        this.f131828f = bnky;
        int min = Math.min(bnko.mo67937a(), (int) JGCastService.FLAG_PRIVATE_DISPLAY);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f131826d) {
            i4++;
            i3 += i3;
        }
        this.f131824b = 32 - i4;
        this.f131823a = i3 - 1;
        this.f131825c = new bnlc[i3];
        int i5 = min / i3;
        while (i2 < (i3 * i5 < min ? i5 + 1 : i5)) {
            i2 += i2;
        }
        while (true) {
            bnlc[] bnlcArr = this.f131825c;
            if (i < bnlcArr.length) {
                bnlcArr[i] = this.f131828f.mo67969a(this, i2);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static ArrayList m109764a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        bnjr.m109612a(arrayList, collection.iterator());
        return arrayList;
    }

    public final void clear() {
        bnlc[] bnlcArr = this.f131825c;
        int length = bnlcArr.length;
        for (int i = 0; i < length; i++) {
            bnlc bnlc = bnlcArr[i];
            if (bnlc.f131796b != 0) {
                bnlc.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = bnlc.f131799e;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    bnlc.mo67989b();
                    bnlc.f131801g.set(0);
                    bnlc.f131797c++;
                    bnlc.f131796b = 0;
                } finally {
                    bnlc.unlock();
                }
            }
        }
    }

    public final boolean containsKey(Object obj) {
        bnkx a;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a2 = mo68004a(obj);
        bnlc a3 = mo68006a(a2);
        try {
            if (!(a3.f131796b == 0 || (a = a3.mo67983a(obj, a2)) == null || a.mo67952d() == null)) {
                z = true;
            }
            return z;
        } finally {
            a3.mo67992d();
        }
    }

    public final boolean containsValue(Object obj) {
        Object obj2;
        Object obj3 = obj;
        if (obj3 == null) {
            return false;
        }
        bnlc[] bnlcArr = this.f131825c;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (bnlc bnlc : bnlcArr) {
                int i2 = bnlc.f131796b;
                AtomicReferenceArray atomicReferenceArray = bnlc.f131799e;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (bnkx bnkx = (bnkx) atomicReferenceArray.get(i3); bnkx != null; bnkx = bnkx.mo67951c()) {
                        if (bnkx.mo67949a() == null) {
                            bnlc.mo67991c();
                            obj2 = null;
                        } else {
                            obj2 = bnkx.mo67952d();
                            if (obj2 == null) {
                                bnlc.mo67991c();
                                obj2 = null;
                            }
                        }
                        if (obj2 != null && mo68005a().mo66864b(obj3, obj2)) {
                            return true;
                        }
                    }
                }
                j2 += (long) bnlc.f131797c;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.f131831j;
        if (set != null) {
            return set;
        }
        bnkv bnkv = new bnkv(this);
        this.f131831j = bnkv;
        return bnkv;
    }

    public final Object get(Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        int a = mo68004a(obj);
        bnlc a2 = mo68006a(a);
        try {
            bnkx a3 = a2.mo67983a(obj, a);
            if (a3 != null) {
                obj2 = a3.mo67952d();
                if (obj2 == null) {
                    a2.mo67991c();
                }
            }
            return obj2;
        } finally {
            a2.mo67992d();
        }
    }

    public final boolean isEmpty() {
        bnlc[] bnlcArr = this.f131825c;
        long j = 0;
        for (int i = 0; i < bnlcArr.length; i++) {
            if (bnlcArr[i].f131796b != 0) {
                return false;
            }
            j += (long) bnlcArr[i].f131797c;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < bnlcArr.length; i2++) {
            if (bnlcArr[i2].f131796b != 0) {
                return false;
            }
            j -= (long) bnlcArr[i2].f131797c;
        }
        if (j == 0) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        Set set = this.f131829h;
        if (set != null) {
            return set;
        }
        bnla bnla = new bnla(this);
        this.f131829h = bnla;
        return bnla;
    }

    public final Object put(Object obj, Object obj2) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj2);
        int a = mo68004a(obj);
        return mo68006a(a).mo67984a(obj, a, obj2, false);
    }

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj2);
        int a = mo68004a(obj);
        return mo68006a(a).mo67984a(obj, a, obj2, true);
    }

    /* JADX INFO: finally extract failed */
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo68004a(obj);
        bnlc a2 = mo68006a(a);
        a2.lock();
        try {
            a2.mo67993e();
            int i = a2.f131796b;
            AtomicReferenceArray atomicReferenceArray = a2.f131799e;
            int length = (atomicReferenceArray.length() - 1) & a;
            bnkx bnkx = (bnkx) atomicReferenceArray.get(length);
            bnkx bnkx2 = bnkx;
            while (true) {
                if (bnkx2 == null) {
                    break;
                }
                Object a3 = bnkx2.mo67949a();
                if (bnkx2.mo67950b() == a) {
                    if (a3 != null && a2.f131795a.f131827e.mo66864b(obj, a3)) {
                        Object d = bnkx2.mo67952d();
                        if (d == null) {
                            if (!bnlc.m109708a(bnkx2)) {
                            }
                        }
                        a2.f131797c++;
                        atomicReferenceArray.set(length, a2.mo67988b(bnkx, bnkx2));
                        a2.f131796b--;
                        a2.unlock();
                        return d;
                    }
                }
                bnkx2 = bnkx2.mo67951c();
            }
            a2.unlock();
            return null;
        } catch (Throwable th) {
            a2.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        r10 = r5.mo67952d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r10 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r1.f131797c++;
        r1.mo67986a(r5, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r1.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (p000.bnlc.m109708a(r5) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r10 = r1.f131796b;
        r1.f131797c++;
        r2.set(r3, r1.mo67988b(r4, r5));
        r1.f131796b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r10;
     */
    public final Object replace(Object obj, Object obj2) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj2);
        int a = mo68004a(obj);
        bnlc a2 = mo68006a(a);
        a2.lock();
        try {
            a2.mo67993e();
            AtomicReferenceArray atomicReferenceArray = a2.f131799e;
            int length = (atomicReferenceArray.length() - 1) & a;
            bnkx bnkx = (bnkx) atomicReferenceArray.get(length);
            bnkx bnkx2 = bnkx;
            while (true) {
                if (bnkx2 == null) {
                    break;
                }
                Object a3 = bnkx2.mo67949a();
                if (bnkx2.mo67950b() == a) {
                    if (a3 != null && a2.f131795a.f131827e.mo66864b(obj, a3)) {
                        break;
                    }
                }
                bnkx2 = bnkx2.mo67951c();
            }
            a2.unlock();
            return null;
        } catch (Throwable th) {
            a2.unlock();
            throw th;
        }
    }

    public final int size() {
        bnlc[] bnlcArr;
        long j = 0;
        for (bnlc bnlc : this.f131825c) {
            j += (long) bnlc.f131796b;
        }
        return bqcn.m112585b(j);
    }

    public final Collection values() {
        Collection collection = this.f131830i;
        if (collection != null) {
            return collection;
        }
        bnll bnll = new bnll(this);
        this.f131830i = bnll;
        return bnll;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        bnle a = this.f131828f.mo67970a();
        bnle b = this.f131828f.mo67972b();
        bmxh bmxh = this.f131827e;
        this.f131828f.mo67972b().mo67994a();
        return new bnld(a, b, bmxh, this.f131826d, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo68004a(Object obj) {
        int b = this.f131827e.mo66863b(obj);
        int i = b + ((b << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bmxh mo68005a() {
        return this.f131828f.mo67972b().mo67994a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bnlc mo68006a(int i) {
        return this.f131825c[(i >>> this.f131824b) & this.f131823a];
    }

    public final boolean remove(Object obj, Object obj2) {
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int a = mo68004a(obj);
        bnlc a2 = mo68006a(a);
        a2.lock();
        try {
            a2.mo67993e();
            int i = a2.f131796b;
            AtomicReferenceArray atomicReferenceArray = a2.f131799e;
            int length = (atomicReferenceArray.length() - 1) & a;
            bnkx bnkx = (bnkx) atomicReferenceArray.get(length);
            bnkx bnkx2 = bnkx;
            while (true) {
                if (bnkx2 == null) {
                    break;
                }
                Object a3 = bnkx2.mo67949a();
                if (bnkx2.mo67950b() == a) {
                    if (a3 != null && a2.f131795a.f131827e.mo66864b(obj, a3)) {
                        if (a2.f131795a.mo68005a().mo66864b(obj2, bnkx2.mo67952d())) {
                            z = true;
                        } else if (!bnlc.m109708a(bnkx2)) {
                        }
                        a2.f131797c++;
                        atomicReferenceArray.set(length, a2.mo67988b(bnkx, bnkx2));
                        a2.f131796b--;
                    }
                }
                bnkx2 = bnkx2.mo67951c();
            }
            return z;
        } finally {
            a2.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r11 = r6.mo67952d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r11 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r2.f131795a.mo68005a().mo66864b(r12, r11) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r2.f131797c++;
        r2.mo67986a(r6, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r2.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (p000.bnlc.m109708a(r6) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r11 = r2.f131796b;
        r2.f131797c++;
        r3.set(r4, r2.mo67988b(r5, r6));
        r2.f131796b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj3);
        if (obj2 == null) {
            return false;
        }
        int a = mo68004a(obj);
        bnlc a2 = mo68006a(a);
        a2.lock();
        try {
            a2.mo67993e();
            AtomicReferenceArray atomicReferenceArray = a2.f131799e;
            int length = (atomicReferenceArray.length() - 1) & a;
            bnkx bnkx = (bnkx) atomicReferenceArray.get(length);
            bnkx bnkx2 = bnkx;
            while (true) {
                if (bnkx2 == null) {
                    break;
                }
                Object a3 = bnkx2.mo67949a();
                if (bnkx2.mo67950b() == a) {
                    if (a3 != null && a2.f131795a.f131827e.mo66864b(obj, a3)) {
                        break;
                    }
                }
                bnkx2 = bnkx2.mo67951c();
            }
            a2.unlock();
            return false;
        } catch (Throwable th) {
            a2.unlock();
            throw th;
        }
    }
}
