package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ikg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikg {

    /* renamed from: a */
    public final bypc f21184a;

    /* renamed from: b */
    public final String f21185b;

    /* renamed from: c */
    public final byte[] f21186c;

    /* renamed from: d */
    public final long f21187d;

    /* renamed from: e */
    public final long f21188e;

    /* renamed from: f */
    public final long f21189f;

    /* renamed from: g */
    public final String f21190g;

    /* renamed from: h */
    public final int f21191h;

    public ikg(bypc bypc, String str, byte[] bArr, long j, long j2, long j3, int i, String str2) {
        sdo.m34959a(bypc);
        this.f21184a = bypc;
        sdo.m34959a((Object) str);
        this.f21185b = str;
        this.f21186c = (byte[]) sdo.m34959a(bArr);
        this.f21187d = j;
        this.f21188e = j2;
        this.f21189f = j3;
        this.f21191h = i;
        this.f21190g = str2;
    }

    /* renamed from: a */
    public static ikg m15585a(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            bypc bypc = (bypc) bxvk.m124014a(bypc.f167305k, sqd.m35966a(jSONObject.getString("txrequest")));
            long j = jSONObject.getLong("expiration");
            long j2 = jSONObject.getLong("reception_elapsed");
            long j3 = jSONObject.getLong("reception_wall");
            String string = jSONObject.getString("account");
            byte[] bytes = jSONObject.getString("handle").getBytes();
            int b = ikm.m15620b(jSONObject.getInt("state"));
            if (jSONObject.has("droidguard")) {
                str2 = jSONObject.getString("droidguard");
            } else {
                str2 = null;
            }
            return new ikg(bypc, string, bytes, j, j2, j3, b, str2);
        } catch (bxwf | JSONException e) {
            ikh.f21195d.mo25417e("Cannot reconstruct cache entry from string", e, new Object[0]);
            return null;
        }
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("txrequest", sqd.m35968b(this.f21184a.mo73642k()));
            jSONObject.put("expiration", this.f21187d);
            jSONObject.put("reception_elapsed", this.f21188e);
            jSONObject.put("reception_wall", this.f21189f);
            jSONObject.put("account", this.f21185b);
            jSONObject.put("handle", new String(this.f21186c));
            int i = this.f21191h;
            ikm.m15621c(i);
            jSONObject.put("state", i);
            jSONObject.put("droidguard", this.f21190g);
            return jSONObject.toString();
        } catch (JSONException e) {
            ikh.f21195d.mo25417e("Cannot make cache entry into a string", e, new Object[0]);
            return null;
        }
    }
}
