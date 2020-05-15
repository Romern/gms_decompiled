package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: atfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atfc implements atfd {

    /* renamed from: a */
    final /* synthetic */ Response.ErrorListener f90226a;

    /* renamed from: b */
    final /* synthetic */ Response.Listener f90227b;

    public atfc(Response.ErrorListener errorListener, Response.Listener listener) {
        this.f90226a = errorListener;
        this.f90227b = listener;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f90226a.onErrorResponse(volleyError);
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        this.f90227b.onResponse((bxxc) obj);
    }
}
