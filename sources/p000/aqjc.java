package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: aqjc */
final /* synthetic */ class aqjc implements Response.ErrorListener {

    /* renamed from: a */
    private final aucf f86191a;

    public aqjc(aucf aucf) {
        this.f86191a = aucf;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f86191a.mo50392b((Exception) volleyError);
    }
}
