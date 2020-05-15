package p000;

import com.android.volley.Response;
import org.json.JSONObject;

/* renamed from: tvd */
final /* synthetic */ class tvd implements Response.Listener {

    /* renamed from: a */
    private final tvk f46707a;

    /* renamed from: b */
    private final String f46708b;

    /* renamed from: c */
    private final tuy f46709c;

    public tvd(tvk tvk, String str, tuy tuy) {
        this.f46707a = tvk;
        this.f46708b = str;
        this.f46709c = tuy;
    }

    public final void onResponse(Object obj) {
        tvk tvk = this.f46707a;
        String str = this.f46708b;
        tuy tuy = this.f46709c;
        JSONObject jSONObject = (JSONObject) obj;
        tvk.f46715a.mo15547a(str, jSONObject);
        tuy.mo26820a(jSONObject);
    }
}
