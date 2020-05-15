package p000;

import java.util.Comparator;
import org.json.JSONObject;

/* renamed from: ctp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ctp {

    /* renamed from: a */
    public final String f12030a;

    /* renamed from: b */
    public final String f12031b;

    /* renamed from: c */
    public final String f12032c;

    /* renamed from: d */
    public final String f12033d;

    /* renamed from: e */
    public final String f12034e;

    public ctp(JSONObject jSONObject) {
        String optString = jSONObject.optString("atc", null);
        String optString2 = jSONObject.optString("ct_ms", null);
        String optString3 = jSONObject.optString("ct_emv", null);
        String optString4 = jSONObject.optString("ct_cavv", null);
        String optString5 = jSONObject.optString("track_data_hash", null);
        this.f12030a = optString;
        this.f12031b = optString2;
        this.f12032c = optString3;
        this.f12033d = optString4;
        this.f12034e = optString5;
    }

    /* renamed from: a */
    public static Comparator m7577a() {
        return new cto();
    }

    /* renamed from: b */
    public final int mo8289b() {
        return czm.m8024c(czm.m8012a(czq.m8044c(this.f12030a, 8)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ctp ctp = (ctp) obj;
            String str = this.f12030a;
            if (str == null ? ctp.f12030a != null : !str.equals(ctp.f12030a)) {
                return false;
            }
            String str2 = this.f12031b;
            if (str2 == null ? ctp.f12031b != null : !str2.equals(ctp.f12031b)) {
                return false;
            }
            String str3 = this.f12032c;
            if (str3 == null ? ctp.f12032c != null : !str3.equals(ctp.f12032c)) {
                return false;
            }
            String str4 = this.f12033d;
            if (str4 == null ? ctp.f12033d != null : !str4.equals(ctp.f12033d)) {
                return false;
            }
            String str5 = this.f12034e;
            return str5 == null ? ctp.f12034e == null : str5.equals(ctp.f12034e);
        }
    }

    public final int hashCode() {
        String str = this.f12030a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12031b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12032c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f12033d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f12034e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
