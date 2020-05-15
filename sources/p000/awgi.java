package p000;

import android.util.Pair;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: awgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awgi extends Request implements NetworkCallbacks {

    /* renamed from: d */
    final HashMap f94300d;

    /* renamed from: e */
    final byte[] f94301e;

    /* renamed from: f */
    final RequestFuture f94302f;

    /* renamed from: g */
    final String f94303g;

    public awgi(String str, byte[] bArr, ArrayList arrayList, String str2, RequestFuture requestFuture) {
        super(1, str, requestFuture);
        this.f94300d = new HashMap(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            this.f94300d.put((String) pair.first, (String) pair.second);
        }
        this.f94301e = bArr;
        this.f94302f = requestFuture;
        this.f94303g = str2;
    }

    public final void deliverError(VolleyError volleyError) {
        Map map;
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null || (map = networkResponse.headers) == null || (str = (String) map.get("Content-Type")) == null || !str.contains("application/x-protobuf")) {
            super.deliverError(volleyError);
        } else {
            this.f94302f.onResponse(volleyError.networkResponse);
        }
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f94302f.onResponse((NetworkResponse) obj);
    }

    public final byte[] getBody() {
        return this.f94301e;
    }

    public final String getBodyContentType() {
        return this.f94303g;
    }

    public final Map getHeaders() {
        return this.f94300d;
    }

    public final Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }

    public final RetryPolicy getRetryPolicy() {
        return new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 0, 1.0f);
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(6912);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        return Response.success(networkResponse, null);
    }
}
