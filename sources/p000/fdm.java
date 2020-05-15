package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: fdm */
final /* synthetic */ class fdm implements Response.ErrorListener {

    /* renamed from: a */
    private final fdn f16322a;

    public fdm(fdn fdn) {
        this.f16322a = fdn;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f16322a.mo10735b();
    }
}
