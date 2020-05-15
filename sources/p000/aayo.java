package p000;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: aayo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aayo extends UrlRequest.Callback {

    /* renamed from: a */
    private final bqgy f56826a;

    /* renamed from: b */
    private final ByteArrayOutputStream f56827b;

    /* renamed from: c */
    private final WritableByteChannel f56828c;

    public aayo(bqgy bqgy) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f56827b = byteArrayOutputStream;
        this.f56828c = Channels.newChannel(byteArrayOutputStream);
        this.f56826a = bqgy;
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f56826a.mo69136a((Throwable) cronetException);
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.f56828c.write(byteBuffer);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode == 401) {
            this.f56826a.mo69136a((Throwable) new aayn());
        } else if (httpStatusCode == 429) {
            this.f56826a.mo69136a((Throwable) new aayp());
        } else if (httpStatusCode >= 400 && httpStatusCode <= 499) {
            this.f56826a.mo69138b(new aays(httpStatusCode, urlResponseInfo.getAllHeaders(), null));
        } else if (httpStatusCode >= 500 && httpStatusCode <= 599) {
            bqgy bqgy = this.f56826a;
            StringBuilder sb = new StringBuilder(43);
            sb.append("Received internal server error: ");
            sb.append(httpStatusCode);
            bqgy.mo69136a((Throwable) new Exception(sb.toString()));
        } else {
            urlRequest.read(ByteBuffer.allocateDirect((int) ceev.f182568a.mo6606a().mo79052d()));
        }
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f56826a.mo69138b(new aays(urlResponseInfo.getHttpStatusCode(), urlResponseInfo.getAllHeaders(), this.f56827b.toByteArray()));
    }
}
