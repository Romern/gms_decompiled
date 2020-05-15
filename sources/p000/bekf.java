package p000;

import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Future;

/* renamed from: bekf */
final /* synthetic */ class bekf implements bqeh {

    /* renamed from: a */
    private final bekk f111701a;

    public bekf(bekk bekk) {
        this.f111701a = bekk;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        OutputStream outputStream;
        bekk bekk = this.f111701a;
        Uri uri = (Uri) bqga.m112780a((Future) bekk.f111710b);
        Uri a = bell.m95260a(uri, ".tmp");
        try {
            String valueOf = String.valueOf(bekk.f111709a);
            bljb a2 = blkh.m107282a(valueOf.length() == 0 ? new String("Write ") : "Write ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            try {
                befx befx = new befx();
                try {
                    outputStream = (OutputStream) bekk.f111713e.mo60643a(a, behw.m95072a(), befx);
                    bekk.f111711c.mo60769a(obj, outputStream);
                    befx.mo60681b();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                    bekk.f111713e.mo60645a(a, uri);
                    synchronized (bekk.f111715g) {
                        bekk.f111716h = obj;
                    }
                    return bqga.m112775a((Object) null);
                } catch (IOException e) {
                    throw belk.m95259b(bekk.f111713e, uri, e);
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
            if (bekk.f111713e.mo60647c(a)) {
                try {
                    bekk.f111713e.mo60644a(a);
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
