package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: atbc */
final /* synthetic */ class atbc implements Response.ErrorListener {

    /* renamed from: a */
    static final Response.ErrorListener f89987a = new atbc();

    private atbc() {
    }

    public final void onErrorResponse(VolleyError volleyError) {
        bnsl bnsl = (bnsl) atbd.f89988a.mo68388c();
        bnsl.mo68437a(volleyError);
        bnsl.mo68432a("atbd", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Chime update failed");
    }
}
