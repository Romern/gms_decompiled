package p000;

import android.os.Bundle;

/* renamed from: vtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vtd extends vsh {

    /* renamed from: a */
    final /* synthetic */ vtf f49939a;

    public vtd(vtf vtf) {
        this.f49939a = vtf;
    }

    /* renamed from: a */
    public final void mo28762a() {
        boolean z;
        this.f49939a.f49930g.mo28759a(bpeb.DRIVING_MODE_FRX_DOWNLOAD, bpea.DRIVING_MODE_FRX_READY);
        this.f49939a.f49947a.mo28782b("com.google.android.projection.gearhead");
        vth vth = new vth();
        Bundle arguments = vth.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            z = true;
        } else {
            z = false;
        }
        arguments.putBoolean("DrivingModeFrxGearheadSetupFragment.force_launch", true);
        if (z) {
            vth.setArguments(arguments);
        }
        this.f49939a.mo28822m().mo28866c(vth);
    }
}
