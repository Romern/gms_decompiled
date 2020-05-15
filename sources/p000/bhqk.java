package p000;

import com.android.volley.Response;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.server.NetworkCallbacks;

/* renamed from: bhqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqk extends ImageRequest implements NetworkCallbacks {
    public bhqk(String str, Response.Listener listener, int i, int i2, Response.ErrorListener errorListener) {
        super(str, listener, i, i2, null, errorListener);
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(10254);
    }
}
