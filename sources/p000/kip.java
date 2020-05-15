package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: kip */
final /* synthetic */ class kip implements Response.ErrorListener {

    /* renamed from: a */
    private final aic f24219a;

    public kip(aic aic) {
        this.f24219a = aic;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f24219a.mo750a((Throwable) volleyError);
    }
}
