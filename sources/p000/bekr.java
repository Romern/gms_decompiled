package p000;

import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Future;

/* renamed from: bekr */
final /* synthetic */ class bekr implements bqeh {

    /* renamed from: a */
    private final bekv f111731a;

    /* renamed from: b */
    private final bqgg f111732b;

    public bekr(bekv bekv, bqgg bqgg) {
        this.f111731a = bekv;
        this.f111732b = bqgg;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        OutputStream outputStream;
        bekv bekv = this.f111731a;
        bqgg bqgg = this.f111732b;
        Uri uri = (Uri) bqga.m112780a((Future) bekv.f111737b);
        Uri a = bell.m95260a(uri, ".tmp");
        try {
            String valueOf = String.valueOf(bekv.f111736a);
            bljb a2 = blkh.m107282a(valueOf.length() == 0 ? new String("Write ") : "Write ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            try {
                befx befx = new befx();
                try {
                    outputStream = (OutputStream) bekv.f111740e.mo60643a(a, behw.m95072a(), befx);
                    bekv.f111738c.mo60769a(obj, outputStream);
                    befx.mo60681b();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                    bekv.f111740e.mo60645a(a, uri);
                    synchronized (bekv.f111741f) {
                        bekv.f111742g = bqgg;
                    }
                    return bqga.m112775a((Object) null);
                } catch (IOException e) {
                    throw belk.m95259b(bekv.f111740e, uri, e);
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
                throw th;
            } catch (Throwable th2) {
                if (a2 != null) {
                    a2.close();
                }
                throw th2;
            }
        } catch (IOException e2) {
            if (bekv.f111740e.mo60647c(a)) {
                try {
                    bekv.f111740e.mo60644a(a);
                } catch (IOException e3) {
                    int i = Build.VERSION.SDK_INT;
                    bqye.m113761a(e2, e3);
                }
            }
            throw e2;
        } catch (Throwable th3) {
            bqye.m113761a(th2, th3);
        }
    }
}
