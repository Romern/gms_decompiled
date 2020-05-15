package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* renamed from: chwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chwa extends BidirectionalStream.Callback {

    /* renamed from: a */
    final /* synthetic */ chwe f189313a;

    /* renamed from: b */
    private List f189314b;

    public chwa(chwe chwe) {
        this.f189313a = chwe;
    }

    /* renamed from: a */
    private static final chuv m149660a(UrlResponseInfo urlResponseInfo) {
        return ciag.m149908a(urlResponseInfo.getHttpStatusCode());
    }

    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        chuv chuv;
        chwe chwe = this.f189313a;
        ByteBuffer byteBuffer = chwe.f189329a;
        chwd chwd = chwe.f189345o;
        int i = chwd.f189319i;
        synchronized (chwd.f189320a) {
            chuv = this.f189313a.f189345o.f189324e;
            if (chuv == null) {
                if (urlResponseInfo == null) {
                    chuv = chuv.f189216c.mo85687a("stream cancelled without reason");
                } else {
                    chuv = m149660a(urlResponseInfo);
                }
            }
        }
        this.f189313a.mo85736a(chuv);
    }

    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        chwe chwe = this.f189313a;
        chuv c = chuv.f189229p.mo85692c(cronetException);
        ByteBuffer byteBuffer = chwe.f189329a;
        chwe.mo85736a(c);
    }

    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        chwe chwe = this.f189313a;
        ByteBuffer byteBuffer2 = chwe.f189329a;
        chwd chwd = chwe.f189345o;
        int i = chwd.f189319i;
        synchronized (chwd.f189320a) {
            this.f189313a.f189345o.f189325f = z;
            if (byteBuffer.remaining() != 0) {
                chwd.m149666a(this.f189313a.f189345o, byteBuffer);
            }
        }
        if (z && (list = this.f189314b) != null) {
            m149661a(list, true);
        }
    }

    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        m149661a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List asList = headerBlock.getAsList();
        this.f189314b = asList;
        chwe chwe = this.f189313a;
        ByteBuffer byteBuffer = chwe.f189329a;
        chwd chwd = chwe.f189345o;
        int i = chwd.f189319i;
        synchronized (chwd.f189320a) {
            z = this.f189313a.f189345o.f189325f;
        }
        if (z) {
            m149661a(asList, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection], assign insn: 0x0019: IGET  (r1v1 ? I:java.util.Collection) = (r0v6 chwd) chwd.b java.util.Collection */
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        chwe chwe = this.f189313a;
        ByteBuffer byteBuffer = chwe.f189329a;
        chwd chwd = chwe.f189345o;
        int i = chwd.f189319i;
        synchronized (chwd.f189320a) {
            this.f189313a.f189345o.mo85731a();
            chwd chwd2 = this.f189313a.f189345o;
            chwd2.f189322c = true;
            ? r1 = chwd2.f189321b;
            int size = r1.size();
            for (int i2 = 0; i2 < size; i2++) {
                chwb chwb = (chwb) r1.get(i2);
                chwd2.f189327h.mo85737a(chwb.f189315a, chwb.f189316b, chwb.f189317c);
            }
            chwd2.f189321b.clear();
        }
    }

    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        chwe chwe = this.f189313a;
        ByteBuffer byteBuffer = chwe.f189329a;
        chwd chwd = chwe.f189345o;
        int i = chwd.f189319i;
        synchronized (chwd.f189320a) {
            z = false;
            if (this.f189314b != null && this.f189313a.f189345o.f189325f) {
                z = true;
            }
        }
        if (!z) {
            List list = this.f189314b;
            if (list != null) {
                m149661a(list, true);
            } else if (urlResponseInfo != null) {
                m149661a(urlResponseInfo.getAllHeadersAsList(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        this.f189313a.mo85736a(m149660a(urlResponseInfo));
    }

    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        chwe chwe = this.f189313a;
        ByteBuffer byteBuffer2 = chwe.f189329a;
        chwd chwd = chwe.f189345o;
        int i = chwd.f189319i;
        synchronized (chwd.f189320a) {
            chwe chwe2 = this.f189313a;
            chwd chwd2 = chwe2.f189345o;
            if (!chwd2.f189326g) {
                chwd2.f189326g = true;
                chwe2.f189336f.mo86023a();
            }
            this.f189313a.f189345o.mo85778c(byteBuffer.position());
        }
    }

    /* renamed from: a */
    private final void m149661a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(Charset.forName("UTF-8"));
            int i2 = i + 1;
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(Charset.forName("UTF-8"));
        }
        chtr a = chsg.m149482a(cife.m150162a(bArr));
        chwe chwe = this.f189313a;
        ByteBuffer byteBuffer = chwe.f189329a;
        chwd chwd = chwe.f189345o;
        int i3 = chwd.f189319i;
        synchronized (chwd.f189320a) {
            chwd chwd2 = this.f189313a.f189345o;
            if (!z) {
                chwd2.mo85866a(a);
            } else {
                chwd2.mo85868b(a);
            }
        }
    }
}
