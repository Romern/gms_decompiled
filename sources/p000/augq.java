package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: augq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class augq extends UrlRequest.Callback {

    /* renamed from: a */
    private final augs f91782a;

    /* renamed from: b */
    private int f91783b = 0;

    /* renamed from: c */
    private String f91784c = null;

    public augq(augs augs) {
        this.f91782a = augs;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    private final void m77038a(CronetException cronetException) {
        int i = this.f91783b;
        if (i / 100 == 2) {
            this.f91782a.mo50515a(aufs.m76993a(i));
        } else if (i != 0 || cronetException == null) {
            augs augs = this.f91782a;
            String str = this.f91784c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(i);
            sb.append("/");
            sb.append(str);
            augs.mo50515a(aufs.m76994a(i, new ProtocolException(sb.toString())));
        } else if (cronetException instanceof NetworkException) {
            NetworkException networkException = (NetworkException) cronetException;
            augs augs2 = this.f91782a;
            int errorCode = networkException.getErrorCode();
            int errorCode2 = networkException.getErrorCode();
            Throwable th = networkException;
            switch (errorCode2) {
                case 1:
                    th = new UnknownHostException(networkException.getMessage()).initCause(networkException);
                    break;
                case 2:
                case 3:
                    th = new InterruptedIOException(networkException.getMessage()).initCause(networkException);
                    break;
                case 4:
                    th = new SocketTimeoutException(networkException.getMessage()).initCause(networkException);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    th = new ConnectException(networkException.getMessage()).initCause(networkException);
                    break;
                case 9:
                    th = new NoRouteToHostException(networkException.getMessage()).initCause(networkException);
                    break;
                case 11:
                    th = new IOException(networkException);
                    break;
            }
            augs2.mo50515a(aufs.m76994a(errorCode, th));
        } else if (cronetException instanceof CallbackException) {
            CallbackException callbackException = (CallbackException) cronetException;
            this.f91782a.mo69136a((Throwable) new ExecutionException(callbackException.getMessage(), callbackException.getCause()));
        } else {
            this.f91782a.mo69136a((Throwable) cronetException);
        }
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        m77038a(null);
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        m77038a(cronetException);
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        urlRequest.cancel();
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f91783b = urlResponseInfo.getHttpStatusCode();
        this.f91784c = urlResponseInfo.getHttpStatusText();
        urlRequest.cancel();
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        m77038a(null);
    }
}
