package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: abgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abgy implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ abgz f57454a;

    public abgy(abgz abgz) {
        this.f57454a = abgz;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f57454a.f57455a = volleyError;
    }
}
