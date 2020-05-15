package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.service.TapAndPayChimeraService;

/* renamed from: atkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atkg extends atkk {
    public atkg(String str, aswm aswm) {
        super("UnblockPaymentCards", str, aswm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49637n(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        if (cgwn.m147255e()) {
            if (astb.m74742c(SystemClock.elapsedRealtime())) {
                atam.m75294a(context, asix.m74198a(context)).mo49759c();
            }
            this.f90414d.mo49637n(Status.f30107a);
            return;
        }
        srn srn = TapAndPayChimeraService.f108661a;
        this.f90414d.mo49637n(Status.f30107a);
    }
}
