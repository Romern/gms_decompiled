package p000;

import java.io.IOException;

/* renamed from: ahnb */
final /* synthetic */ class ahnb implements Runnable {

    /* renamed from: a */
    private final ahnc f67593a;

    /* renamed from: b */
    private final String f67594b;

    public ahnb(ahnc ahnc, String str) {
        this.f67593a = ahnc;
        this.f67594b = str;
    }

    public final void run() {
        ahnc ahnc = this.f67593a;
        String str = this.f67594b;
        try {
            ahnc.f67595a.mo36799a(ahoy.m56308a());
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("EndpointChannelManager reported the disconnection to endpoint %s.", str);
        } catch (IOException e) {
        }
    }
}
