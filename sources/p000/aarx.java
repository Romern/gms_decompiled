package p000;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

/* renamed from: aarx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aarx extends DefaultRetryPolicy {

    /* renamed from: a */
    final /* synthetic */ aary f56404a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aarx(aary aary, int i, int i2, float f) {
        super(i, i2, f);
        this.f56404a = aary;
    }

    public final void retry(VolleyError volleyError) {
        int i;
        String a;
        int i2 = aary.f56406i;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null || (i = networkResponse.statusCode) < 400 || i >= 500 || (a = sil.m35352a(volleyError)) == null || !"userRateLimitExceeded".equalsIgnoreCase(a)) {
            NetworkResponse networkResponse2 = volleyError.networkResponse;
            if (networkResponse2 != null && networkResponse2.statusCode == 401) {
                this.f56404a.mo31680a(true);
            }
            super.retry(volleyError);
            return;
        }
        throw volleyError;
    }
}
