package p000;

import com.android.volley.Cache;
import com.android.volley.ExecutorDelivery;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.ResponseDelivery;
import java.util.concurrent.Executor;

/* renamed from: bwba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwba extends RequestQueue {

    /* renamed from: e */
    private static final Executor f158687e = new bwax();

    /* renamed from: c */
    private final C1231nx f158688c;

    /* renamed from: d */
    private final ExecutorDelivery f158689d = new ExecutorDelivery(f158687e);

    public bwba(Cache cache, Network network, C1231nx nxVar, ResponseDelivery responseDelivery) {
        super(cache, network, 4, new bwaz(nxVar, responseDelivery));
        this.f158688c = nxVar;
    }

    public final Request add(Request request) {
        Response response = (Response) this.f158688c.mo15546a(request.getUrl());
        if (response != null) {
            this.f158689d.postResponse(request, response);
            return request;
        }
        super.add(request);
        return request;
    }
}
