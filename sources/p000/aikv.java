package p000;

import java.io.IOException;

/* renamed from: aikv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aikv extends soa {

    /* renamed from: a */
    final /* synthetic */ aiqb f69067a;

    /* renamed from: b */
    final /* synthetic */ aikw f69068b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aikv(aikw aikw, aiqb aiqb) {
        super(9);
        this.f69068b = aikw;
        this.f69067a = aiqb;
    }

    public final void run() {
        while (true) {
            try {
                aiqm aiqm = this.f69068b.f69069a;
                aiqb aiqb = this.f69067a;
                if (!aiqb.f69476d.get()) {
                    aiqc aiqc = (aiqc) aiqb.f69475c.take();
                    if (aiqc != aiqb.f69473a) {
                        aiqm.mo37589a(aiqc);
                    } else {
                        throw new aiqa();
                    }
                } else {
                    throw new aiqa();
                }
            } catch (InterruptedException e) {
                throw new IOException("BleServerSocket interrupted while waiting for incoming BLE sockets", e);
            } catch (IOException e2) {
                aiqb aiqb2 = this.f69067a;
                if (aiqb2 != null) {
                    try {
                        aiqb2.close();
                        srn srn = ailf.f69111a;
                        return;
                    } catch (IOException e3) {
                        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                        bnsl.mo68437a(e3);
                        bnsl.mo68432a("ails", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68424a("Failed to close %sSocket %s", "BLE", "Server Socket");
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
