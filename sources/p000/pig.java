package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pig {

    /* renamed from: j */
    private static final ptx f39210j = new qav("ApplicationInfo");

    /* renamed from: a */
    public String f39211a;

    /* renamed from: b */
    public String f39212b;

    /* renamed from: c */
    public String f39213c;

    /* renamed from: d */
    public String f39214d;

    /* renamed from: e */
    public String f39215e;

    /* renamed from: f */
    public String f39216f;

    /* renamed from: g */
    public String f39217g;

    /* renamed from: h */
    public final List f39218h = new ArrayList();

    /* renamed from: i */
    public String f39219i;

    /* renamed from: k */
    private final List f39220k = new ArrayList();

    private pig() {
    }

    /* renamed from: a */
    public final List mo23168a() {
        return Collections.unmodifiableList(this.f39220k);
    }

    public pig(JSONObject jSONObject) {
        JSONArray jSONArray;
        int length;
        this.f39211a = jSONObject.getString("appId");
        this.f39216f = jSONObject.getString("sessionId");
        this.f39215e = jSONObject.optString("transportId");
        this.f39214d = jSONObject.optString("displayName");
        this.f39217g = jSONObject.optString("statusText");
        this.f39219i = jSONObject.optString("iconUrl");
        this.f39212b = jSONObject.optString("universalAppId");
        this.f39213c = jSONObject.optString("appType");
        if (jSONObject.has("senderApps")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("senderApps");
            int length2 = jSONArray2.length();
            for (int i = 0; i < length2; i++) {
                try {
                    this.f39218h.add(new plg(jSONArray2.getJSONObject(i)));
                } catch (JSONException e) {
                    f39210j.mo23675c("Ignoring invalid sender app structure: %s", e.getMessage());
                }
            }
        }
        if (jSONObject.has("namespaces") && (length = (jSONArray = jSONObject.getJSONArray("namespaces")).length()) > 0) {
            this.f39220k.clear();
            for (int i2 = 0; i2 < length; i2++) {
                this.f39220k.add(jSONArray.getJSONObject(i2).getString("name"));
            }
        }
    }
}
