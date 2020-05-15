package p000;

import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bjtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtn extends JsonObjectRequest {

    /* renamed from: e */
    private static final HashMap f123289e;

    /* renamed from: f */
    private final String f123290f;

    static {
        HashMap hashMap = new HashMap();
        f123289e = hashMap;
        hashMap.put("upper", "C");
        f123289e.put("zip_name_type", "postal");
        f123289e.put("fmt", "%N%n%O%n%A%n%C");
        f123289e.put("require", "AC");
        f123289e.put("state_name_type", "province");
        f123289e.put("id", "data/ZZ");
        f123289e.put("dir", "ltr");
    }

    public final Map getHeaders() {
        return Collections.singletonMap("User-Agent", bjtx.f123321a);
    }

    public final Request.Priority getPriority() {
        return Request.Priority.HIGH;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        Response parseNetworkResponse = super.parseNetworkResponse(networkResponse);
        if (!parseNetworkResponse.isSuccess()) {
            return parseNetworkResponse;
        }
        JSONObject jSONObject = (JSONObject) parseNetworkResponse.result;
        String a = bjtl.m104566a(jSONObject, "id");
        if (TextUtils.isEmpty(a)) {
            a = this.f123290f;
            try {
                jSONObject.put("id", a);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 28);
                sb.append("Error adding id=");
                sb.append(a);
                sb.append(" to response");
                throw new RuntimeException(sb.toString(), e);
            }
        }
        if (TextUtils.isEmpty(bjtl.m104566a(jSONObject, "key")) && !TextUtils.isEmpty(a)) {
            String substring = a.substring(a.lastIndexOf("/") + 1);
            try {
                jSONObject.put("key", substring);
            } catch (JSONException e2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 29);
                sb2.append("Error adding key=");
                sb2.append(substring);
                sb2.append(" to response");
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
        for (String str : f123289e.keySet()) {
            if (!jSONObject.has(str)) {
                try {
                    jSONObject.put(str, f123289e.get(str));
                } catch (JSONException e3) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 54);
                    sb3.append("Error adding country default data for key=");
                    sb3.append(str);
                    sb3.append(" to response");
                    throw new RuntimeException(sb3.toString(), e3);
                }
            }
        }
        return Response.success(jSONObject, parseNetworkResponse.cacheEntry);
    }

    public bjtn(int i, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(0, bjto.m104586b(i, str).toString(), null, listener, errorListener);
        this.f123290f = bjto.m104585a(i, str);
    }
}
