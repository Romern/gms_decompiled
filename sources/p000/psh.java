package p000;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: psh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class psh extends pst {

    /* renamed from: a */
    final /* synthetic */ int[] f40144a;

    /* renamed from: b */
    final /* synthetic */ psx f40145b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public psh(psx psx, int[] iArr) {
        super(psx, true);
        this.f40145b = psx;
        this.f40144a = iArr;
    }

    /* renamed from: d */
    public final void mo23598d() {
        psx psx = this.f40145b;
        String str = psx.f40161j;
        puc puc = psx.f40164c;
        pue pue = this.f40157c;
        int[] iArr = this.f40144a;
        JSONObject jSONObject = new JSONObject();
        long c = puc.mo23633c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", puc.mo23686f());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException e) {
        }
        puc.mo23630a(jSONObject.toString(), c, (String) null);
        puc.f40249y.mo23689a(c, pue);
    }
}
