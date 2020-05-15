package p000;

import org.json.JSONObject;

/* renamed from: axwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axwu {
    /* renamed from: a */
    static boolean m83439a(JSONObject jSONObject, String str) {
        return jSONObject.optBoolean(str, false);
    }

    /* renamed from: b */
    static long m83440b(JSONObject jSONObject, String str) {
        return jSONObject.optLong(str, 0);
    }

    /* renamed from: c */
    static String m83441c(JSONObject jSONObject, String str) {
        return jSONObject.optString(str, "");
    }
}
