package p000;

import com.felicanetworks.mfc.mfi.MfiClient;
import com.felicanetworks.mfc.mfi.SeInfo;
import com.felicanetworks.mfc.mfi.User;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ciku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciku extends cikl {

    /* renamed from: a */
    private final brhc f190559a;

    /* renamed from: b */
    private final brep f190560b;

    /* renamed from: c */
    private final JSONObject f190561c;

    /* renamed from: d */
    private final String f190562d;

    public ciku(JSONObject jSONObject, brhc brhc, brep brep, String str) {
        super(brep);
        this.f190561c = jSONObject;
        this.f190559a = brhc;
        this.f190560b = brep;
        this.f190562d = str;
    }

    /* renamed from: a */
    public final void mo49937a(MfiClient mfiClient, User user) {
        SeInfo seInformation = mfiClient.getSeInformation();
        JSONObject optJSONObject = this.f190561c.optJSONObject("seInfo");
        if (optJSONObject == null) {
            this.f190559a.mo69532a("felica", "GetSeInfoOperation.execute : Failed to get the SeInfo_Object.", new NullPointerException());
            this.f190560b.mo49931a(new bres(bret.UNKNOWN_FELICA_ERROR));
            return;
        }
        try {
            optJSONObject.put("seId", seInformation.getSeId());
            optJSONObject.put("sepid", seInformation.getSepId());
            optJSONObject.put("platformType", seInformation.getPlatformType());
            optJSONObject.put("seType", seInformation.getSeType());
            optJSONObject.put("serviceProvider", "ID");
            optJSONObject.put("walletAppId", this.f190562d);
            srn srn = atgf.f90279a;
            this.f190560b.mo49932a(optJSONObject);
        } catch (JSONException e) {
            this.f190559a.mo69532a("felica", "GetSeInfoOperation.execute : Failed to put the value", e);
            this.f190560b.mo49931a(new bres(bret.UNKNOWN_FELICA_ERROR));
        }
        String valueOf = String.valueOf(optJSONObject);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("GetSeInfoOperation.execute : ");
        sb.append(valueOf);
        sb.toString();
    }
}
