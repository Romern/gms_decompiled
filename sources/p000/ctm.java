package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: ctm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ctm {

    /* renamed from: a */
    public final Map f12027a;

    public ctm(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = keys.next().toString();
            linkedHashMap.put(str, jSONObject.get(str));
        }
        this.f12027a = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static String m7556a(int i) {
        StringBuilder sb = new StringBuilder(15);
        sb.append("IDDT");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo8269b(String str) {
        Object obj = this.f12027a.get(str);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    /* renamed from: c */
    public final byte[] mo8271c() {
        return czm.m8012a(mo8267a("Issuer_Application_Data"));
    }

    /* renamed from: d */
    public final byte[] mo8273d() {
        return mo8272c("PPSE_FCI");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ctm ctm = (ctm) obj;
            Map map = this.f12027a;
            return map == null ? ctm.f12027a == null : map.equals(ctm.f12027a);
        }
    }

    public final int hashCode() {
        Map map = this.f12027a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    public final String mo8267a(String str) {
        Object obj = this.f12027a.get(str);
        if (obj != null) {
            return obj.toString();
        }
        throw new ctv(str);
    }

    /* renamed from: b */
    public final byte[] mo8270b() {
        return czm.m8026d(mo8267a("Issuer_Country_Code"));
    }

    /* renamed from: c */
    public final byte[] mo8272c(String str) {
        Object obj = this.f12027a.get(str);
        if (obj != null) {
            return czm.m8012a(obj.toString());
        }
        return null;
    }

    /* renamed from: a */
    public final byte[] mo8268a() {
        return czm.m8012a(mo8267a("Track_2_Equivalent_Data"));
    }
}
