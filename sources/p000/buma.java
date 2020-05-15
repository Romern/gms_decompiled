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

/* renamed from: buma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buma extends bfki implements bulx {

    /* renamed from: a */
    public static final buma f154216a = new buma();

    /* renamed from: u */
    private static final short f154217u = m119933a(0);

    /* renamed from: b */
    public short f154218b;

    /* renamed from: c */
    public bulp f154219c;

    /* renamed from: d */
    public bujp f154220d;

    /* renamed from: e */
    public bujt f154221e;

    /* renamed from: f */
    public bulc f154222f;

    /* renamed from: m */
    public bukf f154223m;

    /* renamed from: n */
    public bujy f154224n;

    /* renamed from: o */
    public btzl f154225o;

    /* renamed from: p */
    public btzl f154226p;

    /* renamed from: q */
    public int f154227q;

    /* renamed from: r */
    public boolean f154228r;

    /* renamed from: s */
    public boolean f154229s;

    /* renamed from: t */
    public int f154230t;

    private buma() {
    }

    /* renamed from: a */
    static short m119933a(int i) {
        if (i <= 0) {
            return f154217u;
        }
        int i2 = i - 32768;
        return i2 <= 32767 ? (short) i2 : f154217u;
    }

    /* renamed from: d */
    static long m119936d(long j) {
        return j & 281474960982000L;
    }

    /* renamed from: c */
    public final long mo72838c(long j) {
        return this.f154228r ? m119936d(j) : j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo72846e(long j) {
        return this.f154229s ? m119936d(j) : j;
    }

    /* renamed from: f */
    public final int mo72842f() {
        return this.f154225o.size();
    }

    /* renamed from: a */
    private final void m119934a(bujp bujp, bujt bujt, bulc bulc, bukf bukf, bujy bujy) {
        this.f154219c.f154164e.mo62921a((Runnable) new buly(this, bujp, bujt, bulc, bukf, bujy));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bujp.a(long, boolean):int
     arg types: [long, int]
     candidates:
      bujp.a(java.lang.Object, boolean):java.lang.Object
      buan.a(java.lang.Object, boolean):java.lang.Object
      bujp.a(long, boolean):int */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r6 = r16.mo72806h();
     */
    /* renamed from: b */
    private final void m119935b(bsax bsax, long j, bukj bukj) {
        Set set;
        boolean z;
        bsax bsax2;
        bsax bsax3;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        short b;
        bsax bsax4;
        long a;
        int b2;
        byte round;
        short s;
        short s2;
        int c;
        int i6;
        int i7;
        Set set2;
        bsax bsax5 = bsax;
        bsax.mo70122c();
        int i8 = 1;
        int j2 = bsax5.mo70138j(1);
        int g = j2 - (this.f154222f.mo72567g() - this.f154222f.size());
        if (g <= 0) {
            set = Collections.emptySet();
        } else {
            bukz a2 = this.f154222f.entrySet().iterator();
            set = new HashSet(g);
            while (a2.hasNext() && g > 0) {
                a2.mo72556f();
                set.add(Short.valueOf(a2.mo72806h()));
                g--;
            }
        }
        int j3 = bsax5.mo70138j(1);
        HashSet hashSet = new HashSet(j3);
        for (int i9 = 0; i9 < j3; i9++) {
            try {
                hashSet.add(Long.valueOf(bumd.m119964c(bsax5.mo70121b(1, i9))));
            } catch (Exception e) {
            }
        }
        HashSet hashSet2 = new HashSet();
        if (!hashSet.isEmpty()) {
            bukz a3 = this.f154222f.entrySet().iterator();
            while (a3.hasNext()) {
                a3.mo72556f();
                if (hashSet.contains(Long.valueOf(a3.mo72807i()))) {
                    hashSet2.add((Short) a3.mo72551e());
                }
            }
        }
        HashSet hashSet3 = new HashSet();
        hashSet3.addAll(set);
        hashSet3.addAll(hashSet2);
        int i10 = 4;
        if (!this.f154219c.f154166g.enableFrewleFloorEstimator() || j2 != bsax5.mo70138j(4)) {
            z = false;
        } else {
            z = true;
        }
        int i11 = 3;
        if (z) {
            if (bsax5.mo70135h(4)) {
                i7 = 0;
                i6 = 0;
                for (int i12 = 0; i12 < j2; i12++) {
                    bsax f = bsax5.mo70131f(4, i12);
                    i6 += f.mo70138j(2);
                    i7 += f.mo70138j(3);
                }
            } else {
                i7 = 0;
                i6 = 0;
            }
            int g2 = i6 - (this.f154223m.mo72567g() - this.f154223m.size());
            int g3 = i7 - (this.f154224n.mo72567g() - this.f154224n.size());
            if (g2 <= 0 && g3 <= 0) {
                set2 = Collections.emptySet();
            } else {
                set2 = new HashSet();
                bukc a4 = this.f154223m.entrySet().iterator();
                while (a4.hasNext() && g2 > 0) {
                    a4.mo72556f();
                    set2.add(Short.valueOf(a4.mo72758h()));
                    g2--;
                }
                bujv a5 = this.f154224n.entrySet().iterator();
                while (a5.hasNext() && g3 > 0) {
                    a5.mo72556f();
                    set2.add(Short.valueOf(a5.mo72747h()));
                    g3--;
                }
            }
            hashSet3.addAll(set2);
        }
        mo72845a(hashSet3);
        boolean z5 = this.f154219c.f154166g.elevationFromWifiEnabled() && j2 == bsax5.mo70138j(3);
        int i13 = 0;
        while (i13 < j2) {
            byte[] b3 = bsax5.mo70121b(i8, i13);
            if (z5) {
                bsax2 = bsax5.mo70131f(i11, i13);
            } else {
                bsax2 = null;
            }
            if (z) {
                bsax3 = bsax5.mo70131f(i10, i13);
            } else {
                bsax3 = null;
            }
            try {
                this.f154219c.mo72822b();
                short b4 = (short) bumd.m119961b(b3);
                i = i13;
                try {
                    long c2 = bumd.m119964c(b3);
                    int a6 = bumb.m119952a(bsax2);
                    if (bumc.m119956a(bsax3, bumd.m119966d(b3))) {
                        i5 = bsax3.mo70114b(i10);
                    } else {
                        i5 = 0;
                    }
                    bulc bulc = this.f154222f;
                    bukz a7 = bulc.entrySet().iterator();
                    while (true) {
                        if (!a7.hasNext()) {
                            b = bulc.mo72813b();
                            bulc.f154125a = b;
                            break;
                        }
                        a7.mo72556f();
                        if (c2 == a7.mo72807i()) {
                            try {
                                break;
                            } catch (IllegalStateException e2) {
                                i2 = j2;
                                z2 = z5;
                                this.f154219c.f154178s.mo72712c();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IllegalArgumentException e3) {
                                i2 = j2;
                                z2 = z5;
                                this.f154219c.f154178s.mo72711b();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IndexOutOfBoundsException e4) {
                                i2 = j2;
                                z2 = z5;
                                this.f154219c.f154178s.mo72713d();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            }
                        } else {
                            z5 = z5;
                        }
                    }
                    bulc.mo72811a(b, b4, c2, a6, i5, j);
                    try {
                        bukj.mo72776c(c2);
                        int d = bumd.m119966d(b3);
                        boolean a8 = bumb.m119953a(bsax2, d);
                        boolean a9 = bumc.m119956a(bsax3, d);
                        int i14 = 0;
                        while (i14 < d) {
                            int i15 = d;
                            try {
                                a = bumd.m119960a(b3, i14);
                                b2 = bumd.m119962b(b3, i14);
                                i2 = j2;
                            } catch (IllegalStateException e5) {
                                i2 = j2;
                                z2 = z5;
                                this.f154219c.f154178s.mo72712c();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IllegalArgumentException e6) {
                                i2 = j2;
                                z2 = z5;
                                this.f154219c.f154178s.mo72711b();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IndexOutOfBoundsException e7) {
                                i2 = j2;
                                z2 = z5;
                                this.f154219c.f154178s.mo72713d();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            }
                            try {
                                round = (byte) ((int) Math.round(bumd.m119963c(b3, i14)));
                                z2 = z5;
                            } catch (IllegalStateException e8) {
                                z2 = z5;
                                this.f154219c.f154178s.mo72712c();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IllegalArgumentException e9) {
                                z2 = z5;
                                this.f154219c.f154178s.mo72711b();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IndexOutOfBoundsException e10) {
                                z2 = z5;
                                this.f154219c.f154178s.mo72713d();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            }
                            try {
                                byte round2 = (byte) ((int) Math.round((bumd.m119965d(b3, i14) / 0.01d) - 0.03125d));
                                if (!a8 || !bumb.m119954b(bsax2, i14)) {
                                    s = f154217u;
                                } else {
                                    s = m119933a(bumb.m119955c(bsax2, i14));
                                }
                                if (!a9 || (c = (short) bsax3.mo70123c(1, i14)) == 0) {
                                    s2 = -1;
                                } else {
                                    s2 = (short) (c - 1);
                                }
                                this.f154220d.mo72734a(mo72838c(a), b, b2, round, round2, s, s2);
                                i14++;
                                d = i15;
                                j2 = i2;
                                z5 = z2;
                            } catch (IllegalStateException e11) {
                                this.f154219c.f154178s.mo72712c();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IllegalArgumentException e12) {
                                this.f154219c.f154178s.mo72711b();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IndexOutOfBoundsException e13) {
                                this.f154219c.f154178s.mo72713d();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            }
                        }
                        i2 = j2;
                        z2 = z5;
                    } catch (IllegalStateException e14) {
                        i2 = j2;
                        z2 = z5;
                        this.f154219c.f154178s.mo72712c();
                        this.f154219c.mo72824d();
                        i13 = i + 1;
                        bsax5 = bsax;
                        j2 = i2;
                        z5 = z2;
                        i8 = 1;
                        i10 = 4;
                        i11 = 3;
                    } catch (IllegalArgumentException e15) {
                        i2 = j2;
                        z2 = z5;
                        this.f154219c.f154178s.mo72711b();
                        this.f154219c.mo72824d();
                        i13 = i + 1;
                        bsax5 = bsax;
                        j2 = i2;
                        z5 = z2;
                        i8 = 1;
                        i10 = 4;
                        i11 = 3;
                    } catch (IndexOutOfBoundsException e16) {
                        i2 = j2;
                        z2 = z5;
                        this.f154219c.f154178s.mo72713d();
                        this.f154219c.mo72824d();
                        i13 = i + 1;
                        bsax5 = bsax;
                        j2 = i2;
                        z5 = z2;
                        i8 = 1;
                        i10 = 4;
                        i11 = 3;
                    }
                } catch (IllegalStateException e17) {
                    i3 = j2;
                    z3 = z5;
                    this.f154219c.f154178s.mo72712c();
                    this.f154219c.mo72824d();
                    i13 = i + 1;
                    bsax5 = bsax;
                    j2 = i2;
                    z5 = z2;
                    i8 = 1;
                    i10 = 4;
                    i11 = 3;
                } catch (IllegalArgumentException e18) {
                    i4 = j2;
                    z4 = z5;
                    this.f154219c.f154178s.mo72711b();
                    this.f154219c.mo72824d();
                    i13 = i + 1;
                    bsax5 = bsax;
                    j2 = i2;
                    z5 = z2;
                    i8 = 1;
                    i10 = 4;
                    i11 = 3;
                } catch (IndexOutOfBoundsException e19) {
                    i2 = j2;
                    z2 = z5;
                    this.f154219c.f154178s.mo72713d();
                    this.f154219c.mo72824d();
                    i13 = i + 1;
                    bsax5 = bsax;
                    j2 = i2;
                    z5 = z2;
                    i8 = 1;
                    i10 = 4;
                    i11 = 3;
                }
                try {
                    if (bumc.m119956a(bsax3, bumd.m119966d(b3))) {
                        int j4 = bsax3.mo70138j(2);
                        short s3 = 0;
                        while (s3 < j4) {
                            if (s3 != -1) {
                                bsax4 = bsax3.mo70131f(2, s3);
                            } else {
                                bsax4 = null;
                            }
                            try {
                            } catch (IllegalStateException e20) {
                                this.f154219c.f154178s.mo72712c();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IllegalArgumentException e21) {
                                this.f154219c.f154178s.mo72711b();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IndexOutOfBoundsException e22) {
                                this.f154219c.f154178s.mo72713d();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            }
                            try {
                                this.f154223m.mo72762a(b, s3, bsax4.mo70132f(1), (short) bsax4.mo70114b(2), (short) bsax4.mo70114b(4), bumc.m119957b(bsax4.mo70129e(3), 1), bumc.m119957b(bsax4.mo70129e(3), 2));
                                s3 = (short) (s3 + 1);
                            } catch (IllegalStateException e23) {
                                this.f154219c.f154178s.mo72712c();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IllegalArgumentException e24) {
                                this.f154219c.f154178s.mo72711b();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            } catch (IndexOutOfBoundsException e25) {
                                this.f154219c.f154178s.mo72713d();
                                this.f154219c.mo72824d();
                                i13 = i + 1;
                                bsax5 = bsax;
                                j2 = i2;
                                z5 = z2;
                                i8 = 1;
                                i10 = 4;
                                i11 = 3;
                            }
                        }
                        int i16 = 3;
                        short j5 = (short) bsax3.mo70138j(3);
                        short s4 = 0;
                        while (s4 < j5) {
                            this.f154224n.mo72750a(b, s4, bumc.m119957b(bsax3.mo70131f(i16, s4), 1), bumc.m119957b(bsax3.mo70131f(i16, s4), 2));
                            s4 = (short) (s4 + 1);
                            i16 = 3;
                        }
                    }
                    this.f154219c.mo72823c();
                } catch (IllegalStateException e26) {
                    this.f154219c.f154178s.mo72712c();
                    this.f154219c.mo72824d();
                    i13 = i + 1;
                    bsax5 = bsax;
                    j2 = i2;
                    z5 = z2;
                    i8 = 1;
                    i10 = 4;
                    i11 = 3;
                } catch (IllegalArgumentException e27) {
                    this.f154219c.f154178s.mo72711b();
                    this.f154219c.mo72824d();
                    i13 = i + 1;
                    bsax5 = bsax;
                    j2 = i2;
                    z5 = z2;
                    i8 = 1;
                    i10 = 4;
                    i11 = 3;
                } catch (IndexOutOfBoundsException e28) {
                    this.f154219c.f154178s.mo72713d();
                    this.f154219c.mo72824d();
                    i13 = i + 1;
                    bsax5 = bsax;
                    j2 = i2;
                    z5 = z2;
                    i8 = 1;
                    i10 = 4;
                    i11 = 3;
                }
            } catch (IllegalStateException e29) {
                i3 = j2;
                z3 = z5;
                i = i13;
                this.f154219c.f154178s.mo72712c();
                this.f154219c.mo72824d();
                i13 = i + 1;
                bsax5 = bsax;
                j2 = i2;
                z5 = z2;
                i8 = 1;
                i10 = 4;
                i11 = 3;
            } catch (IllegalArgumentException e30) {
                i4 = j2;
                z4 = z5;
                i = i13;
                this.f154219c.f154178s.mo72711b();
                this.f154219c.mo72824d();
                i13 = i + 1;
                bsax5 = bsax;
                j2 = i2;
                z5 = z2;
                i8 = 1;
                i10 = 4;
                i11 = 3;
            } catch (IndexOutOfBoundsException e31) {
                i2 = j2;
                z2 = z5;
                i = i13;
                this.f154219c.f154178s.mo72713d();
                this.f154219c.mo72824d();
                i13 = i + 1;
                bsax5 = bsax;
                j2 = i2;
                z5 = z2;
                i8 = 1;
                i10 = 4;
                i11 = 3;
            }
            i13 = i + 1;
            bsax5 = bsax;
            j2 = i2;
            z5 = z2;
            i8 = 1;
            i10 = 4;
            i11 = 3;
        }
        int i17 = j2;
        btzj a10 = this.f154226p.iterator();
        while (a10.hasNext()) {
            Long l = (Long) a10.next();
            if (this.f154220d.mo72732a(mo72838c(l.longValue()), false) == -1) {
                short s5 = this.f154218b;
                if (s5 == 0) {
                    bulc bulc2 = this.f154222f;
                    short s6 = bulc2.f154125a;
                    s5 = s6 == 0 ? bulc2.mo72813b() : s6;
                }
                this.f154221e.mo72740a(mo72846e(l.longValue()), s5);
            }
        }
        int i18 = this.f154230t + 1;
        this.f154230t = i18;
        if (i17 > 0 || i18 > 10) {
            mo72839d();
        }
    }

    /* renamed from: d */
    public final void mo72839d() {
        if (this.f114296i) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f154220d.mo72569h() + this.f154221e.mo72584h() + this.f154222f.mo72569h() + this.f154223m.mo72569h() + this.f154224n.mo72569h());
            this.f154220d.mo72534c(allocate);
            this.f154221e.mo72527c(allocate);
            this.f154222f.mo72534c(allocate);
            this.f154223m.mo72534c(allocate);
            this.f154224n.mo72534c(allocate);
            this.f154219c.f154163d.mo62786f().execute(new bulz(this, allocate));
            this.f154230t = 0;
        }
    }

    /* renamed from: e */
    public final boolean mo72841e() {
        return !this.f154225o.isEmpty();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bujp.a(long, boolean):int
     arg types: [long, int]
     candidates:
      bujp.a(java.lang.Object, boolean):java.lang.Object
      buan.a(java.lang.Object, boolean):java.lang.Object
      bujp.a(long, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buks.a(short, boolean):int
     arg types: [short, int]
     candidates:
      buks.a(java.nio.ByteBuffer, buat):buks
      buaq.a(buaq, java.nio.ByteBuffer):void
      buks.a(short, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bulm.a(int, boolean):int
     arg types: [int, int]
     candidates:
      bulm.a(int, buat):bulj
      bulm.a(java.nio.ByteBuffer, buat):bulm
      bulm.a(short, short):int
      buaq.a(buaq, java.nio.ByteBuffer):void
      bulm.a(int, boolean):int */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01c9  */
    /* renamed from: a */
    public final Set mo72829a(bumi bumi, bukm bukm) {
        int i;
        int i2;
        LinkedHashMap linkedHashMap;
        int i3;
        HashMap hashMap;
        buje buje;
        boolean z;
        long j;
        HashMap hashMap2;
        buka buka;
        short s;
        int a;
        short s2;
        bumi bumi2 = bumi;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        HashMap hashMap3 = new HashMap();
        int a2 = bumi.mo72857a();
        int i4 = 0;
        while (i4 < a2) {
            long a3 = bumi2.mo72858a(i4);
            int b = bumi2.mo72860b(i4);
            int c = bumi2.mo72861c(i4);
            float d = bumi2.mo72862d(i4);
            float e = bumi2.mo72863e(i4);
            long c2 = mo72838c(a3);
            float f = (float) b;
            int a4 = this.f154220d.mo72732a(mo72838c(a3), true);
            if (a4 != -1) {
                short b2 = ((bujt) this.f154220d.f153157d).mo72744b(a4);
                int a5 = ((buks) this.f154222f.f153157d).mo72793a(b2, true);
                if (a5 != -1) {
                    this.f154218b = b2;
                    hashMap = hashMap3;
                    i3 = a2;
                    long a6 = bumd.m119959a(this.f154222f.f154127e[a5], this.f154220d.f154040a[a4]);
                    bujp bujp = this.f154220d;
                    linkedHashMap = linkedHashMap2;
                    double d2 = (double) bujp.f154041b[a4];
                    double d3 = (double) bujp.f154042e[a4];
                    Double.isNaN(d3);
                    double d4 = (d3 + 128.0d) * 0.01d;
                    int i5 = this.f154222f.f154128f[a5];
                    short s3 = bujp.f154043f[a4];
                    float f2 = Float.NEGATIVE_INFINITY;
                    if (!(i5 == Integer.MAX_VALUE || (s2 = f154217u) == s3)) {
                        f2 = ((float) (i5 + (s2 != s3 ? s3 + AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT : 0))) / 10.0f;
                    }
                    if (this.f154219c.f154166g.enableFrewleFloorEstimator() && (s = this.f154220d.f154044g[a4]) != -1 && (a = ((bulm) this.f154223m.f153157d).mo72815a(bulm.m119872b(b2, s), true)) != -1) {
                        int a7 = ((bulm) this.f154224n.f153157d).mo72815a(bulm.m119872b(b2, this.f154223m.f154076b[a]), true);
                        if (a7 != -1) {
                            String a8 = this.f154223m.mo72761a(a);
                            bukf bukf = this.f154223m;
                            long j2 = bukf.f154078f[a];
                            long j3 = bukf.f154079g[a];
                            bujy bujy = this.f154224n;
                            buka = new buka(a8, j2, j3, bujy.f154055a[a7], bujy.f154056b[a7]);
                            i2 = i4;
                            z = true;
                            j = a3;
                            i = b;
                            buje = new buje(a3, a6, d2, d4, f2, (double) f, c, d, e, buka);
                            if (buje != null) {
                                Long valueOf = Long.valueOf(c2);
                                linkedHashMap2 = linkedHashMap;
                                if (!linkedHashMap2.containsKey(valueOf)) {
                                    linkedHashMap2.put(valueOf, buje);
                                    hashMap2 = hashMap;
                                } else if (buje.f154013f > ((buje) linkedHashMap2.get(valueOf)).f154013f) {
                                    buje buje2 = (buje) linkedHashMap2.get(valueOf);
                                    bukm.mo72783a(buje2.f154008a, (int) buje2.f154013f, 9, buje2.f154009b, buje2.f154012e, buje2.f154014g, buje2.f154015h, buje2.f154019l);
                                    linkedHashMap2.put(valueOf, buje);
                                    hashMap2 = hashMap;
                                } else {
                                    bukm.mo72783a(buje.f154008a, (int) buje.f154013f, 9, buje.f154009b, buje.f154012e, buje.f154014g, buje.f154015h, buje.f154019l);
                                    hashMap2 = hashMap;
                                }
                            } else {
                                linkedHashMap2 = linkedHashMap;
                                if (this.f154225o.mo72488a(j, z)) {
                                    bukm.mo72783a(j, i, 2, 0, Float.NEGATIVE_INFINITY, c, d, null);
                                    hashMap2 = hashMap;
                                } else if (mo72837b(j)) {
                                    bukm.mo72783a(j, i, 3, 0, Float.NEGATIVE_INFINITY, c, d, null);
                                    hashMap2 = hashMap;
                                } else {
                                    hashMap2 = hashMap;
                                    hashMap2.put(Long.valueOf(j), Integer.valueOf(i2));
                                }
                            }
                            i4 = i2 + 1;
                            bumi2 = bumi;
                            hashMap3 = hashMap2;
                            a2 = i3;
                        }
                    }
                    buka = null;
                    i2 = i4;
                    z = true;
                    j = a3;
                    i = b;
                    buje = new buje(a3, a6, d2, d4, f2, (double) f, c, d, e, buka);
                    if (buje != null) {
                    }
                    i4 = i2 + 1;
                    bumi2 = bumi;
                    hashMap3 = hashMap2;
                    a2 = i3;
                } else {
                    linkedHashMap = linkedHashMap2;
                    hashMap = hashMap3;
                    i3 = a2;
                    i2 = i4;
                    j = a3;
                    i = b;
                    z = true;
                    hashSet.add(Short.valueOf(b2));
                }
            } else {
                linkedHashMap = linkedHashMap2;
                hashMap = hashMap3;
                i3 = a2;
                i2 = i4;
                j = a3;
                i = b;
                z = true;
            }
            buje = null;
            if (buje != null) {
            }
            i4 = i2 + 1;
            bumi2 = bumi;
            hashMap3 = hashMap2;
            a2 = i3;
        }
        int size = linkedHashMap2.size();
        int i6 = this.f154227q;
        for (Map.Entry entry : hashMap3.entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            int intValue = ((Integer) entry.getValue()).intValue();
            int b3 = bumi.mo72860b(intValue);
            int c3 = bumi.mo72861c(intValue);
            float d5 = bumi.mo72862d(intValue);
            bumi.mo72863e(intValue);
            if (size <= i6) {
                this.f154225o.mo72487a(longValue);
                bukm.mo72783a(longValue, b3, 4, 0, Float.NEGATIVE_INFINITY, c3, d5, null);
            } else {
                bukm.mo72783a(longValue, b3, 8, 0, Float.NEGATIVE_INFINITY, c3, d5, null);
            }
        }
        mo72845a(hashSet);
        double size2 = (double) this.f154220d.size();
        Double.isNaN(size2);
        double g = (double) this.f154220d.mo72567g();
        Double.isNaN(g);
        buit.m119578a((size2 * 100.0d) / g);
        double size3 = (double) this.f154221e.size();
        Double.isNaN(size3);
        double g2 = (double) this.f154221e.mo72583g();
        Double.isNaN(g2);
        buit.m119578a((size3 * 100.0d) / g2);
        double size4 = (double) this.f154222f.size();
        Double.isNaN(size4);
        double g3 = (double) this.f154222f.mo72567g();
        Double.isNaN(g3);
        buit.m119578a((size4 * 100.0d) / g3);
        return new HashSet(linkedHashMap2.values());
    }

    /* renamed from: a */
    public final void mo72830a() {
        super.mo61835b();
        this.f154220d.clear();
        this.f154221e.clear();
        this.f154222f.clear();
        this.f154223m.clear();
        this.f154224n.clear();
        this.f154226p.clear();
        this.f154225o.clear();
    }

    /* renamed from: a */
    public final void mo72831a(long j) {
        HashSet hashSet = new HashSet();
        bukz a = this.f154222f.entrySet().iterator();
        while (a.hasNext()) {
            a.mo72556f();
            if (a.mo72808j() < j) {
                hashSet.add(Short.valueOf(a.mo72806h()));
                a.remove();
            }
        }
        mo72845a(hashSet);
    }

    /* renamed from: a */
    public final void mo72832a(bsax bsax) {
        if (bsax.mo70137i(78)) {
            this.f154227q = bsax.mo70114b(78);
        }
        if (bsax.mo70137i(74)) {
            this.f154229s = bsax.mo70113a(74);
        }
        if (bsax.mo70137i(73)) {
            this.f154228r = bsax.mo70113a(73);
        }
    }

    /* renamed from: a */
    public final void mo72833a(bsax bsax, long j, bukj bukj) {
        m119935b(bsax, j, bukj);
        bukj.mo72777d((long) this.f154225o.size());
        this.f154225o.clear();
    }

    /* renamed from: a */
    public final void mo72834a(PrintWriter printWriter) {
        printWriter.print("frewleTileCacheManager{downloadqueue=[");
        btzj a = this.f154225o.iterator();
        while (a.hasNext()) {
            printWriter.printf("%012X, ", (Long) a.next());
        }
        printWriter.print("]; numMacsInCache=");
        printWriter.print(this.f154220d.size());
        printWriter.print("; numUninformativeMacAddresses=");
        printWriter.print(this.f154221e.size());
        printWriter.print("; nibbleModel=");
        printWriter.print(this.f154228r ? 1 : 0);
        printWriter.print("; nibbleUninform=");
        printWriter.print(this.f154229s ? 1 : 0);
        printWriter.print("; tilesInCache=[");
        bukz a2 = this.f154222f.entrySet().iterator();
        while (a2.hasNext()) {
            a2.mo72556f();
            printWriter.printf("0x%016x, ", Long.valueOf(a2.mo72807i()));
        }
        printWriter.println("]}");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72845a(Set set) {
        if (!set.isEmpty()) {
            bujm a = this.f154220d.entrySet().iterator();
            while (a.hasNext()) {
                a.mo72556f();
                if (set.contains(Short.valueOf(a.mo72730h()))) {
                    a.remove();
                }
            }
            bujr a2 = this.f154221e.iterator();
            while (a2.hasNext()) {
                a2.mo72576c();
                if (set.contains(Short.valueOf(a2.mo72737f()))) {
                    a2.remove();
                }
            }
            bukc a3 = this.f154223m.entrySet().iterator();
            while (a3.hasNext()) {
                a3.mo72556f();
                if (set.contains(Short.valueOf(a3.mo72758h()))) {
                    a3.remove();
                }
            }
            bujv a4 = this.f154224n.entrySet().iterator();
            while (a4.hasNext()) {
                a4.mo72556f();
                if (set.contains(Short.valueOf(a4.mo72747h()))) {
                    a4.remove();
                }
            }
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: bulc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: bulc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: bulc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: bukf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: bukf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: bukf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: bulc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: bulc} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo61401a(byte[] bArr) {
        bukf bukf;
        bulc bulc;
        bujt bujt;
        bujp bujp;
        bukf bukf2;
        bulc bulc2;
        bujt bujt2;
        bukf bukf3;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        bujp bujp2 = null;
        try {
            bujp bujp3 = new bujp();
            buan.m119156a(bujp3, bujt.m119653a(wrap, bujp3.f153156c), wrap);
            try {
                bujt2 = bujt.m119657d(wrap);
                try {
                    bulc2 = new bulc();
                    buan.m119156a(bulc2, buks.m119762a(wrap, bulc2.f153156c), wrap);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e) {
                    e = e;
                    bukf3 = null;
                    bukf2 = bukf3;
                    bulc2 = bukf3;
                    bujp2 = bujp3;
                    bulc2 = bulc2;
                    try {
                        throw new IOException(e);
                    } catch (Throwable th) {
                        th = th;
                        bujp = bujp2;
                        bujt = bujt2;
                        bulc = bulc2;
                        bukf = bukf2;
                        m119934a(bujp, bujt, bulc, bukf, null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bukf = null;
                    bujp = bujp3;
                    bujt = bujt2;
                    bulc = null;
                    m119934a(bujp, bujt, bulc, bukf, null);
                    throw th;
                }
                try {
                    bukf2 = new bukf(this.f154219c.f154166g.throwIllegalArgExceptionOnUnsupportedEncoding());
                    buan.m119156a(bukf2, bulm.m119871a(wrap, bukf2.f153156c), wrap);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e2) {
                    e = e2;
                    bukf2 = null;
                    bujp2 = bujp3;
                    bulc2 = bulc2;
                    throw new IOException(e);
                } catch (Throwable th3) {
                    th = th3;
                    bujp = bujp3;
                    bujt = bujt2;
                    bulc = bulc2;
                    bukf = null;
                    m119934a(bujp, bujt, bulc, bukf, null);
                    throw th;
                }
                try {
                    bujy bujy = new bujy();
                    buan.m119156a(bujy, bulm.m119871a(wrap, bujy.f153156c), wrap);
                    m119934a(bujp3, bujt2, bulc2, bukf2, bujy);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e3) {
                    e = e3;
                    bujp2 = bujp3;
                    bulc2 = bulc2;
                    throw new IOException(e);
                } catch (Throwable th4) {
                    th = th4;
                    bujp = bujp3;
                    bujt = bujt2;
                    bulc = bulc2;
                    bukf = bukf2;
                    m119934a(bujp, bujt, bulc, bukf, null);
                    throw th;
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e4) {
                e = e4;
                bujt2 = null;
                bukf3 = null;
                bukf2 = bukf3;
                bulc2 = bukf3;
                bujp2 = bujp3;
                bulc2 = bulc2;
                throw new IOException(e);
            } catch (Throwable th5) {
                th = th5;
                bulc = null;
                bukf = null;
                bujp = bujp3;
                bujt = null;
                m119934a(bujp, bujt, bulc, bukf, null);
                throw th;
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e5) {
            e = e5;
            bujt2 = null;
            bulc2 = null;
            bukf2 = null;
            throw new IOException(e);
        } catch (Throwable th6) {
            th = th6;
            bujp = null;
            bujt = null;
            bulc = null;
            bukf = null;
            m119934a(bujp, bujt, bulc, bukf, null);
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo72836b(bsax bsax) {
        btzj a = this.f154225o.iterator();
        this.f154226p.clear();
        while (a.hasNext()) {
            a.mo72576c();
            bsax.mo70106a(1, a.mo72478a());
            this.f154226p.mo72487a(a.mo72478a());
        }
        this.f154226p.size();
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
        return this.f154221e.mo72741a(mo72846e(j), true);
    }
}
