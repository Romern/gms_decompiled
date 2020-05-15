package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

/* renamed from: anbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anbi {
    /* renamed from: a */
    public static int m63919a(Exception exc) {
        chuv chuv;
        if (exc instanceof VolleyError) {
            NetworkResponse networkResponse = ((VolleyError) exc).networkResponse;
            if (networkResponse != null) {
                return networkResponse.statusCode;
            }
            return 0;
        } else if (!(exc instanceof chuw) || (chuv = ((chuw) exc).f189236a) == null) {
            return 0;
        } else {
            return chuv.f189233s.f189211r;
        }
    }
}
