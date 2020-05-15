package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cru {
    SELECT((byte) 0, (byte) -92, new crp()),
    GET_PROCESSING_OPTIONS(Byte.MIN_VALUE, (byte) -88, new crq()),
    GET_DATA(Byte.MIN_VALUE, (byte) -54, new crr()),
    READ_RECORD((byte) 0, (byte) -78, new crs());
    

    /* renamed from: e */
    public static final Map f11897e;

    /* renamed from: f */
    public final crt f11899f;

    /* renamed from: g */
    private final byte f11900g;

    /* renamed from: h */
    private final byte f11901h;

    static {
        HashMap hashMap = new HashMap(values().length);
        cru[] values = values();
        for (cru cru : values) {
            Map map = (Map) hashMap.get(Byte.valueOf(cru.f11901h));
            if (map == null) {
                map = new HashMap();
                hashMap.put(Byte.valueOf(cru.f11901h), map);
            }
            map.put(Byte.valueOf(cru.f11900g), cru);
        }
        f11897e = Collections.unmodifiableMap(hashMap);
    }

    private cru(byte b, byte b2, crt crt) {
        this.f11901h = b;
        this.f11900g = b2;
        this.f11899f = crt;
    }
}
