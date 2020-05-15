package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* renamed from: bnbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnbe extends ReentrantLock {

    /* renamed from: a */
    final bncb f131349a;

    /* renamed from: b */
    volatile int f131350b;

    /* renamed from: c */
    long f131351c;

    /* renamed from: d */
    int f131352d;

    /* renamed from: e */
    int f131353e;

    /* renamed from: f */
    volatile AtomicReferenceArray f131354f;

    /* renamed from: g */
    final long f131355g;

    /* renamed from: h */
    final ReferenceQueue f131356h;

    /* renamed from: i */
    final ReferenceQueue f131357i;

    /* renamed from: j */
    final Queue f131358j;

    /* renamed from: k */
    final AtomicInteger f131359k = new AtomicInteger();

    /* renamed from: l */
    final Queue f131360l;

    /* renamed from: m */
    final Queue f131361m;

    /* renamed from: n */
    final bmzv f131362n;

    public bnbe(bncb bncb, int i, long j, bmzv bmzv) {
        ReferenceQueue referenceQueue;
        Queue queue;
        Queue queue2;
        this.f131349a = bncb;
        this.f131355g = j;
        bmxy.m108581a(bmzv);
        this.f131362n = bmzv;
        AtomicReferenceArray a = m108809a(i);
        this.f131353e = (a.length() * 3) / 4;
        if (!this.f131349a.mo67093b()) {
            int i2 = this.f131353e;
            if (((long) i2) == this.f131355g) {
                this.f131353e = i2 + 1;
            }
        }
        this.f131354f = a;
        ReferenceQueue referenceQueue2 = null;
        if (bncb.mo67102g()) {
            referenceQueue = new ReferenceQueue();
        } else {
            referenceQueue = null;
        }
        this.f131356h = referenceQueue;
        this.f131357i = bncb.mo67105h() ? new ReferenceQueue() : referenceQueue2;
        if (bncb.mo67099e()) {
            queue = new ConcurrentLinkedQueue();
        } else {
            queue = bncb.f131415t;
        }
        this.f131358j = queue;
        if (bncb.mo67094c()) {
            queue2 = new bnbz();
        } else {
            queue2 = bncb.f131415t;
        }
        this.f131360l = queue2;
        this.f131361m = bncb.mo67099e() ? new bnal() : bncb.f131415t;
    }

    /* renamed from: a */
    static final AtomicReferenceArray m108809a(int i) {
        return new AtomicReferenceArray(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bncc mo67051b(bncc bncc, bncc bncc2) {
        int i = this.f131350b;
        bncc b = bncc2.mo66992b();
        while (bncc != bncc2) {
            bncc a = mo67037a(bncc, b);
            if (a != null) {
                b = a;
            } else {
                mo67055b(bncc);
                i--;
            }
            bncc = bncc.mo66992b();
        }
        this.f131350b = i;
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object mo67057c(bncc bncc, long j) {
        if (bncc.mo66997d() == null) {
            mo67044a();
            return null;
        }
        Object obj = bncc.mo66988a().get();
        if (obj == null) {
            mo67044a();
            return null;
        } else if (!this.f131349a.mo67092a(bncc, j)) {
            return obj;
        } else {
            mo67045a(j);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo67060d() {
        int i;
        AtomicReferenceArray atomicReferenceArray = this.f131354f;
        int length = atomicReferenceArray.length();
        if (length < 1073741824) {
            int i2 = this.f131350b;
            AtomicReferenceArray a = m108809a(length + length);
            this.f131353e = (a.length() * 3) / 4;
            int length2 = a.length() - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bncc bncc = (bncc) atomicReferenceArray.get(i3);
                if (bncc != null) {
                    bncc b = bncc.mo66992b();
                    int c = bncc.mo66995c() & length2;
                    if (b != null) {
                        bncc bncc2 = bncc;
                        while (b != null) {
                            int c2 = b.mo66995c() & length2;
                            if (c2 != c) {
                                i = c2;
                            } else {
                                i = c;
                            }
                            if (c2 != c) {
                                bncc2 = b;
                            }
                            b = b.mo66992b();
                            c = i;
                        }
                        a.set(c, bncc2);
                        while (bncc != bncc2) {
                            int c3 = bncc.mo66995c() & length2;
                            bncc a2 = mo67037a(bncc, (bncc) a.get(c3));
                            if (a2 != null) {
                                a.set(c3, a2);
                            } else {
                                mo67055b(bncc);
                                i2--;
                            }
                            bncc = bncc.mo66992b();
                        }
                    } else {
                        a.set(c, bncc);
                    }
                }
            }
            this.f131354f = a;
            this.f131350b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo67061e() {
        if ((this.f131359k.incrementAndGet() & 63) == 0) {
            mo67059c(this.f131349a.f131430p.mo15379a());
            mo67062f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo67062f() {
        if (!isHeldByCurrentThread()) {
            bncb bncb = this.f131349a;
            while (true) {
                bncf bncf = (bncf) bncb.f131428n.poll();
                if (bncf != null) {
                    try {
                        bncb.f131429o.mo31604a(bncf);
                    } catch (Throwable th) {
                        bncb.f131413a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bncc mo67037a(bncc bncc, bncc bncc2) {
        if (bncc.mo66997d() == null) {
            return null;
        }
        bnbn a = bncc.mo66988a();
        Object obj = a.get();
        if (obj == null && a.mo66975d()) {
            return null;
        }
        bncc a2 = this.f131349a.f131431q.mo67016a(this, bncc, bncc2);
        a2.mo66990a(a.mo66971a(this.f131357i, obj, a2));
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bncc mo67052b(Object obj, int i) {
        AtomicReferenceArray atomicReferenceArray = this.f131354f;
        for (bncc bncc = (bncc) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); bncc != null; bncc = bncc.mo66992b()) {
            if (bncc.mo66995c() == i) {
                Object d = bncc.mo66997d();
                if (d == null) {
                    mo67044a();
                } else if (this.f131349a.f131420f.mo66864b(obj, d)) {
                    return bncc;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bncc mo67038a(bncc bncc, bncc bncc2, Object obj, Object obj2, bnbn bnbn, bncd bncd) {
        mo67049a(obj, obj2, bnbn.mo66970a(), bncd);
        this.f131360l.remove(bncc2);
        this.f131361m.remove(bncc2);
        if (!bnbn.mo66974c()) {
            return mo67051b(bncc, bncc2);
        }
        bnbn.mo66972a(null);
        return bncc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo67058c() {
        while (true) {
            bncc bncc = (bncc) this.f131358j.poll();
            if (bncc == null) {
                return;
            }
            if (this.f131361m.contains(bncc)) {
                this.f131361m.add(bncc);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo67059c(long j) {
        if (tryLock()) {
            try {
                mo67053b();
                mo67054b(j);
                this.f131359k.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bncc mo67039a(Object obj, int i, long j) {
        bncc b = mo67052b(obj, i);
        if (b == null) {
            return null;
        }
        if (!this.f131349a.mo67092a(b, j)) {
            return b;
        }
        mo67045a(j);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bncc mo67040a(Object obj, int i, bncc bncc) {
        bnas bnas = this.f131349a.f131431q;
        bmxy.m108581a(obj);
        return bnas.mo67017a(this, obj, i, bncc);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.f131352d++;
        r13.set(r5, r4.mo67038a(r7, r8, r8.mo66997d(), r8.mo66988a().get(), r8.mo66988a(), p000.bncd.f131438c));
        r4.f131350b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0106, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0115, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011a, code lost:
        r2 = r2 + 1;
     */
    /* renamed from: b */
    public final void mo67053b() {
        int i = 0;
        if (this.f131349a.mo67102g()) {
            int i2 = 0;
            while (true) {
                Reference poll = this.f131356h.poll();
                if (poll == null) {
                    break;
                }
                bncc bncc = (bncc) poll;
                bncb bncb = this.f131349a;
                int c = bncc.mo66995c();
                bnbe a = bncb.mo67089a(c);
                a.lock();
                try {
                    int i3 = a.f131350b;
                    AtomicReferenceArray atomicReferenceArray = a.f131354f;
                    int length = c & (atomicReferenceArray.length() - 1);
                    bncc bncc2 = (bncc) atomicReferenceArray.get(length);
                    bncc bncc3 = bncc2;
                    while (true) {
                        if (bncc3 == null) {
                            break;
                        } else if (bncc3 == bncc) {
                            break;
                        } else {
                            bncc3 = bncc3.mo66992b();
                        }
                    }
                    i2++;
                    if (i2 == 16) {
                        break;
                    }
                } finally {
                    a.unlock();
                    a.mo67062f();
                }
            }
        }
        if (this.f131349a.mo67105h()) {
            do {
                Reference poll2 = this.f131357i.poll();
                if (poll2 != null) {
                    bnbn bnbn = (bnbn) poll2;
                    bncb bncb2 = this.f131349a;
                    bncc b = bnbn.mo66973b();
                    int c2 = b.mo66995c();
                    bnbe a2 = bncb2.mo67089a(c2);
                    Object d = b.mo66997d();
                    a2.lock();
                    try {
                        int i4 = a2.f131350b;
                        AtomicReferenceArray atomicReferenceArray2 = a2.f131354f;
                        int length2 = c2 & (atomicReferenceArray2.length() - 1);
                        bncc bncc4 = (bncc) atomicReferenceArray2.get(length2);
                        for (bncc bncc5 = bncc4; bncc5 != null; bncc5 = bncc5.mo66992b()) {
                            Object d2 = bncc5.mo66997d();
                            if (bncc5.mo66995c() == c2) {
                                if (d2 != null && a2.f131349a.f131420f.mo66864b(d, d2)) {
                                    if (bncc5.mo66988a() == bnbn) {
                                        a2.f131352d++;
                                        atomicReferenceArray2.set(length2, a2.mo67038a(bncc4, bncc5, d2, bnbn.get(), bnbn, bncd.COLLECTED));
                                        a2.f131350b--;
                                    } else {
                                        a2.unlock();
                                    }
                                }
                            }
                        }
                        a2.unlock();
                    } finally {
                        a2.unlock();
                        if (!a2.isHeldByCurrentThread()) {
                            a2.mo67062f();
                        }
                    }
                } else {
                    return;
                }
            } while (i != 16);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo67041a(bncc bncc, Object obj, bnbn bnbn) {
        if (bnbn.mo66974c()) {
            bmxy.m108605b(!Thread.holdsLock(bncc), "Recursive load of: %s", obj);
            Object e = bnbn.mo66976e();
            if (e != null) {
                mo67047a(bncc, this.f131349a.f131430p.mo15379a());
                return e;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("CacheLoader returned null for key ");
            sb.append(valueOf);
            sb.append(".");
            throw new bnab(sb.toString());
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo67042a(Object obj, int i) {
        long a;
        bncc a2;
        try {
            if (!(this.f131350b == 0 || (a2 = mo67039a(obj, i, (a = this.f131349a.f131430p.mo15379a()))) == null)) {
                Object obj2 = a2.mo66988a().get();
                if (obj2 != null) {
                    mo67047a(a2, a);
                    a2.mo66997d();
                    bnac bnac = this.f131349a.f131432r;
                    return obj2;
                }
                mo67044a();
            }
            mo67061e();
            return null;
        } finally {
            mo67061e();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r11 = r5.mo66988a();
        r2 = r11.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r2 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r9.f131352d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r11.mo66975d() != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        mo67048a(r5, r12, r0);
        r10 = r9.f131350b + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        mo67049a(r10, (java.lang.Object) null, r11.mo66970a(), p000.bncd.f131438c);
        mo67048a(r5, r12, r0);
        r10 = r9.f131350b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        r9.f131350b = r10;
        mo67046a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        if (r13 != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        r9.f131352d++;
        mo67049a(r10, r2, r11.mo66970a(), p000.bncd.f131437b);
        mo67048a(r5, r12, r0);
        mo67046a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        unlock();
        mo67062f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        mo67056b(r5, r0);
     */
    /* renamed from: a */
    public final Object mo67043a(Object obj, int i, Object obj2, boolean z) {
        lock();
        try {
            long a = this.f131349a.f131430p.mo15379a();
            mo67059c(a);
            if (this.f131350b + 1 > this.f131353e) {
                mo67060d();
            }
            AtomicReferenceArray atomicReferenceArray = this.f131354f;
            int length = (atomicReferenceArray.length() - 1) & i;
            bncc bncc = (bncc) atomicReferenceArray.get(length);
            bncc bncc2 = bncc;
            while (true) {
                if (bncc2 == null) {
                    this.f131352d++;
                    bncc a2 = mo67040a(obj, i, bncc);
                    mo67048a(a2, obj2, a);
                    atomicReferenceArray.set(length, a2);
                    this.f131350b++;
                    mo67046a(a2);
                    break;
                }
                Object d = bncc2.mo66997d();
                if (bncc2.mo66995c() == i) {
                    if (d != null && this.f131349a.f131420f.mo66864b(obj, d)) {
                        break;
                    }
                }
                bncc2 = bncc2.mo66992b();
            }
            return null;
        } finally {
            unlock();
            mo67062f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo67054b(long j) {
        bncc bncc;
        bncc bncc2;
        mo67058c();
        do {
            bncc = (bncc) this.f131360l.peek();
            if (bncc == null || !this.f131349a.mo67092a(bncc, j)) {
                do {
                    bncc2 = (bncc) this.f131361m.peek();
                    if (bncc2 == null || !this.f131349a.mo67092a(bncc2, j)) {
                        return;
                    }
                } while (mo67050a(bncc2, bncc2.mo66995c(), bncd.EXPIRED));
                throw new AssertionError();
            }
        } while (mo67050a(bncc, bncc.mo66995c(), bncd.EXPIRED));
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo67055b(bncc bncc) {
        Object d = bncc.mo66997d();
        bncc.mo66995c();
        mo67049a(d, bncc.mo66988a().get(), bncc.mo66988a().mo66970a(), bncd.COLLECTED);
        this.f131360l.remove(bncc);
        this.f131361m.remove(bncc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo67056b(bncc bncc, long j) {
        if (this.f131349a.mo67098d()) {
            bncc.mo66989a(j);
        }
        this.f131361m.add(bncc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67044a() {
        if (tryLock()) {
            try {
                mo67053b();
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67045a(long j) {
        if (tryLock()) {
            try {
                mo67054b(j);
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67046a(bncc bncc) {
        if (this.f131349a.mo67091a()) {
            mo67058c();
            if (((long) bncc.mo66988a().mo66970a()) > this.f131355g && !mo67050a(bncc, bncc.mo66995c(), bncd.SIZE)) {
                throw new AssertionError();
            }
            while (this.f131351c > this.f131355g) {
                for (bncc bncc2 : this.f131361m) {
                    if (bncc2.mo66988a().mo66970a() > 0) {
                        if (!mo67050a(bncc2, bncc2.mo66995c(), bncd.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67047a(bncc bncc, long j) {
        if (this.f131349a.mo67098d()) {
            bncc.mo66989a(j);
        }
        this.f131358j.add(bncc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67048a(bncc bncc, Object obj, long j) {
        boolean z;
        bnbn bnbn;
        bnbn a = bncc.mo66988a();
        int a2 = this.f131349a.f131425k.mo66950a();
        if (a2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Weights must be non-negative");
        int ordinal = this.f131349a.f131423i.ordinal();
        if (ordinal == 0) {
            bnbn = a2 != 1 ? new bnbv(obj, a2) : new bnbk(obj);
        } else if (ordinal == 1) {
            bnbn = a2 != 1 ? new bnbu(this.f131357i, obj, bncc, a2) : new bnbf(this.f131357i, obj, bncc);
        } else if (ordinal == 2) {
            bnbn = a2 != 1 ? new bnbw(this.f131357i, obj, bncc, a2) : new bnbs(this.f131357i, obj, bncc);
        } else {
            throw null;
        }
        bncc.mo66990a(bnbn);
        mo67058c();
        this.f131351c += (long) a2;
        if (this.f131349a.mo67098d()) {
            bncc.mo66989a(j);
        }
        if (this.f131349a.mo67101f()) {
            bncc.mo66993b(j);
        }
        this.f131361m.add(bncc);
        this.f131360l.add(bncc);
        a.mo66972a(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67049a(Object obj, Object obj2, int i, bncd bncd) {
        this.f131351c -= (long) i;
        int ordinal = bncd.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
            throw null;
        } else if (this.f131349a.f131428n != bncb.f131415t) {
            this.f131349a.f131428n.offer(new bncf(obj, obj2, bncd));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo67050a(bncc bncc, int i, bncd bncd) {
        AtomicReferenceArray atomicReferenceArray = this.f131354f;
        int length = i & (atomicReferenceArray.length() - 1);
        bncc bncc2 = (bncc) atomicReferenceArray.get(length);
        for (bncc bncc3 = bncc2; bncc3 != null; bncc3 = bncc3.mo66992b()) {
            if (bncc3 == bncc) {
                this.f131352d++;
                bncc a = mo67038a(bncc2, bncc3, bncc3.mo66997d(), bncc3.mo66988a().get(), bncc3.mo66988a(), bncd);
                int i2 = this.f131350b;
                atomicReferenceArray.set(length, a);
                this.f131350b = i2 - 1;
                return true;
            }
        }
        return false;
    }
}
