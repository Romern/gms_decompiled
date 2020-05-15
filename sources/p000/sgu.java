package p000;

import android.content.Context;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

/* renamed from: sgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgu extends DefaultRetryPolicy {

    /* renamed from: a */
    protected final Context f44439a;

    /* renamed from: b */
    protected final String f44440b;

    public sgu(ajec ajec, String str, int i) {
        this(ajec.f44453i, str, (int) cfop.f185115a.mo6606a().mo82233l(), i, 1.0f);
    }

    public final void retry(VolleyError volleyError) {
        int i;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null || (i = networkResponse.statusCode) < 400 || i >= 500 || "userRateLimitExceeded".equalsIgnoreCase(sil.m35352a(volleyError))) {
            super.retry(volleyError);
            return;
        }
        if (this.f44440b != null && sgv.m35241a(volleyError)) {
            gie.m13192a(this.f44439a, this.f44440b);
        }
        throw volleyError;
    }

    protected sgu(Context context, String str) {
        this.f44439a = context;
        this.f44440b = str;
    }

    public sgu(Context context, String str, int i, int i2, float f) {
        super(i, i2, f);
        this.f44439a = context;
        this.f44440b = str;
    }
}
