package p000;

import android.util.Log;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: adwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adwt implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ bqgy f62848a;

    public adwt(bqgy bqgy) {
        this.f62848a = bqgy;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        String valueOf = String.valueOf(volleyError);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("volleyError ");
        sb.append(valueOf);
        Log.e("Sbuscriber ", sb.toString());
        this.f62848a.mo69136a((Throwable) volleyError);
    }
}
