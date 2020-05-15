package p000;

import org.json.JSONObject;

/* renamed from: blbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbn {

    /* renamed from: a */
    public final blbi f125837a;

    /* renamed from: b */
    public final int f125838b;

    /* renamed from: c */
    public final int f125839c;

    /* renamed from: d */
    public final Integer f125840d;

    /* renamed from: e */
    public final blbh f125841e;

    public blbn(blbi blbi, int i, int i2, Integer num, blbh blbh) {
        this.f125837a = new blbi(blbi);
        this.f125838b = i;
        this.f125839c = i2;
        this.f125840d = num;
        this.f125841e = blbh;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (!(obj instanceof blbn)) {
            return false;
        }
        blbn blbn = (blbn) obj;
        if (this.f125837a.equals(blbn.f125837a) && this.f125838b == blbn.f125838b && this.f125839c == blbn.f125839c && ((num = this.f125840d) == null ? blbn.f125840d == null : num.equals(blbn.f125840d))) {
            blbh blbh = this.f125841e;
            blbh blbh2 = blbn.f125841e;
            if (blbh != null) {
                if (blbh.equals(blbh2)) {
                    return true;
                }
            } else if (blbh2 != null) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f125837a.hashCode() + 527) * 31) + this.f125838b) * 31) + this.f125839c) * 31;
        Integer num = this.f125840d;
        int i = 0;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        blbh blbh = this.f125841e;
        if (blbh != null) {
            i = blbh.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f125837a);
        int i = this.f125838b;
        int i2 = this.f125839c;
        String valueOf2 = String.valueOf(this.f125840d);
        String valueOf3 = String.valueOf(this.f125841e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 106 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("chunkInfoMap: ");
        sb.append(valueOf);
        sb.append(", chunkSize: ");
        sb.append(i);
        sb.append(", remainderLength: ");
        sb.append(i2);
        sb.append(", remainderWeakHash: ");
        sb.append(valueOf2);
        sb.append(", remainderInfo: ");
        sb.append(valueOf3);
        return sb.toString();
    }

    public blbn(JSONObject jSONObject) {
        this.f125837a = new blbi(jSONObject.getJSONObject("chunkMap"));
        this.f125838b = jSONObject.getInt("chunkSize");
        this.f125839c = jSONObject.getInt("remainderLength");
        blbh blbh = null;
        this.f125840d = jSONObject.has("remainderWeakHash") ? Integer.valueOf(jSONObject.getInt("remainderWeakHash")) : null;
        this.f125841e = jSONObject.has("remainderInfo") ? new blbh(jSONObject.getJSONObject("remainderInfo")) : blbh;
    }
}
