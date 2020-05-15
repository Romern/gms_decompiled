package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import java.util.HashMap;

/* renamed from: sgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgz extends she {
    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        return Response.success(networkResponse, null);
    }

    public sgz(String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, HashMap hashMap, int i, int i2) {
        super(0, str, null, listener, errorListener, str2, str3, true, hashMap, i, i2);
    }
}
