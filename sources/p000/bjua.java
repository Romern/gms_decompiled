package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: bjua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjua extends JsonObjectRequest {

    /* renamed from: e */
    private final Map f123330e;

    public bjua(String str, Map map, Response.Listener listener, Response.ErrorListener errorListener) {
        super(str, null, listener, errorListener);
        this.f123330e = map;
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("extraHeaders should not be null or empty");
        }
    }

    public final Map getHeaders() {
        Map headers = super.getHeaders();
        if (headers.isEmpty()) {
            return this.f123330e;
        }
        C1223np npVar = new C1223np(headers.size() + this.f123330e.size());
        npVar.putAll(headers);
        npVar.putAll(this.f123330e);
        return npVar;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        Response parseNetworkResponse = super.parseNetworkResponse(networkResponse);
        if (parseNetworkResponse.isSuccess()) {
            JSONObject jSONObject = (JSONObject) parseNetworkResponse.result;
        }
        return parseNetworkResponse;
    }
}
