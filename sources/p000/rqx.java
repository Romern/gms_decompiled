package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.concurrent.Future;

/* renamed from: rqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rqx extends bqdt implements Future, Response.Listener, Response.ErrorListener {
    public final void onErrorResponse(VolleyError volleyError) {
        mo69136a((Throwable) volleyError);
    }

    public final void onResponse(Object obj) {
        mo69138b(obj);
    }
}
