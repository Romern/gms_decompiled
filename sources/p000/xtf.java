package p000;

/* renamed from: xtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xtf implements bqfp {

    /* renamed from: a */
    final /* synthetic */ xtg f53035a;

    public xtf(xtg xtg) {
        this.f53035a = xtg;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        boolean z;
        xkg xkg = (xkg) obj;
        try {
            byte[] bArr = {xkg.f52499a.f52553Z};
            xkh xkh = xkg.f52500b;
            if (xkh != null) {
                bArr = bqce.m112562a(bArr, xkh.mo29865a().mo74444c());
            }
            xtk.f53046k.mo25414c("  Sending response: %s", srv.m36164d(bArr));
            this.f53035a.f53037b.f53054h.mo30140b((byte) -125, bArr);
            xtk xtk = this.f53035a.f53037b;
            xtk.f53051e.mo30194a(xtk.f53048b, xaj.TYPE_CABLE_CTAP_RESPONSE_SENT);
            xtk xtk2 = this.f53035a.f53037b;
            int i = xtk2.f53055i.f53094f;
            if (i != 1 && xtk2.f53053g != null) {
                if (i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                xtk.f53046k.mo25414c("  Assertion sent, success=%s", Boolean.valueOf(z));
                this.f53035a.f53037b.f53053g.mo30154a(z);
                this.f53035a.f53037b.f53053g = null;
                this.f53035a.f53037b.f53052f = xtj.ASSERTION_SENT;
            }
        } catch (bypr e) {
            xtk.f53046k.mo25417e("Error decoding response", e, new Object[0]);
            this.f53035a.f53037b.mo30122b();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        xtk.f53046k.mo25417e("Error sending response", th, new Object[0]);
        this.f53035a.f53037b.mo30122b();
    }
}
