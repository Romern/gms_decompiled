package p000;

import android.graphics.Bitmap;
import java.io.IOException;

/* renamed from: cmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cmt implements cmd {

    /* renamed from: a */
    private final cmr f7085a;

    /* renamed from: b */
    private final cqs f7086b;

    public cmt(cmr cmr, cqs cqs) {
        this.f7085a = cmr;
        this.f7086b = cqs;
    }

    /* renamed from: a */
    public final void mo3970a() {
        this.f7085a.mo3979a();
    }

    /* renamed from: a */
    public final void mo3971a(cgt cgt, Bitmap bitmap) {
        IOException iOException = this.f7086b.f11862c;
        if (iOException != null) {
            if (bitmap != null) {
                cgt.mo3881a(bitmap);
            }
            throw iOException;
        }
    }
}
