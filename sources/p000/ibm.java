package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.Map;

/* renamed from: ibm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibm extends Request implements NetworkCallbacks {

    /* renamed from: d */
    private final Map f20682d;

    /* renamed from: e */
    private final byte[] f20683e;

    /* renamed from: f */
    private final Response.Listener f20684f;

    /* renamed from: g */
    private final int f20685g;

    public ibm(int i, String str, Response.Listener listener, Response.ErrorListener errorListener, Map map, byte[] bArr, int i2) {
        super(i, str, errorListener);
        this.f20684f = listener;
        this.f20682d = map;
        this.f20683e = bArr;
        this.f20685g = i2;
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f20684f.onResponse((ProxyResponse) obj);
    }

    public final byte[] getBody() {
        return this.f20683e;
    }

    public final Map getHeaders() {
        return this.f20682d;
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35313a(4100, this.f20685g);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        int i = networkResponse.statusCode;
        Map map = networkResponse.headers;
        return Response.success(new ProxyResponse(1, 0, null, i, ProxyResponse.m6411a(map), networkResponse.data), HttpHeaderParser.parseCacheHeaders(networkResponse));
    }
}
