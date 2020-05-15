package p000;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import java.util.Map;

/* renamed from: auyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyz extends JsonObjectRequest {

    /* renamed from: e */
    private final bnhe f92810e;

    public auyz(String str, Response.Listener listener, bnhe bnhe) {
        super(0, str, null, listener, null);
        this.f92810e = bnhe;
    }

    public final Map getHeaders() {
        return this.f92810e;
    }
}
