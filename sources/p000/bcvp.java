package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bcvp */
final /* synthetic */ class bcvp implements bqeh {

    /* renamed from: a */
    private final bcvt f105007a;

    /* renamed from: b */
    private final bcwr f105008b;

    /* renamed from: c */
    private final bcoh f105009c;

    /* renamed from: d */
    private final bctr f105010d;

    /* renamed from: e */
    private final String f105011e;

    public bcvp(bcvt bcvt, bcwr bcwr, bcoh bcoh, bctr bctr, String str) {
        this.f105007a = bcvt;
        this.f105008b = bcwr;
        this.f105009c = bcoh;
        this.f105010d = bctr;
        this.f105011e = str;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bcvt bcvt = this.f105007a;
        bcwr bcwr = this.f105008b;
        bcoh bcoh = this.f105009c;
        bctr bctr = this.f105010d;
        String str = this.f105011e;
        Void voidR = (Void) obj;
        if (bcwr.mo57623b() != null) {
            try {
                InputStream a = bcvt.mo57599a(Uri.parse(bcwr.mo57623b()));
                if (a != null) {
                    a.close();
                }
                bcvw b = bcvx.m90131b();
                b.mo57614a(bcwr.mo57623b());
                return bqga.m112775a(b.mo57613a());
            } catch (IOException e) {
            }
        }
        bcwe bcwe = bcvt.f105024c;
        bcwp a2 = bcwr.mo57622a();
        bcei c = bcej.m88869c();
        c.f104034a = "LighterPhotoScottyDownload";
        c.mo56735a(bcen.f104044e);
        return bcwe.mo57615a(bcoh, a2, bctr, str, c.mo56734a(), 18);
    }
}
