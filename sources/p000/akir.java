package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.CountDownLatch;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: akir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akir extends UrlRequest.Callback {

    /* renamed from: a */
    private final File f72060a;

    /* renamed from: b */
    private final CountDownLatch f72061b;

    public akir(File file, CountDownLatch countDownLatch) {
        this.f72060a = file;
        this.f72061b = countDownLatch;
    }

    /* renamed from: a */
    private final void m59846a() {
        if (this.f72060a.exists()) {
            this.f72060a.delete();
        }
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        m59846a();
        this.f72061b.countDown();
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akir", "onFailed", 415, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Failed to download %s", this.f72060a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        FileChannel channel;
        if (byteBuffer.position() == 0) {
            m59846a();
            srn srn = ajvp.f71371a;
            return;
        }
        try {
            channel = new FileOutputStream(this.f72060a, true).getChannel();
            byteBuffer.flip();
            channel.write(byteBuffer);
            byteBuffer.clear();
            if (!urlRequest.isDone()) {
                urlRequest.read(byteBuffer);
            }
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akir", "onReadCompleted", (int) ErrorInfo.TYPE_FSC_OTHER_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Saved file to %s", this.f72060a.getAbsoluteFile());
            if (channel != null) {
                channel.close();
                return;
            }
            return;
        } catch (IOException e) {
            m59846a();
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("akir", "onReadCompleted", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to write to %s", this.f72060a);
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo.getHttpStatusCode() != 200) {
            m59846a();
            srn srn = ajvp.f71371a;
            urlResponseInfo.getHttpStatusCode();
            this.f72061b.countDown();
            return;
        }
        urlRequest.read(ByteBuffer.allocateDirect(8192));
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f72061b.countDown();
    }
}
