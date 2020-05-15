package p000;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bhwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwn implements bhwh {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    private static float m101661a(float f) {
        return Math.min(1.0f, (Math.max(f, -100.0f) + 100.0f) / 60.0f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final C1245ok mo64353a(bhtx bhtx) {
        bhwr bhwr = bhtx.f119581b;
        boolean z = bhtx.f119584e;
        C1245ok okVar = new C1245ok();
        if (bhwr == null || bhwr.mo64366a() == 0) {
            return okVar;
        }
        if (z) {
            okVar.put(bhuf.f119629k, Float.valueOf(1.0f));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bhwr.mo64366a(); i++) {
            arrayList.add(Integer.valueOf(bhwr.mo64367a(i).f119746d));
        }
        okVar.put(bhuf.f119626h, Float.valueOf(Math.min(1.0f, ((float) arrayList.size()) / 25.0f)));
        Collections.sort(arrayList, Collections.reverseOrder());
        int i2 = 0;
        while (i2 < Math.min(arrayList.size(), 5)) {
            String str = bhuf.f119627i;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
            sb.append(str);
            sb.append("_rank");
            int i3 = i2 + 1;
            sb.append(i3);
            okVar.put(sb.toString(), Float.valueOf(m101661a((float) ((Integer) arrayList.get(i2)).intValue())));
            i2 = i3;
        }
        int size = arrayList.size();
        float f = 0.0f;
        if (size == 0) {
            String str2 = bhuf.f119628j;
            Float valueOf = Float.valueOf(0.0f);
            okVar.put(str2, valueOf);
            okVar.put(bhuf.f119630l, valueOf);
        } else {
            int size2 = arrayList.size();
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                Integer num = (Integer) arrayList.get(i4);
                f += (float) num.intValue();
                f2 += (float) (num.intValue() * num.intValue());
            }
            float f3 = (float) size;
            float f4 = f / f3;
            double sqrt = Math.sqrt((double) ((f2 / f3) - (f4 * f4)));
            okVar.put(bhuf.f119628j, Float.valueOf(m101661a(f4)));
            okVar.put(bhuf.f119630l, Float.valueOf(Math.min(1.0f, ((float) sqrt) / 30.0f)));
        }
        return okVar;
    }
}
