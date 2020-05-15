package p000;

import android.os.ConditionVariable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: red */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class red extends UrlRequest.Callback {

    /* renamed from: a */
    final WritableByteChannel f42786a = Channels.newChannel(this.f42787b);

    /* renamed from: b */
    final /* synthetic */ bxtv f42787b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f42788c;

    /* renamed from: d */
    final /* synthetic */ ConditionVariable f42789d;

    public red(bxtv bxtv, AtomicReference atomicReference, ConditionVariable conditionVariable) {
        this.f42787b = bxtv;
        this.f42788c = atomicReference;
        this.f42789d = conditionVariable;
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f42788c.set(new CancellationException());
        this.f42789d.open();
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f42788c.set(cronetException);
        this.f42789d.open();
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.f42786a.write(byteBuffer);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        String valueOf = String.valueOf(str);
        throw new IOException(valueOf.length() == 0 ? new String("Did not expect a redirect to: ") : "Did not expect a redirect to: ".concat(valueOf));
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.read(ByteBuffer.allocateDirect(4096));
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f42788c.set(urlResponseInfo);
        this.f42789d.open();
    }
}
