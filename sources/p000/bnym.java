package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bnym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnym implements Serializable {

    /* renamed from: a */
    public static final double f132376a;
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    protected final List f132377b;

    /* renamed from: c */
    public volatile boolean f132378c;

    /* renamed from: d */
    private List f132379d = Collections.emptyList();

    /* renamed from: e */
    private int f132380e = 0;

    static {
        double d = bnvx.f132266a + bnvx.f132267b;
        f132376a = d + d;
    }

    /* renamed from: a */
    static final int m110785a(bnwk bnwk, bnwk bnwk2) {
        double d = bnwk.f132306h - bnwk2.f132306h;
        double d2 = bnwk.f132307i - bnwk2.f132307i;
        double d3 = bnwk.f132308j - bnwk2.f132308j;
        double sqrt = Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
        bnvq bnvq = bnxi.f132328e.f132332d;
        if (sqrt > 0.0d) {
            return Math.max(0, Math.min(30, -(Math.getExponent(sqrt / bnvq.f132236a) >> (bnvq.f132237b - 1))));
        }
        return 30;
    }

    /* renamed from: b */
    private static bnxo m110792b(bnxo bnxo, boolean z, double d, bnxp bnxp) {
        boolean z2;
        boolean z3;
        bnxo bnxo2 = bnxo;
        if (z) {
            if (bnxo2.f132339b.f132223b.f132221b <= d) {
                return bnxo2;
            }
        } else if (bnxo2.f132339b.f132223b.f132220a >= d) {
            return bnxo2;
        }
        bnxq bnxq = bnxo2.f132338a;
        double b = bnxo2.f132339b.f132222a.mo68519b(bnvx.m110597a(d, bnxq.f132346e, bnxq.f132348g, bnxq.f132345d, bnxq.f132347f));
        boolean z4 = false;
        if (bnxq.f132345d <= bnxq.f132347f) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (bnxq.f132346e <= bnxq.f132348g) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 != z3) {
            z4 = true;
        }
        return m110787a(bnxo, z4 ^ z, b, z, d, bnxp);
    }

    public bnym() {
        bnkn.m109661a();
        this.f132378c = true;
        this.f132377b = new ArrayList();
    }

    /* renamed from: a */
    private static bnxo m110786a(bnxo bnxo, boolean z, double d, bnxp bnxp) {
        boolean z2;
        boolean z3;
        bnxo bnxo2 = bnxo;
        if (z) {
            if (bnxo2.f132339b.f132222a.f132221b <= d) {
                return bnxo2;
            }
        } else if (bnxo2.f132339b.f132222a.f132220a >= d) {
            return bnxo2;
        }
        bnxq bnxq = bnxo2.f132338a;
        double b = bnxo2.f132339b.f132223b.mo68519b(bnvx.m110597a(d, bnxq.f132345d, bnxq.f132347f, bnxq.f132346e, bnxq.f132348g));
        boolean z4 = false;
        if (bnxq.f132345d <= bnxq.f132347f) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (bnxq.f132346e <= bnxq.f132348g) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 != z3) {
            z4 = true;
        }
        return m110787a(bnxo, z, d, z4 ^ z, b, bnxp);
    }

    /* renamed from: a */
    private static bnxo m110787a(bnxo bnxo, boolean z, double d, boolean z2, double d2, bnxp bnxp) {
        if (bnxp.f132340a == bnxp.f132341b.size()) {
            bnxp.f132341b.add(new bnxo());
        }
        List list = bnxp.f132341b;
        int i = bnxp.f132340a;
        bnxp.f132340a = i + 1;
        bnxo bnxo2 = (bnxo) list.get(i);
        bnxo2.f132338a = bnxo.f132338a;
        if (z) {
            bnxo2.f132339b.f132222a.mo68523c(bnxo.f132339b.f132222a.f132220a, d);
        } else {
            bnxo2.f132339b.f132222a.mo68523c(d, bnxo.f132339b.f132222a.f132221b);
        }
        if (!z2) {
            bnxo2.f132339b.f132223b.mo68523c(d2, bnxo.f132339b.f132223b.f132221b);
        } else {
            bnxo2.f132339b.f132223b.mo68523c(bnxo.f132339b.f132223b.f132220a, d2);
        }
        return bnxo2;
    }

    /* renamed from: a */
    static final List m110788a(int i) {
        if (i >= 256) {
            return new bnyk(i);
        }
        return new bnyl(i);
    }

    /* renamed from: a */
    private final void m110789a(bnvt bnvt, bnvt bnvt2, bnxr bnxr) {
        if (bnxr.f132355e > 0) {
            bnvu bnvu = new bnvu();
            bnvu.f132251a.clear();
            while (bnvt.compareTo(bnvt2) < 0) {
                bnvt bnvt3 = bnvt;
                while (!bnvt3.mo68587d() && bnvt3.mo68591g().mo68588e().equals(bnvt) && bnvt3.mo68591g().mo68590f().compareTo(bnvt2) < 0) {
                    bnvt3 = bnvt3.mo68591g();
                }
                bnvu.f132251a.add(bnvt3);
                bnvt = bnvt3.mo68590f().mo68592h();
            }
            List emptyList = Collections.emptyList();
            for (int i = 0; i < bnvu.f132251a.size(); i++) {
                m110790a(new bnwj((bnvt) bnvu.f132251a.get(i), f132376a), emptyList, bnxr);
            }
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    private final void m110790a(bnwj bnwj, List list, bnxr bnxr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        bnyj bnyj;
        int i6;
        int i7;
        bnyj bnxw;
        bnwa bnwa;
        bnym bnym = this;
        bnwj bnwj2 = bnwj;
        List list2 = list;
        bnxr bnxr2 = bnxr;
        int size = list.size();
        int i8 = 2;
        int i9 = 0;
        if (bnxr2.f132351a && size > 0) {
            if (bnwj2.f132291a.mo68588e().f132250b != bnxr2.f132353c.f132250b) {
                int i10 = bnwj2.f132293c;
                int i11 = bnwj2.f132294d;
                if ((bnwj2.f132295e & 2) != 0) {
                    int b = bnvt.m110566b(bnwj2.f132296f);
                    i10 += b;
                    i11 += b;
                }
                long j = (long) i10;
                long j2 = (long) i11;
                bnxr2.f132352b = bnwk.m110665b(bnxi.f132328e.mo68688a(bnwj2.f132291a.mo68579a(), j + j, j2 + j2));
            }
            int i12 = bnwj2.f132296f;
            long j3 = (long) bnwj2.f132293c;
            long j4 = (long) bnwj2.f132294d;
            long b2 = (long) bnvt.m110566b(i12);
            bnxr2.mo68695a(bnwk.m110665b(bnxi.f132328e.mo68688a(bnwj2.f132291a.mo68579a(), j3 + j3 + b2, j4 + j4 + b2)));
            for (int i13 = 0; i13 < size; i13++) {
                bnxq bnxq = ((bnxo) list2.get(i13)).f132338a;
                if (((bnxk) bnym.f132377b.get(bnxq.f132342a)).mo68652e()) {
                    bnxr2.mo68694a(bnxq.f132342a, bnxq.f132349h, bnxq.f132350i);
                }
            }
        }
        bnvt bnvt = bnwj2.f132291a;
        int size2 = bnym.f132377b.size();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = 1;
            if (i14 >= size && i16 >= bnxr2.f132355e) {
                break;
            }
            if (i14 < size) {
                i = ((bnxo) list2.get(i14)).f132338a.f132342a;
            } else {
                i = size2;
            }
            if (i16 < bnxr2.f132355e) {
                i2 = bnxr2.f132354d[i16];
            } else {
                i2 = size2;
            }
            if (i2 < i) {
                bnxk bnxk = (bnxk) bnym.f132377b.get(i2);
                if (bnvt != null) {
                    bnyj = new bnxs(bnxk, bnvt.f132250b);
                } else {
                    bnyj = new bnxt(bnxk);
                }
                i16++;
                i5 = i15;
                i4 = size;
                i3 = size2;
            } else {
                int i18 = i14;
                while (i18 < size && ((bnxo) list2.get(i18)).f132338a.f132342a == i) {
                    i18++;
                }
                bnxk bnxk2 = (bnxk) bnym.f132377b.get(i);
                int i19 = i18 - i14;
                if (i19 == 1) {
                    bnxo bnxo = (bnxo) list2.get(i14);
                    if (bnvt != null) {
                        long j5 = bnvt.f132250b;
                        if (i2 == i) {
                            bnxw = new bnye(bnxk2, bnxo, j5);
                            i5 = i15;
                            i4 = size;
                            i3 = size2;
                            i7 = i2;
                            i6 = i;
                        } else {
                            bnxw = new bnyf(bnxk2, bnxo, j5);
                            i5 = i15;
                            i4 = size;
                            i3 = size2;
                            i7 = i2;
                            i6 = i;
                        }
                    } else if (i2 != i) {
                        bnxw = new bnyh(bnxk2, bnxo);
                        i5 = i15;
                        i4 = size;
                        i3 = size2;
                        i7 = i2;
                        i6 = i;
                    } else {
                        bnxw = new bnyg(bnxk2, bnxo);
                        i5 = i15;
                        i4 = size;
                        i3 = size2;
                        i7 = i2;
                        i6 = i;
                    }
                } else {
                    int i20 = ((bnxo) list2.get(i14)).f132338a.f132343b;
                    while (true) {
                        if (i17 < i19) {
                            int i21 = i15;
                            if (i20 + i17 == ((bnxo) list2.get(i14 + i17)).f132338a.f132343b) {
                                i17++;
                                i15 = i21;
                            } else if (bnvt != null) {
                                long j6 = bnvt.f132250b;
                                if (i2 != i) {
                                    i4 = size;
                                    i3 = size2;
                                    i5 = i21;
                                    i7 = i2;
                                    i6 = i;
                                    bnxw = new bnya(bnxk2, list, i14, i18, j6);
                                } else {
                                    i4 = size;
                                    i3 = size2;
                                    i5 = i21;
                                    i7 = i2;
                                    i6 = i;
                                    bnxw = new bnxz(bnxk2, list, i14, i18, j6);
                                }
                            } else {
                                i4 = size;
                                i3 = size2;
                                i5 = i21;
                                i7 = i2;
                                i6 = i;
                                if (i7 != i6) {
                                    bnxw = new bnyc(bnxk2, list2, i14, i18);
                                } else {
                                    bnxw = new bnyb(bnxk2, list2, i14, i18);
                                }
                            }
                        } else {
                            i5 = i15;
                            i4 = size;
                            i3 = size2;
                            i7 = i2;
                            i6 = i;
                            if (bnvt != null) {
                                long j7 = bnvt.f132250b;
                                if (i7 == i6) {
                                    bnxw = new bnxu(bnxk2, i20, i19, j7);
                                } else {
                                    bnxw = new bnxv(bnxk2, i20, i19, j7);
                                }
                            } else if (i7 != i6) {
                                bnxw = new bnxx(bnxk2, i20, i19);
                            } else {
                                bnxw = new bnxw(bnxk2, i20, i19);
                            }
                        }
                    }
                }
                if (i7 == i6) {
                    i16++;
                }
                i14 = i18;
            }
            i15 = i5 + 1;
            bnxr2.f132356f[i5] = bnyj;
            bnvt = null;
            bnym = this;
            bnwj2 = bnwj;
            size = i4;
            size2 = i3;
            i8 = 2;
            i9 = 0;
        }
        List list3 = bnym.f132379d;
        bnwa[] bnwaArr = bnxr2.f132356f;
        if (i15 == 1) {
            bnwa = bnwaArr[i9];
        } else if (i15 != i8) {
            bnwa = new bnxm((bnyj[]) Arrays.copyOf(bnwaArr, i15));
        } else {
            bnwa = new bnxl(bnwaArr[i9], bnwaArr[1]);
        }
        list3.add(bnwa);
        if (bnxr2.f132351a && !list.isEmpty()) {
            int i22 = bnwj2.f132293c;
            int i23 = bnwj2.f132294d;
            int b3 = bnvt.m110566b(bnwj2.f132296f);
            int i24 = bnwj2.f132295e;
            if (i24 == 0 || i24 == 3) {
                i22 += b3;
            } else {
                i23 += b3;
            }
            long j8 = (long) i22;
            long j9 = (long) i23;
            bnxr2.mo68695a(bnwk.m110665b(bnxi.f132328e.mo68688a(bnwj2.f132291a.mo68579a(), j8 + j8, j9 + j9)));
            while (i9 < size) {
                bnxq bnxq2 = ((bnxo) list2.get(i9)).f132338a;
                if (((bnxk) bnym.f132377b.get(bnxq2.f132342a)).mo68652e()) {
                    bnxr2.mo68694a(bnxq2.f132342a, bnxq2.f132349h, bnxq2.f132350i);
                }
                i9++;
            }
            bnxr2.f132353c = bnwj2.f132291a.mo68590f().mo68592h();
        }
    }

    /* renamed from: a */
    private static void m110791a(bnxo bnxo, bnvj bnvj, List list, List list2, bnxp bnxp) {
        bnvj bnvj2 = bnxo.f132339b.f132223b;
        if (bnvj2.f132221b > bnvj.f132220a) {
            double d = bnvj2.f132220a;
            double d2 = bnvj.f132221b;
            if (d < d2) {
                list.add(m110792b(bnxo, true, d2, bnxp));
                list2.add(m110792b(bnxo, false, bnvj.f132220a, bnxp));
                return;
            }
            list2.add(bnxo);
            return;
        }
        list.add(bnxo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02db  */
    /* renamed from: a */
    public final bnwb mo68707a() {
        boolean z;
        bnxr bnxr;
        bnxr bnxr2;
        bnvt bnvt;
        boolean z2;
        bnvl bnvl;
        int i;
        bnxk bnxk;
        bnxj bnxj;
        bnvl bnvl2;
        int i2;
        bnvl bnvl3;
        bnvl bnvl4;
        if (!this.f132378c) {
            synchronized (this) {
                if (!this.f132378c) {
                    bmxy.m108601b(this.f132379d.isEmpty(), "Incremental updates not supported yet");
                    int i3 = 0;
                    for (int i4 = this.f132380e; i4 < this.f132377b.size(); i4++) {
                        i3 += ((bnxk) this.f132377b.get(i4)).mo68651d();
                    }
                    this.f132379d = m110788a(((i3 * 3) / 10) / 4);
                    List a = m110788a(6);
                    int i5 = 0;
                    for (int i6 = 6; i5 < i6; i6 = 6) {
                        a.add(m110788a(i3));
                        i5++;
                    }
                    bnxr bnxr3 = new bnxr(this.f132377b.size() - this.f132380e);
                    int i7 = this.f132380e;
                    while (true) {
                        z = true;
                        if (i7 >= this.f132377b.size()) {
                            break;
                        }
                        bnxk bnxk2 = (bnxk) this.f132377b.get(i7);
                        boolean e = bnxk2.mo68652e();
                        if (e) {
                            bnxr3.f132351a = true;
                            if (bnxk2.mo68654f()) {
                                bnxr3.mo68693a(i7);
                            }
                        }
                        int d = bnxk2.mo68651d();
                        bnxj bnxj2 = new bnxj();
                        bnvl bnvl5 = new bnvl();
                        bnvl bnvl6 = new bnvl();
                        int i8 = 0;
                        while (i8 < d) {
                            bnxk2.mo68643a(i8, bnxj2);
                            if (e) {
                                bnxr3.mo68694a(i7, bnxj2.f132333a, bnxj2.f132334b);
                            }
                            int a2 = bnxi.m110724a(bnxj2.f132333a);
                            if (a2 == bnxi.m110724a(bnxj2.f132334b)) {
                                bnxi.m110728a(a2, bnxj2.f132333a, bnvl5);
                                bnxi.m110728a(a2, bnxj2.f132334b, bnvl6);
                                double d2 = 1.0d - f132376a;
                                if (Math.abs(bnvl5.f132224a) <= d2 && Math.abs(bnvl5.f132225b) <= d2 && Math.abs(bnvl6.f132224a) <= d2) {
                                    if (Math.abs(bnvl6.f132225b) <= d2) {
                                        bnxk = bnxk2;
                                        i = i8;
                                        bnvl = bnvl6;
                                        z2 = e;
                                        bnxj = bnxj2;
                                        ((List) a.get(a2)).add(new bnxq(i7, i8, bnxj2.f132333a, bnxj2.f132334b, bnvl5, bnvl));
                                        bnvl3 = bnvl5;
                                        i8 = i + 1;
                                        bnxj2 = bnxj;
                                        bnvl5 = bnvl3;
                                        bnxk2 = bnxk;
                                        bnvl6 = bnvl;
                                        e = z2;
                                    } else {
                                        i = i8;
                                        bnvl = bnvl6;
                                        bnvl2 = bnvl5;
                                        bnxk = bnxk2;
                                        z2 = e;
                                        bnxj = bnxj2;
                                        i2 = 0;
                                        while (i2 < 6) {
                                            if (bnvx.m110602a(bnxj.f132333a, bnxj.f132334b, i2, f132376a, bnvl2, bnvl)) {
                                                bnvl4 = bnvl2;
                                                ((List) a.get(i2)).add(new bnxq(i7, i, bnxj.f132333a, bnxj.f132334b, bnvl2, bnvl));
                                            } else {
                                                bnvl4 = bnvl2;
                                            }
                                            i2++;
                                            bnvl2 = bnvl4;
                                        }
                                        bnvl3 = bnvl2;
                                        i8 = i + 1;
                                        bnxj2 = bnxj;
                                        bnvl5 = bnvl3;
                                        bnxk2 = bnxk;
                                        bnvl6 = bnvl;
                                        e = z2;
                                    }
                                }
                            }
                            i = i8;
                            bnvl = bnvl6;
                            bnvl2 = bnvl5;
                            bnxk = bnxk2;
                            z2 = e;
                            bnxj = bnxj2;
                            i2 = 0;
                            while (i2 < 6) {
                            }
                            bnvl3 = bnvl2;
                            i8 = i + 1;
                            bnxj2 = bnxj;
                            bnvl5 = bnvl3;
                            bnxk2 = bnxk;
                            bnvl6 = bnvl;
                            e = z2;
                        }
                        i7++;
                    }
                    int i9 = 0;
                    while (i9 < 6) {
                        List list = (List) a.get(i9);
                        int size = list.size();
                        if (size == 0) {
                            if (bnxr3.f132355e == 0) {
                                bnxr = bnxr3;
                                a.set(i9, null);
                                i9++;
                                bnxr3 = bnxr;
                                z = true;
                            }
                        }
                        List a3 = m110788a(size);
                        bnvk a4 = bnvk.m110505a();
                        int i10 = 0;
                        while (i10 < size) {
                            bnxq bnxq = (bnxq) list.get(i10);
                            bnxo bnxo = new bnxo();
                            bnxo.f132338a = bnxq;
                            bnxo.f132339b.f132222a.mo68520b(bnxq.f132345d, bnxq.f132347f);
                            bnxo.f132339b.f132223b.mo68520b(bnxq.f132346e, bnxq.f132348g);
                            a3.add(bnxo);
                            bnvk bnvk = bnxo.f132339b;
                            a4.f132222a.mo68517a(bnvk.f132222a);
                            a4.f132223b.mo68517a(bnvk.f132223b);
                            i10++;
                            list = list;
                            size = size;
                            bnxr3 = bnxr3;
                            z = true;
                            a3 = a3;
                        }
                        bnvt a5 = bnvt.m110560a(i9);
                        bnwj bnwj = new bnwj(a5, f132376a);
                        bnxp bnxp = new bnxp(a3.size());
                        if (size > 0) {
                            int b = bnvt.m110566b(bnwj.f132296f);
                            if (bnwj.f132296f == 0) {
                                if (!a4.f132222a.mo68518a(0.0d)) {
                                    if (!a4.f132223b.mo68518a(0.0d)) {
                                        bnxr2 = bnxr3;
                                    }
                                }
                                bnvt = bnwj.f132291a;
                                bnxr2 = bnxr3;
                                if (bnvt.f132250b != bnwj.f132291a.f132250b) {
                                    bnxr = bnxr2;
                                    m110789a(a5.mo68588e(), bnvt.mo68588e(), bnxr);
                                    mo68708a(new bnwj(bnvt, f132376a), a3, bnxr, bnxp);
                                    m110789a(bnvt.mo68590f().mo68592h(), a5.mo68590f().mo68592h(), bnxr);
                                    a.set(i9, null);
                                    i9++;
                                    bnxr3 = bnxr;
                                    z = true;
                                } else {
                                    bnxr = bnxr2;
                                }
                            } else {
                                bnvj bnvj = a4.f132222a;
                                bnxi bnxi = bnxi.f132328e;
                                long j = (long) bnwj.f132293c;
                                bnxr2 = bnxr3;
                                long j2 = (long) b;
                                if (!bnvj.mo68518a(bnxi.mo68686a(bnxi.m110723a(j + j + j2)))) {
                                    bnvj bnvj2 = a4.f132223b;
                                    bnxi bnxi2 = bnxi.f132328e;
                                    long j3 = (long) bnwj.f132294d;
                                    if (bnvj2.mo68518a(bnxi2.mo68686a(bnxi.m110723a(j3 + j3 + j2)))) {
                                    }
                                }
                                bnvt = bnwj.f132291a;
                                if (bnvt.f132250b != bnwj.f132291a.f132250b) {
                                }
                            }
                            bnvk a6 = a4.mo68527a(bnwj.f132292b + (bnvr.f132240c * 1.5d));
                            int max = Math.max(bnwj.f132293c, bnxi.m110729b(bnxi.f132328e.mo68689c(a6.f132222a.f132220a)));
                            int max2 = Math.max(bnwj.f132294d, bnxi.m110729b(bnxi.f132328e.mo68689c(a6.f132223b.f132220a)));
                            int min = (Math.min((bnwj.f132294d + b) - 1, bnxi.m110729b(bnxi.f132328e.mo68689c(a6.f132223b.f132221b))) ^ max2) | (Math.min((bnwj.f132293c + b) - 1, bnxi.m110729b(bnxi.f132328e.mo68689c(a6.f132222a.f132221b))) ^ max);
                            int numberOfLeadingZeros = 30 - (63 - Long.numberOfLeadingZeros((long) ((min + min) + (z ? 1 : 0))));
                            if (numberOfLeadingZeros > bnwj.f132296f) {
                                long j4 = bnvt.m110561a(bnwj.f132291a.mo68579a(), max, max2).f132250b;
                                long c = bnvt.m110571c(numberOfLeadingZeros);
                                bnvt = new bnvt(c | (j4 & (-c)));
                            } else {
                                bnvt = bnwj.f132291a;
                            }
                            if (bnvt.f132250b != bnwj.f132291a.f132250b) {
                            }
                        } else {
                            bnxr = bnxr3;
                        }
                        mo68708a(bnwj, a3, bnxr, bnxp);
                        a.set(i9, null);
                        i9++;
                        bnxr3 = bnxr;
                        z = true;
                    }
                    this.f132380e = this.f132377b.size();
                    this.f132378c = z;
                }
            }
        }
        return new bnwb(this.f132379d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnym.a(bnxo, boolean, double, bnxp):bnxo
     arg types: [bnxo, int, double, bnxp]
     candidates:
      bnym.a(bnwj, java.util.List, bnxr, bnxp):void
      bnym.a(bnxo, boolean, double, bnxp):bnxo */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68708a(bnwj bnwj, List list, bnxr bnxr, bnxp bnxp) {
        bnxr bnxr2;
        bnwj bnwj2 = bnwj;
        List list2 = list;
        bnxr bnxr3 = bnxr;
        bnxp bnxp2 = bnxp;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            i2 += bnwj2.f132296f < ((bnxo) list2.get(i)).f132338a.f132344c ? 1 : 0;
            if (i2 > 10) {
                List a = m110788a(size);
                List a2 = m110788a(size);
                List a3 = m110788a(size);
                List a4 = m110788a(size);
                bngx a5 = bngx.m109359a(a, a2, a3, a4);
                int i3 = bnxp2.f132340a;
                bnvk a6 = bnwj.mo68657a();
                int i4 = 0;
                while (i4 < size) {
                    bnxo bnxo = (bnxo) list2.get(i4);
                    bnvk bnvk = bnxo.f132339b;
                    bnvj bnvj = bnvk.f132222a;
                    double d = bnvj.f132221b;
                    int i5 = size;
                    bnvj bnvj2 = a6.f132222a;
                    bngx bngx = a5;
                    int i6 = i3;
                    if (d > bnvj2.f132220a) {
                        double d2 = bnvj.f132220a;
                        double d3 = bnvj2.f132221b;
                        if (d2 < d3) {
                            bnvj bnvj3 = bnvk.f132223b;
                            double d4 = bnvj3.f132221b;
                            bnvj bnvj4 = a6.f132223b;
                            bnvj bnvj5 = bnvj3;
                            if (d4 <= bnvj4.f132220a) {
                                a.add(m110786a(bnxo, true, d3, bnxp2));
                                a3.add(m110786a(bnxo, false, a6.f132222a.f132220a, bnxp2));
                            } else if (bnvj5.f132220a >= bnvj4.f132221b) {
                                a2.add(m110786a(bnxo, true, d3, bnxp2));
                                a4.add(m110786a(bnxo, false, a6.f132222a.f132220a, bnxp2));
                            } else {
                                m110791a(m110786a(bnxo, true, d3, bnxp2), a6.f132223b, a, a2, bnxp2);
                                m110791a(m110786a(bnxo, false, a6.f132222a.f132220a, bnxp2), a6.f132223b, a3, a4, bnxp2);
                            }
                        } else {
                            m110791a(bnxo, a6.f132223b, a3, a4, bnxp2);
                        }
                    } else {
                        m110791a(bnxo, a6.f132223b, a, a2, bnxp2);
                    }
                    i4++;
                    list2 = list;
                    size = i5;
                    a5 = bngx;
                    i3 = i6;
                }
                bngx bngx2 = a5;
                int i7 = i3;
                int i8 = 0;
                while (i8 < 4) {
                    bnwj bnwj3 = bnwj;
                    bngx bngx3 = bngx2;
                    List list3 = (List) bngx3.get(bnvr.m110549a(bnwj3.f132295e, i8));
                    if (!list3.isEmpty()) {
                        bnxr2 = bnxr;
                    } else {
                        bnxr2 = bnxr;
                        if (bnxr2.f132355e <= 0) {
                            i8++;
                            bngx2 = bngx3;
                        }
                    }
                    int a7 = bnvr.m110549a(bnwj3.f132295e, i8);
                    mo68708a(new bnwj(bnwj3, i8, a7 >> 1, a7 & 1), list3, bnxr2, bnxp2);
                    i8++;
                    bngx2 = bngx3;
                }
                bnxp2.f132340a = i7;
                return;
            }
            i++;
            list2 = list;
            bnxr3 = bnxr3;
            size = size;
        }
        m110790a(bnwj, list, bnxr);
    }

    /* renamed from: a */
    public final void mo68709a(bnxk bnxk) {
        this.f132377b.add(bnxk);
        this.f132378c = false;
    }
}
