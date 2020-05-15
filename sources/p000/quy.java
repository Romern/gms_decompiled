package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: quy */
public final /* synthetic */ class quy implements Response.ErrorListener {

    /* renamed from: a */
    private final bqgy f42216a;

    public quy(bqgy bqgy) {
        this.f42216a = bqgy;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        bqgy bqgy = this.f42216a;
        imo imo = qvb.f42218a;
        bqgy.mo69136a((Throwable) volleyError);
    }
}
