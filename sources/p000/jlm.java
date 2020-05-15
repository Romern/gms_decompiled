package p000;

import com.android.volley.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jlm */
final /* synthetic */ class jlm implements Response.Listener {

    /* renamed from: a */
    private final bqgy f22760a;

    public jlm(bqgy bqgy) {
        this.f22760a = bqgy;
    }

    public final void onResponse(Object obj) {
        bqgy bqgy = this.f22760a;
        try {
            bqgy.mo69138b(((JSONObject) obj).getString("privateTopicName"));
        } catch (JSONException e) {
            bqgy.mo69136a((Throwable) e);
        }
    }
}
