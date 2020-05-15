package p000;

import org.json.JSONObject;

/* renamed from: blbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbh {

    /* renamed from: a */
    public final long f125824a;

    /* renamed from: b */
    public final String f125825b;

    public blbh(long j, String str) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        this.f125824a = j;
        bmxy.m108581a(str);
        this.f125825b = str;
    }

    /* renamed from: a */
    public final JSONObject mo66441a() {
        return new JSONObject().put("md5", this.f125825b).put("start", this.f125824a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof blbh) {
            blbh blbh = (blbh) obj;
            if (this.f125824a != blbh.f125824a || !this.f125825b.equals(blbh.f125825b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f125824a;
        int i = (((int) (j ^ (j >>> 32))) + 527) * 31;
        String str = this.f125825b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        long j = this.f125824a;
        String str = this.f125825b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append("start: ");
        sb.append(j);
        sb.append(", md5Hash");
        sb.append(str);
        return sb.toString();
    }

    public blbh(JSONObject jSONObject) {
        this(jSONObject.getLong("start"), jSONObject.getString("md5"));
    }
}
