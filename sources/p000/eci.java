package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: eci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eci {

    /* renamed from: a */
    public static final int[] f14678a = {0, 1};

    /* renamed from: c */
    private static final List f14679c;

    /* renamed from: b */
    public final Map f14680b = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        for (int i : f14678a) {
            arrayList.add(new ecf(i));
        }
        f14679c = arrayList;
    }

    /* renamed from: a */
    public static final List m10104a(List list, int i) {
        int i2;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ecg ecg = (ecg) list.get(i3);
            float c = ecg.mo9952c(i);
            if (i != 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            arrayList.add(Float.valueOf(c - ecg.mo9952c(i2)));
        }
        return ece.m10100a(arrayList, Float.valueOf(-120.0f));
    }

    /* renamed from: b */
    public static final List m10105b(List list, int i) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Float.valueOf(((ecg) list.get(i2)).mo9952c(i)));
        }
        return ece.m10100a(arrayList, Float.valueOf(-120.0f));
    }

    /* renamed from: a */
    public final List mo9955a(int i) {
        Comparator comparator = (Comparator) f14679c.get(i);
        ArrayList arrayList = new ArrayList();
        for (ecg ecg : this.f14680b.values()) {
            if (ecg.mo9950a(i)) {
                arrayList.add(ecg);
            }
        }
        Collections.sort(arrayList, comparator);
        return arrayList;
    }
}
