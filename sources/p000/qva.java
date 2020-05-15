package p000;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: qva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qva extends JsonObjectRequest {

    /* renamed from: e */
    private final Map f42217e;

    public qva(String str, Map map, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener) {
        super(1, str, jSONObject, listener, errorListener);
        this.f42217e = map;
    }

    public final Map getHeaders() {
        return this.f42217e;
    }
}
