package p000;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.Map;

/* renamed from: kjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kjf extends JsonObjectRequest implements NetworkCallbacks {

    /* renamed from: e */
    private final bnhe f24237e;

    public kjf(String str, Response.Listener listener, Response.ErrorListener errorListener, bnhe bnhe) {
        super(0, str, null, listener, errorListener);
        this.f24237e = bnhe;
    }

    public final Map getHeaders() {
        return this.f24237e;
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(18688);
    }
}
