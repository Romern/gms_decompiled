package p000;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: cith */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cith extends UrlRequest.Callback {

    /* renamed from: a */
    private final UrlRequest.Callback f191409a;

    public cith(UrlRequest.Callback callback) {
        this.f191409a = callback;
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f191409a.onCanceled(urlRequest, urlResponseInfo);
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f191409a.onFailed(urlRequest, urlResponseInfo, cronetException);
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f191409a.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.f191409a.onRedirectReceived(urlRequest, urlResponseInfo, str);
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f191409a.onResponseStarted(urlRequest, urlResponseInfo);
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f191409a.onSucceeded(urlRequest, urlResponseInfo);
    }
}
