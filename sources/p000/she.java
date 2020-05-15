package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonRequest;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.HashMap;
import java.util.Map;

/* renamed from: she */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class she extends JsonRequest implements NetworkCallbacks {

    /* renamed from: e */
    public final HashMap f44463e;

    /* renamed from: f */
    private final int f44464f;

    /* renamed from: g */
    private final int f44465g;

    /* JADX WARNING: Illegal instructions before constructor call */
    protected she(int i, String str, String str2, Response.Listener listener, Response.ErrorListener errorListener, String str3, String str4, boolean z, HashMap hashMap, int i2, int i3) {
        super(i, str, r3, listener, errorListener);
        String str5;
        HashMap hashMap2 = hashMap;
        if (str2 != null) {
            str5 = str2.toString();
        } else {
            str5 = null;
        }
        this.f44463e = hashMap2;
        shb.m35264a(hashMap2, str3, str4);
        this.f44463e.put("Accept-Encoding", "gzip");
        setShouldCache(z);
        this.f44464f = i2;
        this.f44465g = i3;
    }

    public final void deliverResponse(Object obj) {
        super.deliverResponse(obj);
    }

    public final Map getHeaders() {
        return this.f44463e;
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35313a(this.f44464f, this.f44465g);
    }

    /* access modifiers changed from: protected */
    public abstract Response parseNetworkResponse(NetworkResponse networkResponse);
}
