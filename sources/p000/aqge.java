package p000;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aqge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqge extends Request implements NetworkCallbacks {

    /* renamed from: h */
    private static final int f86038h = aqgx.m71596a(15);

    /* renamed from: d */
    private final Response.Listener f86039d;

    /* renamed from: e */
    private final int f86040e;

    /* renamed from: f */
    private final byte[] f86041f;

    /* renamed from: g */
    private final boolean f86042g;

    public aqge(String str, Response.ErrorListener errorListener, Response.Listener listener, int i, byte[] bArr, boolean z) {
        super(1, str, errorListener);
        this.f86039d = listener;
        this.f86040e = i;
        this.f86041f = bArr;
        this.f86042g = z;
        setRetryPolicy(new DefaultRetryPolicy(f86038h, 0, 1.0f));
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        Integer num = (Integer) obj;
        Response.Listener listener = this.f86039d;
        if (listener != null) {
            listener.onResponse(num);
        }
    }

    public final byte[] getBody() {
        return this.f86041f;
    }

    public final String getBodyContentType() {
        return "application/octet-stream";
    }

    public final Map getHeaders() {
        HashMap hashMap = new HashMap();
        if (this.f86042g) {
            hashMap.put("X-Goog-Upload-Command", "upload, finalize");
        } else {
            hashMap.put("X-Goog-Upload-Command", "upload");
        }
        hashMap.put("X-Goog-Upload-Http-Method", DataParser.CONNECT_TYPE_POST);
        hashMap.put("X-Goog-Upload-Offset", Integer.toString(this.f86040e));
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
        new Object[1][0] = Integer.valueOf(networkResponse.statusCode);
        int i = networkResponse.statusCode;
        if (i != 200) {
            return Response.error(new VolleyError(String.format("Received status %d from server", Integer.valueOf(i))));
        }
        String str = (String) networkResponse.headers.get("X-Goog-Upload-Status");
        if (str == null) {
            return Response.error(new VolleyError("Response did not include the upload status header"));
        }
        if (!str.equals("final")) {
            if (str.equals("active")) {
                return Response.success(0, null);
            }
            new Object[1][0] = str;
            return Response.error(new VolleyError("Server returned unknown status value"));
        } else if (this.f86042g) {
            return Response.success(0, null);
        } else {
            return Response.success(1, null);
        }
    }
}
