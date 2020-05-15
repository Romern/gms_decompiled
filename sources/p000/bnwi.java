package p000;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bnwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnwi implements Comparable, Serializable, bnxk {

    /* renamed from: a */
    transient bnym f132283a;

    /* renamed from: b */
    public final int f132284b;

    /* renamed from: c */
    public bnwe f132285c;

    /* renamed from: d */
    public int f132286d;

    /* renamed from: e */
    private final AtomicInteger f132287e;

    /* renamed from: f */
    private final bnwk[] f132288f;

    /* renamed from: g */
    private bnwe f132289g;

    /* renamed from: h */
    private boolean f132290h;

    static {
        bnwk bnwk = bnwk.f132299a;
    }

    public bnwi(List list) {
        bnwc bnwc;
        int i;
        bnwk bnwk;
        double d;
        double d2;
        bnwi bnwi = this;
        bnwi.f132287e = new AtomicInteger();
        m110646g();
        int size = list.size();
        bnwi.f132284b = size;
        bnwk[] bnwkArr = new bnwk[size];
        bnwi.f132288f = bnwkArr;
        list.toArray(bnwkArr);
        int i2 = 0;
        bnwi.f132286d = 0;
        double d3 = 0.0d;
        boolean z = true;
        if (bnwi.f132284b >= 3) {
            bnwi.f132290h = false;
            if (bnwt.m110687a(bnvr.m110552b(bnwi.mo68642a(1)), bnwi.mo68642a(0), bnwi.mo68642a(2), bnwi.mo68642a(1)) != bnwi.mo68645a(bnwi.mo68642a(1))) {
                bnwi.f132290h = true;
            }
        } else if (mo68649c()) {
            bnwi.f132290h = bnwi.mo68642a(0).f132308j >= 0.0d ? false : z;
        } else {
            bnwi.f132290h = false;
        }
        if (bnwi.f132284b >= 3) {
            bnvw bnvw = new bnvw();
            while (i2 <= bnwi.f132284b) {
                bnwk a = bnwi.mo68642a(i2);
                bnwc bnwc2 = new bnwc(a);
                if (bnvw.f132261a.mo68637i()) {
                    bnvw.f132261a.mo68623a(bnwc2);
                    i = i2;
                    bnwk = a;
                    bnwc = bnwc2;
                } else {
                    bnwk c = bnwk.m110667c(bnwk.m110666b(bnvw.f132262b, a), bnwk.m110664a(bnvw.f132262b, a));
                    double a2 = c.mo68658a();
                    if (a2 >= 1.91346E-15d) {
                        bnvw.f132264d.mo68560a(bnvw.f132263c.mo68616c().f132229b, bnwc2.mo68616c().f132229b);
                        double h = bnvw.f132264d.mo68570h();
                        double d4 = bnvr.f132240c;
                        if (h >= 3.141592653589793d - (d4 + d4)) {
                            bnvw.f132264d.mo68564b();
                        }
                        bnvw.f132265e.mo68520b(bnvw.f132263c.mo68614a().f132229b, bnwc2.mo68614a().f132229b);
                        bnwk c2 = bnwk.m110667c(c, bnwk.f132304f);
                        double a3 = c2.mo68659a(bnvw.f132262b);
                        double a4 = c2.mo68659a(a);
                        double d5 = (a2 * 6.06638E-16d) + 6.83174E-31d;
                        if (a3 * a4 < d3 || Math.abs(a3) <= d5 || Math.abs(a4) <= d5) {
                            double d6 = bnvr.f132240c;
                            double d7 = c.f132306h;
                            i = i2;
                            double d8 = c.f132307i;
                            double min = Math.min(1.5707963267948966d, (d6 * 3.0d) + Math.atan2(Math.sqrt((d7 * d7) + (d8 * d8)), Math.abs(c.f132308j)));
                            double asin = Math.asin(bnwk.m110666b(bnvw.f132262b, a).mo68658a() * 0.5d * Math.sin(min));
                            bnvj bnvj = bnvw.f132265e;
                            bnwc = bnwc2;
                            double d9 = min;
                            double d10 = (((asin + asin) - (bnvj.f132221b - bnvj.f132220a)) * 0.5d) + bnvr.f132240c;
                            if (a3 > d5 || a4 < (-d5)) {
                                bnwk = a;
                                d = d10;
                                d2 = d9;
                            } else {
                                bnvj bnvj2 = bnvw.f132265e;
                                bnwk = a;
                                d = d10;
                                d2 = d9;
                                bnvj2.f132221b = Math.min(d2, bnvj2.f132221b + d10);
                            }
                            if (a4 <= d5 && a3 >= (-d5)) {
                                bnvj bnvj3 = bnvw.f132265e;
                                bnvj3.f132220a = Math.max(-d2, bnvj3.f132220a - d);
                            }
                        } else {
                            i = i2;
                            bnwk = a;
                            bnwc = bnwc2;
                        }
                        bnvw.f132261a.mo68624a(new bnwe(bnvw.f132265e, bnvw.f132264d));
                    } else if (bnvw.f132262b.mo68659a(a) < d3) {
                        bnwd bnwd = bnvw.f132261a;
                        bnwd.f132276a.mo68523c(-1.5707963267948966d, 1.5707963267948966d);
                        bnwd.f132277b.mo68564b();
                        i = i2;
                        bnwk = a;
                        bnwc = bnwc2;
                    } else {
                        bnwd bnwd2 = bnvw.f132261a;
                        bnwc bnwc3 = bnvw.f132263c;
                        bnvj a5 = bnvj.m110497a(bnwc3.mo68614a().f132229b, bnwc2.mo68614a().f132229b);
                        double d11 = bnwc3.mo68616c().f132229b;
                        double d12 = bnwc2.mo68616c().f132229b;
                        bnvp bnvp = new bnvp();
                        bnvp.mo68560a(d11, d12);
                        bnwd2.mo68624a(new bnwe(a5, bnvp));
                        i = i2;
                        bnwk = a;
                        bnwc = bnwc2;
                    }
                }
                bnvw.f132262b = bnwk;
                bnvw.f132263c = bnwc;
                i2 = i + 1;
                bnwi = this;
                d3 = 0.0d;
            }
            double d13 = bnvr.f132240c;
            bnwe f = bnvw.f132261a.mo68626c().mo68628a(bnwc.m110612a(d13 + d13, d3)).mo68630f();
            f = bnwi.mo68645a(bnwk.f132304f) ? new bnwe(new bnvj(f.f132276a.f132220a, 1.5707963267948966d), bnvp.m110536d()) : f;
            if (f.f132277b.mo68566e() && bnwi.mo68645a(bnwk.f132305g)) {
                f = new bnwe(new bnvj(-1.5707963267948966d, f.f132276a.f132221b), f.f132277b);
            }
            bnwi.f132285c = f;
            bnwi.f132289g = bnvw.m110596a(f);
        } else if (mo68646b()) {
            bnwe d14 = bnwe.m110627d();
            this.f132285c = d14;
            this.f132289g = d14;
        } else {
            bnwe c3 = bnwe.m110626c();
            this.f132285c = c3;
            this.f132289g = c3;
        }
    }

    /* renamed from: a */
    static bnwi m110642a(int i, bnvg bnvg) {
        Iterator it;
        bnwi bnwi;
        int i2;
        int i3;
        int d = bnvg.mo68515d();
        ArrayList arrayList = new ArrayList(d);
        bnwn bnwn = new bnwn();
        int i4 = 0;
        while (i4 < d) {
            long e = bnvg.mo68516e();
            bnwm bnwm = new bnwm((int) (e % 6), (int) (e / 6));
            bnwn.f132314a.add(bnwm);
            i4 += bnwm.f132313b;
        }
        Iterator it2 = bnwn.f132314a.iterator();
        if (!it2.hasNext()) {
            it = Collections.emptyIterator();
        } else {
            it = new bnwl(it2);
        }
        bnwo bnwo = new bnwo();
        bnwo bnwo2 = new bnwo();
        for (int i5 = 0; i5 < d; i5++) {
            if (i5 != 0) {
                int[] a = bnvd.m110484a(bnvg.mo68516e());
                i2 = bnwo.mo68671a(bnve.m110485a(a[0]));
                i3 = bnwo2.mo68671a(bnve.m110485a(a[1]));
            } else {
                int i6 = (i + 7) / 8;
                int i7 = i6 + i6;
                byte[] bArr = new byte[i7];
                if (bnvg.f132219a.read(bArr) >= i7) {
                    int[] a2 = bnvd.m110484a(Long.reverseBytes(bqcr.m112594a(Arrays.copyOf(bArr, 8))));
                    i2 = bnwo.mo68671a(a2[0]);
                    i3 = bnwo2.mo68671a(a2[1]);
                } else {
                    throw new IOException("EOF");
                }
            }
            arrayList.add(bnwk.m110665b(bnxi.m110725a(((Integer) it.next()).intValue(), bnxi.f132328e.mo68686a(bnwp.m110675a(i2, i)), bnxi.f132328e.mo68686a(bnwp.m110675a(i3, i)))));
        }
        int d2 = bnvg.mo68515d();
        if (d2 <= d) {
            for (int i8 = 0; i8 < d2; i8++) {
                arrayList.set(bnvg.mo68515d(), new bnwk(bnvg.mo68514c(), bnvg.mo68514c(), bnvg.mo68514c()));
            }
            bnwh bnwh = new bnwh(bnvg.mo68516e());
            int d3 = bnvg.mo68515d();
            if (bnwh.mo68640a(bnwg.BOUND_ENCODED)) {
                bnwi = m110644a(arrayList, bnwh.mo68640a(bnwg.ORIGIN_INSIDE), bnwe.m110625a(bnvg));
            } else {
                bnwi = new bnwi(arrayList);
            }
            bnwi.f132286d = d3;
            return bnwi;
        }
        throw new IOException("Number of off-center points is greater than total amount of points.");
    }

    /* renamed from: g */
    private final void m110646g() {
        int i = this.f132284b;
        int i2 = 10;
        if (i > 8) {
            if (i <= 8192) {
                i2 = 50;
            } else if (i > 50000) {
                i2 = 2;
            }
        }
        this.f132287e.set(i2);
        bnym bnym = new bnym();
        this.f132283a = bnym;
        bnym.mo68709a(this);
    }

    /* renamed from: h */
    private final int m110647h() {
        int i;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            i = this.f132284b;
            if (i2 >= i) {
                break;
            }
            if (mo68642a(i2).compareTo(mo68642a(i3)) < 0) {
                i3 = i2;
            }
            i2++;
        }
        return (i <= 0 || mo68642a(i3 + 1).compareTo(mo68642a((this.f132284b + i3) + -1)) < 0) ? i3 : i3 + this.f132284b;
    }

    private Object readResolve() {
        m110646g();
        return this;
    }

    /* renamed from: b */
    public final boolean mo68646b() {
        return mo68649c() && this.f132290h;
    }

    /* renamed from: c */
    public final boolean mo68649c() {
        return this.f132284b == 1;
    }

    /* renamed from: d */
    public final int mo68651d() {
        if (!mo68649c()) {
            return this.f132284b;
        }
        return 0;
    }

    /* renamed from: e */
    public final boolean mo68652e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnwi) {
            bnwi bnwi = (bnwi) obj;
            return Arrays.equals(this.f132288f, bnwi.f132288f) && bmxi.m108538a(Boolean.valueOf(this.f132290h), Boolean.valueOf(bnwi.f132290h)) && bmxi.m108538a(this.f132285c, bnwi.f132285c);
        }
    }

    /* renamed from: f */
    public final boolean mo68654f() {
        return this.f132290h;
    }

    public final int hashCode() {
        return this.f132285c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S2Loop, ");
        sb.append(this.f132288f.length);
        sb.append(" points. [");
        for (bnwk bnwk : this.f132288f) {
            sb.append(bnwk.mo68661c());
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final boolean mo68647b(bnwi bnwi) {
        bnwe bnwe = this.f132289g;
        bnwe bnwe2 = bnwi.f132285c;
        bnvj bnvj = bnwe.f132276a;
        bnvj bnvj2 = bnwe2.f132276a;
        if ((!bnvj2.mo68521b() && (bnvj2.f132220a < bnvj.f132220a || bnvj2.f132221b > bnvj.f132221b)) || !bnwe.f132277b.mo68563a(bnwe2.f132277b)) {
            return false;
        }
        if (!mo68649c() && bnwi.f132284b >= 2) {
            bnwk a = bnwi.mo68642a(1);
            int i = -1;
            if (this.f132284b < 10) {
                int i2 = 1;
                while (true) {
                    if (i2 <= this.f132284b) {
                        if (mo68642a(i2).mo68662c(a)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            } else {
                bnwb a2 = this.f132283a.mo68707a();
                if (a2.mo68608a(a)) {
                    bnyj a3 = ((bnxn) a2.mo68609b()).mo68690a(0);
                    int d = a3.mo68698d() - 1;
                    while (true) {
                        if (d < 0) {
                            break;
                        }
                        int b = a3.mo68697b(d);
                        if (!mo68642a(b).mo68662c(a)) {
                            int i3 = b + 1;
                            if (mo68642a(i3).mo68662c(a)) {
                                i = i3;
                                break;
                            }
                            d--;
                        } else {
                            i = b == 0 ? this.f132284b : b;
                        }
                    }
                }
            }
            if (i < 0) {
                return mo68645a(bnwi.mo68642a(1));
            }
            bnwk a4 = mo68642a(i - 1);
            bnwk a5 = mo68642a(i);
            bnwk a6 = mo68642a(i + 1);
            bnwk a7 = bnwi.mo68642a(0);
            if (!bnwt.m110687a(a6, bnwi.mo68642a(2), a7, a5) || !bnwt.m110687a(a7, a4, a6, a5)) {
                return false;
            }
            return true;
        } else if (mo68646b() || bnwi.mo68644a()) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo68648b(bnwk bnwk) {
        if (this.f132284b < 3) {
            return this.f132290h;
        }
        bnvv bnvv = new bnvv(bnvr.f132241d, bnwk, mo68642a(0));
        boolean z = this.f132290h;
        for (int i = 1; i <= this.f132284b; i++) {
            z ^= bnvv.mo68604c(mo68642a(i));
        }
        return z;
    }

    /* renamed from: a */
    static bnwi m110643a(bnvg bnvg) {
        boolean z;
        byte a = bnvg.mo68512a();
        boolean z2 = true;
        if (a == 1) {
            int b = bnvg.mo68513b();
            if (b >= 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "Loops with more than 2^31 - 1 vertices not supported.");
            ArrayList arrayList = new ArrayList(b);
            for (int i = 0; i < b; i++) {
                arrayList.add(new bnwk(bnvg.mo68514c(), bnvg.mo68514c(), bnvg.mo68514c()));
            }
            if (bnvg.mo68512a() == 0) {
                z2 = false;
            }
            int b2 = bnvg.mo68513b();
            bnwi a2 = m110644a(arrayList, z2, bnwe.m110625a(bnvg));
            a2.f132286d = b2;
            if (b > 0) {
                a2.m110646g();
            }
            return a2;
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Unknown S2Loop encoding version encountered during decoding: ");
        sb.append((int) a);
        throw new IOException(sb.toString());
    }

    private bnwi(List list, boolean z, bnwe bnwe) {
        this.f132287e = new AtomicInteger();
        m110646g();
        int size = list.size();
        this.f132284b = size;
        this.f132288f = new bnwk[size];
        this.f132285c = bnwe;
        this.f132289g = bnvw.m110596a(bnwe);
        this.f132286d = 0;
        this.f132290h = z;
        list.toArray(this.f132288f);
    }

    /* renamed from: a */
    public static bnwi m110644a(List list, boolean z, bnwe bnwe) {
        return new bnwi(list, z, bnwe);
    }

    /* renamed from: a */
    public static boolean m110645a(bnwk bnwk, bnwk bnwk2, bnwk bnwk3, bnwk bnwk4) {
        if (bnwk4.mo68662c(bnwk)) {
            return false;
        }
        if (bnwk4.mo68662c(bnwk3)) {
            return true;
        }
        return bnwt.m110687a(bnwk, bnwk3, bnwk4, bnwk2);
    }

    /* renamed from: a */
    public final int compareTo(bnwi bnwi) {
        int i = this.f132284b;
        int i2 = bnwi.f132284b;
        if (i != i2) {
            return i - i2;
        }
        if (i != 0) {
            int h = m110647h() % this.f132284b;
            int h2 = bnwi.m110647h() % bnwi.f132284b;
            int i3 = 0;
            while (i3 < i) {
                int d = mo68642a(h).compareTo(bnwi.mo68642a(h2));
                if (d != 0) {
                    return d;
                }
                i3++;
                h++;
                h2++;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final bnwk mo68642a(int i) {
        try {
            bnwk[] bnwkArr = this.f132288f;
            int length = bnwkArr.length;
            if (i >= length) {
                i -= length;
            }
            return bnwkArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalStateException("Invalid vertex index");
        }
    }

    /* renamed from: a */
    public final void mo68643a(int i, bnxj bnxj) {
        bnwk a = mo68642a(i);
        bnwk a2 = mo68642a(i + 1);
        bnxj.f132333a = a;
        bnxj.f132334b = a2;
    }

    /* renamed from: a */
    public final boolean mo68644a() {
        return mo68649c() && !this.f132290h;
    }

    /* renamed from: a */
    public final boolean mo68645a(bnwk bnwk) {
        bnwe bnwe;
        if (!this.f132283a.f132378c && (bnwe = this.f132285c) != null && !bnwe.mo68632a(bnwk)) {
            return false;
        }
        if (this.f132284b <= 32 || (!this.f132283a.f132378c && this.f132287e.decrementAndGet() > 0)) {
            return mo68648b(bnwk);
        }
        bnwb a = this.f132283a.mo68707a();
        if (a.mo68608a(bnwk)) {
            bnyj a2 = ((bnxn) a.mo68609b()).mo68690a(0);
            boolean c = a2.mo68696c();
            int d = a2.mo68698d();
            if (d > 0) {
                bnvv bnvv = new bnvv(a.mo68610c(), bnwk);
                int i = -2;
                int i2 = 0;
                while (i2 < d) {
                    int b = a2.mo68697b(i2);
                    if (b != i + 1) {
                        bnvv.mo68602a(mo68642a(b));
                    }
                    c ^= bnvv.mo68604c(mo68642a(b + 1));
                    i2++;
                    i = b;
                }
            }
            if (c) {
                return true;
            }
        }
        return false;
    }
}
