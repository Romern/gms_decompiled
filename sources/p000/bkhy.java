package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: bkhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkhy implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ String f124256a;

    /* renamed from: b */
    final /* synthetic */ bkib f124257b;

    public bkhy(bkib bkib, String str) {
        this.f124257b = bkib;
        this.f124256a = str;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        bkib bkib = this.f124257b;
        String str = this.f124256a;
        bkhz bkhz = (bkhz) bkib.f124263b.remove(str);
        bkhz.f124260c = volleyError;
        bkib.mo66012a(str, bkhz);
    }
}
