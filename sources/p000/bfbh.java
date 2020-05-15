package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bfbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfbh implements bfbk {

    /* renamed from: a */
    public int f113296a;

    /* renamed from: b */
    public final bezi f113297b;

    /* renamed from: c */
    public final List f113298c;

    /* renamed from: d */
    public final List f113299d;

    /* renamed from: e */
    public final float[] f113300e;

    /* renamed from: f */
    public final /* synthetic */ bfbj f113301f;

    /* renamed from: g */
    private final int[] f113302g;

    /* renamed from: h */
    private final int f113303h;

    /* renamed from: i */
    private final bfbg f113304i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.Collection, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    public bfbh(bfbj bfbj, int i, int[] iArr, bfbg bfbg, bezi bezi, bfbo bfbo, List list) {
        this.f113301f = bfbj;
        this.f113296a = i;
        this.f113302g = iArr;
        this.f113304i = bfbg;
        this.f113297b = bezi;
        this.f113298c = list;
        this.f113303h = bqcn.m112580a(iArr);
        this.f113300e = new float[list.size()];
        ArrayList arrayList = new ArrayList(bngx.m109355a(bnjd.m109586b((Iterable) bfbo.f113326a.values(), bfbn.f113325a)));
        this.f113299d = arrayList;
        arrayList.removeAll(list);
    }

    /* renamed from: a */
    public final double mo61358a(int i) {
        boolean z;
        if (this.f113296a == this.f113301f.f113306a.get()) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        mo61360a(i, this.f113300e);
        float[] fArr = this.f113300e;
        double d = 0.0d;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (((bfbp) mo61359a().get(i2)).mo61367c()) {
                d += bezc.m96112a((double) fArr[i2], (double) ((bfbp) mo61359a().get(i2)).f113330c);
            }
        }
        return d;
    }

    /* renamed from: a */
    public final List mo61359a() {
        bmxy.m108600b(this.f113296a == this.f113301f.f113306a.get());
        return this.f113298c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02ce  */
    /* renamed from: a */
    public final void mo61360a(int i, float[] fArr) {
        boolean z;
        float[] fArr2;
        float[] fArr3;
        bfbj bfbj;
        bfbb bfbb;
        float[] fArr4;
        float[] fArr5;
        float[] fArr6;
        int i2;
        float[] fArr7;
        bfbj bfbj2;
        int i3;
        List list;
        long j;
        bfbc bfbc;
        double d;
        double d2;
        double d3;
        double d4;
        int i4 = i;
        if (fArr.length == this.f113302g.length) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        bfbj bfbj3 = this.f113301f;
        bfbg bfbg = this.f113304i;
        bezi bezi = this.f113297b;
        int i5 = this.f113303h;
        if (bezi.mo61274a(i4) == bznr.CLUTTER_BUILDING) {
            int i6 = i5 + 1;
            if (bfbj3.f113317l.length < i6) {
                bfbj3.f113317l = new float[i6];
            }
            fArr2 = bfbj3.f113317l;
        } else {
            float[] fArr8 = (float[]) bfbj3.f113316k.get(Integer.valueOf(i));
            if (fArr8 == null || fArr8.length < i5 + 1) {
                if (fArr8 != null) {
                    bfbj3.f113307b.mo61327o();
                } else {
                    bfbj3.f113307b.mo61326n();
                }
                if (fArr8 == null) {
                    fArr8 = new float[0];
                }
                float b = bezi.mo61276b(i4);
                bmxy.m108584a(i4, bezi.mo61290h());
                double b2 = bezi.mo61275b();
                double d5 = (double) (i4 % bezi.mo61278d());
                Double.isNaN(d5);
                double f = b2 + ((d5 + 0.5d) * bezi.mo61280f());
                double c = bezi.mo61277c();
                double d6 = (double) (i4 / bezi.mo61278d());
                Double.isNaN(d6);
                bnvl bnvl = new bnvl(f, c + ((d6 + 0.5d) * bezi.mo61280f()));
                bfbd a = bfbd.m96295a(bnvl.f132224a, bnvl.f132225b, (double) (b + 1.5f));
                ArrayList arrayList = bfbj3.f113308c;
                List subList = arrayList.subList(fArr8.length, arrayList.size());
                int size = subList.size();
                bfbd a2 = bfbd.m96295a((a.f113288a - bfbg.f113294a.mo61275b()) / bfbg.f113294a.mo61280f(), (a.f113289b - bfbg.f113294a.mo61277c()) / bfbg.f113294a.mo61280f(), a.f113290c);
                bezi bezi2 = bfbg.f113294a;
                bmxy.m108588a(bezi2.mo61274a(bezi2.mo61283a((int) a2.f113288a, (int) a2.f113289b)) != bznr.CLUTTER_UNKNOWN);
                if (a2.f113290c >= ((double) bfbg.f113294a.mo61276b(bfbg.f113294a.mo61283a((int) a2.f113288a, (int) a2.f113289b)))) {
                    float[] fArr9 = new float[size];
                    float[] fArr10 = new float[size];
                    int i7 = 0;
                    while (i7 < size) {
                        bfbe bfbe = (bfbe) subList.get(i7);
                        double d7 = bfbe.f113292b;
                        bmxy.m108596a(d7 >= -90.0d && d7 <= 90.0d, "Bad elevation: %s", Double.valueOf(d7));
                        double d8 = bfbe.f113291a;
                        bmxy.m108596a(d8 >= 0.0d && d8 <= 360.0d, "Bad azimuth: %s", Double.valueOf(d8));
                        double d9 = bfbe.f113292b;
                        bfbg.f113295b.getClass();
                        if (d9 < 5.0d) {
                            bfbc = new bfbc(0.0f, 0.0f);
                            bfbj2 = bfbj3;
                            list = subList;
                            i3 = size;
                            fArr5 = fArr9;
                            fArr7 = fArr8;
                            fArr6 = fArr10;
                            i2 = i7;
                            j = 4602678819172646912L;
                        } else {
                            double tan = Math.tan(Math.toRadians(d9));
                            double d10 = bfbe.f113292b;
                            bfbg.f113295b.getClass();
                            double tan2 = Math.tan(Math.toRadians(Math.min(d10 + 5.0d, 90.0d)));
                            double d11 = bfbe.f113292b;
                            list = subList;
                            bfbg.f113295b.getClass();
                            i3 = size;
                            double tan3 = Math.tan(Math.toRadians(Math.max(d11 - 0.875d, 0.01d)));
                            bfbj2 = bfbj3;
                            fArr6 = fArr10;
                            double hypot = Math.hypot(bfbg.f113294a.mo61280f(), bfbg.f113294a.mo61280f() * tan);
                            double d12 = 90.0d - bfbe.f113291a;
                            fArr7 = fArr8;
                            double[] dArr = {Math.cos(Math.toRadians(d12)), Math.sin(Math.toRadians(d12))};
                            double d13 = a2.f113288a;
                            double d14 = a2.f113289b;
                            double a3 = (double) bfbg.f113294a.mo61273a();
                            i2 = i7;
                            bfbe bfbe2 = bfbe;
                            double d15 = a2.f113290c;
                            Double.isNaN(a3);
                            double min = Math.min((a3 - d15) / tan3, (double) bfbg.f113295b.f113293a);
                            double d16 = -4.9E-324d;
                            double d17 = 0.0d;
                            double d18 = d14;
                            double d19 = 1.0E-6d;
                            double d20 = d13;
                            double d21 = hypot;
                            while (true) {
                                if (d19 <= min) {
                                    if (d16 >= tan2) {
                                        d = tan2;
                                        fArr5 = fArr9;
                                        break;
                                    }
                                    double d22 = min;
                                    bfbf bfbf = bfbg.f113295b;
                                    bfbf.getClass();
                                    bfbf.getClass();
                                    if (d17 * 0.5d >= 20.0d) {
                                        d = tan2;
                                        fArr5 = fArr9;
                                        break;
                                    }
                                    int i8 = (int) d20;
                                    int i9 = (int) d18;
                                    fArr5 = fArr9;
                                    if (!bfbg.f113294a.mo61287b(i8, i9)) {
                                        d = tan2;
                                        break;
                                    }
                                    int a4 = bfbg.f113294a.mo61283a(i8, i9);
                                    double d23 = tan2;
                                    double b3 = (double) bfbg.f113294a.mo61276b(a4);
                                    double d24 = d18;
                                    double d25 = a2.f113290c;
                                    Double.isNaN(b3);
                                    double d26 = (b3 - d25) / d19;
                                    if (bfbg.f113294a.mo61274a(a4) == bznr.CLUTTER_TREE) {
                                        d3 = d20;
                                        Double.isNaN(b3);
                                        double d27 = b3 - (a2.f113290c + (d19 * tan));
                                        if (d27 > 0.0d) {
                                            d4 = d21;
                                            d17 += Math.min(d27, d4);
                                            if (bfbg.f113294a.mo61274a(a4) == bznr.CLUTTER_UNKNOWN) {
                                                d16 = Math.max(d16, d26);
                                            }
                                            d18 = d24 + dArr[1];
                                            d19 += bfbg.f113294a.mo61280f();
                                            d21 = d4;
                                            min = d22;
                                            fArr9 = fArr5;
                                            d20 = d3 + dArr[0];
                                            tan2 = d23;
                                        }
                                    } else {
                                        d3 = d20;
                                    }
                                    d4 = d21;
                                    if (bfbg.f113294a.mo61274a(a4) == bznr.CLUTTER_UNKNOWN) {
                                    }
                                    d18 = d24 + dArr[1];
                                    d19 += bfbg.f113294a.mo61280f();
                                    d21 = d4;
                                    min = d22;
                                    fArr9 = fArr5;
                                    d20 = d3 + dArr[0];
                                    tan2 = d23;
                                } else {
                                    d = tan2;
                                    fArr5 = fArr9;
                                    break;
                                }
                            }
                            bfbf bfbf2 = bfbg.f113295b;
                            bfbf2.getClass();
                            double d28 = d17 * 0.5d;
                            if (d16 < d) {
                                bfbf2.getClass();
                                if (d28 < 20.0d) {
                                    double d29 = bfbe2.f113292b;
                                    double degrees = Math.toDegrees(Math.atan(d16));
                                    bfbf bfbf3 = bfbg.f113295b;
                                    bfbf3.getClass();
                                    bfbf3.getClass();
                                    bfbf3.getClass();
                                    double a5 = bqci.m112565a(degrees - d29, -5.0d, 5.0d);
                                    bfbg.f113295b.getClass();
                                    j = 4602678819172646912L;
                                    d2 = 0.5d - (a5 / 10.0d);
                                    bfbc = new bfbc((float) d2, (float) d28);
                                }
                            }
                            j = 4602678819172646912L;
                            d2 = 0.0d;
                            bfbc = new bfbc((float) d2, (float) d28);
                        }
                        float f2 = bfbc.f113286a;
                        fArr5[i2] = f2;
                        fArr6[i2] = f2 > 0.0f ? bfbc.f113287b : 999.0f;
                        i7 = i2 + 1;
                        bfbj3 = bfbj2;
                        fArr8 = fArr7;
                        fArr10 = fArr6;
                        fArr9 = fArr5;
                        subList = list;
                        size = i3;
                    }
                    bfbj = bfbj3;
                    fArr3 = fArr8;
                    bfbb = new bfbb(fArr9, fArr10);
                } else {
                    bfbj = bfbj3;
                    fArr3 = fArr8;
                    bfbb = new bfbb(new float[size], new float[size]);
                }
                bfbj bfbj4 = bfbj;
                float[] fArr11 = new float[bfbj4.f113308c.size()];
                int i10 = 0;
                while (true) {
                    fArr4 = fArr3;
                    if (i10 >= fArr4.length) {
                        break;
                    }
                    fArr11[i10] = fArr4[i10];
                    i10++;
                    fArr3 = fArr4;
                }
                int i11 = 0;
                while (true) {
                    int length = bfbb.f113285a.length;
                    if (i11 >= length) {
                        break;
                    }
                    int length2 = fArr4.length;
                    bmxy.m108599b(i11, length);
                    fArr11[length2 + i11] = bfbb.f113285a[i11];
                    i11++;
                }
                bfbj4.f113316k.put(Integer.valueOf(i), fArr11);
                fArr2 = fArr11;
            } else {
                bfbj3.f113307b.mo61325m();
                fArr2 = fArr8;
            }
        }
        int i12 = 0;
        while (true) {
            float[] fArr12 = fArr;
            if (i12 < fArr12.length) {
                fArr12[i12] = fArr2[this.f113302g[i12]];
                i12++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo61361a(bnwc bnwc, float[] fArr) {
        boolean z;
        if (fArr.length == this.f113302g.length) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        bfbg bfbg = this.f113304i;
        bezi bezi = bfbg.f113294a;
        int i = bfbg.f113295b.f113293a;
        if (!bfbw.m96322a(bezi, bnwc) || !bezi.mo61285a(bnwc, i)) {
            return false;
        }
        bezi bezi2 = this.f113297b;
        mo61360a(bezi2.mo61283a((int) bezi2.mo61282a(bnwc), (int) bezi2.mo61286b(bnwc)), fArr);
        return true;
    }
}
