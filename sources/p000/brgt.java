package p000;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: brgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brgt extends JsonObjectRequest {

    /* renamed from: e */
    private final Map f142834e;

    public brgt(String str, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener, Map map) {
        super(1, str, jSONObject, listener, errorListener);
        this.f142834e = map;
    }

    public final Map getHeaders() {
        return this.f142834e;
    }
}
