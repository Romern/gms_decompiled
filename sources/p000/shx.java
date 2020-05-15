package p000;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonRequest;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.HashMap;
import java.util.Map;

/* renamed from: shx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shx extends JsonRequest implements NetworkCallbacks {

    /* renamed from: e */
    private final String f44513e;

    /* renamed from: f */
    private final HashMap f44514f;

    /* renamed from: g */
    private final int f44515g;

    /* renamed from: h */
    private final int f44516h;

    /* JADX WARNING: Illegal instructions before constructor call */
    public shx(int i, String str, Object obj, Response.Listener listener, Response.ErrorListener errorListener, String str2, HashMap hashMap, int i2, int i3) {
        super(i, str, r3, listener, errorListener);
        String str3;
        if (obj != null) {
            str3 = obj.toString();
        } else {
            str3 = null;
        }
        this.f44513e = str2;
        this.f44514f = hashMap;
        if (str2 != null) {
            hashMap.put("Authorization", str2.length() == 0 ? new String("OAuth ") : "OAuth ".concat(str2));
        }
        this.f44514f.put("Accept-Encoding", "gzip");
        setRetryPolicy(new DefaultRetryPolicy(10000, 1, 1.0f));
        this.f44515g = i2;
        this.f44516h = i3;
    }

    public final Map getHeaders() {
        return this.f44514f;
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35313a(this.f44515g, this.f44516h);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        return Response.success(null, null);
    }
}
