package p000;

import android.net.Network;

/* renamed from: veo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class veo implements vew {

    /* renamed from: a */
    final /* synthetic */ vep f49126a;

    public veo(vep vep) {
        this.f49126a = vep;
    }

    /* renamed from: a */
    public final void mo28356a(String str) {
        if (!this.f49126a.f49128b.mo28377e()) {
            vep vep = this.f49126a;
            veq veq = vep.f49128b;
            Network network = vep.f49127a;
            int i = veq.f49131h;
            if (veq.f49132a.mo28363a(network, veq.f49135d) && veq.mo28361b(veq.f49135d)) {
                return;
            }
        }
        throw new vex(str);
    }
}
