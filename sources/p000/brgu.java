package p000;

import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: brgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brgu extends StringRequest {

    /* renamed from: e */
    private final Map f142835e;

    /* renamed from: f */
    private final String f142836f;

    public brgu(String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Map map) {
        super(1, str, listener, errorListener);
        this.f142836f = str2;
        this.f142835e = map;
    }

    public final byte[] getBody() {
        try {
            String str = this.f142836f;
            if (str != null) {
                return str.getBytes("utf-8");
            }
            return null;
        } catch (UnsupportedEncodingException e) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", this.f142836f, "utf-8");
            return null;
        }
    }

    public final Map getHeaders() {
        return this.f142835e;
    }
}
