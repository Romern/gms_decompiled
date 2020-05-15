package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bnlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnlc extends ReentrantLock {

    /* renamed from: a */
    final bnlw f131795a;

    /* renamed from: b */
    volatile int f131796b;

    /* renamed from: c */
    int f131797c;

    /* renamed from: d */
    int f131798d;

    /* renamed from: e */
    volatile AtomicReferenceArray f131799e;

    /* renamed from: f */
    final int f131800f;

    /* renamed from: g */
    final AtomicInteger f131801g;

    public bnlc(bnlw bnlw, int i) {
        this.f131801g = new AtomicInteger();
        this.f131795a = bnlw;
        this.f131800f = -1;
        AtomicReferenceArray a = m109707a(i);
        int length = (a.length() * 3) / 4;
        this.f131798d = length;
        if (length == this.f131800f) {
            this.f131798d = length + 1;
        }
        this.f131799e = a;
    }

    /* renamed from: a */
    static final AtomicReferenceArray m109707a(int i) {
        return new AtomicReferenceArray(i);
    }

    /* renamed from: c */
    static final void m109709c(ReferenceQueue referenceQueue) {
        do {
        } while (referenceQueue.poll() != null);
    }

    /* renamed from: a */
    public void mo67985a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bnkx mo67988b(bnkx bnkx, bnkx bnkx2) {
        int i = this.f131796b;
        bnkx c = bnkx2.mo67951c();
        while (bnkx != bnkx2) {
            bnkx a = mo67982a(bnkx, c);
            if (a != null) {
                c = a;
            } else {
                i--;
            }
            bnkx = bnkx.mo67951c();
        }
        this.f131796b = i;
        return c;
    }

    /* renamed from: b */
    public void mo67989b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo67992d() {
        if ((this.f131801g.incrementAndGet() & 63) == 0) {
            mo67993e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo67993e() {
        if (tryLock()) {
            try {
                mo67985a();
                this.f131801g.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* renamed from: a */
    static boolean m109708a(bnkx bnkx) {
        return bnkx.mo67952d() == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo67991c() {
        if (tryLock()) {
            try {
                mo67985a();
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bnkx mo67982a(bnkx bnkx, bnkx bnkx2) {
        return this.f131795a.f131828f.mo67967a(this, bnkx, bnkx2);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo67990b(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Reference poll = referenceQueue.poll();
            if (poll != null) {
                bnlt bnlt = (bnlt) poll;
                bnlw bnlw = this.f131795a;
                bnkx a = bnlt.mo67945a();
                int b = a.mo67950b();
                bnlc a2 = bnlw.mo68006a(b);
                Object a3 = a.mo67949a();
                a2.lock();
                try {
                    int i2 = a2.f131796b;
                    AtomicReferenceArray atomicReferenceArray = a2.f131799e;
                    int length = (atomicReferenceArray.length() - 1) & b;
                    bnkx bnkx = (bnkx) atomicReferenceArray.get(length);
                    bnkx bnkx2 = bnkx;
                    while (true) {
                        if (bnkx2 == null) {
                            break;
                        }
                        Object a4 = bnkx2.mo67949a();
                        if (bnkx2.mo67950b() == b) {
                            if (a4 != null && a2.f131795a.f131827e.mo66864b(a3, a4)) {
                                if (((bnls) bnkx2).mo67995e() == bnlt) {
                                    a2.f131797c++;
                                    atomicReferenceArray.set(length, a2.mo67988b(bnkx, bnkx2));
                                    a2.f131796b--;
                                }
                            }
                        }
                        bnkx2 = bnkx2.mo67951c();
                    }
                    a2.unlock();
                    i++;
                } catch (Throwable th) {
                    a2.unlock();
                    throw th;
                }
            } else {
                return;
            }
        } while (i != 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bnkx mo67983a(Object obj, int i) {
        if (this.f131796b == 0) {
            return null;
        }
        AtomicReferenceArray atomicReferenceArray = this.f131799e;
        for (bnkx bnkx = (bnkx) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); bnkx != null; bnkx = bnkx.mo67951c()) {
            if (bnkx.mo67950b() == i) {
                Object a = bnkx.mo67949a();
                if (a == null) {
                    mo67991c();
                } else if (this.f131795a.f131827e.mo66864b(obj, a)) {
                    return bnkx;
                }
            }
        }
        return null;
    }

    public bnlc(bnlw bnlw, int i, byte[] bArr) {
        this(bnlw, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo67984a(Object obj, int i, Object obj2, boolean z) {
        int i2;
        Object obj3 = obj;
        int i3 = i;
        Object obj4 = obj2;
        lock();
        try {
            mo67993e();
            int i4 = this.f131796b + 1;
            if (i4 > this.f131798d) {
                AtomicReferenceArray atomicReferenceArray = this.f131799e;
                int length = atomicReferenceArray.length();
                if (length < 1073741824) {
                    int i5 = this.f131796b;
                    AtomicReferenceArray a = m109707a(length + length);
                    this.f131798d = (a.length() * 3) / 4;
                    int length2 = a.length() - 1;
                    for (int i6 = 0; i6 < length; i6++) {
                        bnkx bnkx = (bnkx) atomicReferenceArray.get(i6);
                        if (bnkx != null) {
                            bnkx c = bnkx.mo67951c();
                            int b = bnkx.mo67950b() & length2;
                            if (c != null) {
                                bnkx bnkx2 = bnkx;
                                while (c != null) {
                                    int b2 = c.mo67950b() & length2;
                                    if (b2 != b) {
                                        i2 = b2;
                                    } else {
                                        i2 = b;
                                    }
                                    if (b2 != b) {
                                        bnkx2 = c;
                                    }
                                    c = c.mo67951c();
                                    b = i2;
                                }
                                a.set(b, bnkx2);
                                while (bnkx != bnkx2) {
                                    int b3 = bnkx.mo67950b() & length2;
                                    bnkx a2 = mo67982a(bnkx, (bnkx) a.get(b3));
                                    if (a2 == null) {
                                        i5--;
                                    } else {
                                        a.set(b3, a2);
                                    }
                                    bnkx = bnkx.mo67951c();
                                }
                            } else {
                                a.set(b, bnkx);
                            }
                        }
                    }
                    this.f131799e = a;
                    this.f131796b = i5;
                }
                i4 = this.f131796b + 1;
            }
            AtomicReferenceArray atomicReferenceArray2 = this.f131799e;
            int length3 = (atomicReferenceArray2.length() - 1) & i3;
            bnkx bnkx3 = (bnkx) atomicReferenceArray2.get(length3);
            bnkx bnkx4 = bnkx3;
            while (true) {
                if (bnkx4 == null) {
                    this.f131797c++;
                    bnkx a3 = this.f131795a.f131828f.mo67968a(this, obj3, i3, bnkx3);
                    mo67986a(a3, obj4);
                    atomicReferenceArray2.set(length3, a3);
                    this.f131796b = i4;
                    break;
                }
                Object a4 = bnkx4.mo67949a();
                if (bnkx4.mo67950b() == i3) {
                    if (a4 != null && this.f131795a.f131827e.mo66864b(obj3, a4)) {
                        Object d = bnkx4.mo67952d();
                        if (d == null) {
                            this.f131797c++;
                            mo67986a(bnkx4, obj4);
                            this.f131796b = this.f131796b;
                        } else {
                            if (!z) {
                                this.f131797c++;
                                mo67986a(bnkx4, obj4);
                            }
                            unlock();
                            return d;
                        }
                    }
                }
                bnkx4 = bnkx4.mo67951c();
            }
            return null;
        } finally {
            unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67986a(bnkx bnkx, Object obj) {
        this.f131795a.f131828f.mo67971a(this, bnkx, obj);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.f131797c++;
        r4.set(r3, r2.mo67988b(r5, r6));
        r2.f131796b--;
     */
    /* renamed from: a */
    public final void mo67987a(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Reference poll = referenceQueue.poll();
            if (poll != null) {
                bnkx bnkx = (bnkx) poll;
                bnlw bnlw = this.f131795a;
                int b = bnkx.mo67950b();
                bnlc a = bnlw.mo68006a(b);
                a.lock();
                try {
                    int i2 = a.f131796b;
                    AtomicReferenceArray atomicReferenceArray = a.f131799e;
                    int length = b & (atomicReferenceArray.length() - 1);
                    bnkx bnkx2 = (bnkx) atomicReferenceArray.get(length);
                    bnkx bnkx3 = bnkx2;
                    while (true) {
                        if (bnkx3 == null) {
                            break;
                        } else if (bnkx3 == bnkx) {
                            break;
                        } else {
                            bnkx3 = bnkx3.mo67951c();
                        }
                    }
                    i++;
                } finally {
                    a.unlock();
                }
            } else {
                return;
            }
        } while (i != 16);
    }
}
