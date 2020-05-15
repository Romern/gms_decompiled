package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: atba */
final /* synthetic */ class atba implements Response.ErrorListener {

    /* renamed from: a */
    static final Response.ErrorListener f89985a = new atba();

    private atba() {
    }

    public final void onErrorResponse(VolleyError volleyError) {
        bnsl bnsl = (bnsl) atbd.f89988a.mo68388c();
        bnsl.mo68437a(volleyError);
        bnsl.mo68432a("atbd", "b", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Chime request failed");
    }
}
