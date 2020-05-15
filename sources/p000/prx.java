package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: prx */
final /* synthetic */ class prx implements rkl {

    /* renamed from: a */
    private final psd f40123a;

    public prx(psd psd) {
        this.f40123a = psd;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        psd psd = this.f40123a;
        Status bo = ((psu) rkk).mo7183bo();
        int i = bo.f30115i;
        if (i != 0) {
            psd.f40128a.mo23675c(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(i), bo.f30116j), new Object[0]);
        }
        psd.f40137j = null;
        if (!psd.f40135h.isEmpty()) {
            psd.mo23591c();
        }
    }
}
