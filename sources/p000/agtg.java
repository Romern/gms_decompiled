package p000;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: agtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agtg extends StringRequest {

    /* renamed from: e */
    private final String f66445e;

    public agtg(String str, String str2, Response.Listener listener, Response.ErrorListener errorListener) {
        super(0, str, listener, errorListener);
        this.f66445e = str2;
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        super.deliverResponse((String) obj);
    }

    public final Map getHeaders() {
        HashMap hashMap = new HashMap();
        String str = this.f66445e;
        if (str != null) {
            hashMap.put("Accept-Language", str);
        }
        return hashMap;
    }

    public final void deliverResponse(String str) {
        super.deliverResponse(str);
    }
}
