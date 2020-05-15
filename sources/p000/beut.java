package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: beut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beut implements beuk {

    /* renamed from: b */
    public static final beur[] f112546b = {beur.ON_BICYCLE, beur.INCONSISTENT, beur.RUNNING, beur.STILL, beur.IN_VEHICLE, beur.WALKING};

    /* renamed from: c */
    private final beuy f112547c;

    public beut(ByteBuffer byteBuffer, long j) {
        this.f112547c = new beuy(f112546b, byteBuffer, j);
    }

    /* renamed from: a */
    public final List mo61159a(beup beup) {
        int i;
        if (beup.f112500c < 4.0E-4f || beup.f112516s < 4.0E-4f) {
            return Collections.singletonList(new beus(beur.STILL, 100));
        }
        TreeMap treeMap = new TreeMap();
        for (int i2 = 0; i2 < this.f112547c.mo61171a(); i2++) {
            beuw a = this.f112547c.mo61172a(i2, beup.mo61161a());
            Integer num = (Integer) treeMap.get(a.f112566a);
            if (num == null) {
                i = 1;
            } else {
                i = Integer.valueOf(num.intValue() + 1);
            }
            treeMap.put((beur) a.f112566a, i);
        }
        bxbm.m122544b(!treeMap.containsKey(beur.ON_FOOT));
        Integer num2 = (Integer) treeMap.get(beur.WALKING);
        if (num2 == null) {
            num2 = 0;
        }
        Integer num3 = (Integer) treeMap.get(beur.RUNNING);
        if (num3 == null) {
            num3 = 0;
        }
        int intValue = num2.intValue() + num3.intValue();
        if (intValue != 0) {
            treeMap.put(beur.ON_FOOT, Integer.valueOf(intValue));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int a2 = this.f112547c.mo61171a();
            double d = (double) intValue2;
            Double.isNaN(d);
            double d2 = (double) a2;
            Double.isNaN(d2);
            arrayList.add(new beus((beur) entry.getKey(), (int) Math.round((d * 100.0d) / d2)));
        }
        Collections.sort(arrayList, beuk.f112491a);
        return arrayList;
    }

    /* renamed from: a */
    public final List mo61160a(float[] fArr) {
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return mo61159a(beuq.m95918a(arrayList));
    }
}
