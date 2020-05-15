package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: bgea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgea {

    /* renamed from: a */
    public final buiv f116209a;

    public bgea(buiv buiv) {
        this.f116209a = buiv;
    }

    /* renamed from: a */
    public final bfns mo62701a(bfoa bfoa, bfni bfni) {
        bukm bukm;
        buiw buiw;
        int i;
        buiu buiu;
        String str;
        ArrayList arrayList;
        bfni bfni2;
        boolean z;
        int i2;
        boolean z2;
        String str2;
        buiu buiu2;
        int i3;
        bfoa bfoa2;
        String str3;
        int i4;
        int i5;
        buiv buiv;
        float f;
        int i6;
        int i7;
        bfnz[] bfnzArr;
        bfoa bfoa3 = bfoa;
        bfni bfni3 = bfni;
        buiv buiv2 = this.f116209a;
        buki buki = buiv2.f153981a.f154180u;
        if (buki.f154092e) {
            bukm = new bulh();
            buki.f154089b.mo72752a(bukm);
        } else {
            bukm = bulf.f154134a;
        }
        buiv2.f153983c = bukm;
        buiv2.f153983c.mo72782a(buiv2.f153981a.f154162c.mo62775b());
        buiv2.f153983c.mo72787b(bfni3);
        buiv2.f153983c.mo72780a(bfoa.mo62006b());
        buiv2.f153983c.mo72786b(bfoa.mo62009d());
        bulp bulp = buiv2.f153981a;
        String str4 = "os_";
        bulp.f154178s.mo72709a(str4).mo72707a(bulp.f154162c);
        if (!buiv2.f153981a.f154166g.enableRnnFrewleEngine()) {
            buiv2.f153984d = null;
            buiw = new buix(buiv2.f153981a, buiv2.f153982b, buiv2.f153985e, buiv2.f153986f, buiv2.f153987g);
        } else {
            if (buiv2.f153984d == null) {
                bulp bulp2 = buiv2.f153981a;
                buiv2.f153984d = new bujd(bulp2.f154163d, bulp2);
            }
            buiw = buiv2.f153984d;
        }
        buiu buiu3 = new buiu(buiv2.f153981a, buiv2.f153988i, buiv2.f153983c, buiw);
        bulp bulp3 = (bulp) buiu3.f153976a;
        bulp3.f154178s.mo72709a("ld_").mo72707a(bulp3.f154162c);
        bumi bumi = buiu3.f153979d;
        bukm bukm2 = buiu3.f153977b;
        bumi.f154242e.mo72847a();
        int b = bfoa.mo62006b();
        int i8 = bumi.f154241d;
        int i9 = 1000;
        int min = Math.min(b, 1000);
        bumg bumg = bumi.f154243f;
        bumg.mo72852b(min);
        bumg.mo72847a();
        bfnz[] e = bfoa.mo62011e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float f2 = Float.NEGATIVE_INFINITY;
            if (i11 >= min) {
                break;
            }
            bfoa bfoa4 = bfoa3;
            buiu buiu4 = buiu3;
            String str5 = str4;
            byte b2 = bfoa4.mo62005b(i11);
            long a = bfoa4.mo62003a(i11);
            if (e != null) {
                int length = e.length;
                int i12 = 0;
                float f3 = Float.NEGATIVE_INFINITY;
                int i13 = 0;
                while (i13 < length) {
                    bfnz bfnz = e[i13];
                    buiv buiv3 = buiv2;
                    if (bfnz.f114529a == a) {
                        int i14 = bfnz.f114537i;
                        if (i14 > 3) {
                            f3 = ((float) bfnz.f114534f) / 100.0f;
                            f2 = ((float) bfnz.f114533e) / 100.0f;
                            i12 = i14;
                        }
                    }
                    i13++;
                    buiv2 = buiv3;
                }
                buiv = buiv2;
                i6 = i12;
                f = f2;
                f2 = f3;
            } else {
                buiv = buiv2;
                i6 = 0;
                f = Float.NEGATIVE_INFINITY;
            }
            if (b2 >= bumi.f154238a) {
                int i15 = bumi.f154239b;
                if (b2 <= -35) {
                    bumi.m119976a(bumi.f154243f, a, b2, i6, f, f2);
                    i7 = i11;
                    bfnzArr = e;
                    i11 = i7 + 1;
                    bfni3 = bfni;
                    e = bfnzArr;
                    str4 = str5;
                    buiu3 = buiu4;
                    bfoa3 = bfoa4;
                    buiv2 = buiv;
                    i10 = 0;
                    i9 = 1000;
                }
            }
            i7 = i11;
            bfnzArr = e;
            bukm2.mo72783a(a, b2, 5, 0, Float.NEGATIVE_INFINITY, i6, f, null);
            i11 = i7 + 1;
            bfni3 = bfni;
            e = bfnzArr;
            str4 = str5;
            buiu3 = buiu4;
            bfoa3 = bfoa4;
            buiv2 = buiv;
            i10 = 0;
            i9 = 1000;
        }
        bumg bumg2 = bumi.f154243f;
        int i16 = bumg2.f154234b;
        if (i16 > 0) {
            bumg2.mo72850a(bumq.f154256b);
            long a2 = bumi.m119975a(bumi.f154243f, i10);
            int i17 = 1;
            for (int i18 = 1; i18 < i16; i18++) {
                if (a2 != bumi.m119975a(bumi.f154243f, i18)) {
                    i17++;
                }
                a2 = bumi.m119975a(bumi.f154243f, i18);
            }
            i = i17;
        } else {
            i = 0;
        }
        bumi.f154242e.mo72852b(i);
        int i19 = 0;
        int i20 = 1;
        int i21 = 0;
        while (i19 < i) {
            String str6 = str4;
            bfoa bfoa5 = bfoa3;
            buiu buiu5 = buiu3;
            long a3 = bumi.m119975a(bumi.f154243f, i21);
            int i22 = i20;
            while (true) {
                bumg bumg3 = bumi.f154243f;
                if (i22 < bumg3.f154234b) {
                    if (a3 != bumi.m119975a(bumg3, i22)) {
                        i3 = i21;
                        bfoa2 = bfoa5;
                        str3 = str6;
                        break;
                    }
                    int e2 = bumi.m119980e(bumi.f154243f, i22);
                    int d = bumi.m119979d(bumi.f154243f, i22);
                    float b3 = bumi.m119977b(bumi.f154243f, i22);
                    bumi.m119978c(bumi.f154243f, i22);
                    bukm2.mo72783a(a3, e2, 6, 0, Float.NEGATIVE_INFINITY, d, b3, null);
                    i22++;
                    str6 = str6;
                    bfoa5 = bfoa5;
                    i21 = i21;
                } else {
                    i3 = i21;
                    bfoa2 = bfoa5;
                    str3 = str6;
                    break;
                }
            }
            bumg bumg4 = bumi.f154242e;
            bumg bumg5 = bumi.f154243f;
            Comparator comparator = bumq.f154255a;
            int i23 = i3;
            if (i23 < 0 || i23 >= (i4 = bumg5.f154234b)) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Index out of bounds on sort: fromIndex = ");
                sb.append(i23);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i22 <= 0 || i22 > i4) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Index out of bounds on sort: toIndex = ");
                sb2.append(i22);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                try {
                    Arrays.sort(bumg5.f154233a, i23, i22, comparator);
                    int i24 = i22 - i23;
                    int i25 = (i24 / 2) + i23;
                    if (i24 % 2 == 0) {
                        bumq[] bumqArr = (bumq[]) bumg5.f154233a;
                        i5 = (bumqArr[i25 - 1].f154258d + bumqArr[i25].f154258d) / 2;
                    } else {
                        i5 = ((bumq[]) bumg5.f154233a)[i25].f154258d;
                    }
                    bumi.m119976a(bumg4, a3, i5, bumi.m119979d(bumi.f154243f, i23), bumi.m119977b(bumi.f154243f, i23), bumi.m119978c(bumi.f154243f, i23));
                    i20 = i22 + 1;
                    i19++;
                    i21 = i22;
                    str4 = str3;
                    buiu3 = buiu5;
                    bfoa3 = bfoa2;
                    i9 = 1000;
                } catch (IllegalArgumentException e3) {
                    StringBuilder sb3 = new StringBuilder(82);
                    sb3.append("Illegal argument exception on sort: toIndex = ");
                    sb3.append(i22);
                    sb3.append(", fromIndex = ");
                    sb3.append(i23);
                    throw new IndexOutOfBoundsException(sb3.toString());
                }
            }
        }
        bumi.f154242e.mo72850a(bumq.f154255a);
        bumg bumg6 = bumi.f154242e;
        int i26 = bumi.f154240c;
        bumg6.mo72848a(Math.min(i, i9));
        bumi.f154242e.mo72850a(bumq.f154256b);
        buiu3.f153979d = bumi;
        Set<buje> a4 = buiu3.f153976a.mo72819a(buiu3.f153979d, buiu3.f153977b);
        if (a4.isEmpty()) {
            arrayList = new ArrayList();
            str = str4;
            buiu = buiu3;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            for (buje buje : a4) {
                ayvd.m84904a(buje.f154009b, iArr);
                arrayList5.add(new bumf(buje));
                int size = arrayList3.size();
                int i27 = 0;
                while (i27 < size) {
                    bumf bumf = (bumf) arrayList3.get(i27);
                    List list = bumf.f154232a;
                    int i28 = size;
                    int size2 = list.size();
                    int i29 = 0;
                    while (true) {
                        if (i29 >= size2) {
                            str2 = str4;
                            buiu2 = buiu3;
                            arrayList4.add(bumf);
                            break;
                        }
                        List list2 = list;
                        str2 = str4;
                        buiu2 = buiu3;
                        ayvd.m84904a(((buje) list.get(i29)).f154009b, iArr2);
                        int i30 = i29 + 1;
                        int i31 = size2;
                        if (ayuo.m84843a(iArr[0], iArr[1], iArr2[0], iArr2[1]) <= 200.0d) {
                            arrayList5.add(bumf);
                            break;
                        }
                        str4 = str2;
                        list = list2;
                        buiu3 = buiu2;
                        i29 = i30;
                        size2 = i31;
                    }
                    i27++;
                    size = i28;
                    str4 = str2;
                    buiu3 = buiu2;
                }
                String str7 = str4;
                buiu buiu6 = buiu3;
                bumf bumf2 = new bumf();
                int size3 = arrayList5.size();
                for (int i32 = 0; i32 < size3; i32++) {
                    bumf2.f154232a.addAll(((bumf) arrayList5.get(i32)).f154232a);
                }
                arrayList4.add(bumf2);
                arrayList5.clear();
                arrayList3.clear();
                arrayList3.addAll(arrayList4);
                arrayList4.clear();
                str4 = str7;
                buiu3 = buiu6;
            }
            str = str4;
            buiu = buiu3;
            if (arrayList3.size() > 0) {
                boolean[] zArr = new boolean[arrayList3.size()];
                int i33 = 0;
                int i34 = 0;
                for (int i35 = 0; i35 < arrayList3.size(); i35++) {
                    List list3 = ((bumf) arrayList3.get(i35)).f154232a;
                    ayvd.m84904a(((buje) list3.get(0)).f154009b, iArr);
                    if (bfni3 == null || ayuo.m84843a(iArr[0], iArr[1], bfni3.f114480b, bfni3.f114481c) * 1000.0d < ((double) bfni3.f114482d)) {
                        zArr[i35] = true;
                        i34 = Math.max(i34, list3.size());
                    } else {
                        i33 = Math.max(i33, list3.size());
                    }
                }
                if (i33 >= 3) {
                    z2 = i33 - i34 < 2;
                } else {
                    z2 = true;
                }
                if (z2) {
                    i33 = i34;
                }
                for (int i36 = 0; i36 < arrayList3.size(); i36++) {
                    List list4 = ((bumf) arrayList3.get(i36)).f154232a;
                    if (zArr[i36] != z2 || list4.size() < i33) {
                        int size4 = list4.size();
                        for (int i37 = 0; i37 < size4; i37++) {
                            arrayList2.add((buje) list4.get(i37));
                        }
                    }
                }
            }
            arrayList = arrayList2;
        }
        int size5 = arrayList.size();
        int i38 = 0;
        while (i38 < size5) {
            buje buje2 = (buje) arrayList.get(i38);
            a4.remove(buje2);
            buiu.f153977b.mo72783a(buje2.f154008a, (int) buje2.f154013f, 10, buje2.f154009b, buje2.f154012e, buje2.f154014g, buje2.f154015h, buje2.f154019l);
            i38++;
            buiu = buiu;
        }
        buiu buiu7 = buiu;
        bfni a5 = buiu7.f153978c.mo72716a(a4, buiu7.f153977b);
        Collection emptySet = Collections.emptySet();
        if (a5 != null) {
            if (((bulp) buiu7.f153976a).f154166g.elevationFromWifiEnabled()) {
                buip a6 = buir.m119575a(a4, ((bulp) buiu7.f153976a).f154166g);
                float f4 = a6.f153961a;
                float f5 = a6.f153962b;
                emptySet = a6.f153963c;
                if (f4 != Float.NEGATIVE_INFINITY) {
                    bfnh l = a5.mo61991l();
                    l.mo61978a(f4, f5);
                    a5 = l.mo61977a();
                }
            }
            if (((bulp) buiu7.f153976a).f154166g.enableFrewleFloorEstimator()) {
                cewk cewk = ((bulp) buiu7.f153976a).f154166g;
                HashMap hashMap = new HashMap();
                int i39 = Integer.MIN_VALUE;
                buka buka = null;
                for (buje buje3 : a4) {
                    if (buje3.f154019l != null && buje3.f154013f >= ((float) cewk.elevationFromWifiMinRssiDbm())) {
                        if (hashMap.containsKey(buje3.f154019l)) {
                            i2 = ((Integer) hashMap.get(buje3.f154019l)).intValue() + 1;
                        } else {
                            i2 = 1;
                        }
                        if (i2 > i39) {
                            buka = buje3.f154019l;
                            i39 = i2;
                        }
                        hashMap.put(buje3.f154019l, Integer.valueOf(i2));
                    }
                }
                if (buka != null && !buka.f154061a.isEmpty()) {
                    bfnh l2 = a5.mo61991l();
                    l2.f114471b = buka.f154061a;
                    String a7 = buka.mo72753a();
                    if (a7 != null && !a7.isEmpty()) {
                        l2.mo61979a(a7);
                    }
                    bfni2 = l2.mo61977a();
                }
            }
            bfni2 = a5;
        } else {
            bfni2 = a5;
        }
        for (buje buje4 : a4) {
            if (emptySet.contains(buje4)) {
                buiu7.f153977b.mo72783a(buje4.f154008a, (int) buje4.f154013f, 11, buje4.f154009b, buje4.f154012e, buje4.f154014g, buje4.f154015h, buje4.f154019l);
            } else {
                buiu7.f153977b.mo72783a(buje4.f154008a, (int) buje4.f154013f, 1, buje4.f154009b, buje4.f154012e, buje4.f154014g, buje4.f154015h, buje4.f154019l);
            }
        }
        buiv2.f153982b.mo72790b();
        bulp bulp4 = buiv2.f153981a;
        long b4 = bulp4.f154162c.mo62775b();
        if (b4 - bulp4.f154175p > 86400000) {
            bulp4.f154168i.mo72831a(-604800000 + b4);
            bulp4.f154175p = b4;
        }
        if (b4 - bulp4.f154176q > 3600000) {
            bulp4.f154168i.mo72839d();
            bulp4.f154176q = b4;
        }
        bult bult = bulp4.f154167h;
        if (bult.f114296i) {
            if (bult.f154187d != null && bult.f154188e) {
                if (!bult.f154186c.getAndSet(true)) {
                    try {
                        bult.f114294g.mo62786f().execute(new buls(bult, bult.f154187d.mo70120b()));
                        z = false;
                    } catch (IOException e4) {
                        z = false;
                        bult.f154186c.set(false);
                    }
                    bult.f154188e = z;
                }
            }
        }
        bulp bulp5 = buiv2.f153981a;
        buit buit = bulp5.f154178s;
        buit.mo72709a(str).mo72708b(bulp5.f154162c);
        if (bfni2 != null) {
            buit.f153971a++;
        }
        int i40 = 5;
        if (buiv2.f153981a.mo72825e()) {
            buiv2.f153983c.mo72781a(7, buiv2.f153981a.f154162c.mo62775b());
            if (!buiv2.f153981a.f154166g.usePartialGlsFix142179343()) {
                return bfns.m97357a(bfmy.CACHE_MISS, buiv2.f153981a.f154162c.mo62776c(), bfoa);
            }
            if (bfni2 == null) {
                i40 = 0;
            }
            return new bfns(i40, bfni2, bfni2 != null ? bfmy.OK : bfmy.GLS_ERROR, buiv2.f153981a.f154162c.mo62776c(), bfoa, true);
        }
        bfoa bfoa6 = bfoa;
        if (bfni2 != null) {
            buiv2.f153983c.mo72784a(bfni2);
            buiv2.f153983c.mo72781a(1, buiv2.f153981a.f154162c.mo62775b());
            return bfns.m97356a(5, bfni2, buiv2.f153981a.f154162c.mo62776c(), bfoa6);
        }
        buiv2.f153983c.mo72781a(5, buiv2.f153981a.f154162c.mo62775b());
        return null;
    }
}
