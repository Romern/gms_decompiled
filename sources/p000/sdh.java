package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: sdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sdh implements rkd {

    /* renamed from: a */
    final /* synthetic */ rke f44063a;

    /* renamed from: b */
    final /* synthetic */ aucf f44064b;

    /* renamed from: c */
    final /* synthetic */ sdk f44065c;

    public sdh(rke rke, aucf aucf, sdk sdk) {
        this.f44063a = rke;
        this.f44064b = aucf;
        this.f44065c = sdk;
    }

    /* renamed from: a */
    public final void mo24807a(Status status) {
        if (status.mo17710c()) {
            this.f44064b.mo50391a(this.f44065c.mo25398a(this.f44063a.mo9456a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f44064b.mo50390a((Exception) rzy.m34725a(status));
    }
}
