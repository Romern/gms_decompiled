package p000;

import com.google.android.gms.maps.model.LatLng;
import java.util.Comparator;

/* renamed from: bhzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhzv implements Comparator {

    /* renamed from: a */
    private final LatLng f120000a;

    public bhzv(LatLng latLng) {
        this.f120000a = latLng;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        bhzt bhzt = (bhzt) obj;
        bhzt bhzt2 = (bhzt) obj2;
        double a = aepo.m52350a(bhzt.f119991b, this.f120000a);
        float f = bhzt.f119992c;
        double a2 = aepo.m52350a(bhzt2.f119991b, this.f120000a);
        double d = (double) f;
        Double.isNaN(d);
        double d2 = (double) bhzt2.f119992c;
        Double.isNaN(d2);
        int compare = Double.compare(a - d, a2 - d2);
        return compare == 0 ? Double.compare(a, a2) : compare;
    }
}
