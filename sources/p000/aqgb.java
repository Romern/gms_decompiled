package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: aqgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqgb implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ aqgd f86022a;

    public aqgb(aqgd aqgd) {
        this.f86022a = aqgd;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        aqgy.m71600a("Error while uploading chunk: %s", volleyError.getMessage());
        this.f86022a.f86029e.add(0);
    }
}
