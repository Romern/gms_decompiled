package p000;

import com.google.android.cast.JGCastService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* renamed from: bncb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bncb extends AbstractMap implements ConcurrentMap {

    /* renamed from: a */
    static final Logger f131413a = Logger.getLogger(bncb.class.getName());

    /* renamed from: s */
    static final bnbn f131414s = new bnaf();

    /* renamed from: t */
    static final Queue f131415t = new bnag();

    /* renamed from: b */
    final int f131416b;

    /* renamed from: c */
    final int f131417c;

    /* renamed from: d */
    final bnbe[] f131418d;

    /* renamed from: e */
    final int f131419e;

    /* renamed from: f */
    final bmxh f131420f;

    /* renamed from: g */
    final bmxh f131421g;

    /* renamed from: h */
    final bnbg f131422h;

    /* renamed from: i */
    final bnbg f131423i;

    /* renamed from: j */
    final long f131424j;

    /* renamed from: k */
    final bncg f131425k;

    /* renamed from: l */
    final long f131426l;

    /* renamed from: m */
    final long f131427m;

    /* renamed from: n */
    final Queue f131428n;

    /* renamed from: o */
    final bnce f131429o;

    /* renamed from: p */
    final bmzq f131430p;

    /* renamed from: q */
    final bnas f131431q;

    /* renamed from: r */
    final bnac f131432r;

    /* renamed from: u */
    Set f131433u;

    /* renamed from: v */
    Collection f131434v;

    /* renamed from: w */
    Set f131435w;

    public bncb(bmzz bmzz, bnac bnac) {
        Queue queue;
        boolean z;
        boolean z2;
        bmzz bmzz2 = bmzz;
        int i = bmzz2.f131284d;
        this.f131419e = Math.min(i == -1 ? 4 : i, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        this.f131422h = bmzz.mo66958b();
        this.f131423i = bmzz.mo66961c();
        this.f131420f = (bmxh) bmxu.m108565a(bmzz2.f131292l, bmzz.mo66958b().mo67063a());
        this.f131421g = (bmxh) bmxu.m108565a(bmzz2.f131293m, bmzz.mo66961c().mo67063a());
        long j = 0;
        this.f131424j = (bmzz2.f131290j == 0 || bmzz2.f131291k == 0) ? 0 : bmzz2.f131287g != null ? bmzz2.f131286f : bmzz2.f131285e;
        this.f131425k = (bncg) bmxu.m108565a(bmzz2.f131287g, bmzy.INSTANCE);
        long j2 = bmzz2.f131291k;
        this.f131426l = j2 == -1 ? 0 : j2;
        long j3 = bmzz2.f131290j;
        this.f131427m = j3 != -1 ? j3 : j;
        bnce bnce = (bnce) bmxu.m108565a(bmzz2.f131294n, bmzx.INSTANCE);
        this.f131429o = bnce;
        if (bnce != bmzx.INSTANCE) {
            queue = new ConcurrentLinkedQueue();
        } else {
            queue = f131415t;
        }
        this.f131428n = queue;
        int i2 = 0;
        int i3 = 1;
        boolean z3 = !mo67101f() ? mo67098d() : true;
        bmzq bmzq = bmzz2.f131295o;
        this.f131430p = bmzq == null ? z3 ? bmzq.f131275a : bmzz.f131281b : bmzq;
        bnbg bnbg = this.f131422h;
        if (!mo67099e()) {
            z = mo67098d();
        } else {
            z = true;
        }
        if (!mo67094c()) {
            z2 = mo67101f();
        } else {
            z2 = true;
        }
        this.f131431q = bnas.m108765a(bnbg, z, z2);
        bmzv bmzv = (bmzv) ((bmzm) bmzz2.f131296p).f131273a;
        this.f131432r = bnac;
        int min = Math.min(16, (int) JGCastService.FLAG_PRIVATE_DISPLAY);
        if (mo67091a() && !mo67093b()) {
            min = (int) Math.min((long) min, this.f131424j);
        }
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.f131419e && (!mo67091a() || ((long) (i4 * 20)) <= this.f131424j)) {
            i5++;
            i4 += i4;
        }
        this.f131417c = 32 - i5;
        this.f131416b = i4 - 1;
        this.f131418d = new bnbe[i4];
        int i6 = min / i4;
        while (i3 < (i6 * i4 < min ? i6 + 1 : i6)) {
            i3 += i3;
        }
        if (mo67091a()) {
            long j4 = this.f131424j;
            long j5 = (long) i4;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                bnbe[] bnbeArr = this.f131418d;
                if (i2 < bnbeArr.length) {
                    if (((long) i2) == j7) {
                        j6--;
                    }
                    bnbeArr[i2] = mo67090a(i3, j6, (bmzv) ((bmzm) bmzz2.f131296p).f131273a);
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                bnbe[] bnbeArr2 = this.f131418d;
                if (i2 < bnbeArr2.length) {
                    bnbeArr2[i2] = mo67090a(i3, -1, (bmzv) ((bmzm) bmzz2.f131296p).f131273a);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static ArrayList m108948a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        bnjr.m109612a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: i */
    static bncc m108953i() {
        return bnbd.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo67091a() {
        return this.f131424j >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo67094c() {
        return this.f131427m > 0;
    }

    public final void clear() {
        bncd bncd;
        bnbe[] bnbeArr = this.f131418d;
        int length = bnbeArr.length;
        for (int i = 0; i < length; i++) {
            bnbe bnbe = bnbeArr[i];
            if (bnbe.f131350b != 0) {
                bnbe.lock();
                try {
                    bnbe.mo67059c(bnbe.f131349a.f131430p.mo15379a());
                    AtomicReferenceArray atomicReferenceArray = bnbe.f131354f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (bncc bncc = (bncc) atomicReferenceArray.get(i2); bncc != null; bncc = bncc.mo66992b()) {
                            if (bncc.mo66988a().mo66975d()) {
                                Object d = bncc.mo66997d();
                                Object obj = bncc.mo66988a().get();
                                if (d != null) {
                                    if (obj != null) {
                                        bncd = bncd.EXPLICIT;
                                        bncc.mo66995c();
                                        bnbe.mo67049a(d, obj, bncc.mo66988a().mo66970a(), bncd);
                                    }
                                }
                                bncd = bncd.COLLECTED;
                                bncc.mo66995c();
                                bnbe.mo67049a(d, obj, bncc.mo66988a().mo66970a(), bncd);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (bnbe.f131349a.mo67102g()) {
                        do {
                        } while (bnbe.f131356h.poll() != null);
                    }
                    if (bnbe.f131349a.mo67105h()) {
                        do {
                        } while (bnbe.f131357i.poll() != null);
                    }
                    bnbe.f131360l.clear();
                    bnbe.f131361m.clear();
                    bnbe.f131359k.set(0);
                    bnbe.f131352d++;
                    bnbe.f131350b = 0;
                } finally {
                    bnbe.unlock();
                    bnbe.mo67062f();
                }
            }
        }
    }

    public final boolean containsKey(Object obj) {
        bncc a;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a2 = mo67088a(obj);
        bnbe a3 = mo67089a(a2);
        try {
            if (!(a3.f131350b == 0 || (a = a3.mo67039a(obj, a2, a3.f131349a.f131430p.mo15379a())) == null || a.mo66988a().get() == null)) {
                z = true;
            }
            return z;
        } finally {
            a3.mo67061e();
        }
    }

    public final boolean containsValue(Object obj) {
        long j;
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long a = this.f131430p.mo15379a();
        bnbe[] bnbeArr = this.f131418d;
        long j2 = -1;
        int i = 0;
        while (i < 3) {
            int length = bnbeArr.length;
            long j3 = 0;
            int i2 = 0;
            while (i2 < length) {
                bnbe bnbe = bnbeArr[i2];
                int i3 = bnbe.f131350b;
                AtomicReferenceArray atomicReferenceArray = bnbe.f131354f;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    bncc bncc = (bncc) atomicReferenceArray.get(i4);
                    while (bncc != null) {
                        bnbe[] bnbeArr2 = bnbeArr;
                        Object c = bnbe.mo67057c(bncc, a);
                        if (c != null) {
                            j = a;
                            if (this.f131421g.mo66864b(obj2, c)) {
                                return true;
                            }
                        } else {
                            j = a;
                        }
                        bncc = bncc.mo66992b();
                        bnbeArr = bnbeArr2;
                        a = j;
                    }
                }
                j3 += (long) bnbe.f131352d;
                i2++;
                a = a;
            }
            long j4 = a;
            bnbe[] bnbeArr3 = bnbeArr;
            if (j3 == j2) {
                return false;
            }
            i++;
            j2 = j3;
            bnbeArr = bnbeArr3;
            a = j4;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo67098d() {
        return this.f131426l > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo67099e() {
        return mo67098d() || mo67091a();
    }

    public final Set entrySet() {
        Set set = this.f131435w;
        if (set != null) {
            return set;
        }
        bnau bnau = new bnau(this, this);
        this.f131435w = bnau;
        return bnau;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo67101f() {
        return mo67094c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo67102g() {
        return this.f131422h != bnbg.STRONG;
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo67088a(obj);
        return mo67089a(a).mo67042a(obj, a);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo67105h() {
        return this.f131423i != bnbg.STRONG;
    }

    public final boolean isEmpty() {
        bnbe[] bnbeArr = this.f131418d;
        long j = 0;
        for (int i = 0; i < bnbeArr.length; i++) {
            if (bnbeArr[i].f131350b != 0) {
                return false;
            }
            j += (long) bnbeArr[i].f131352d;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < bnbeArr.length; i2++) {
            if (bnbeArr[i2].f131350b != 0) {
                return false;
            }
            j -= (long) bnbeArr[i2].f131352d;
        }
        if (j == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final long mo67107j() {
        bnbe[] bnbeArr;
        long j = 0;
        for (bnbe bnbe : this.f131418d) {
            j += (long) Math.max(0, bnbe.f131350b);
        }
        return j;
    }

    public final Set keySet() {
        Set set = this.f131433u;
        if (set != null) {
            return set;
        }
        bnax bnax = new bnax(this, this);
        this.f131433u = bnax;
        return bnax;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnbe.a(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object
     arg types: [java.lang.Object, int, java.lang.Object, int]
     candidates:
      bnbe.a(java.lang.Object, java.lang.Object, int, bncd):void
      bnbe.a(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object */
    public final Object put(Object obj, Object obj2) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj2);
        int a = mo67088a(obj);
        return mo67089a(a).mo67043a(obj, a, obj2, false);
    }

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnbe.a(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object
     arg types: [java.lang.Object, int, java.lang.Object, int]
     candidates:
      bnbe.a(java.lang.Object, java.lang.Object, int, bncd):void
      bnbe.a(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object */
    public final Object putIfAbsent(Object obj, Object obj2) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj2);
        int a = mo67088a(obj);
        return mo67089a(a).mo67043a(obj, a, obj2, true);
    }

    public final Object remove(Object obj) {
        bncd bncd;
        if (obj == null) {
            return null;
        }
        int a = mo67088a(obj);
        bnbe a2 = mo67089a(a);
        a2.lock();
        try {
            a2.mo67059c(a2.f131349a.f131430p.mo15379a());
            int i = a2.f131350b;
            AtomicReferenceArray atomicReferenceArray = a2.f131354f;
            int length = a & (atomicReferenceArray.length() - 1);
            bncc bncc = (bncc) atomicReferenceArray.get(length);
            bncc bncc2 = bncc;
            while (true) {
                if (bncc2 == null) {
                    break;
                }
                Object d = bncc2.mo66997d();
                if (bncc2.mo66995c() == a) {
                    if (d != null && a2.f131349a.f131420f.mo66864b(obj, d)) {
                        bnbn a3 = bncc2.mo66988a();
                        Object obj2 = a3.get();
                        if (obj2 != null) {
                            bncd = bncd.EXPLICIT;
                        } else if (a3.mo66975d()) {
                            bncd = bncd.COLLECTED;
                        }
                        a2.f131352d++;
                        atomicReferenceArray.set(length, a2.mo67038a(bncc, bncc2, d, obj2, a3, bncd));
                        a2.f131350b--;
                        a2.unlock();
                        a2.mo67062f();
                        return obj2;
                    }
                }
                bncc2 = bncc2.mo66992b();
            }
            return null;
        } finally {
            a2.unlock();
            a2.mo67062f();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r6 = r4.mo66988a();
        r0 = r6.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r8.f131352d++;
        r8.mo67049a(r13, r0, r6.mo66970a(), p000.bncd.f131437b);
        r8.mo67048a(r4, r14, r1);
        r8.mo67046a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        r8.unlock();
        r8.mo67062f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r6.mo66975d() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        r13 = r8.f131350b;
        r8.f131352d++;
        r9.set(r10, r8.mo67038a(r3, r4, r5, null, r6, p000.bncd.f131438c));
        r8.f131350b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r0;
     */
    public final Object replace(Object obj, Object obj2) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj2);
        int a = mo67088a(obj);
        bnbe a2 = mo67089a(a);
        a2.lock();
        try {
            long a3 = a2.f131349a.f131430p.mo15379a();
            a2.mo67059c(a3);
            AtomicReferenceArray atomicReferenceArray = a2.f131354f;
            int length = a & (atomicReferenceArray.length() - 1);
            bncc bncc = (bncc) atomicReferenceArray.get(length);
            bncc bncc2 = bncc;
            while (true) {
                if (bncc2 == null) {
                    break;
                }
                Object d = bncc2.mo66997d();
                if (bncc2.mo66995c() == a) {
                    if (d != null && a2.f131349a.f131420f.mo66864b(obj, d)) {
                        break;
                    }
                }
                bncc2 = bncc2.mo66992b();
            }
            a2.unlock();
            a2.mo67062f();
            return null;
        } catch (Throwable th) {
            a2.unlock();
            a2.mo67062f();
            throw th;
        }
    }

    public final int size() {
        return bqcn.m112585b(mo67107j());
    }

    public final Collection values() {
        Collection collection = this.f131434v;
        if (collection != null) {
            return collection;
        }
        bnbo bnbo = new bnbo(this, this);
        this.f131434v = bnbo;
        return bnbo;
    }

    /* renamed from: b */
    static void m108951b(bncc bncc) {
        bnbd bnbd = bnbd.INSTANCE;
        bncc.mo66996c(bnbd);
        bncc.mo66998d(bnbd);
    }

    /* renamed from: a */
    static void m108949a(bncc bncc) {
        bnbd bnbd = bnbd.INSTANCE;
        bncc.mo66991a(bnbd);
        bncc.mo66994b(bnbd);
    }

    /* renamed from: b */
    static void m108952b(bncc bncc, bncc bncc2) {
        bncc.mo66996c(bncc2);
        bncc2.mo66998d(bncc);
    }

    /* renamed from: a */
    static void m108950a(bncc bncc, bncc bncc2) {
        bncc.mo66991a(bncc2);
        bncc2.mo66994b(bncc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo67093b() {
        return this.f131425k != bmzy.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo67088a(Object obj) {
        int b = this.f131420f.mo66863b(obj);
        int i = b + ((b << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bnbe mo67089a(int i) {
        return this.f131418d[(i >>> this.f131417c) & this.f131416b];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bnbe mo67090a(int i, long j, bmzv bmzv) {
        return new bnbe(this, i, j, bmzv);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo67092a(bncc bncc, long j) {
        bmxy.m108581a(bncc);
        if (mo67098d() && j - bncc.mo66999e() >= this.f131426l) {
            return true;
        }
        if (!mo67094c() || j - bncc.mo67002h() < this.f131427m) {
            return false;
        }
        return true;
    }

    public final boolean remove(Object obj, Object obj2) {
        bncd bncd;
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int a = mo67088a(obj);
        bnbe a2 = mo67089a(a);
        a2.lock();
        try {
            a2.mo67059c(a2.f131349a.f131430p.mo15379a());
            int i = a2.f131350b;
            AtomicReferenceArray atomicReferenceArray = a2.f131354f;
            int length = a & (atomicReferenceArray.length() - 1);
            bncc bncc = (bncc) atomicReferenceArray.get(length);
            bncc bncc2 = bncc;
            while (true) {
                if (bncc2 == null) {
                    break;
                }
                Object d = bncc2.mo66997d();
                if (bncc2.mo66995c() == a) {
                    if (d != null && a2.f131349a.f131420f.mo66864b(obj, d)) {
                        bnbn a3 = bncc2.mo66988a();
                        Object obj3 = a3.get();
                        if (a2.f131349a.f131421g.mo66864b(obj2, obj3)) {
                            bncd = bncd.EXPLICIT;
                        } else if (obj3 == null) {
                            if (a3.mo66975d()) {
                                bncd = bncd.COLLECTED;
                            }
                        }
                        a2.f131352d++;
                        atomicReferenceArray.set(length, a2.mo67038a(bncc, bncc2, d, obj3, a3, bncd));
                        a2.f131350b--;
                        if (bncd == bncd.EXPLICIT) {
                            z = true;
                        }
                    }
                }
                bncc2 = bncc2.mo66992b();
            }
            return z;
        } finally {
            a2.unlock();
            a2.mo67062f();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r1 = r5.mo66988a();
        r8 = r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r8 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r9.f131349a.f131421g.mo66864b(r14, r8) == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r9.f131352d++;
        r9.mo67049a(r13, r8, r1.mo66970a(), p000.bncd.f131437b);
        r9.mo67048a(r5, r15, r2);
        r9.mo67046a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        r9.unlock();
        r9.mo67062f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9.mo67056b(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        if (r1.mo66975d() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r13 = r9.f131350b;
        r9.f131352d++;
        r10.set(r11, r9.mo67038a(r4, r5, r7, null, r1, p000.bncd.f131438c));
        r9.f131350b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return true;
     */
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj3);
        if (obj2 == null) {
            return false;
        }
        int a = mo67088a(obj);
        bnbe a2 = mo67089a(a);
        a2.lock();
        try {
            long a3 = a2.f131349a.f131430p.mo15379a();
            a2.mo67059c(a3);
            AtomicReferenceArray atomicReferenceArray = a2.f131354f;
            int length = a & (atomicReferenceArray.length() - 1);
            bncc bncc = (bncc) atomicReferenceArray.get(length);
            bncc bncc2 = bncc;
            while (true) {
                if (bncc2 == null) {
                    break;
                }
                Object d = bncc2.mo66997d();
                if (bncc2.mo66995c() == a) {
                    if (d != null && a2.f131349a.f131420f.mo66864b(obj, d)) {
                        break;
                    }
                }
                bncc2 = bncc2.mo66992b();
            }
            a2.unlock();
            a2.mo67062f();
            return false;
        } catch (Throwable th) {
            a2.unlock();
            a2.mo67062f();
            throw th;
        }
    }
}
