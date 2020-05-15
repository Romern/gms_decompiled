package p000;

import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: arqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arqw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BootstrapConfigurations f88142a;

    /* renamed from: b */
    final /* synthetic */ arqx f88143b;

    public arqw(arqx arqx, BootstrapConfigurations bootstrapConfigurations) {
        this.f88143b = arqx;
        this.f88142a = bootstrapConfigurations;
    }

    public final void run() {
        arqx arqx = this.f88143b;
        ardc ardc = arqx.f88145b;
        ardo ardo = new ardo(arqx.f88144a);
        BootstrapConfigurations bootstrapConfigurations = this.f88142a;
        arqx arqx2 = this.f88143b;
        ardc.mo48426a(ardo, bootstrapConfigurations, arqx2.f88146c, arqx2.f88147d);
    }
}
