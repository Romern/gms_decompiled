package p000;

import java.io.IOException;

/* renamed from: ahpr */
public final /* synthetic */ class ahpr implements Runnable {

    /* renamed from: a */
    private final ahps f67745a;

    /* renamed from: b */
    private final airy f67746b;

    public ahpr(ahps ahps, airy airy) {
        this.f67745a = ahps;
        this.f67746b = airy;
    }

    public final void run() {
        ahps ahps = this.f67745a;
        airy airy = this.f67746b;
        String str = airy.f69126a;
        ahow a = ahow.m56298a(airy);
        if (a != null) {
            srn srn = ahkm.f67363a;
            ahkm.m55981a(ahps.f67748b);
        } else {
            try {
                airy.close();
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68420a("Failed to close NFC socket with device %s", str);
            }
        }
        ahps.f67749c.mo36844a(ahps.f67747a, str, a, bvif.NFC);
    }
}
