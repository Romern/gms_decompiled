package p000;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: bjtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjtz extends Request {

    /* renamed from: d */
    private final Response.Listener f123329d;

    public bjtz(String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(1, str, errorListener);
        this.f123329d = listener;
        SystemClock.elapsedRealtime();
    }

    public final void deliverError(VolleyError volleyError) {
        SystemClock.elapsedRealtime();
        super.deliverError(volleyError);
    }

    public final void deliverResponse(Object obj) {
        SystemClock.elapsedRealtime();
        this.f123329d.onResponse(obj);
    }
}
