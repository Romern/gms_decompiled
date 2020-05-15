package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfbw {

    /* renamed from: a */
    private final bfbx f113352a;

    /* renamed from: b */
    private bezi f113353b;

    /* renamed from: c */
    private final boolean f113354c;

    /* renamed from: d */
    private final int f113355d;

    public bfbw(bfbx bfbx, int i, boolean z) {
        this.f113352a = bfbx;
        this.f113355d = i;
        this.f113354c = z;
        this.f113353b = !z ? new bezj() : null;
    }

    /* renamed from: a */
    public static boolean m96322a(bezi bezi, bnwc bnwc) {
        if (bezi.mo61291i()) {
            int a = (int) bezi.mo61282a(bnwc);
            int b = (int) bezi.mo61286b(bnwc);
            if (!bezi.mo61287b(a, b) || bezi.mo61274a(bezi.mo61283a(a, b)) == bznr.CLUTTER_UNKNOWN) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(short[], short):void}
     arg types: [short[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(short[], short):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.BitSet.set(int, boolean):void}
     arg types: [int, int]
     candidates:
      ClspMth{java.util.BitSet.set(int, int):void}
      ClspMth{java.util.BitSet.set(int, boolean):void} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0394  */
    /* renamed from: a */
    public final bmxv mo61376a(List list) {
        double d;
        bfbw bfbw;
        int size;
        int i;
        bezh bezh;
        bezh bezh2;
        double d2;
        boolean z;
        List list2 = list;
        bmxy.m108588a(!list.isEmpty());
        if (list.size() != 1) {
            bnwd d3 = bnwd.m110619d();
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                d3.mo68623a((bnwc) list2.get(i2));
            }
            bnwc g = d3.mo68634g();
            bnwc h = d3.mo68635h();
            double d4 = g.f132274a;
            double d5 = h.f132274a;
            double d6 = g.f132275b;
            double d7 = h.f132275b;
            double sin = Math.sin((d5 - d4) * 0.5d);
            double sin2 = Math.sin((d7 - d6) * 0.5d);
            double asin = Math.asin(Math.sqrt(Math.min(1.0d, (sin * sin) + (sin2 * sin2 * Math.cos(d4) * Math.cos(d5)))));
            d = bnvn.m110521a(asin + asin).mo68547c();
        } else {
            d = 0.0d;
        }
        bmxy.m108588a(d <= 2500.0d);
        try {
            bezi bezi = this.f113353b;
            if (bezi != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!bezi.mo61285a((bnwc) it.next(), this.f113355d)) {
                    }
                }
                bfbw = this;
                bezi bezi2 = bfbw.f113353b;
                size = list.size();
                i = 0;
                while (i < size) {
                    int i3 = i + 1;
                    if (!m96322a(bezi2, (bnwc) list.get(i))) {
                        return bmvz.f131120a;
                    }
                    i = i3;
                }
                return bmxv.m108566b(bfbw.f113353b);
            }
            if (!this.f113354c) {
                bfbx bfbx = this.f113352a;
                bezj bezj = (bezj) this.f113353b;
                bnwe a = bfcb.m96327a(list2, ((bfcb) bfbx).f113359a);
                bezn b = bezn.m96171b(a.mo68638j());
                Iterable a2 = bezl.m96168a(b, a, ((bfcb) bfbx).f113360b, ((bfcb) bfbx).f113361c);
                bnvk a3 = b.mo61299a(a);
                double a4 = bezl.m96167a(((bfcb) bfbx).f113361c);
                int floor = (int) (Math.floor(a3.mo68528b().f132224a / a4) * a4);
                int floor2 = (int) (Math.floor(a3.mo68528b().f132225b / a4) * a4);
                double d8 = a3.mo68529c().f132224a;
                double d9 = (double) floor;
                Double.isNaN(d9);
                int ceil = (int) Math.ceil((d8 - d9) / a4);
                double d10 = a3.mo68529c().f132225b;
                bezj bezj2 = bezj;
                double d11 = (double) floor2;
                Double.isNaN(d11);
                int ceil2 = (int) Math.ceil((d10 - d11) / a4);
                bezj bezj3 = bezj2;
                bezj3.f113152h = b;
                bezj3.f113145a = d9;
                bezj3.f113146b = d11;
                bezj3.f113147c = ceil;
                bezj3.f113148d = ceil2;
                bezj3.f113149e = a4;
                int i4 = ceil * ceil2;
                bezj3.f113153i = new BitSet(i4);
                bezj3.f113154j = new BitSet(i4);
                short[] sArr = bezj3.f113150f;
                if (sArr.length != i4) {
                    sArr = new short[i4];
                }
                Arrays.fill(sArr, (short) -23575);
                bezj3.f113150f = sArr;
                bezj3.f113151g = Float.NaN;
                Iterable<bfce> a5 = ((bfcb) bfbx).mo61377a(a2);
                bnvl bnvl = new bnvl(d9, d11);
                double d12 = bezj3.f113145a;
                bnvl bnvl2 = bnvl;
                double d13 = (double) ceil;
                Double.isNaN(d13);
                double d14 = d12 + (d13 * a4);
                double d15 = bezj3.f113146b;
                double d16 = (double) ceil2;
                Double.isNaN(d16);
                bnvk a6 = bnvk.m110506a(bnvl2, new bnvl(d14, d15 + (d16 * a4)));
                for (bfce bfce : a5) {
                    Iterator a7 = bfce.mo61381a(a6);
                    while (a7.hasNext()) {
                        bfcc bfcc = (bfcc) a7.next();
                        bnvl bnvl3 = bfcc.f113364a;
                        int a8 = bezj3.mo61283a((int) ((bnvl3.f132224a - bezj3.f113145a) / a4), (int) ((bnvl3.f132225b - bezj3.f113146b) / a4));
                        bznr bznr = bfcc.f113367d;
                        float f = bfcc.f113366c;
                        float f2 = bfcc.f113365b;
                        bezj3.f113154j.set(a8, bznr != bznr.CLUTTER_UNKNOWN);
                        if (!bezi.m96136a(bznr)) {
                            bezj3.f113153i.set(a8, false);
                            f2 = 0.0f;
                        } else {
                            bezj3.f113153i.set(a8, true);
                        }
                        bezj3.f113150f[a8] = bezi.m96135a(f + f2);
                        bezj3.f113151g = Float.NaN;
                    }
                }
                bfbw = this;
                bezi bezi22 = bfbw.f113353b;
                size = list.size();
                i = 0;
                while (i < size) {
                }
                return bmxv.m108566b(bfbw.f113353b);
            }
            bfbx bfbx2 = this.f113352a;
            bnwe a9 = bfcb.m96327a(list2, ((bfcb) bfbx2).f113359a);
            bezn b2 = bezn.m96171b(a9.mo68638j());
            Iterable a10 = bezl.m96168a(b2, a9, ((bfcb) bfbx2).f113360b, ((bfcb) bfbx2).f113361c);
            bnvk a11 = b2.mo61299a(a9);
            double a12 = bezl.m96167a(((bfcb) bfbx2).f113361c);
            int floor3 = (int) (Math.floor(a11.mo68528b().f132224a / a12) * a12);
            int floor4 = (int) (Math.floor(a11.mo68528b().f132225b / a12) * a12);
            double d17 = a11.mo68529c().f132224a;
            double d18 = (double) floor3;
            Double.isNaN(d18);
            int ceil3 = (int) Math.ceil((d17 - d18) / a12);
            double d19 = a11.mo68529c().f132225b;
            double d20 = (double) floor4;
            Double.isNaN(d20);
            int ceil4 = (int) Math.ceil((d19 - d20) / a12);
            bezh bezh3 = bezh;
            double d21 = d20;
            double d22 = d18;
            try {
                bezh = new bezh(b2, d18, d20, ceil3, ceil4, a12);
                Iterable<bfce> a13 = ((bfcb) bfbx2).mo61377a(a10);
                double d23 = d21;
                bnvl bnvl4 = new bnvl(d22, d23);
                double d24 = (double) ceil3;
                Double.isNaN(d24);
                Double.isNaN(d22);
                double d25 = d22 + (d24 * a12);
                double d26 = (double) ceil4;
                Double.isNaN(d26);
                Double.isNaN(d23);
                bnvk a14 = bnvk.m110506a(bnvl4, new bnvl(d25, d23 + (d26 * a12)));
                for (bfce bfce2 : a13) {
                    Iterator a15 = bfce2.mo61381a(a14);
                    while (a15.hasNext()) {
                        bfcc bfcc2 = (bfcc) a15.next();
                        bnvl bnvl5 = bfcc2.f113364a;
                        double d27 = bnvl5.f132224a;
                        Double.isNaN(d2);
                        int i5 = (int) ((d27 - d2) / a12);
                        double d28 = bnvl5.f132225b;
                        Double.isNaN(d23);
                        int i6 = (int) ((d28 - d23) / a12);
                        if (i5 < 0 || i6 < 0 || i5 >= ceil3 || i6 >= ceil4) {
                            d2 = d2;
                            bezh2 = bezh2;
                        } else {
                            bezh bezh4 = bezh2;
                            bmxy.m108584a(i5, bezh4.f113139d);
                            bmxy.m108584a(i6, bezh4.f113140e);
                            int i7 = (i6 * bezh4.f113139d) + i5;
                            bznr bznr2 = bfcc2.f113367d;
                            float f3 = bfcc2.f113366c;
                            float f4 = bfcc2.f113365b;
                            if (bezh4.f113143h != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bmxy.m108601b(z, "Call build() once");
                            double d29 = d2;
                            bezh4.f113143h.set(i7, bznr2 != bznr.CLUTTER_UNKNOWN);
                            if (!bezi.m96136a(bznr2)) {
                                bezh4.f113142g.set(i7, false);
                                f4 = 0.0f;
                            } else {
                                bezh4.f113142g.set(i7, true);
                            }
                            bezh4.f113144i[i7] = bezi.m96135a(f3 + f4);
                            d2 = d29;
                            bezh2 = bezh4;
                        }
                    }
                    d22 = d2;
                    bezh3 = bezh2;
                }
                bezh bezh5 = bezh2;
                bmxy.m108601b(bezh5.f113143h != null, "Call build() once");
                bezg bezg = new bezg(bezh5);
                bezh5.f113142g = null;
                bezh5.f113143h = null;
                bezh5.f113144i = null;
                bfbw = this;
                try {
                    bfbw.f113353b = bezg;
                    bezi bezi222 = bfbw.f113353b;
                    size = list.size();
                    i = 0;
                    while (i < size) {
                    }
                    return bmxv.m108566b(bfbw.f113353b);
                } catch (bfbq | IOException e) {
                    e = e;
                    if (!bfbw.f113354c) {
                        bfbw.f113353b = new bezj();
                    }
                    throw e;
                }
            } catch (bfbq | IOException e2) {
                e = e2;
                bfbw = this;
                if (!bfbw.f113354c) {
                }
                throw e;
            }
        } catch (bfbq | IOException e3) {
            e = e3;
            bfbw = this;
            if (!bfbw.f113354c) {
            }
            throw e;
        }
    }
}
