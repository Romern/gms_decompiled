package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bhwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwj implements bhwh {

    /* renamed from: a */
    private static final float[] f119734a = {0.0f, 10.0f, 20.0f, 40.0f, 80.0f, 160.0f, 320.0f, 640.0f};

    /* renamed from: b */
    private bhub f119735b = null;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public final C1245ok mo64353a(bhtx bhtx) {
        float f;
        int i;
        int i2;
        bhtx bhtx2 = bhtx;
        bhub bhub = bhtx2.f119580a;
        C1245ok okVar = new C1245ok();
        float f2 = bhub.f119611g;
        Float valueOf = Float.valueOf(1.0f);
        if (f2 > 0.0f) {
            okVar.put(bhuf.f119620b, Float.valueOf(Math.min(1.0f, f2 / 30.0f)));
        } else if (f2 == 0.0f) {
            okVar.put(bhuf.f119621c, valueOf);
        }
        int i3 = bhub.f119607c;
        int i4 = bhub.f119609e;
        int i5 = i3 / 1000;
        C1245ok okVar2 = new C1245ok();
        float[] fArr = f119734a;
        double d = (double) fArr[0];
        double d2 = (double) fArr[fArr.length - 1];
        double d3 = (double) i5;
        if (d3 >= d2) {
            String str = bhuf.f119619a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32);
            sb.append(str);
            sb.append(i4);
            sb.append("-accuracy-");
            sb.append((int) d2);
            okVar2.put(sb.toString(), valueOf);
        } else if (d3 <= d) {
            String str2 = bhuf.f119619a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 32);
            sb2.append(str2);
            sb2.append(i4);
            sb2.append("-accuracy-");
            sb2.append((int) d);
            okVar2.put(sb2.toString(), valueOf);
        } else {
            int i6 = 1;
            while (true) {
                float[] fArr2 = f119734a;
                if (i6 >= fArr2.length) {
                    i = -1;
                    i2 = -1;
                    break;
                } else if (((float) i5) < fArr2[i6]) {
                    i = i6 - 1;
                    i2 = i6;
                    break;
                } else {
                    i6++;
                }
            }
            float[] fArr3 = f119734a;
            float f3 = (fArr3[i2] - ((float) i5)) / (fArr3[i2] - fArr3[i]);
            String str3 = bhuf.f119619a;
            float f4 = f119734a[i2];
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 32);
            sb3.append(str3);
            sb3.append(i4);
            sb3.append("-accuracy-");
            sb3.append((int) f4);
            okVar2.put(sb3.toString(), Float.valueOf(f3));
            String str4 = bhuf.f119619a;
            float f5 = f119734a[i];
            StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 32);
            sb4.append(str4);
            sb4.append(i4);
            sb4.append("-accuracy-");
            sb4.append((int) f5);
            okVar2.put(sb4.toString(), Float.valueOf(1.0f - f3));
        }
        okVar.mo8150a(okVar2);
        C1245ok okVar3 = new C1245ok();
        bhub bhub2 = this.f119735b;
        if (bhub2 == null) {
            okVar3.put(bhuf.f119622d, valueOf);
        } else {
            bhub bhub3 = bhtx2.f119580a;
            float a = (float) ayuo.m84843a(bhub3.f119605a, bhub3.f119606b, bhub2.f119605a, bhub2.f119606b);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(bhtx2.f119580a.f119610f - this.f119735b.f119610f);
            okVar3.put(bhuf.f119623e, Float.valueOf(1.0f - (Math.min(a, 10000.0f) / 10000.0f)));
            okVar3.put(bhuf.f119624f, Float.valueOf(1.0f - (((float) Math.min(seconds, 3600L)) / 3600.0f)));
            String str5 = bhuf.f119625g;
            if (seconds != 0) {
                f = a / ((float) seconds);
            } else {
                f = 0.0f;
            }
            okVar3.put(str5, Float.valueOf(Math.min(f, 350.0f) / 350.0f));
        }
        okVar.mo8150a(okVar3);
        this.f119735b = bhub;
        return okVar;
    }
}
