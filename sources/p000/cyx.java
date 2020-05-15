package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: cyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cyx implements asrx {

    /* renamed from: a */
    public final Map f12423a;

    /* renamed from: b */
    public final Map f12424b;

    /* renamed from: c */
    public final List f12425c;

    public cyx(Map map, Map map2, List list) {
        this.f12423a = map;
        this.f12425c = Collections.unmodifiableList(list);
        this.f12424b = Collections.unmodifiableMap(map2);
    }

    /* renamed from: a */
    public static final String m7943a(JSONObject jSONObject) {
        return m7944a(jSONObject, "PRU", 3) + m7944a(jSONObject, "AIP", 2) + m7944a(jSONObject, "AFL", 32) + m7944a(jSONObject, "AUC", 2) + m7944a(jSONObject, "CPR", 2) + m7944a(jSONObject, "CRM-CAC_Switch_Interface", 3) + m7944a(jSONObject, "CRM-CAC_Denial", 3) + m7944a(jSONObject, "CRM-CAC_Online", 3) + m7944a(jSONObject, "CRM-CAC_Default", 3) + m7944a(jSONObject, "NCOT", 1) + m7944a(jSONObject, "COA", 6) + m7944a(jSONObject, "LCOL", 1) + m7944a(jSONObject, "UCOL", 1) + m7944a(jSONObject, "LCOA", 6) + m7944a(jSONObject, "UCOA", 6) + m7944a(jSONObject, "STA", 6) + m7944a(jSONObject, "CVM-CAC_Online-PIN", 2) + m7944a(jSONObject, "CVM-CAC_Signature", 2) + m7944a(jSONObject, "CVM-Accumulator", 6) + m7944a(jSONObject, "CVM-Counter", 1) + m7944a(jSONObject, "CVM-Cons_limit_1", 1) + m7944a(jSONObject, "CVM-Cons_limit_2", 1) + m7944a(jSONObject, "CVM-Cum_limit_1", 6) + m7944a(jSONObject, "CVM-Cum_limit_2", 6) + m7944a(jSONObject, "CVM-Sta_limit_1", 6) + m7944a(jSONObject, "CVM-Sta_limit_2", 6) + m7944a(jSONObject, "CL-Accumulator", 6) + m7944a(jSONObject, "CL-Counter", 1) + m7944a(jSONObject, "CL-Cons_limit", 1) + m7944a(jSONObject, "CL-Cum_limit", 6) + m7944a(jSONObject, "CL-STA_limit", 6);
    }

    /* renamed from: b */
    public static String m7946b(int i) {
        StringBuilder sb = new StringBuilder(15);
        sb.append("IDDT");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo8442c() {
        return mo8443c("Secondary_Currency_1");
    }

    /* renamed from: d */
    public final String mo8444d() {
        return mo8443c("Secondary_Currency_2");
    }

    /* renamed from: e */
    public final String mo8446e(String str) {
        return ((JSONObject) this.f12424b.get("BF50")).optString(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.f12423a.equals(((cyx) obj).f12423a);
        }
        return true;
    }

    /* renamed from: f */
    public final byte[] mo8449f() {
        return cvz.m7720b(mo8439a("Issuer_Application_Data"));
    }

    /* renamed from: g */
    public final byte[] mo8450g() {
        return mo8445d("PRU");
    }

    public final int hashCode() {
        return this.f12423a.hashCode();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cwd.a(char, int):java.lang.String
     arg types: [int, int]
     candidates:
      cwd.a(java.lang.String, char):java.lang.String
      cwd.a(java.lang.String, int):java.lang.String
      cwd.a(char, int):java.lang.String */
    /* renamed from: a */
    private static final String m7944a(JSONObject jSONObject, String str, int i) {
        String optString = jSONObject.optString(str);
        if (optString == null) {
            return cwd.m7746a('0', i + i);
        }
        int i2 = i + i;
        if (optString.length() >= i2) {
            return optString;
        }
        String a = cwd.m7746a('0', i2 - optString.length());
        return a.length() == 0 ? new String(optString) : optString.concat(a);
    }

    /* renamed from: b */
    public final String mo8440b() {
        return mo8439a("CRM_Currency_Code");
    }

    /* renamed from: c */
    public final String mo8443c(String str) {
        Object obj = this.f12423a.get(str);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    /* renamed from: d */
    public final byte[] mo8445d(String str) {
        Object obj = this.f12423a.get(str);
        if (obj != null) {
            return cvz.m7710a(obj.toString());
        }
        return null;
    }

    /* renamed from: e */
    public final byte[] mo8447e() {
        return cvz.m7710a(mo8439a("Track_2_Equivalent_Data"));
    }

    /* renamed from: b */
    public final byte[] mo8441b(String str) {
        Object obj = this.f12423a.get(str);
        if (obj != null) {
            return cvz.m7710a(obj.toString());
        }
        throw new cvm(str);
    }

    /* renamed from: a */
    public static void m7945a(Map map, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                map.put(obj, jSONObject.get(obj));
            }
        }
    }

    /* renamed from: a */
    public final String mo8439a(String str) {
        Object obj = this.f12423a.get(str);
        if (obj != null) {
            return obj.toString();
        }
        throw new cvm(str);
    }

    /* renamed from: a */
    public final byte[] mo3395a() {
        return mo8445d("PPSE_FCI");
    }

    /* renamed from: a */
    public final byte[] mo3396a(int i) {
        String a = czd.m7983a(i);
        String str = (String) cyv.f12421a.get(a);
        if (str == null) {
            str = (String) cyv.f12422b.get(a);
        }
        return mo8445d(str);
    }
}
