package p000;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: beto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beto {

    /* renamed from: a */
    private final Map f112415a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [betn, java.lang.Double]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    public beto() {
        EnumMap enumMap = new EnumMap(betn.class);
        enumMap.put((Object) betn.SCAN_OVERLAP_MIN_RADIUS_0_2, (Object) Double.valueOf(142.156d));
        enumMap.put((Object) betn.WIFI_LOC_DISTANCE_0_1, (Object) Double.valueOf(100.453d));
        enumMap.put((Object) betn.WIFI_LOC_DISTANCE_0_2, (Object) Double.valueOf(175.247d));
        enumMap.put((Object) betn.WIFI_LOC_DISTANCE_1_2, (Object) Double.valueOf(109.315d));
        enumMap.put((Object) betn.CELL_LOC_DISTANCE_0_2, (Object) Double.valueOf(265.911d));
        this.f112415a = Collections.unmodifiableMap(enumMap);
    }

    /* renamed from: a */
    public final double mo61134a(Map map, betn betn) {
        Double d = (Double) map.get(betn);
        if (d == null) {
            d = (Double) this.f112415a.get(betn);
        }
        return d.doubleValue();
    }
}
