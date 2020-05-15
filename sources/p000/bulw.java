package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bulw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bulw extends bfki implements bulx {

    /* renamed from: a */
    public static final bulw f154195a = new bulw();

    /* renamed from: s */
    private static final short f154196s = m119902a(0);

    /* renamed from: b */
    public short f154197b;

    /* renamed from: c */
    public bulp f154198c;

    /* renamed from: d */
    public bujk f154199d;

    /* renamed from: e */
    public bujt f154200e;

    /* renamed from: f */
    public bukx f154201f;

    /* renamed from: m */
    public btzl f154202m;

    /* renamed from: n */
    public btzl f154203n;

    /* renamed from: o */
    public int f154204o;

    /* renamed from: p */
    public boolean f154205p;

    /* renamed from: q */
    public boolean f154206q;

    /* renamed from: r */
    public int f154207r;

    private bulw() {
    }

    /* renamed from: a */
    static short m119902a(int i) {
        if (i <= 0) {
            return f154196s;
        }
        int i2 = i - 32768;
        return i2 <= 32767 ? (short) i2 : f154196s;
    }

    /* renamed from: d */
    static long m119905d(long j) {
        return j & 281474960982000L;
    }

    /* renamed from: c */
    public final long mo72838c(long j) {
        return this.f154205p ? m119905d(j) : j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo72840e(long j) {
        return this.f154206q ? m119905d(j) : j;
    }

    /* renamed from: f */
    public final int mo72842f() {
        return this.f154202m.size();
    }

    /* renamed from: a */
    private final void m119903a(bujk bujk, bujt bujt, bukx bukx) {
        this.f154198c.f154164e.mo62921a((Runnable) new bulu(this, bujk, bujt, bukx));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bujk.a(long, boolean):int
     arg types: [long, int]
     candidates:
      bujk.a(java.lang.Object, boolean):java.lang.Object
      buan.a(java.lang.Object, boolean):java.lang.Object
      bujk.a(long, boolean):int */
    /* renamed from: b */
    private final void m119904b(bsax bsax, long j, bukj bukj) {
        Set set;
        bsax bsax2;
        int i;
        boolean z;
        short b;
        short s;
        bsax bsax3;
        bsax bsax4 = bsax;
        bsax.mo70122c();
        int i2 = 1;
        int j2 = bsax4.mo70138j(1);
        int g = j2 - (this.f154201f.mo72567g() - this.f154201f.size());
        if (g <= 0) {
            set = Collections.emptySet();
        } else {
            buku a = this.f154201f.entrySet().iterator();
            set = new HashSet(g);
            while (a.hasNext() && g > 0) {
                a.mo72556f();
                set.add(Short.valueOf(a.mo72797h()));
                g--;
            }
        }
        int j3 = bsax4.mo70138j(1);
        HashSet hashSet = new HashSet(j3);
        for (int i3 = 0; i3 < j3; i3++) {
            try {
                hashSet.add(Long.valueOf(bumd.m119964c(bsax4.mo70121b(1, i3))));
            } catch (Exception e) {
            }
        }
        HashSet hashSet2 = new HashSet();
        if (!hashSet.isEmpty()) {
            buku a2 = this.f154201f.entrySet().iterator();
            while (a2.hasNext()) {
                a2.mo72556f();
                if (hashSet.contains(Long.valueOf(a2.mo72798i()))) {
                    hashSet2.add((Short) a2.mo72551e());
                }
            }
        }
        HashSet hashSet3 = new HashSet();
        hashSet3.addAll(set);
        hashSet3.addAll(hashSet2);
        mo72835a(hashSet3);
        int i4 = 3;
        boolean z2 = this.f154198c.f154166g.elevationFromWifiEnabled() && j2 == bsax4.mo70138j(3);
        int i5 = 0;
        while (i5 < j2) {
            byte[] b2 = bsax4.mo70121b(i2, i5);
            if (z2) {
                bsax2 = bsax4.mo70131f(i4, i5);
            } else {
                bsax2 = null;
            }
            try {
                this.f154198c.mo72822b();
                int b3 = bumd.m119961b(b2);
                long c = bumd.m119964c(b2);
                int a3 = bumb.m119952a(bsax2);
                bukx bukx = this.f154201f;
                short s2 = (short) b3;
                buku a4 = bukx.entrySet().iterator();
                while (true) {
                    if (!a4.hasNext()) {
                        b = bukx.mo72804b();
                        bukx.f154111a = b;
                        break;
                    }
                    a4.mo72556f();
                    if (c == a4.mo72798i()) {
                        b = a4.mo72797h();
                        break;
                    }
                    i = j2;
                }
                long j4 = c;
                bukx.mo72802a(b, s2, c, a3, j);
                try {
                    bukj.mo72776c(j4);
                    int d = bumd.m119966d(b2);
                    boolean a5 = bumb.m119953a(bsax2, d);
                    int i6 = 0;
                    while (i6 < d) {
                        z = z2;
                        try {
                            long a6 = bumd.m119960a(b2, i6);
                            int b4 = bumd.m119962b(b2, i6);
                            i = j2;
                            try {
                                byte round = (byte) ((int) Math.round(bumd.m119963c(b2, i6)));
                                bsax bsax5 = bsax2;
                                byte round2 = (byte) ((int) Math.round((bumd.m119965d(b2, i6) / 0.01d) - 0.03125d));
                                if (a5) {
                                    bsax3 = bsax5;
                                    if (bumb.m119954b(bsax3, i6)) {
                                        s = m119902a(bumb.m119955c(bsax3, i6));
                                        this.f154199d.mo72728a(mo72838c(a6), b, b4, round, round2, s);
                                        i6++;
                                        z2 = z;
                                        j2 = i;
                                    }
                                } else {
                                    bsax3 = bsax5;
                                }
                                s = f154196s;
                                this.f154199d.mo72728a(mo72838c(a6), b, b4, round, round2, s);
                                i6++;
                                z2 = z;
                                j2 = i;
                            } catch (IllegalStateException e2) {
                                this.f154198c.f154178s.mo72712c();
                                this.f154198c.mo72824d();
                                i5++;
                                z2 = z;
                                j2 = i;
                                i2 = 1;
                                i4 = 3;
                            } catch (IllegalArgumentException e3) {
                                this.f154198c.f154178s.mo72711b();
                                this.f154198c.mo72824d();
                                i5++;
                                z2 = z;
                                j2 = i;
                                i2 = 1;
                                i4 = 3;
                            } catch (IndexOutOfBoundsException e4) {
                                this.f154198c.f154178s.mo72713d();
                                this.f154198c.mo72824d();
                                i5++;
                                z2 = z;
                                j2 = i;
                                i2 = 1;
                                i4 = 3;
                            }
                        } catch (IllegalStateException e5) {
                            i = j2;
                            this.f154198c.f154178s.mo72712c();
                            this.f154198c.mo72824d();
                            i5++;
                            z2 = z;
                            j2 = i;
                            i2 = 1;
                            i4 = 3;
                        } catch (IllegalArgumentException e6) {
                            i = j2;
                            this.f154198c.f154178s.mo72711b();
                            this.f154198c.mo72824d();
                            i5++;
                            z2 = z;
                            j2 = i;
                            i2 = 1;
                            i4 = 3;
                        } catch (IndexOutOfBoundsException e7) {
                            i = j2;
                            this.f154198c.f154178s.mo72713d();
                            this.f154198c.mo72824d();
                            i5++;
                            z2 = z;
                            j2 = i;
                            i2 = 1;
                            i4 = 3;
                        }
                    }
                    i = j2;
                    z = z2;
                    this.f154198c.mo72823c();
                } catch (IllegalStateException e8) {
                    i = j2;
                    z = z2;
                    this.f154198c.f154178s.mo72712c();
                    this.f154198c.mo72824d();
                    i5++;
                    z2 = z;
                    j2 = i;
                    i2 = 1;
                    i4 = 3;
                } catch (IllegalArgumentException e9) {
                    i = j2;
                    z = z2;
                    this.f154198c.f154178s.mo72711b();
                    this.f154198c.mo72824d();
                    i5++;
                    z2 = z;
                    j2 = i;
                    i2 = 1;
                    i4 = 3;
                } catch (IndexOutOfBoundsException e10) {
                    i = j2;
                    z = z2;
                    this.f154198c.f154178s.mo72713d();
                    this.f154198c.mo72824d();
                    i5++;
                    z2 = z;
                    j2 = i;
                    i2 = 1;
                    i4 = 3;
                }
            } catch (IllegalStateException e11) {
                i = j2;
                z = z2;
                this.f154198c.f154178s.mo72712c();
                this.f154198c.mo72824d();
                i5++;
                z2 = z;
                j2 = i;
                i2 = 1;
                i4 = 3;
            } catch (IllegalArgumentException e12) {
                i = j2;
                z = z2;
                this.f154198c.f154178s.mo72711b();
                this.f154198c.mo72824d();
                i5++;
                z2 = z;
                j2 = i;
                i2 = 1;
                i4 = 3;
            } catch (IndexOutOfBoundsException e13) {
                i = j2;
                z = z2;
                this.f154198c.f154178s.mo72713d();
                this.f154198c.mo72824d();
                i5++;
                z2 = z;
                j2 = i;
                i2 = 1;
                i4 = 3;
            }
            i5++;
            z2 = z;
            j2 = i;
            i2 = 1;
            i4 = 3;
        }
        int i7 = j2;
        btzj a7 = this.f154203n.iterator();
        while (a7.hasNext()) {
            Long l = (Long) a7.next();
            if (this.f154199d.mo72726a(mo72838c(l.longValue()), false) == -1) {
                short s3 = this.f154197b;
                if (s3 == 0) {
                    bukx bukx2 = this.f154201f;
                    short s4 = bukx2.f154111a;
                    s3 = s4 == 0 ? bukx2.mo72804b() : s4;
                }
                this.f154200e.mo72740a(mo72840e(l.longValue()), s3);
            }
        }
        int i8 = this.f154207r + 1;
        this.f154207r = i8;
        if (i7 > 0 || i8 > 10) {
            mo72839d();
        }
    }

    /* renamed from: d */
    public final void mo72839d() {
        if (this.f114296i) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f154199d.mo72569h() + this.f154200e.mo72584h() + this.f154201f.mo72569h());
            this.f154199d.mo72534c(allocate);
            this.f154200e.mo72527c(allocate);
            this.f154201f.mo72534c(allocate);
            this.f154198c.f154163d.mo62786f().execute(new bulv(this, allocate));
            this.f154207r = 0;
        }
    }

    /* renamed from: e */
    public final boolean mo72841e() {
        return !this.f154202m.isEmpty();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bujk.a(long, boolean):int
     arg types: [long, int]
     candidates:
      bujk.a(java.lang.Object, boolean):java.lang.Object
      buan.a(java.lang.Object, boolean):java.lang.Object
      bujk.a(long, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buks.a(short, boolean):int
     arg types: [short, int]
     candidates:
      buks.a(java.nio.ByteBuffer, buat):buks
      buaq.a(buaq, java.nio.ByteBuffer):void
      buks.a(short, boolean):int */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x015e  */
    /* renamed from: a */
    public final Set mo72829a(bumi bumi, bukm bukm) {
        int i;
        long j;
        int i2;
        HashMap hashMap;
        buje buje;
        boolean z;
        HashMap hashMap2;
        float f;
        short s;
        bumi bumi2 = bumi;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        HashMap hashMap3 = new HashMap();
        int a = bumi.mo72857a();
        int i3 = 0;
        while (i3 < a) {
            long a2 = bumi2.mo72858a(i3);
            int b = bumi2.mo72860b(i3);
            int c = bumi2.mo72861c(i3);
            float d = bumi2.mo72862d(i3);
            float e = bumi2.mo72863e(i3);
            long c2 = mo72838c(a2);
            float f2 = (float) b;
            int a3 = this.f154199d.mo72726a(mo72838c(a2), true);
            if (a3 != -1) {
                short b2 = ((bujt) this.f154199d.f153157d).mo72744b(a3);
                int a4 = ((buks) this.f154201f.f153157d).mo72793a(b2, true);
                if (a4 != -1) {
                    this.f154197b = b2;
                    long j2 = a2;
                    long a5 = bumd.m119959a(this.f154201f.f154113e[a4], this.f154199d.f154027a[a3]);
                    bujk bujk = this.f154199d;
                    int i4 = b;
                    double d2 = (double) bujk.f154028b[a3];
                    hashMap = hashMap3;
                    i2 = a;
                    double d3 = (double) bujk.f154029e[a3];
                    Double.isNaN(d3);
                    double d4 = (d3 + 128.0d) * 0.01d;
                    int i5 = this.f154201f.f154114f[a4];
                    short s2 = bujk.f154030f[a3];
                    if (i5 == Integer.MAX_VALUE || (s = f154196s) == s2) {
                        f = Float.NEGATIVE_INFINITY;
                    } else {
                        f = ((float) (i5 + (s != s2 ? s2 + AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT : 0))) / 10.0f;
                    }
                    z = true;
                    j = j2;
                    i = i4;
                    buje = new buje(j2, a5, d2, d4, f, (double) f2, c, d, e);
                    if (buje == null) {
                        Long valueOf = Long.valueOf(c2);
                        if (!linkedHashMap.containsKey(valueOf)) {
                            linkedHashMap.put(valueOf, buje);
                            hashMap2 = hashMap;
                        } else if (buje.f154013f > ((buje) linkedHashMap.get(valueOf)).f154013f) {
                            buje buje2 = (buje) linkedHashMap.get(valueOf);
                            bukm.mo72783a(buje2.f154008a, (int) buje2.f154013f, 9, buje2.f154009b, buje2.f154012e, buje2.f154014g, buje2.f154015h, buje2.f154019l);
                            linkedHashMap.put(valueOf, buje);
                            hashMap2 = hashMap;
                        } else {
                            bukm.mo72783a(buje.f154008a, (int) buje.f154013f, 9, buje.f154009b, buje.f154012e, buje.f154014g, buje.f154015h, buje.f154019l);
                            hashMap2 = hashMap;
                        }
                    } else {
                        long j3 = j;
                        if (this.f154202m.mo72488a(j3, z)) {
                            bukm.mo72783a(j3, i, 2, 0, Float.NEGATIVE_INFINITY, c, d, null);
                            hashMap2 = hashMap;
                        } else if (mo72837b(j3)) {
                            bukm.mo72783a(j3, i, 3, 0, Float.NEGATIVE_INFINITY, c, d, null);
                            hashMap2 = hashMap;
                        } else {
                            hashMap2 = hashMap;
                            hashMap2.put(Long.valueOf(j3), Integer.valueOf(i3));
                        }
                    }
                    i3++;
                    bumi2 = bumi;
                    hashMap3 = hashMap2;
                    a = i2;
                } else {
                    hashMap = hashMap3;
                    i2 = a;
                    j = a2;
                    i = b;
                    z = true;
                    hashSet.add(Short.valueOf(b2));
                }
            } else {
                hashMap = hashMap3;
                i2 = a;
                j = a2;
                i = b;
                z = true;
            }
            buje = null;
            if (buje == null) {
            }
            i3++;
            bumi2 = bumi;
            hashMap3 = hashMap2;
            a = i2;
        }
        int size = linkedHashMap.size();
        int i6 = this.f154204o;
        for (Map.Entry entry : hashMap3.entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            int intValue = ((Integer) entry.getValue()).intValue();
            int b3 = bumi.mo72860b(intValue);
            int c3 = bumi.mo72861c(intValue);
            float d5 = bumi.mo72862d(intValue);
            bumi.mo72863e(intValue);
            if (size <= i6) {
                this.f154202m.mo72487a(longValue);
                bukm.mo72783a(longValue, b3, 4, 0, Float.NEGATIVE_INFINITY, c3, d5, null);
            } else {
                bukm.mo72783a(longValue, b3, 8, 0, Float.NEGATIVE_INFINITY, c3, d5, null);
            }
        }
        mo72835a(hashSet);
        double size2 = (double) this.f154199d.size();
        Double.isNaN(size2);
        double g = (double) this.f154199d.mo72567g();
        Double.isNaN(g);
        buit.m119578a((size2 * 100.0d) / g);
        double size3 = (double) this.f154200e.size();
        Double.isNaN(size3);
        double g2 = (double) this.f154200e.mo72583g();
        Double.isNaN(g2);
        buit.m119578a((size3 * 100.0d) / g2);
        double size4 = (double) this.f154201f.size();
        Double.isNaN(size4);
        double g3 = (double) this.f154201f.mo72567g();
        Double.isNaN(g3);
        buit.m119578a((size4 * 100.0d) / g3);
        return new HashSet(linkedHashMap.values());
    }

    /* renamed from: a */
    public final void mo72830a() {
        super.mo61835b();
        this.f154199d.clear();
        this.f154200e.clear();
        this.f154201f.clear();
        this.f154203n.clear();
        this.f154202m.clear();
    }

    /* renamed from: a */
    public final void mo72831a(long j) {
        HashSet hashSet = new HashSet();
        buku a = this.f154201f.entrySet().iterator();
        while (a.hasNext()) {
            a.mo72556f();
            if (a.mo72799j() < j) {
                hashSet.add(Short.valueOf(a.mo72797h()));
                a.remove();
            }
        }
        mo72835a(hashSet);
    }

    /* renamed from: b */
    public final void mo72836b(bsax bsax) {
        btzj a = this.f154202m.iterator();
        this.f154203n.clear();
        while (a.hasNext()) {
            a.mo72576c();
            bsax.mo70106a(1, a.mo72478a());
            this.f154203n.mo72487a(a.mo72478a());
        }
        this.f154203n.size();
    }

    /* renamed from: a */
    public final void mo72832a(bsax bsax) {
        if (bsax.mo70137i(78)) {
            this.f154204o = bsax.mo70114b(78);
        }
        if (bsax.mo70137i(74)) {
            this.f154206q = bsax.mo70113a(74);
        }
        if (bsax.mo70137i(73)) {
            this.f154205p = bsax.mo70113a(73);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bujt.a(long, boolean):boolean
     arg types: [long, int]
     candidates:
      bujt.a(int, buat):bujq
      bujt.a(java.nio.ByteBuffer, buat):bujt
      bujt.a(long, short):boolean
      buaq.a(buaq, java.nio.ByteBuffer):void
      bujt.a(long, boolean):boolean */
    /* renamed from: b */
    public final boolean mo72837b(long j) {
        return this.f154200e.mo72741a(mo72840e(j), true);
    }

    /* renamed from: a */
    public final void mo72833a(bsax bsax, long j, bukj bukj) {
        m119904b(bsax, j, bukj);
        bukj.mo72777d((long) this.f154202m.size());
        this.f154202m.clear();
    }

    /* renamed from: a */
    public final void mo72834a(PrintWriter printWriter) {
        printWriter.print("frewleTileCacheManager{downloadqueue=[");
        btzj a = this.f154202m.iterator();
        while (a.hasNext()) {
            printWriter.printf("%012X, ", (Long) a.next());
        }
        printWriter.print("]; numMacsInCache=");
        printWriter.print(this.f154199d.size());
        printWriter.print("; numUninformativeMacAddresses=");
        printWriter.print(this.f154200e.size());
        printWriter.print("; nibbleModel=");
        printWriter.print(this.f154205p ? 1 : 0);
        printWriter.print("; nibbleUninform=");
        printWriter.print(this.f154206q ? 1 : 0);
        printWriter.print("; tilesInCache=[");
        buku a2 = this.f154201f.entrySet().iterator();
        while (a2.hasNext()) {
            a2.mo72556f();
            printWriter.printf("0x%016x, ", Long.valueOf(a2.mo72798i()));
        }
        printWriter.println("]}");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72835a(Set set) {
        if (!set.isEmpty()) {
            bujh a = this.f154199d.entrySet().iterator();
            while (a.hasNext()) {
                a.mo72556f();
                if (set.contains(Short.valueOf(a.mo72724h()))) {
                    a.remove();
                }
            }
            bujr a2 = this.f154200e.iterator();
            while (a2.hasNext()) {
                a2.mo72576c();
                if (set.contains(Short.valueOf(a2.mo72737f()))) {
                    a2.remove();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61401a(byte[] bArr) {
        bujt bujt;
        bujk bujk;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        try {
            bujk = new bujk();
            buan.m119156a(bujk, bujt.m119653a(wrap, bujk.f153156c), wrap);
            try {
                bujt = bujt.m119657d(wrap);
                try {
                    bukx bukx = new bukx();
                    buan.m119156a(bukx, buks.m119762a(wrap, bukx.f153156c), wrap);
                    m119903a(bujk, bujt, bukx);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e) {
                    e = e;
                    try {
                        throw new IOException(e);
                    } catch (Throwable th) {
                        th = th;
                        m119903a(bujk, bujt, (bukx) null);
                        throw th;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e2) {
                e = e2;
                bujt = null;
                throw new IOException(e);
            } catch (Throwable th2) {
                th = th2;
                bujt = null;
                m119903a(bujk, bujt, (bukx) null);
                throw th;
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e3) {
            e = e3;
            bujk = null;
            bujt = null;
            throw new IOException(e);
        } catch (Throwable th3) {
            th = th3;
            bujk = null;
            bujt = null;
            m119903a(bujk, bujt, (bukx) null);
            throw th;
        }
    }
}
