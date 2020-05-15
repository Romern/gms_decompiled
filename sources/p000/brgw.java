package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.io.IOException;

/* renamed from: brgw */
final /* synthetic */ class brgw implements Response.ErrorListener {

    /* renamed from: a */
    private final brgp f142838a;

    public brgw(brgp brgp) {
        this.f142838a = brgp;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f142838a.mo69528a(new IOException(volleyError));
    }
}
