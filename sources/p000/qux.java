package p000;

import com.android.volley.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qux */
public final /* synthetic */ class qux implements Response.Listener {

    /* renamed from: a */
    private final bqgy f42215a;

    public qux(bqgy bqgy) {
        this.f42215a = bqgy;
    }

    public final void onResponse(Object obj) {
        bqgy bqgy = this.f42215a;
        JSONObject jSONObject = (JSONObject) obj;
        imo imo = qvb.f42218a;
        try {
            bqgy.mo69138b(jSONObject.getString("privateTopicName"));
        } catch (JSONException e) {
            bqgy.mo69136a((Throwable) e);
        }
    }
}
