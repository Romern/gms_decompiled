package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.service.TapAndPayChimeraService;

/* renamed from: atik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atik extends atkk {

    /* renamed from: a */
    private final long f90399a;

    public atik(long j, String str, aswm aswm) {
        super("BlockPaymentCards", str, aswm);
        this.f90399a = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49636m(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        boolean z;
        if (!cgwn.m147255e()) {
            bnsl bnsl = (bnsl) TapAndPayChimeraService.f108661a.mo68390d();
            bnsl.mo68432a("atik", "b", 2404, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("blockPaymentCards: feature flag not enabled");
            this.f90414d.mo49636m(Status.f30107a);
            return;
        }
        if (this.f90399a > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (!astb.m74737a(SystemClock.elapsedRealtime(), this.f90399a)) {
            atam.m75294a(context, asix.m74198a(context)).mo49754b();
        }
        this.f90414d.mo49636m(Status.f30107a);
    }
}
