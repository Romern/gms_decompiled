package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: ansn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ansn implements rkl {

    /* renamed from: a */
    final /* synthetic */ ansp f77593a;

    public ansn(ansp ansp) {
        this.f77593a = ansp;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        alla alla = (alla) rkk;
        ansp ansp = this.f77593a;
        Status bo = alla.mo7183bo();
        amfb b = alla.mo40472b();
        if (bo.mo17710c()) {
            try {
                if (b.mo24660a() > 0) {
                    ansp.f77602f = b.mo24661a(0).mo25476e();
                } else {
                    ansp.f77602f = null;
                }
                b.mo12460c();
                ansp.f77607k = true;
                ansp.mo42190d();
            } catch (Throwable th) {
                b.mo12460c();
                throw th;
            }
        }
    }
}
