package p000;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: citp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class citp extends UrlRequest.Callback {

    /* renamed from: a */
    final /* synthetic */ citq f191427a;

    public citp(citq citq) {
        this.f191427a = citq;
    }

    /* renamed from: a */
    private final void m150981a(IOException iOException) {
        citq citq = this.f191427a;
        int i = citq.f191428h;
        citq.f191434f = iOException;
        citr citr = citq.f191431c;
        if (citr != null) {
            citr.f191447c = iOException;
            citr.f191445a = true;
            citr.f191446b = null;
        }
        cits cits = citq.f191432d;
        if (cits != null) {
            cits.f191450d = iOException;
            cits.f191451e = true;
        }
        citq.f191442o = true;
        this.f191427a.f191429a.mo86559b();
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        citq citq = this.f191427a;
        int i = citq.f191428h;
        citq.f191433e = urlResponseInfo;
        m150981a(new IOException("disconnect() called"));
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (cronetException != null) {
            citq citq = this.f191427a;
            int i = citq.f191428h;
            citq.f191433e = urlResponseInfo;
            m150981a(cronetException);
            return;
        }
        throw new IllegalStateException("Exception cannot be null in onFailed.");
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        citq citq = this.f191427a;
        int i = citq.f191428h;
        citq.f191433e = urlResponseInfo;
        citq.f191429a.mo86559b();
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        citq citq = this.f191427a;
        int i = citq.f191428h;
        citq.f191435g = true;
        try {
            URL url = new URL(str);
            boolean equals = url.getProtocol().equals(this.f191427a.url.getProtocol());
            if (this.f191427a.instanceFollowRedirects) {
                this.f191427a.url = url;
            }
            if (this.f191427a.instanceFollowRedirects) {
                if (equals) {
                    this.f191427a.f191430b.followRedirect();
                    return;
                }
            }
        } catch (MalformedURLException e) {
        }
        citq citq2 = this.f191427a;
        citq2.f191433e = urlResponseInfo;
        citq2.f191430b.cancel();
        m150981a(null);
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        citq citq = this.f191427a;
        int i = citq.f191428h;
        citq.f191433e = urlResponseInfo;
        citq.f191442o = true;
        this.f191427a.f191429a.mo86559b();
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        citq citq = this.f191427a;
        int i = citq.f191428h;
        citq.f191433e = urlResponseInfo;
        m150981a(null);
    }
}
