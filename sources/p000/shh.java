package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: shh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class shh implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ String f44469a;

    /* renamed from: b */
    final /* synthetic */ Response.ErrorListener f44470b;

    /* renamed from: c */
    final /* synthetic */ shj f44471c;

    public shh(shj shj, String str, Response.ErrorListener errorListener) {
        this.f44471c = shj;
        this.f44469a = str;
        this.f44470b = errorListener;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        NetworkResponse networkResponse;
        if (volleyError == null || (networkResponse = volleyError.networkResponse) == null) {
            this.f44471c.f44475l.mo25566a(this.f44469a, -1);
        } else {
            this.f44471c.f44475l.mo25566a(this.f44469a, networkResponse.statusCode);
        }
        this.f44471c.f44475l.mo25564a();
        this.f44470b.onErrorResponse(volleyError);
    }
}
