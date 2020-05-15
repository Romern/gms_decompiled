package p000;

import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: cdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdc implements cdd {

    /* renamed from: a */
    final /* synthetic */ ceh f6568a;

    /* renamed from: b */
    final /* synthetic */ cgr f6569b;

    public cdc(ceh ceh, cgr cgr) {
        this.f6568a = ceh;
        this.f6569b = cgr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e A[SYNTHETIC, Splitter:B:13:0x002e] */
    /* renamed from: a */
    public final int mo3731a(ccx ccx) {
        cmr cmr;
        try {
            cmr = new cmr(new FileInputStream(this.f6568a.mo3765a().getFileDescriptor()), this.f6569b);
            try {
                int a = ccx.mo3726a(cmr, this.f6569b);
                try {
                    cmr.close();
                } catch (IOException e) {
                }
                this.f6568a.mo3765a();
                return a;
            } catch (Throwable th) {
                th = th;
                if (cmr != null) {
                    try {
                        cmr.close();
                    } catch (IOException e2) {
                    }
                }
                this.f6568a.mo3765a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cmr = null;
            if (cmr != null) {
            }
            this.f6568a.mo3765a();
            throw th;
        }
    }
}
