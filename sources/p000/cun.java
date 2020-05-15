package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cun {
    SELECT((byte) 0, (byte) -92, new cuh()),
    GET_PROCESSING_OPTIONS(Byte.MIN_VALUE, (byte) -88, new cui()),
    GET_DATA(Byte.MIN_VALUE, (byte) -54, new cuj()),
    READ_RECORD((byte) 0, (byte) -78, new cuk()),
    APPEND_RECORD(Byte.MIN_VALUE, (byte) -30, new cul());
    

    /* renamed from: f */
    public static final Map f12068f;

    /* renamed from: g */
    public final cum f12070g;

    /* renamed from: h */
    private final byte f12071h;

    /* renamed from: i */
    private final byte f12072i;

    static {
        HashMap hashMap = new HashMap(values().length);
        cun[] values = values();
        for (cun cun : values) {
            Map map = (Map) hashMap.get(Byte.valueOf(cun.f12072i));
            if (map == null) {
                map = new HashMap();
                hashMap.put(Byte.valueOf(cun.f12072i), map);
            }
            map.put(Byte.valueOf(cun.f12071h), cun);
        }
        f12068f = Collections.unmodifiableMap(hashMap);
    }

    private cun(byte b, byte b2, cum cum) {
        this.f12072i = b;
        this.f12071h = b2;
        this.f12070g = cum;
    }
}
