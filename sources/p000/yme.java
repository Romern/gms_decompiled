package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: yme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yme extends yks {

    /* renamed from: a */
    public static final /* synthetic */ int f54078a = 0;

    /* renamed from: j */
    private static final bnhe f54079j = bnhe.m109411a("walking", 3, "running", 3, "biking", 5, "in_vehicle", 5);

    /* renamed from: b */
    private final ynn f54080b;

    /* renamed from: c */
    private final long f54081c;

    /* renamed from: d */
    private final long f54082d;

    /* renamed from: e */
    private final long f54083e;

    /* renamed from: f */
    private final bnhe f54084f;

    /* renamed from: g */
    private final ygz f54085g;

    /* renamed from: h */
    private final ygz f54086h;

    /* renamed from: i */
    private final long f54087i;

    /* renamed from: k */
    private final btwy f54088k;

    public yme(ymd ymd) {
        ynn ynn = ymd.f54070a;
        bmxy.m108581a(ynn);
        this.f54080b = ynn;
        btwy btwy = ymd.f54077h;
        bmxy.m108581a(btwy);
        this.f54088k = btwy;
        bmxy.m108581a(ymd.f54075f);
        this.f54081c = TimeUnit.SECONDS.toNanos(ymd.f54071b);
        this.f54082d = TimeUnit.SECONDS.toNanos(ymd.f54072c);
        this.f54083e = TimeUnit.SECONDS.toNanos(ymd.f54073d);
        this.f54084f = bnhe.m109413a(ymd.f54074e);
        this.f54087i = ymd.f54076g;
        bmxv c = bmxv.m108567c(null);
        ygy ygy = new ygy("com.google.activity.samples");
        ygy.f53787b = m44355a(c, ygv.m44050a("detailed"));
        ygy.mo30480c(1, TimeUnit.HOURS);
        ygy.mo30476a(1, TimeUnit.HOURS);
        ygy.f53789d = this.f54080b;
        this.f54085g = ygy.mo30475a();
        ygy ygy2 = new ygy("com.google.speed");
        ygy2.f53787b = m44355a(c, ygv.m44053a(ygv.f53778h));
        ygy2.mo30480c(1, TimeUnit.HOURS);
        ygy2.mo30476a(1, TimeUnit.HOURS);
        ygy2.f53789d = this.f54080b;
        this.f54086h = ygy2.mo30475a();
    }

    /* renamed from: a */
    private static int m44352a(int i, int i2, int i3) {
        return i2 != 1 ? i2 == 3 ? (i == 2 && i3 == 2) ? 2 : 6 : i2 : (i == 0 && i3 == 0) ? 0 : 6;
    }

    /* renamed from: b */
    public final yfr mo30605b() {
        return m44354a("{source_stream_id}", (caaq) null);
    }

    /* renamed from: c */
    public final bngx mo30606c() {
        return this.f54083e > 0 ? bngx.m109357a(this.f54085g, this.f54086h) : bngx.m109356a(this.f54085g);
    }

    /* renamed from: d */
    public final String mo30607d() {
        return "ActivitySamplesToSegmentTransformation";
    }

    /* renamed from: a */
    public static Map m44353a(String str) {
        try {
            return str.isEmpty() ? f54079j : zvr.m46578b(str);
        } catch (IllegalArgumentException e) {
            return f54079j;
        }
    }

    /* renamed from: a */
    private final yfr m44354a(String str, caaq caaq) {
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30417a(bzzn.f172115i);
        a.mo30420a(yfl.f53726a);
        a.mo30419a(bzzr.m126369a(this.f54080b.mo30613a("from_activity_samples"), str));
        if (caaq != null) {
            a.mo30418a(caaq);
        }
        return a.mo30415a();
    }

    /* renamed from: a */
    private static ygd m44355a(bmxv bmxv, ygd ygd) {
        return (ygd) bmxv.mo66810a((bmxj) new ymc(ygd)).mo66812a(ygd);
    }

    /* renamed from: a */
    private static yht m44356a(yhx yhx, yht yht, long j, long j2, int i, int i2, yfr yfr) {
        if (j == j2 || i == 7) {
            return null;
        }
        if (i == i2 && yht != null) {
            yht.mo30505a(j2, TimeUnit.NANOSECONDS);
            return yht;
        }
        yht c = yhx.mo30521c();
        yfm.m43953a(c, j, j2);
        c.mo30506a(yfr);
        c.mo30503a().mo30433a(btws.m118961a(i));
        return c;
    }

    /* renamed from: a */
    private static yhu m44357a(yhu yhu, long j, long j2) {
        if (yhu == null || Math.abs(yhu.mo30387b() - j) > j2) {
            return null;
        }
        return yhu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ yfr mo30603a(Object obj, Iterable iterable) {
        caaq caaq = (caaq) obj;
        ygz ygz = this.f54085g;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yfr yfr = (yfr) it.next();
            if (ygz.f53800e.equals(yfr.mo30423c()) && ygz.f53801f.mo30462a(yfr)) {
                arrayList.add(yfr);
            }
        }
        yfr yfr2 = (yfr) bnjd.m109587b(arrayList);
        return m44354a(yfr2.mo30425e(), yfr2.mo30428g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03d2 A[SYNTHETIC] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ygx mo30604a(Object obj, Iterable iterable, yhg yhg, yhy yhy) {
        bngx bngx;
        ygx ygx;
        ArrayList arrayList;
        ListIterator listIterator;
        int i;
        yfw yfw;
        ListIterator listIterator2;
        ListIterator listIterator3;
        yfw yfw2;
        int i2;
        int i3;
        long j;
        long j2;
        long j3;
        int i4;
        yfw yfw3;
        boolean z;
        int i5;
        long j4;
        yfw yfw4;
        btwq btwq;
        long j5;
        int i6;
        yfw yfw5;
        ArrayList arrayList2;
        caaq g;
        int i7;
        long j6;
        bnjq bnjq;
        Float f;
        Double d;
        yhu yhu;
        Iterable iterable2 = iterable;
        caaq caaq = (caaq) obj;
        if (caaq == null) {
            List a = yjy.m44260a(iterable2, this.f54085g);
            bmxy.m108596a(a.isEmpty(), "All activity sample streams should have device set, not expecting: %s", yjy.m44258a(a));
        }
        if (this.f54083e > 0) {
            List a2 = yjy.m44260a(iterable2, this.f54086h);
            bngx = !a2.isEmpty() ? ((ygx) a2.get(0)).mo30473a() : bngx.m109376e();
        } else {
            bngx = bngx.m109376e();
        }
        List a3 = yjy.m44260a(iterable2, this.f54085g);
        if (a3.isEmpty()) {
            return null;
        }
        if (a3.size() > 1) {
            ypq.m44538a(yme.class.getName(), Level.SEVERE, "More than one activity sample streams per device: %s", yjy.m44258a(a3));
        }
        ygx ygx2 = (ygx) a3.get(0);
        yhx a4 = yhy.m44167a(m44354a(ygx2.mo30474b().mo30425e(), caaq));
        if (ygx2.mo30473a().isEmpty()) {
            ygx = a4.mo30520b();
        } else {
            btwr btwr = new btwr(this.f54088k);
            bnjq h = bnjr.m109626h(new ymb(bnjr.m109626h(ygx2.mo30473a().listIterator())));
            bnre i8 = bngx.listIterator();
            long millis = TimeUnit.NANOSECONDS.toMillis(this.f54081c);
            long millis2 = TimeUnit.NANOSECONDS.toMillis(this.f54082d);
            ArrayList arrayList3 = new ArrayList(100);
            ArrayList arrayList4 = new ArrayList();
            long j7 = 0;
            while (h.hasNext()) {
                btxb btxb = (btxb) h.next();
                long j8 = btxb.f152787b;
                if (!arrayList3.isEmpty() && j8 - j7 > millis) {
                    arrayList4.addAll(btwr.mo72452a(arrayList3));
                    arrayList3.clear();
                }
                if (h.hasNext()) {
                    bnjq = h;
                    j6 = millis;
                    long j9 = ((btxb) h.mo67862a()).f152787b;
                    if (btxb.mo72458b().f152784a == 5 && j9 - j8 > millis2) {
                        btxb = new btxb(btxb.f152786a, j9 - millis2);
                    }
                } else {
                    bnjq = h;
                    j6 = millis;
                }
                long nanos = TimeUnit.MILLISECONDS.toNanos(btxb.f152787b);
                long j10 = j8;
                long j11 = this.f54083e;
                if (i8.hasNext()) {
                    yhu yhu2 = null;
                    while (true) {
                        if (!i8.hasNext()) {
                            yhu = null;
                            break;
                        }
                        yhu = (yhu) i8.next();
                        if (yhu.mo30387b() - nanos >= 0) {
                            break;
                        }
                        yhu2 = yhu;
                    }
                    if (yhu2 != null) {
                        i8.previous();
                    }
                    if (yhu != null) {
                        i8.previous();
                    }
                    yhu a5 = m44357a(yhu2, nanos, j11);
                    yhu a6 = m44357a(yhu, nanos, j11);
                    if (a5 == null && a6 == null) {
                        f = null;
                    } else if (a5 == null) {
                        bmzs.m108696a(a6);
                        f = Float.valueOf(a6.mo30510b(0));
                    } else {
                        f = a6 != null ? Float.valueOf((a5.mo30510b(0) + a6.mo30510b(0)) / 2.0f) : Float.valueOf(a5.mo30510b(0));
                    }
                } else {
                    f = null;
                }
                if (f != null) {
                    d = Double.valueOf(f.doubleValue());
                } else {
                    d = null;
                }
                arrayList3.add(new btxc(btxb, d));
                h = bnjq;
                millis = j6;
                j7 = j10;
            }
            if (!arrayList3.isEmpty()) {
                arrayList4.addAll(btwr.mo72452a(arrayList3));
            }
            yfr b = ygx2.mo30474b();
            if (!(b == null || (g = b.mo30428g()) == null)) {
                caap a7 = caap.m126421a(g.f172360c);
                if (a7 == null) {
                    a7 = caap.UNKNOWN;
                }
                if (a7 == caap.WATCH) {
                    ArrayList arrayList5 = new ArrayList();
                    ListIterator listIterator4 = arrayList4.listIterator();
                    while (listIterator4.hasNext()) {
                        ArrayList arrayList6 = new ArrayList();
                        if (listIterator4.hasNext()) {
                            btwq btwq2 = (btwq) listIterator4.next();
                            arrayList6.add(btwq2);
                            int a8 = btws.m118961a(btwq2.f152749b);
                            while (true) {
                                if (!listIterator4.hasNext()) {
                                    break;
                                }
                                btwq btwq3 = (btwq) listIterator4.next();
                                if (a8 != btws.m118961a(btwq3.f152749b)) {
                                    listIterator4.previous();
                                    break;
                                }
                                arrayList6.add(btwq3);
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            String a9 = bzzh.m126348a(btws.m118961a(((btwq) arrayList6.get(0)).f152749b));
                            if (this.f54084f.containsKey(a9)) {
                                i7 = ((Integer) this.f54084f.get(a9)).intValue();
                            } else {
                                i7 = 0;
                            }
                            if (arrayList6.size() <= i7) {
                                ArrayList arrayList7 = new ArrayList();
                                int size = arrayList6.size();
                                for (int i9 = 0; i9 < size; i9++) {
                                    arrayList7.add(new btwq(((btwq) arrayList6.get(i9)).f152748a, 7));
                                }
                                arrayList6 = arrayList7;
                            }
                        }
                        arrayList5.addAll(arrayList6);
                    }
                    arrayList4 = arrayList5;
                    ArrayList arrayList8 = new ArrayList();
                    arrayList = new ArrayList();
                    listIterator = arrayList4.listIterator();
                    while (listIterator.hasNext()) {
                        ArrayList arrayList9 = new ArrayList();
                        btwq btwq4 = (btwq) listIterator.next();
                        int i10 = btwq4.f152749b;
                        arrayList9.add(btwq4);
                        while (true) {
                            if (!listIterator.hasNext()) {
                                break;
                            }
                            btwq btwq5 = (btwq) listIterator.next();
                            if (btwq5.f152749b != i10) {
                                listIterator.previous();
                                break;
                            }
                            arrayList9.add(btwq5);
                        }
                        arrayList.add(new ymg(i10, arrayList9));
                    }
                    i = 0;
                    while (i < arrayList.size()) {
                        ymg ymg = (ymg) arrayList.get(i);
                        if (ymg.f54090a != 3) {
                            arrayList8.addAll(ymg.f54091b);
                            arrayList2 = arrayList;
                        } else {
                            int i11 = i + 1;
                            if (!ymh.m44364a(arrayList, i - 1) || !ymh.m44364a(arrayList, i11)) {
                                List list = ymg.f54091b;
                                ArrayList arrayList10 = new ArrayList();
                                int size2 = list.size();
                                int i12 = 0;
                                while (i12 < size2) {
                                    arrayList10.add(new btwq(((btwq) list.get(i12)).f152748a, 6));
                                    i12++;
                                    arrayList = arrayList;
                                }
                                arrayList2 = arrayList;
                                arrayList8.addAll(arrayList10);
                            } else {
                                arrayList8.addAll(ymg.f54091b);
                                arrayList2 = arrayList;
                            }
                        }
                        i++;
                        arrayList = arrayList2;
                    }
                    yfr b2 = ygx2.mo30474b();
                    yfw = (yfw) yhg;
                    long j12 = yfw.f53737a;
                    listIterator2 = arrayList8.listIterator();
                    long j13 = j12;
                    int i13 = 7;
                    int i14 = 7;
                    yht yht = null;
                    while (true) {
                        if (listIterator2.hasNext()) {
                            listIterator3 = listIterator2;
                            yfw2 = yfw;
                            i2 = i13;
                            i3 = i14;
                            j = j13;
                            j2 = j12;
                            break;
                        }
                        btwq btwq6 = (btwq) listIterator2.next();
                        int i15 = i13;
                        long nanos2 = TimeUnit.MILLISECONDS.toNanos(btwq6.f152748a);
                        i3 = i14;
                        long j14 = yfw.f53738b;
                        if (nanos2 > j14) {
                            listIterator2.previous();
                            listIterator3 = listIterator2;
                            yfw2 = yfw;
                            i2 = i15;
                            j = j13;
                            j2 = j14;
                            break;
                        }
                        long j15 = nanos2 - j12;
                        ListIterator listIterator5 = listIterator2;
                        if (i3 != 6) {
                            yfw3 = yfw;
                            if (j15 > this.f54081c) {
                                z = true;
                                i5 = btwq6.f152749b;
                                if (i5 == i3 || z) {
                                    if (!z) {
                                        j4 = j12 + this.f54081c;
                                    } else {
                                        j4 = nanos2;
                                    }
                                    long j16 = nanos2;
                                    yfw4 = yfw3;
                                    if (j4 <= yfw4.f53737a) {
                                        i6 = m44352a(i15, i3, i5);
                                        btwq = btwq6;
                                        yfw5 = yfw4;
                                        j5 = j13;
                                        yht a10 = m44356a(a4, yht, j13, j4, i6, i15, b2);
                                        if (!z) {
                                            yht = a10;
                                        } else {
                                            yht = null;
                                        }
                                    } else {
                                        yfw5 = yfw4;
                                        btwq = btwq6;
                                        j5 = j13;
                                        i6 = i3;
                                    }
                                    j12 = j16;
                                    j13 = Math.max(j5, j12);
                                    i14 = btwq.f152749b;
                                    i13 = i6;
                                } else {
                                    j12 = nanos2;
                                    i14 = i3;
                                    i13 = i15;
                                }
                                listIterator2 = listIterator5;
                                yfw = yfw3;
                            }
                        } else {
                            yfw3 = yfw;
                        }
                        z = false;
                        i5 = btwq6.f152749b;
                        if (i5 == i3) {
                        }
                        if (!z) {
                        }
                        long j162 = nanos2;
                        yfw4 = yfw3;
                        if (j4 <= yfw4.f53737a) {
                        }
                        j12 = j162;
                        j13 = Math.max(j5, j12);
                        i14 = btwq.f152749b;
                        i13 = i6;
                        listIterator2 = listIterator5;
                        yfw = yfw3;
                    }
                    yfw yfw6 = yfw2;
                    j3 = yfw6.f53737a;
                    if (j >= j3) {
                        yfr yfr = b2;
                        if (j < yfw6.f53738b && j2 >= j3) {
                            while (true) {
                                if (!listIterator3.hasNext()) {
                                    i4 = 7;
                                    break;
                                }
                                int i16 = ((btwq) listIterator3.next()).f152749b;
                                if (i16 != i3) {
                                    i4 = i16;
                                    break;
                                }
                            }
                            m44356a(a4, yht, j, j2, m44352a(i2, i3, i4), i2, yfr);
                        }
                    }
                    ygx = a4.mo30520b();
                }
            }
            ArrayList arrayList82 = new ArrayList();
            arrayList = new ArrayList();
            listIterator = arrayList4.listIterator();
            while (listIterator.hasNext()) {
            }
            i = 0;
            while (i < arrayList.size()) {
            }
            yfr b22 = ygx2.mo30474b();
            yfw = (yfw) yhg;
            long j122 = yfw.f53737a;
            listIterator2 = arrayList82.listIterator();
            long j132 = j122;
            int i132 = 7;
            int i142 = 7;
            yht yht2 = null;
            while (true) {
                if (listIterator2.hasNext()) {
                }
                listIterator2 = listIterator5;
                yfw = yfw3;
            }
            yfw yfw62 = yfw2;
            j3 = yfw62.f53737a;
            if (j >= j3) {
            }
            ygx = a4.mo30520b();
        }
        if (this.f54087i <= 0) {
            return ygx;
        }
        yhz yhz = (yhz) ygx;
        yhx a11 = yhy.m44167a(yhz.f53844a);
        bnre i17 = yhz.f53845b.listIterator();
        while (i17.hasNext()) {
            yhu yhu3 = (yhu) i17.next();
            long b3 = yhu3.mo30387b();
            for (long a12 = yhu3.mo30385a(); a12 < b3; a12 += this.f54087i) {
                long min = Math.min(this.f54087i + a12, b3);
                yht c = a11.mo30521c();
                c.mo30506a(yhu3.mo30511d());
                yfm.m43953a(c, a12, min);
                yfp.m43963a(c, yhu3.mo30516i());
            }
        }
        return a11.mo30520b();
    }
}
