package p000;

import org.json.JSONObject;

/* renamed from: ctk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ctk {

    /* renamed from: a */
    public final int f12019a;

    /* renamed from: b */
    public final long f12020b;

    /* renamed from: c */
    public final long f12021c;

    public ctk(JSONObject jSONObject) {
        this.f12021c = jSONObject.getLong("hardExpirationTimestamp");
        this.f12020b = jSONObject.getLong("softExpirationTimestamp");
        this.f12019a = jSONObject.getInt("lowCredentialsThreshold");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ctk ctk = (ctk) obj;
            return this.f12019a == ctk.f12019a && this.f12020b == ctk.f12020b && this.f12021c == ctk.f12021c;
        }
    }

    public final int hashCode() {
        int i = this.f12019a;
        long j = this.f12020b;
        long j2 = this.f12021c;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }
}
