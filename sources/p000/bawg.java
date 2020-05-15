package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* renamed from: bawg */
final /* synthetic */ class bawg implements bqeh {

    /* renamed from: a */
    private final bawq f101969a;

    /* renamed from: b */
    private final batp f101970b;

    /* renamed from: c */
    private final bauy f101971c;

    public bawg(bawq bawq, batp batp, bauy bauy) {
        this.f101969a = bawq;
        this.f101970b = batp;
        this.f101971c = bauy;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bawq bawq = this.f101969a;
        batp batp = this.f101970b;
        bauy bauy = this.f101971c;
        Uri uri = (Uri) obj;
        if (uri == null) {
            bauo a = bauq.m87573a();
            a.f101791a = baup.DOWNLOADED_FILE_NOT_FOUND_ERROR;
            a.f101792b = "getDataFileUri() resolved to null";
            return bqga.m112777a((Throwable) a.mo55987a());
        }
        try {
            if (!bawq.f101995d.mo60648d(uri)) {
                batp.mo55952a(bawq.m87633a(bauy.f101850b, bauy.f101852d, bauy.f101857i, uri.toString()));
            } else {
                String path = uri.getPath();
                if (path != null) {
                    List a2 = bawq.mo55998a(uri, path);
                    if (batp.f164950c) {
                        batp.mo74035c();
                        batp.f164950c = false;
                    }
                    batr batr = (batr) batp.f164949b;
                    batr batr2 = batr.f101718h;
                    batr.mo55953a();
                    bxsy.m123078a(a2, batr.f101726g);
                }
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Failed to list files under directory:");
            sb.append(valueOf);
            bbev.m87907a(e, sb.toString());
        }
        return bqga.m112775a(batp);
    }
}
