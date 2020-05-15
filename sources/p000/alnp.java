package p000;

import android.util.Log;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: alnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alnp implements Response.ErrorListener {
    public final void onErrorResponse(VolleyError volleyError) {
        Log.w("BasePeopleOperation", "Failed to get result");
    }
}
