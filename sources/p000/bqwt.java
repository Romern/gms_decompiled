package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bqwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqwt {
    NULL(0),
    STRING_POOL(1),
    TABLE(2),
    XML(3),
    XML_START_NAMESPACE(PSKKeyManager.MAX_KEY_LENGTH_BYTES),
    XML_END_NAMESPACE(257),
    XML_START_ELEMENT(258),
    XML_END_ELEMENT(259),
    XML_CDATA(260),
    XML_RESOURCE_MAP(384),
    TABLE_PACKAGE(512),
    TABLE_TYPE(513),
    TABLE_TYPE_SPEC(514),
    TABLE_LIBRARY(515),
    TABLE_OVERLAYABLE(516),
    TABLE_OVERLAYABLE_POLICY(517);
    

    /* renamed from: r */
    public static final Map f141783r;

    /* renamed from: q */
    public final short f141785q;

    static {
        HashMap hashMap = new HashMap();
        bqwt[] values = values();
        for (bqwt bqwt : values) {
            hashMap.put(Short.valueOf(bqwt.f141785q), bqwt);
        }
        f141783r = Collections.unmodifiableMap(hashMap);
    }

    private bqwt(int i) {
        boolean z;
        long j = (long) i;
        int i2 = (int) j;
        if (((long) i2) == j) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108593a(z, "Out of range: %s", j);
        this.f141785q = (short) i2;
    }
}
