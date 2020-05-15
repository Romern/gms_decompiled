package p000;

import org.json.JSONObject;

/* renamed from: cyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cyu {

    /* renamed from: a */
    public final String f12417a;

    /* renamed from: b */
    public final String f12418b;

    /* renamed from: c */
    public final String f12419c;

    /* renamed from: d */
    public final String f12420d;

    static {
        new cyu(null, null, null, null);
    }

    public cyu(String str, String str2, String str3, String str4) {
        this.f12417a = str;
        this.f12418b = str2;
        this.f12419c = str3;
        this.f12420d = str4;
    }

    /* renamed from: a */
    public static cyu m7942a(JSONObject jSONObject) {
        return new cyu(jSONObject.optString("atc", null), jSONObject.optString("ct_ms", null), jSONObject.optString("ct_emv", null), jSONObject.optString("ct_cavv", null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cyu cyu = (cyu) obj;
        String str = this.f12417a;
        if (str == null ? cyu.f12417a != null : !str.equals(cyu.f12417a)) {
            return false;
        }
        String str2 = this.f12418b;
        if (str2 == null ? cyu.f12418b != null : !str2.equals(cyu.f12418b)) {
            return false;
        }
        String str3 = this.f12419c;
        if (str3 == null ? cyu.f12419c != null : !str3.equals(cyu.f12419c)) {
            return false;
        }
        String str4 = this.f12420d;
        if (str4 != null) {
            return str4.equals(cyu.f12420d);
        }
        return cyu.f12420d == null;
    }

    public final int hashCode() {
        String str = this.f12417a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12418b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12419c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f12420d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }
}
