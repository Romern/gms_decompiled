package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: bjzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjzq implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ bkaf f123710a;

    public bjzq(bkaf bkaf) {
        this.f123710a = bkaf;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        bkaf bkaf = this.f123710a;
        bkaf.f123747K = null;
        bkaf.mo65717k();
        this.f123710a.f123763af = null;
    }
}
