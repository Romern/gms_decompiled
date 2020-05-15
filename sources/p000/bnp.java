package p000;

import com.android.volley.Request;
import com.android.volley.Response;

/* renamed from: bnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnp implements Runnable {

    /* renamed from: a */
    private final Request f5197a;

    /* renamed from: b */
    private final Response f5198b;

    /* renamed from: c */
    private final Runnable f5199c;

    public bnp(Request request, Response response, Runnable runnable) {
        this.f5197a = request;
        this.f5198b = response;
        this.f5199c = runnable;
    }

    public final void run() {
        if (this.f5197a.isCanceled()) {
            this.f5197a.mo4167a("canceled-at-delivery");
            return;
        }
        if (this.f5198b.isSuccess()) {
            this.f5197a.deliverResponse(this.f5198b.result);
        } else {
            this.f5197a.deliverError(this.f5198b.error);
        }
        if (this.f5198b.intermediate) {
            this.f5197a.addMarker("intermediate-response");
        } else {
            this.f5197a.mo4167a("done");
        }
        Runnable runnable = this.f5199c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
