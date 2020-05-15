package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.io.IOException;

/* renamed from: brgy */
final /* synthetic */ class brgy implements Response.ErrorListener {

    /* renamed from: a */
    private final brgp f142840a;

    public brgy(brgp brgp) {
        this.f142840a = brgp;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f142840a.mo69528a(new IOException(volleyError));
    }
}
