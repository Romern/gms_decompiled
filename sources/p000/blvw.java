package p000;

import java.io.IOException;

/* renamed from: blvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blvw implements bluo {

    /* renamed from: a */
    final /* synthetic */ blvx f127900a;

    public blvw(blvx blvx) {
        this.f127900a = blvx;
    }

    /* renamed from: a */
    public final void mo13812a(bluu bluu) {
        synchronized (this.f127900a) {
            if (!bluu.mo66725b()) {
                this.f127900a.mo66702a(new IOException("transmit of connection confirm failed"));
                return;
            }
            blvx blvx = this.f127900a;
            if (blvx.f127901f != 1) {
                blvx.f127819b.mo13815a(new blut("unexpected transmit of connection confirm"));
            }
            blvx blvx2 = this.f127900a;
            blvx2.f127901f = 2;
            blvx2.mo66699a(blvx2.f127902g);
        }
    }
}
