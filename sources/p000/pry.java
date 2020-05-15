package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: pry */
final /* synthetic */ class pry implements rkl {

    /* renamed from: a */
    private final psd f40124a;

    public pry(psd psd) {
        this.f40124a = psd;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        psd psd = this.f40124a;
        Status bo = ((psu) rkk).mo7183bo();
        int i = bo.f30115i;
        if (i != 0) {
            psd.f40128a.mo23675c(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(i), bo.f30116j), new Object[0]);
        }
        psd.f40136i = null;
        if (!psd.f40135h.isEmpty()) {
            psd.mo23591c();
        }
    }
}
