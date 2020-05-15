package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: abcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abcp implements Future, Response.Listener, Response.ErrorListener {

    /* renamed from: a */
    private final RequestFuture f57039a = RequestFuture.newFuture();

    /* renamed from: b */
    private final Response.Listener f57040b;

    public abcp(Response.Listener listener) {
        this.f57040b = listener;
    }

    public final boolean cancel(boolean z) {
        return this.f57039a.cancel(z);
    }

    public final Object get() {
        return this.f57039a.get();
    }

    public final boolean isCancelled() {
        return this.f57039a.isCancelled();
    }

    public final boolean isDone() {
        return this.f57039a.isDone();
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f57039a.onErrorResponse(volleyError);
    }

    public final void onResponse(Object obj) {
        Response.Listener listener = this.f57040b;
        if (listener != null) {
            listener.onResponse(obj);
        }
        this.f57039a.onResponse(obj);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f57039a.get(j, timeUnit);
    }
}
