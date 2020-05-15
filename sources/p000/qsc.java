package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: qsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsc extends qrw {

    /* renamed from: a */
    private final bxxk f42020a;

    /* renamed from: b */
    private final aucf f42021b;

    public qsc(bxxk bxxk, aucf aucf) {
        this.f42020a = bxxk;
        this.f42021b = aucf;
    }

    /* renamed from: a */
    public final void mo24233a(Bundle bundle) {
        bngx bngx;
        try {
            bxxk bxxk = this.f42020a;
            Status status = (Status) adbw.m50144a(bundle, "status", Status.class);
            bngs j = bngx.m109377j();
            if (bundle.containsKey("entities")) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bundle.getByteArray("entities"));
                while (true) {
                    bxxc bxxc = (bxxc) bxxk.mo73663c(byteArrayInputStream, bxus.m123744c());
                    if (bxxc == null) {
                        break;
                    }
                    j.mo67668c(bxxc);
                }
                bngx = j.mo67664a();
            } else {
                bngx = j.mo67664a();
            }
            qsf qsf = new qsf(status, bngx);
            if (qsf.f42025a.mo17710c()) {
                this.f42021b.mo50391a(qsf.f42026b);
            } else {
                this.f42021b.mo50390a((Exception) rzy.m34725a(qsf.f42025a));
            }
        } catch (IOException e) {
            this.f42021b.mo50390a((Exception) rzy.m34725a(Status.f30109c));
        }
    }
}
