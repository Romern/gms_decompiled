package p000;

import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;

/* renamed from: atez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atez implements RetryPolicy {

    /* renamed from: a */
    final /* synthetic */ atfa f90215a;

    /* renamed from: b */
    private int f90216b;

    public atez(atfa atfa) {
        this.f90215a = atfa;
    }

    public final int getCurrentRetryCount() {
        return this.f90216b;
    }

    public final int getCurrentTimeout() {
        return 0;
    }

    public final void retry(VolleyError volleyError) {
        NetworkResponse networkResponse;
        atfa atfa = this.f90215a;
        if (atfa.f90219f == null || this.f90216b > 0 || (networkResponse = volleyError.networkResponse) == null || networkResponse.statusCode != 401) {
            throw volleyError;
        }
        if (!TextUtils.isEmpty(atfa.f90220g)) {
            try {
                gie.m13196b(atfa.f90218e, atfa.f90220g);
            } catch (Exception e) {
                bnsl bnsl = (bnsl) atfa.f90217d.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("atfa", "b", 182, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unexpected exception while clearing token");
            }
        }
        this.f90216b++;
    }
}
