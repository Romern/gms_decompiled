package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: bhvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvc {
    /* renamed from: a */
    public static float m101598a(bhwr bhwr, List list, long j) {
        if (!(bhwr == null || list == null || list.isEmpty() || bhwr.mo64366a() == 0)) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < bhwr.mo64366a(); i++) {
                bhwq a = bhwr.mo64367a(i);
                int i2 = a.f119746d;
                if (i2 >= -120) {
                    Long valueOf = Long.valueOf(a.f119744b & j);
                    if (hashMap.containsKey(valueOf)) {
                        i2 = Math.max(((Integer) hashMap.get(valueOf)).intValue(), i2);
                    }
                    hashMap.put(valueOf, Integer.valueOf(i2));
                }
            }
            int size = list.size();
            float f = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                bvoe bvoe = (bvoe) list.get(i3);
                Integer num = (Integer) hashMap.get(Long.valueOf(bvoe.f157022b));
                float a2 = m101599a(bvoe);
                if (num != null && a2 > 0.0f) {
                    f += a2 * ((float) (num.intValue() + 120));
                }
            }
            float f2 = 0.0f;
            for (Integer num2 : hashMap.values()) {
                float intValue = (float) (num2.intValue() + 120);
                f2 += intValue * intValue;
            }
            float sqrt = (float) Math.sqrt((double) f2);
            int size2 = list.size();
            float f3 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                float a3 = m101599a((bvoe) list.get(i4));
                if (a3 > 0.0f) {
                    f3 += a3 * a3;
                }
            }
            float sqrt2 = (float) Math.sqrt((double) f3);
            if (f != 0.0f) {
                return f / (sqrt * sqrt2);
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    private static float m101599a(bvoe bvoe) {
        float f = (float) bvoe.f157023c;
        return (bvoe.f157021a & 4) != 0 ? f * (((float) bvoe.f157024d) / 100.0f) : f;
    }

    /* renamed from: a */
    public static List m101600a(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new bhue());
        }
        return arrayList;
    }
}
