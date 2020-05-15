package p000;

import java.io.IOException;

/* renamed from: blvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blvu implements bluo {

    /* renamed from: a */
    final /* synthetic */ blvv f127897a;

    public blvu(blvv blvv) {
        this.f127897a = blvv;
    }

    /* renamed from: a */
    public final void mo13812a(bluu bluu) {
        synchronized (this.f127897a) {
            if (!bluu.mo66725b()) {
                this.f127897a.mo66702a(new IOException("transmit of connection request failed"));
                return;
            }
            blvv blvv = this.f127897a;
            int i = blvv.f127898f;
            if (i != 3) {
                if (i != 1) {
                    blvv.f127819b.mo13815a(new blut("unexpected transmit of connection request"));
                }
                this.f127897a.f127898f = 2;
            }
        }
    }
}
