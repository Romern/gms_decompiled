package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: atsg */
final /* synthetic */ class atsg implements Response.ErrorListener {

    /* renamed from: a */
    private final atsh f90763a;

    public atsg(atsh atsh) {
        this.f90763a = atsh;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        atsh atsh = this.f90763a;
        bnsl bnsl = (bnsl) atsh.f90764a.mo68388c();
        bnsl.mo68437a(volleyError.getCause());
        bnsl.mo68432a("atsh", "a", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        NetworkResponse networkResponse = volleyError.networkResponse;
        bnsl.mo68409a("Could not complete GetOobeFlow RPC. response code %d", networkResponse != null ? networkResponse.statusCode : -1);
        atsh.mo2453l(null);
    }
}
