package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: bgdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgdz implements bujf {

    /* renamed from: a */
    private static bhcs f116206a;

    /* renamed from: c */
    private static final bgdz f116207c = new bgdz();

    /* renamed from: b */
    private final buox f116208b;

    static {
        bgdz.class.getSimpleName();
    }

    public bgdz() {
        f116206a = null;
        buoy buoy = new buoy();
        buoy.f154607a = ceze.f183524a.mo6606a().rttHistoryRangeTimeToLiveSeconds();
        buoz buoz = new buoz();
        buoz.f154608a = 1.0d;
        buoz.f154609b = -0.6d;
        buoz.f154610c = 2.8d;
        buoz.f154611d = buoy.f154607a;
        buoz.f154612e = 1.0d;
        buoz.f154613f = 0.2d;
        buoz.f154614g = 4;
        buoz.f154615h = 6;
        buoz.f154616i = -90;
        buoz.f154617j = -5;
        buoz.f154618k = 2;
        this.f116208b = new buox(this, buoz);
    }

    /* renamed from: a */
    public static bgdz m98685a(bujf bujf) {
        if (f116206a == null) {
            f116206a = new bhcs(bujf);
        }
        f116206a.mo63556a();
        return f116207c;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.reflect.Array.newInstance(java.lang.Class<?>, int[]):java.lang.Object VARARG throws java.lang.IllegalArgumentException, java.lang.NegativeArraySizeException}
     arg types: [java.lang.Class<double>, int[]]
     candidates:
      ClspMth{java.lang.reflect.Array.newInstance(java.lang.Class<?>, int):java.lang.Object throws java.lang.NegativeArraySizeException}
      ClspMth{java.lang.reflect.Array.newInstance(java.lang.Class<?>, int[]):java.lang.Object VARARG throws java.lang.IllegalArgumentException, java.lang.NegativeArraySizeException} */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x05b0  */
    /* renamed from: a */
    public final bfns mo62700a(bfnz[] bfnzArr) {
        int length;
        double d;
        buox buox;
        double d2;
        long j;
        bfni bfni;
        bfoa bfoa;
        bfns bfns;
        Class<double> cls;
        bngx bngx;
        bupa bupa;
        Class<double> cls2;
        double d3;
        bupa bupa2;
        int i;
        long j2;
        ArrayList arrayList;
        bupb bupb;
        Class<double> cls3;
        double d4;
        bfnz[] bfnzArr2 = bfnzArr;
        Class<double> cls4 = double.class;
        if (!ceze.m138458c() || bfnzArr2 == null || (length = bfnzArr2.length) <= 0) {
            return null;
        }
        bhcs bhcs = f116206a;
        if (bhcs != null) {
            bhcs.mo63556a();
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Attempting RTT location with scan of length ");
        sb.append(length);
        sb.toString();
        buox buox2 = this.f116208b;
        int i2 = 1;
        bmxy.m108588a(true);
        bmxy.m108588a(true);
        long j3 = Long.MIN_VALUE;
        int i3 = 0;
        bupb bupb2 = null;
        while (i3 < length) {
            bfnz bfnz = bfnzArr2[i3];
            buox2.f154606f += i2;
            if (bfnz.f114530b != 0) {
                cls3 = cls4;
            } else {
                if (!(bfnz.f114534f == 0 || bfnz.f114537i == 0)) {
                    int i4 = bfnz.f114532d;
                    buoz buoz = buox2.f154603c;
                    if (i4 < buoz.f154617j && i4 > buoz.f154616i) {
                        double d5 = buoz.f154608a;
                        double d6 = buoz.f154609b;
                        double d7 = buoz.f154610c;
                        cls3 = cls4;
                        double d8 = (double) bfnz.f114533e;
                        Double.isNaN(d8);
                        double max = Math.max(((d8 / 100.0d) - d6) * d5, 0.0d);
                        if (max >= d7) {
                            d4 = Math.sqrt((max * max) - (d7 * d7));
                        } else {
                            d4 = 0.0d;
                        }
                        double d9 = (double) bfnz.f114534f;
                        Double.isNaN(d9);
                        double max2 = Math.max(Math.pow(d9 / 100.0d, 2.0d) * d5 * (d4 / max), 0.5d);
                        int i5 = bfnz.f114537i;
                        int i6 = bfnz.f114532d;
                        long j4 = bfnz.f114531c;
                        long j5 = bfnz.f114529a;
                        double d10 = (double) j4;
                        Double.isNaN(d10);
                        bupb2 = new bupb(j5, d4, max2, i5, i6, d10 / 1000000.0d);
                        buph buph = buox2.f154601a;
                        Long valueOf = Long.valueOf(bupb2.f154623a);
                        List list = (List) buph.f154636a.get(valueOf);
                        if (list == null) {
                            list = new ArrayList();
                            buph.f154636a.put(valueOf, list);
                        }
                        list.add(0, bupb2);
                        buph.mo72971a(list, bupb2.f154628f);
                        long j6 = bfnz.f114531c / 1000;
                        if (j3 < j6) {
                            j3 = j6;
                        }
                        i3++;
                        bfnzArr2 = bfnzArr;
                        cls4 = cls3;
                        i2 = 1;
                    }
                }
                cls3 = cls4;
            }
            buox2.f154605e++;
            i3++;
            bfnzArr2 = bfnzArr;
            cls4 = cls3;
            i2 = 1;
        }
        Class<double> cls5 = cls4;
        if (bupb2 == null) {
            double d11 = (double) j3;
            Double.isNaN(d11);
            d = d11 / 1000.0d;
        } else {
            d = bupb2.f154628f;
        }
        buph buph2 = buox2.f154601a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = buph2.f154636a.entrySet().iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Map.Entry) it.next()).getValue();
            buph2.mo72971a(list2, d);
            if (list2.isEmpty()) {
                it.remove();
            } else {
                if (list2 != null) {
                    int i7 = buph2.f154639d;
                    int i8 = i7 - 1;
                    if (i7 == 0) {
                        throw null;
                    } else if (i8 != 0) {
                        bupb = i8 != 1 ? i8 != 2 ? null : buph.m120199a(list2, buph2.f154637b, buph2.f154638c) : buph.m120199a(list2, 1.0d, 0.0d);
                    } else {
                        bupb = (bupb) list2.get(0);
                    }
                } else {
                    bupb = null;
                }
                if (bupb != null) {
                    arrayList2.add(bupb);
                }
            }
        }
        bujf bujf = buox2.f154602b;
        bmxy.m108588a(true);
        bmxy.m108588a(true);
        ListIterator listIterator = arrayList2.listIterator();
        while (listIterator.hasNext()) {
            if (bujf.mo62698a(Long.valueOf(((bupb) listIterator.next()).f154623a)) == null) {
                listIterator.remove();
            }
        }
        buoz buoz2 = buox2.f154603c;
        int i9 = buoz2.f154614g;
        int i10 = buoz2.f154615h;
        bmxy.m108588a(true);
        int size = arrayList2.size();
        if (size < i9) {
            arrayList2 = null;
        } else if (i9 <= i10) {
            Collections.sort(arrayList2, bupg.f154635a);
            if (i10 < size) {
                arrayList2.subList(i10, size).clear();
            }
        } else {
            arrayList2 = null;
        }
        bujf bujf2 = buox2.f154602b;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            d2 = d;
            buox = buox2;
            j = j3;
            bfni = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            bngs bngs = new bngs();
            int size2 = arrayList2.size();
            bsbs bsbs = null;
            int i11 = 0;
            int i12 = 0;
            while (i12 < size2) {
                bupb bupb3 = (bupb) arrayList2.get(i12);
                int i13 = i12;
                buje a = bujf2.mo62698a(Long.valueOf(bupb3.f154623a));
                if (a == null) {
                    arrayList = arrayList2;
                    j2 = j3;
                } else {
                    if (bsbs == null) {
                        j2 = j3;
                        arrayList = arrayList2;
                        bsbs = new bsbs(ayuo.m84844a(a.f154017j), ayuo.m84844a(a.f154018k));
                    } else {
                        arrayList = arrayList2;
                        j2 = j3;
                    }
                    bupc bupc = new bupc(bupb3, a, bsbs);
                    if (a.f154011d != 0.0f) {
                        arrayList3.add(bupc);
                    } else {
                        bngs.mo67668c(bupc);
                        i11++;
                    }
                }
                j3 = j2;
                i12 = i13 + 1;
                arrayList2 = arrayList;
            }
            j = j3;
            if (i11 < 3) {
                bngs.mo67666b((Iterable) arrayList3);
            }
            bngx a2 = bngs.mo67664a();
            if (a2.isEmpty()) {
                a2 = null;
            }
            if (a2 != null) {
                int size3 = a2.size();
                if (size3 >= 3) {
                    int i14 = size3 - 1;
                    int[] iArr = new int[2];
                    iArr[1] = 2;
                    iArr[0] = i14;
                    double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls5, iArr);
                    int[] iArr2 = new int[2];
                    iArr2[1] = 1;
                    iArr2[0] = i14;
                    double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls5, iArr2);
                    double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls5, 2, 2);
                    double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls5, 2, 1);
                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls5, 2, 1);
                    double d12 = ((bupc) a2.get(0)).f154632d.f154619a;
                    d2 = d;
                    double d13 = ((bupc) a2.get(0)).f154632d.f154620b;
                    double d14 = ((bupc) a2.get(0)).f154629a;
                    int i15 = 1;
                    while (i15 < size3) {
                        double d15 = ((bupc) a2.get(i15)).f154632d.f154619a;
                        double d16 = ((bupc) a2.get(i15)).f154632d.f154620b;
                        double d17 = ((bupc) a2.get(i15)).f154629a;
                        int i16 = i15 - 1;
                        double[] dArr6 = dArr[i16];
                        double d18 = d15 - d12;
                        dArr6[0] = d18;
                        double d19 = d16 - d13;
                        dArr6[1] = d19;
                        dArr2[i16][0] = ((Math.pow(d14, 2.0d) - Math.pow(d17, 2.0d)) + Math.pow(d18, 2.0d) + Math.pow(d19, 2.0d)) * 0.5d;
                        i15++;
                        d14 = d14;
                        d12 = d12;
                        size3 = size3;
                        buox2 = buox2;
                        dArr3 = dArr3;
                        cls5 = cls5;
                        dArr4 = dArr4;
                        a2 = a2;
                        d13 = d13;
                    }
                    bngx bngx2 = a2;
                    double d20 = d13;
                    int i17 = size3;
                    buox = buox2;
                    cls = cls5;
                    double d21 = d12;
                    adyn adyn = new adyn(dArr);
                    adyn adyn2 = new adyn(dArr5);
                    adyn adyn3 = new adyn(dArr2);
                    adyn adyn4 = new adyn(dArr3);
                    adyn adyn5 = new adyn(dArr4);
                    bsdg.m115308c(adyn, adyn, adyn4);
                    bsdg.m115308c(adyn, adyn3, adyn5);
                    if (bupe.m120197a(adyn4)) {
                        bsdf bsdf = new bsdf();
                        bsdf.mo70258a(adyn4);
                        bsdf.mo70259a(adyn5, adyn2);
                        double a3 = adyn2.mo33930a(0, 0) + d21;
                        double a4 = adyn2.mo33930a(1, 0) + d20;
                        int i18 = 0;
                        double d22 = 0.0d;
                        while (true) {
                            i = i17;
                            if (i18 >= i) {
                                break;
                            }
                            double hypot = ((bupc) bngx2.get(i18)).f154629a - Math.hypot(a3 - ((bupc) bngx2.get(i18)).f154632d.f154619a, a4 - ((bupc) bngx2.get(i18)).f154632d.f154620b);
                            d22 += hypot * hypot;
                            i18++;
                            i17 = i;
                        }
                        bngx = bngx2;
                        bsbs bsbs2 = ((bupc) bngx.get(0)).f154632d.f154622d;
                        double d23 = ((bupc) bngx.get(0)).f154631c;
                        double d24 = (double) i;
                        Double.isNaN(d24);
                        bupa = new bupa(a3, a4, d22 / d24, bsbs2);
                        if (bupa != null) {
                            double d25 = Double.MAX_VALUE;
                            int i19 = 0;
                            while (true) {
                                int size4 = bngx.size();
                                if (size4 >= 3) {
                                    int[] iArr3 = new int[2];
                                    iArr3[1] = 1;
                                    iArr3[0] = size4;
                                    Class<double> cls6 = cls;
                                    double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) cls6, iArr3);
                                    int[] iArr4 = new int[2];
                                    iArr4[1] = 2;
                                    iArr4[0] = size4;
                                    double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls6, iArr4);
                                    int[] iArr5 = new int[2];
                                    iArr5[1] = size4;
                                    iArr5[0] = size4;
                                    double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) cls6, iArr5);
                                    int[] iArr6 = new int[2];
                                    iArr6[1] = 1;
                                    iArr6[0] = size4;
                                    double[][] dArr10 = (double[][]) Array.newInstance((Class<?>) cls6, iArr6);
                                    int[] iArr7 = new int[2];
                                    iArr7[1] = 2;
                                    iArr7[0] = size4;
                                    double[][] dArr11 = (double[][]) Array.newInstance((Class<?>) cls6, iArr7);
                                    double[][] dArr12 = (double[][]) Array.newInstance((Class<?>) cls6, 2, 2);
                                    double[][] dArr13 = (double[][]) Array.newInstance((Class<?>) cls6, 2, 1);
                                    double[][] dArr14 = (double[][]) Array.newInstance((Class<?>) cls6, 2, 1);
                                    int i20 = 0;
                                    double d26 = 0.0d;
                                    while (i20 < size4) {
                                        d26 += ((bupc) bngx.get(i20)).f154630b;
                                        i20++;
                                        d25 = d25;
                                    }
                                    d3 = d25;
                                    double d27 = 1.0d / d26;
                                    int i21 = 0;
                                    while (i21 < size4) {
                                        bupc bupc2 = (bupc) bngx.get(i21);
                                        bupa bupa3 = bupc2.f154632d;
                                        double a5 = bupf.m120198a(bupa, bupa3);
                                        if (a5 != 0.0d) {
                                            double[][] dArr15 = dArr7;
                                            double[][] dArr16 = dArr11;
                                            dArr7[i21][0] = a5 - bupc2.f154629a;
                                            double[] dArr17 = dArr8[i21];
                                            double[][] dArr18 = dArr12;
                                            Class<double> cls7 = cls6;
                                            double[][] dArr19 = dArr8;
                                            dArr17[0] = (bupa.f154619a - bupa3.f154619a) / a5;
                                            dArr17[1] = (bupa.f154620b - bupa3.f154620b) / a5;
                                            int i22 = 0;
                                            while (i22 < size4) {
                                                dArr9[i21][i22] = i21 == i22 ? (1.0d / bupc2.f154630b) * d27 : 0.0d;
                                                i22++;
                                            }
                                            i21++;
                                            dArr12 = dArr18;
                                            dArr7 = dArr15;
                                            dArr11 = dArr16;
                                            cls6 = cls7;
                                            dArr8 = dArr19;
                                        } else {
                                            cls2 = cls6;
                                        }
                                    }
                                    adyn adyn6 = new adyn(dArr8);
                                    adyn adyn7 = new adyn(dArr7);
                                    adyn adyn8 = new adyn(dArr9);
                                    adyn adyn9 = new adyn(dArr11);
                                    adyn adyn10 = new adyn(dArr10);
                                    adyn adyn11 = new adyn(dArr12);
                                    adyn adyn12 = new adyn(dArr13);
                                    adyn adyn13 = new adyn(dArr14);
                                    bsdg.m115306a(adyn8, adyn6, adyn9);
                                    bsdg.m115306a(adyn8, adyn7, adyn10);
                                    bsdg.m115308c(adyn6, adyn9, adyn11);
                                    bsdg.m115308c(adyn6, adyn10, adyn12);
                                    if (bupe.m120197a(adyn11)) {
                                        bsdf bsdf2 = new bsdf();
                                        bsdf2.mo70258a(adyn11);
                                        bsdf2.mo70259a(adyn12, adyn13);
                                        double a6 = bupa.f154619a - adyn13.mo33930a(0, 0);
                                        double a7 = bupa.f154620b - adyn13.mo33930a(1, 0);
                                        bnre i23 = bngx.listIterator();
                                        double d28 = 0.0d;
                                        while (i23.hasNext()) {
                                            bupc bupc3 = (bupc) i23.next();
                                            double d29 = bupc3.f154629a;
                                            bupa bupa4 = bupc3.f154632d;
                                            double hypot2 = d29 - Math.hypot(a6 - bupa4.f154619a, a7 - bupa4.f154620b);
                                            d28 += hypot2 * hypot2;
                                        }
                                        bsbs bsbs3 = ((bupc) bngx.get(0)).f154632d.f154622d;
                                        double d30 = ((bupc) bngx.get(0)).f154631c;
                                        double d31 = (double) size4;
                                        Double.isNaN(d31);
                                        bupa2 = new bupa(a6, a7, d28 / d31, bsbs3);
                                        cls2 = cls6;
                                    } else {
                                        cls2 = cls6;
                                        bupa2 = null;
                                    }
                                    if (bupa2 != null) {
                                        double a8 = bupf.m120198a(bupa2, bupa);
                                        bupa = bupa2;
                                        d3 = a8;
                                    }
                                    i19++;
                                    if (i19 >= 100 && d3 > 0.001d && bupa2 != null) {
                                        d25 = d3;
                                        cls = cls2;
                                    }
                                } else {
                                    cls2 = cls;
                                    d3 = d25;
                                }
                                bupa2 = null;
                                if (bupa2 != null) {
                                }
                                i19++;
                                if (i19 >= 100) {
                                    break;
                                }
                                d25 = d3;
                                cls = cls2;
                            }
                            bfni = new bfni(bupa.f154622d.mo70228a(bupa.f154620b), bupa.f154622d.mo70230b(bupa.f154619a), (int) (Math.sqrt(bupa.f154621c) * 1000.0d));
                        }
                    } else {
                        bngx = bngx2;
                    }
                } else {
                    d2 = d;
                    buox = buox2;
                    cls = cls5;
                    bngx = a2;
                }
                bupa = null;
                if (bupa != null) {
                }
            } else {
                d2 = d;
                buox = buox2;
            }
            bfni = null;
        }
        if (bfni != null) {
            buox buox3 = buox;
            int i24 = buox3.f154603c.f154618k;
            bmxy.m108581a(bfni);
            int i25 = i24 - 1;
            if (i24 == 0) {
                throw null;
            } else if (i25 != 1) {
                bfoa = null;
            } else {
                bmxy.m108581a(buox3.f154604d);
                bupd bupd = buox3.f154604d;
                bupd.f154633a = bfni;
                bupd.f154634b = d2;
                bfni = bupd.f154633a;
                bmxy.m108581a(bfni);
                bfoa = null;
            }
        } else {
            bfoa = null;
        }
        if (bfni == null) {
            bfns = bfns.m97357a(bfmy.NO_LOCATION, j, bfoa);
        } else {
            bfns = bfns.m97356a(6, bfni, j, bfoa);
        }
        String valueOf2 = String.valueOf(bfns);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 16);
        sb2.append("RTT location is ");
        sb2.append(valueOf2);
        sb2.toString();
        return bfns;
    }

    /* renamed from: a */
    public final buje mo62698a(Long l) {
        bhcs bhcs = f116206a;
        if (bhcs != null) {
            return bhcs.mo62698a(l);
        }
        return null;
    }
}
