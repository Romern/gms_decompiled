package p000;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pkz extends ptb {

    /* renamed from: a */
    public static final String f39550a = ptk.m31239c("com.google.cast.proximity");

    /* renamed from: b */
    final /* synthetic */ pjc f39551b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pkz(pjc pjc, String str) {
        super(f39550a, "ProximityInfoChannel", str);
        this.f39551b = pjc;
    }

    /* renamed from: b */
    public final void mo23345b(String str) {
        String str2;
        String str3 = str;
        if (!TextUtils.isEmpty(str)) {
            new Object[1][0] = str3;
            try {
                JSONObject jSONObject = new JSONObject(str3);
                if ("GET_PROXIMITY_INFO".equals(jSONObject.getString("responseType"))) {
                    int optInt = jSONObject.optInt("deviceCapabilities", 0);
                    String string = jSONObject.getString("friendlyName");
                    String optString = jSONObject.optString("model", null);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("proximityIdentifiers");
                    String string2 = jSONObject2.getString("wifiBssid");
                    String string3 = jSONObject2.getString("deviceId");
                    this.f39551b.f39334w.mo23139c();
                    this.f39551b.f39316e.mo23859a("proximity info name=%s, bssid=%s, deviceId=%sdeviceCapabilities=%d", string, string2, string3, Integer.valueOf(optInt));
                    if (!TextUtils.isEmpty(this.f39551b.f39275D)) {
                        pjc pjc = this.f39551b;
                        poj poj = pjc.f39335x;
                        String str4 = pjc.f39275D;
                        System.currentTimeMillis();
                        str2 = string2;
                        new pov(poj.f39918b, poj.f39919c, poj.f39917a, string3, string, optString, string2, optInt, str4).mo23522a();
                    } else {
                        str2 = string2;
                    }
                    pim pim = this.f39551b.f39336y;
                    if (pim != null) {
                        pim.f39236e.mo23193b(str2, string);
                        return;
                    }
                    return;
                }
                this.f40173s.mo23675c("Unexpected message (%s); ignoring", str3);
            } catch (JSONException e) {
                this.f40173s.mo23675c("Message is malformed (%s); ignoring: %s", e.getMessage(), str3);
            }
        }
    }
}
