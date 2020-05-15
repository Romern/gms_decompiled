package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: cda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cda implements cde {

    /* renamed from: a */
    final /* synthetic */ ceh f6564a;

    /* renamed from: b */
    final /* synthetic */ cgr f6565b;

    public cda(ceh ceh, cgr cgr) {
        this.f6564a = ceh;
        this.f6565b = cgr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[SYNTHETIC, Splitter:B:13:0x002c] */
    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo3729a(ccx ccx) {
        cmr cmr;
        try {
            cmr = new cmr(new FileInputStream(this.f6564a.mo3765a().getFileDescriptor()), this.f6565b);
            try {
                ImageHeaderParser$ImageType a = ccx.mo3727a(cmr);
                try {
                    cmr.close();
                } catch (IOException e) {
                }
                this.f6564a.mo3765a();
                return a;
            } catch (Throwable th) {
                th = th;
                if (cmr != null) {
                    try {
                        cmr.close();
                    } catch (IOException e2) {
                    }
                }
                this.f6564a.mo3765a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cmr = null;
            if (cmr != null) {
            }
            this.f6564a.mo3765a();
            throw th;
        }
    }
}
