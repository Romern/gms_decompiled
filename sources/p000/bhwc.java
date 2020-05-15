package p000;

import java.util.List;

/* renamed from: bhwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwc implements bhwh {
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
        bhtr bhtr = bhtx.f119583d;
        C1245ok okVar = new C1245ok();
        bhub bhub = bhtx.f119580a;
        Float valueOf = Float.valueOf(1.0f);
        if (bhtr == null || bhub.f119610f - bhtr.f119566b > 300000) {
            okVar.put(bhuf.f119634p, valueOf);
            return okVar;
        }
        List list = bhtr.f119565a;
        int size = list.size();
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            bhtw bhtw = (bhtw) list.get(i2);
            float f2 = bhtw.f119579b;
            int i3 = bhtw.f119578a;
            f += i3 != 0 ? i3 != 1 ? i3 != 3 ? i3 != 7 ? i3 != 8 ? 0.0f : f2 + f2 : f2 : f2 * 0.0f : 4.0f * f2 : f2 * 15.0f;
            if (i3 == 7 && f2 > 0.9f) {
                okVar.put(bhuf.f119635q, valueOf);
            }
            if (i >= 3) {
                break;
            }
            i++;
            String str = bhuf.f119631m;
            int i4 = bhtw.f119578a;
            String str2 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 6 ? i4 != 7 ? i4 != 8 ? "unknown" : "running" : "walking" : "exiting_vehicle" : "still" : "on_foot" : "on_bicycle" : "in_vehicle";
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + str2.length());
            sb.append(str);
            sb.append(str2);
            sb.append("_rank");
            sb.append(i);
            okVar.put(sb.toString(), Float.valueOf(f2));
        }
        if (f > 0.0f) {
            okVar.put(bhuf.f119632n, Float.valueOf(Math.min(1.0f, f / 15.0f)));
        } else {
            okVar.put(bhuf.f119633o, valueOf);
        }
        return okVar;
    }
}
