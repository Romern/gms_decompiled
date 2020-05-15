package p000;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ResponseDelivery;
import com.android.volley.VolleyError;

/* renamed from: bwaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bwaz extends bwbo {

    /* renamed from: a */
    private final C1231nx f158685a;

    /* renamed from: b */
    private final ResponseDelivery f158686b;

    public bwaz(C1231nx nxVar, ResponseDelivery responseDelivery) {
        this.f158685a = nxVar;
        this.f158686b = responseDelivery;
    }

    public final void postError(Request request, VolleyError volleyError) {
        super.postError(request, volleyError);
        this.f158686b.postError(request, volleyError);
    }

    public final void postResponse(Request request, Response response) {
        super.postResponse(request, response);
        if (request.shouldCache() && response.isSuccess()) {
            this.f158685a.mo15547a(request.getUrl(), response);
        }
        this.f158686b.postResponse(request, response);
    }

    public final void postResponse(Request request, Response response, Runnable runnable) {
        super.postResponse(request, response, runnable);
        if (request.shouldCache() && response.isSuccess()) {
            this.f158685a.mo15547a(request.getUrl(), response);
        }
        this.f158686b.postResponse(request, response, runnable);
    }
}
