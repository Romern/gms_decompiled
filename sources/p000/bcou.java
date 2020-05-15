package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcou {
    /* renamed from: a */
    public static bmxv m89528a(JSONObject jSONObject) {
        if (!jSONObject.has("TEXT") || !jSONObject.has("MESSAGE_CALLBACK_PAYLOAD")) {
            bbos.m88294d("Action", "failed to convert JSONObject to ReplyActionPayload, missing necessary properties");
            return bmvz.f131120a;
        }
        bcot c = m89529c();
        try {
            c.mo57111b((String) jSONObject.get("TEXT"));
            c.mo57110a((String) jSONObject.get("MESSAGE_CALLBACK_PAYLOAD"));
            return bmxv.m108566b(c.mo57109a());
        } catch (JSONException e) {
            bbos.m88294d("Action", "failed to convert JSONObject to ReplyActionPayload");
            return bmvz.f131120a;
        }
    }

    /* renamed from: c */
    public static bcot m89529c() {
        return new bcot();
    }

    /* renamed from: a */
    public abstract String mo57112a();

    /* renamed from: b */
    public abstract String mo57113b();

    /* renamed from: d */
    public final bmxv mo57114d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("TEXT", mo57112a());
            jSONObject.put("MESSAGE_CALLBACK_PAYLOAD", mo57113b());
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e) {
            bbos.m88294d("Action", "failed to convert ReplyActionPayload to JSONObject");
            return bmvz.f131120a;
        }
    }
}
