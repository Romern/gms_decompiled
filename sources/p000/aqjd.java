package p000;

import android.text.TextUtils;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;

/* renamed from: aqjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjd {

    /* renamed from: a */
    public static final Logger f86192a = new Logger("SetupServices", "UpdateableStringHelper");

    /* renamed from: a */
    public static aucb m71716a(String str) {
        if (TextUtils.isEmpty(str)) {
            return aucu.m76778a((Object) null);
        }
        aucf aucf = new aucf();
        RequestQueue requestQueue = rpr.m34216b().getRequestQueue();
        aqjb aqjb = new aqjb(str, aucf);
        aucf.getClass();
        StringRequest stringRequest = new StringRequest(str, aqjb, new aqjc(aucf));
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(5000, 1, 2.0f));
        requestQueue.add(stringRequest);
        return aucf.f91388a.mo50363a(aqja.f86188a);
    }
}
