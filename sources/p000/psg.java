package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: psg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class psg extends pst {

    /* renamed from: a */
    final /* synthetic */ psx f40143a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public psg(psx psx) {
        super(psx, true);
        this.f40143a = psx;
    }

    /* renamed from: d */
    public final void mo23598d() {
        psx psx = this.f40143a;
        String str = psx.f40161j;
        puc puc = psx.f40164c;
        pue pue = this.f40157c;
        JSONObject jSONObject = new JSONObject();
        long c = puc.mo23633c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", puc.mo23686f());
        } catch (JSONException e) {
        }
        puc.mo23630a(jSONObject.toString(), c, (String) null);
        puc.f40248x.mo23689a(c, pue);
    }
}
