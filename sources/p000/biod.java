package p000;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: biod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biod {

    /* renamed from: a */
    public static final int[] f121038a = {7842000, 3921000, 1825000, 1130000, 579000, 287000, 143000, 72000, 36000, 18000, 9000, 4000, 2000, 1123, 562, 281, 140, 70, 35, 18, 9, 4, 2};

    /* renamed from: a */
    public static List m102652a(LatLngBounds latLngBounds, int i, Collection collection) {
        Iterator it;
        ArrayList arrayList;
        double[] dArr;
        LatLngBounds latLngBounds2 = latLngBounds;
        double[] dArr2 = new double[2];
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            long longValue = ((Long) it2.next()).longValue();
            ayvd.m84903a(longValue, dArr2);
            LatLng latLng = new LatLng(dArr2[0], dArr2[1]);
            if (!latLngBounds2.mo43871a(latLng)) {
                LatLng latLng2 = latLngBounds2.f79896a;
                LatLng latLng3 = latLngBounds2.f79897b;
                double d = latLng.f79894a;
                double b = ayuo.m84846b(d, latLng.f79895b, d, latLng3.f79895b);
                double d2 = latLng.f79894a;
                dArr = dArr2;
                double min = Math.min(b, ayuo.m84846b(d2, latLng.f79895b, d2, latLng2.f79895b));
                double d3 = latLng.f79894a;
                double d4 = latLng.f79895b;
                double b2 = ayuo.m84846b(d3, d4, latLng3.f79894a, d4);
                double d5 = latLng.f79894a;
                double d6 = latLng.f79895b;
                arrayList = arrayList2;
                it = it2;
                double min2 = Math.min(b2, ayuo.m84846b(d5, d6, latLng2.f79894a, d6));
                double d7 = latLng.f79894a;
                if (latLng2.f79894a > d7 || d7 > latLng3.f79894a) {
                    double d8 = latLng.f79895b;
                    double d9 = latLng2.f79895b;
                    double d10 = latLng3.f79895b;
                    if (d9 > d10 ? !(d9 <= d8 || d8 <= d10) : !(d9 <= d8 && d8 <= d10)) {
                        int i2 = f121038a[i];
                        double hypot = Math.hypot(min, min2);
                        double d11 = (double) i2;
                        Double.isNaN(d11);
                        if (hypot >= (d11 * 1.414d) / 2.0d) {
                            it2 = it;
                            dArr2 = dArr;
                            arrayList2 = arrayList;
                        }
                    } else if (min2 >= ((double) (f121038a[i] / 2))) {
                        it2 = it;
                        dArr2 = dArr;
                        arrayList2 = arrayList;
                    }
                } else if (min >= ((double) (f121038a[i] / 2))) {
                    it2 = it;
                    dArr2 = dArr;
                    arrayList2 = arrayList;
                }
            } else {
                dArr = dArr2;
                arrayList = arrayList2;
                it = it2;
            }
            arrayList2 = arrayList;
            arrayList2.add(Long.valueOf(longValue));
            it2 = it;
            dArr2 = dArr;
        }
        return arrayList2;
    }
}
