package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: abfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abfk implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ Response.ErrorListener f57344a;

    /* renamed from: b */
    final /* synthetic */ Response.ErrorListener f57345b;

    public abfk(Response.ErrorListener errorListener, Response.ErrorListener errorListener2) {
        this.f57344a = errorListener;
        this.f57345b = errorListener2;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f57344a.onErrorResponse(volleyError);
        this.f57345b.onErrorResponse(volleyError);
    }
}
