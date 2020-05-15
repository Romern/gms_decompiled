package p000;

import android.content.Intent;

/* renamed from: vtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vtb extends vsh {

    /* renamed from: a */
    final /* synthetic */ vtc f49935a;

    public vtb(vtc vtc) {
        this.f49935a = vtc;
    }

    /* renamed from: a */
    public final void mo28762a() {
        if (this.f49935a.f49937b.mo28756a()) {
            this.f49935a.mo28828a();
            vtc vtc = this.f49935a;
            Intent makeMainActivity = Intent.makeMainActivity(vqx.m41082c());
            makeMainActivity.putExtra("FRX_START_FRAGMENT", "DND_ACCESS");
            makeMainActivity.addFlags(67108864);
            vtc.startActivity(makeMainActivity);
        }
    }
}
