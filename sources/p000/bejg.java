package p000;

import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Future;

/* renamed from: bejg */
final /* synthetic */ class bejg implements bqeh {

    /* renamed from: a */
    private final bejk f111644a;

    public bejg(bejk bejk) {
        this.f111644a = bejk;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        OutputStream outputStream;
        bejk bejk = this.f111644a;
        bxxc bxxc = (bxxc) obj;
        Uri uri = (Uri) bqga.m112780a((Future) bejk.f111650b);
        Uri a = bell.m95260a(uri, ".tmp");
        try {
            String valueOf = String.valueOf(bejk.f111649a);
            bljb a2 = blkh.m107282a(valueOf.length() == 0 ? new String("Write ") : "Write ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            try {
                befx befx = new befx();
                try {
                    outputStream = (OutputStream) bejk.f111652d.mo60643a(a, behw.m95072a(), befx);
                    bxxc.mo73638a(outputStream);
                    befx.mo60681b();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                    bejk.f111652d.mo60645a(a, uri);
                    return bqga.m112775a((Object) null);
                } catch (IOException e) {
                    throw belk.m95259b(bejk.f111652d, uri, e);
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
            if (bejk.f111652d.mo60647c(a)) {
                try {
                    bejk.f111652d.mo60644a(a);
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
