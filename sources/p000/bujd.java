package p000;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* renamed from: bujd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bujd implements buiw {

    /* renamed from: a */
    private static final Comparator f153999a = buiy.f153994a;

    /* renamed from: b */
    private final float[] f154000b = new float[19];

    /* renamed from: c */
    private final float[] f154001c = new float[6];

    /* renamed from: d */
    private final float[] f154002d = new float[6];

    /* renamed from: e */
    private final float[] f154003e = new float[24];

    /* renamed from: f */
    private SoftReference f154004f = new SoftReference(null);

    /* renamed from: g */
    private SoftReference f154005g = new SoftReference(null);

    /* renamed from: h */
    private final bgmm f154006h;

    /* renamed from: i */
    private final bulq f154007i;

    public bujd(bgmm bgmm, bulq bulq) {
        this.f154006h = bgmm;
        this.f154007i = bulq;
    }

    /* renamed from: a */
    public static double m119593a(List list, buiz buiz) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            arrayList.add(Double.valueOf(buiz.mo72718a(obj)));
        }
        Collections.sort(arrayList);
        return ((Double) arrayList.get(arrayList.size() / 2)).doubleValue();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(float[], float):void}
     arg types: [float[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        monitor-enter(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5 = (p000.bukl) r1.f154005g.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        if (r5 != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004b, code lost:
        r5 = new java.io.DataInputStream(r1.f154006h.mo62780a("locationmodel/wifi_accuracy.model.uncompressed"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r6 = p000.bukl.m119737a(r5);
        r1.f154005g = new java.lang.ref.SoftReference(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0069, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        p000.bqye.m113761a(r3, r0);
     */
    /* renamed from: a */
    public final synchronized bfni mo72716a(Set set, bukm bukm) {
        int i;
        bukl bukl;
        bukl bukl2;
        float f;
        float f2;
        Throwable th;
        Throwable th2;
        bukm bukm2 = bukm;
        synchronized (this) {
            char c = 2;
            if (!set.isEmpty()) {
                try {
                    synchronized (this) {
                        bukl = (bukl) this.f154004f.get();
                        if (bukl == null) {
                            DataInputStream dataInputStream = new DataInputStream(this.f154006h.mo62780a("locationmodel/wifi_location.model.uncompressed"));
                            try {
                                bukl = bukl.m119737a(dataInputStream);
                                this.f154004f = new SoftReference(bukl);
                                dataInputStream.close();
                            } catch (Throwable th3) {
                                bqye.m113761a(th2, th3);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList(set);
                    Collections.sort(arrayList, f153999a);
                    int i2 = 20;
                    char c2 = 0;
                    List subList = arrayList.subList(0, Math.min(arrayList.size(), 20));
                    bujc bujc = new bujc(subList);
                    Arrays.fill(this.f154001c, 0.0f);
                    Arrays.fill(this.f154002d, 0.0f);
                    int i3 = 0;
                    float[] fArr = null;
                    while (true) {
                        float f3 = 1.4f;
                        if (i3 != i2) {
                            buje buje = i3 < subList.size() ? (buje) subList.get(i3) : null;
                            float f4 = (float) i3;
                            float size = (float) subList.size();
                            float[] fArr2 = this.f154000b;
                            fArr2[c2] = buje != null ? buje.f154013f : -105.0f;
                            fArr2[1] = buje != null ? buje.f154010c : -55.0f;
                            if (buje != null) {
                                f3 = buje.f154011d;
                            }
                            fArr2[c] = f3;
                            if (buje != null) {
                                f = (float) ayuo.m84840a(buje.f154018k - bujc.f153998b, buje.f154017j);
                            } else {
                                f = 0.0f;
                            }
                            fArr2[3] = f;
                            float[] fArr3 = this.f154000b;
                            if (buje != null) {
                                f2 = (float) ayuo.m84853d(buje.f154017j - bujc.f153997a);
                            } else {
                                f2 = 0.0f;
                            }
                            fArr3[4] = f2;
                            float[] fArr4 = this.f154000b;
                            fArr4[5] = f4;
                            fArr4[6] = size;
                            int i4 = 0;
                            int i5 = 7;
                            while (i4 < 6) {
                                this.f154000b[i5] = this.f154001c[i4];
                                i4++;
                                i5++;
                            }
                            int i6 = 0;
                            while (i6 < 6) {
                                this.f154000b[i5] = this.f154002d[i6];
                                i6++;
                                i5++;
                            }
                            fArr = bukl.mo72778a(this.f154000b);
                            System.arraycopy(this.f154002d, 0, this.f154001c, 0, 6);
                            System.arraycopy(fArr, 0, this.f154002d, 0, 6);
                            if (i3 < 4) {
                                System.arraycopy(fArr, 0, this.f154003e, i3 * 6, 6);
                            }
                            i3++;
                            c = 2;
                            i2 = 20;
                            c2 = 0;
                        } else {
                            int length = fArr.length;
                            float f5 = fArr[length - 2];
                            double d = (double) fArr[length - 1];
                            bfni bfni = new bfni(ayuo.m84844a(bujc.f153997a + ayuo.m84855e(d)), ayuo.m84844a(bujc.f153998b + ayuo.m84845b((double) f5, ayuo.m84855e(d) + bujc.f153997a)), (int) (Math.max(Math.min(bukl2.mo72778a(this.f154003e)[0], 150.0f), 3.0f) * 1.4f * 1000.0f));
                            return bfni;
                        }
                    }
                } catch (IOException | ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
                    if (!(e instanceof IOException)) {
                        i = 9;
                    } else {
                        i = 8;
                    }
                    bukm2.mo72781a(i, ((bulp) this.f154007i).f154162c.mo62775b());
                    return null;
                }
            } else {
                bukm2.mo72781a(2, ((bulp) this.f154007i).f154162c.mo62775b());
                return null;
            }
        }
        throw th;
        throw th2;
    }
}
