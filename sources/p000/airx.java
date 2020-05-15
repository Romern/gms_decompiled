package p000;

import java.io.IOException;

/* renamed from: airx */
final /* synthetic */ class airx implements Runnable {

    /* renamed from: a */
    private final airy f69605a;

    public airx(airy airy) {
        this.f69605a = airy;
    }

    public final void run() {
        airy airy = this.f69605a;
        try {
            byte[] a = airy.mo37917a(airy.f69606c.mo37929b());
            int b = airy.f69606c.mo37929b();
            while (true) {
                airu a2 = airy.f69606c.mo37927a(new airt(Byte.MIN_VALUE, (byte) 3, (byte) 0, (byte) 0, a, b));
                if (!a2.mo37911c()) {
                    airy.mo37916a(a2.f69600a);
                    try {
                        if (airy.f69609f.available() > 0) {
                            continue;
                        }
                    } catch (IOException e) {
                    }
                    if (a2.f69600a.length <= 0) {
                        return;
                    }
                } else {
                    srz.m36171a(airy);
                    return;
                }
            }
        } catch (IOException e2) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("airy", "d", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("NearFieldCommunicationSocket encountered an error when sending DATA command.");
            srz.m36171a(airy);
        }
    }
}
