package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;
import java.io.Closeable;

/* renamed from: ayds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayds implements Closeable {

    /* renamed from: a */
    private final aydr f97251a;

    public ayds(ConnectionConfiguration connectionConfiguration) {
        boolean z;
        sdo.m34967a("NetworkConnectionChimeraService.constructor");
        if (connectionConfiguration.f110867d == 2) {
            z = true;
        } else {
            z = false;
        }
        aydr aydr = new aydr(z, connectionConfiguration);
        this.f97251a = aydr;
        aydr.start();
    }

    public final void close() {
        sdo.m34967a("close");
        aydr aydr = this.f97251a;
        aydr.interrupt();
        aydr.mo53969a();
        aydr.mo53970b();
        bqhi.m112840a(aydr);
    }
}
