package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: bgut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgut extends soa {

    /* renamed from: a */
    final /* synthetic */ bguu f117597a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgut(bguu bguu) {
        super(10);
        this.f117597a = bguu;
    }

    public final void run() {
        rke e = this.f117597a.f117598a.mo24388e();
        if (e != null) {
            Status status = (Status) e.mo9456a(chcs.f188354a.mo6606a().mo85112o(), TimeUnit.MILLISECONDS);
            if (!status.mo17710c()) {
                String valueOf = String.valueOf(status.f30116j);
                bgur.m100025c("GCoreUlr", valueOf.length() == 0 ? new String("Clearcut: error uploading: ") : "Clearcut: error uploading: ".concat(valueOf));
            }
        }
    }
}
