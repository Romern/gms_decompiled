package p000;

import com.google.android.gms.udc.UdcCacheResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akxv */
final /* synthetic */ class akxv implements aubw {

    /* renamed from: a */
    private final akyf f73083a;

    /* renamed from: b */
    private final int f73084b;

    public akxv(akyf akyf, int i) {
        this.f73083a = akyf;
        this.f73084b = i;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        akyf akyf = this.f73083a;
        int i = this.f73084b;
        UdcCacheResponse udcCacheResponse = (UdcCacheResponse) obj;
        try {
            JSONArray jSONArray = new JSONArray();
            for (UdcCacheResponse.UdcSetting udcSetting : udcCacheResponse.f109350a) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("settingId", udcSetting.f109354a);
                jSONObject.put("settingValue", udcSetting.f109355b);
                jSONArray.put(jSONObject);
            }
            akyf.m60678a(akyf.f73109b, jSONArray.toString(), i);
        } catch (JSONException e) {
            akyf.f73106d.mo25417e("converting to JSON failed", e, new Object[0]);
            akyf.m60676a(akyf.f73109b, i);
        }
    }
}
