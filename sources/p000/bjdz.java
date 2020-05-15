package p000;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: bjdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjdz implements ResponseHandler {

    /* renamed from: a */
    private final ResponseHandler f122564a;

    /* renamed from: b */
    private final HttpUriRequest f122565b;

    public final Object handleResponse(HttpResponse httpResponse) {
        ResponseHandler responseHandler = this.f122564a;
        bixi.m102936a(this.f122565b, httpResponse, null);
        return responseHandler.handleResponse(httpResponse);
    }

    public /* synthetic */ bjdz(ResponseHandler responseHandler, HttpUriRequest httpUriRequest) {
        this.f122564a = responseHandler;
        this.f122565b = httpUriRequest;
    }
}
