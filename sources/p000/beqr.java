package p000;

import android.os.Bundle;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: beqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqr {

    /* renamed from: h */
    public static final Comparator f112062h = new beqq();

    /* renamed from: a */
    public final List f112063a = new ArrayList();

    /* renamed from: b */
    public long f112064b;

    /* renamed from: c */
    public long f112065c;

    /* renamed from: d */
    public Integer f112066d = null;

    /* renamed from: e */
    public int f112067e = 0;

    /* renamed from: f */
    public int f112068f = 0;

    /* renamed from: g */
    public Bundle f112069g;

    /* renamed from: a */
    static List m95447a(Map map, double d, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (d == 0.0d) {
            arrayList.add(new DetectedActivity(4, 100));
            return arrayList;
        }
        for (Map.Entry entry : map.entrySet()) {
            double intValue = (double) ((Integer) entry.getValue()).intValue();
            Double.isNaN(intValue);
            arrayList.add(new DetectedActivity(((Integer) entry.getKey()).intValue(), (int) Math.round(intValue / d)));
        }
        if (z) {
            Collections.sort(arrayList, f112062h);
        }
        return arrayList;
    }
}
