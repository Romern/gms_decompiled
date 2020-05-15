package p000;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: jlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jlo extends JsonObjectRequest {

    /* renamed from: e */
    private final Map f22762e;

    public jlo(String str, Map map, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener) {
        super(1, str, jSONObject, listener, errorListener);
        this.f22762e = map;
    }

    public final Map getHeaders() {
        return this.f22762e;
    }
}
