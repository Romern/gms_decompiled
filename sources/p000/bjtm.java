package p000;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import java.util.Collections;
import java.util.Map;

/* renamed from: bjtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtm extends JsonObjectRequest {
    public final Map getHeaders() {
        return Collections.singletonMap("User-Agent", bjtx.f123321a);
    }

    public final Request.Priority getPriority() {
        return Request.Priority.HIGH;
    }

    public bjtm(int i, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(0, bjto.m104586b(i, null).buildUpon().appendPath(str).toString(), null, listener, errorListener);
    }
}
