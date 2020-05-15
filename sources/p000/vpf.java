package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpf {

    /* renamed from: a */
    public final String f49704a;

    /* renamed from: b */
    public String f49705b;

    /* renamed from: c */
    public String f49706c;

    /* renamed from: d */
    public String f49707d;

    /* renamed from: e */
    public Integer f49708e;

    /* renamed from: f */
    public Integer f49709f;

    public vpf(String str) {
        sdo.m34959a((Object) str);
        this.f49704a = str;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("error").getJSONArray("errors").getJSONObject(0);
            this.f49705b = jSONObject.optString("reason");
            this.f49706c = jSONObject.optString("message");
            this.f49707d = jSONObject.optString("location");
            String optString = jSONObject.optString("locationType");
            this.f49708e = vcq.m39997a(this.f49705b);
            String str2 = this.f49707d;
            if (str2 == null) {
                this.f49709f = null;
                return;
            }
            if (optString != null) {
                StringBuilder sb = new StringBuilder(optString.length() + 1 + str2.length());
                sb.append(optString);
                sb.append(".");
                sb.append(str2);
                str2 = sb.toString();
            }
            this.f49709f = vcp.m39996a(str2);
        } catch (JSONException e) {
            vpg.f49710a.mo25376c(String.format("Unable to parse response: %s", str));
        }
    }

    /* renamed from: a */
    public final boolean mo28720a(int i) {
        Integer num = this.f49708e;
        return num != null && i == num.intValue();
    }

    /* renamed from: b */
    public final boolean mo28721b(int i) {
        Integer num = this.f49709f;
        return num != null && i == num.intValue();
    }
}
