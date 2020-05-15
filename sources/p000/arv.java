package p000;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: arv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arv extends Property {
    public arv(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        asc asc = (asc) obj;
        return null;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        asc asc = (asc) obj;
        PointF pointF = (PointF) obj2;
        asc.f2108a = Math.round(pointF.x);
        asc.f2109b = Math.round(pointF.y);
        int i = asc.f2112e + 1;
        asc.f2112e = i;
        if (i == asc.f2113f) {
            asc.mo2375a();
        }
    }
}
