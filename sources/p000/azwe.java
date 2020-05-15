package p000;

import org.json.JSONObject;

/* renamed from: azwe */
final /* synthetic */ class azwe implements bmxj {

    /* renamed from: a */
    static final bmxj f100114a = new azwe();

    private azwe() {
    }

    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        azwb c = azwc.m86291c();
        c.mo55316a(jSONObject.optInt("LAUNCH_LOAD_SOURCE", 0));
        c.mo55317a(jSONObject.optBoolean("SHOULD_SHOW_KEYBOARD", false));
        return bmxv.m108566b(c.mo55315a());
    }
}
