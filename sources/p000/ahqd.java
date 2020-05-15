package p000;

import java.io.IOException;

/* renamed from: ahqd */
final /* synthetic */ class ahqd implements Runnable {

    /* renamed from: a */
    private final ahqe f67781a;

    /* renamed from: b */
    private final aivx f67782b;

    public ahqd(ahqe ahqe, aivx aivx) {
        this.f67781a = ahqe;
        this.f67782b = aivx;
    }

    public final void run() {
        ahqe ahqe = this.f67781a;
        aivx aivx = this.f67782b;
        String str = aivx.f69126a;
        ahrg a = ahrg.m56414a(aivx);
        if (a != null) {
            srn srn = ahkm.f67363a;
            ahkm.m55981a(ahqe.f67784b);
        } else {
            try {
                aivx.close();
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68420a("Failed to close Wifi Aware socket with device %s", str);
            }
        }
        ahqe.f67785c.mo36844a(ahqe.f67783a, str, a, bvif.WIFI_AWARE);
    }
}
