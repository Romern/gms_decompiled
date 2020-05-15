package p000;

import android.text.TextUtils;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aqgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgw extends Request implements NetworkCallbacks {

    /* renamed from: g */
    private static final int f86090g = aqgx.m71596a(5);

    /* renamed from: d */
    private final Response.Listener f86091d;

    /* renamed from: e */
    private final aqgk f86092e;

    /* renamed from: f */
    private final int f86093f;

    public aqgw(String str, Response.ErrorListener errorListener, Response.Listener listener, aqgk aqgk, int i) {
        super(1, str, errorListener);
        this.f86091d = listener;
        this.f86092e = aqgk;
        this.f86093f = i;
        setRetryPolicy(new DefaultRetryPolicy(f86090g, 1, 1.0f));
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        String str = (String) obj;
        Response.Listener listener = this.f86091d;
        if (listener != null) {
            listener.onResponse(str);
        }
    }

    public final byte[] getBody() {
        return this.f86092e.serializeToBytes();
    }

    public final String getBodyContentType() {
        return "application/octet-stream";
    }

    public final Map getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Goog-Upload-Protocol", "resumable");
        hashMap.put("X-Goog-Upload-Command", "start");
        hashMap.put("X-Goog-Upload-Http-Method", DataParser.CONNECT_TYPE_POST);
        hashMap.put("X-Goog-Upload-Header-Content-Length", Integer.toString(this.f86093f));
        return hashMap;
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(6144);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        String str = (String) networkResponse.headers.get("X-Goog-Upload-Status");
        if (str == null || !str.equals("active")) {
            new Object[1][0] = str;
            return Response.error(new VolleyError("Unexpected status"));
        }
        String str2 = (String) networkResponse.headers.get("X-Goog-Upload-URL");
        if (TextUtils.isEmpty(str2)) {
            return Response.error(new VolleyError("Server did not provide an upload location"));
        }
        new Object[1][0] = str2;
        return Response.success(str2, null);
    }
}
