package p000;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.VolleyError;

/* renamed from: eny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eny extends DefaultRetryPolicy {

    /* renamed from: a */
    private final enx f15368a;

    /* renamed from: b */
    private boolean f15369b;

    public eny(enx enx) {
        super(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 1, 1.0f);
        this.f15368a = enx;
    }

    public final void retry(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            if (!this.f15369b) {
                eoa.m10826b("GoogleAuthProtoRequest", "Request failed due to auth failure, clearing token", new Object[0]);
                this.f15369b = true;
                this.f15368a.mo10343b();
            } else {
                eoa.m10824a("GoogleAuthProtoRequest", "Repeated auth failure, giving up", new Object[0]);
                throw volleyError;
            }
        }
        super.retry(volleyError);
    }
}
