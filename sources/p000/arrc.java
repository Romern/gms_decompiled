package p000;

import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions;

/* renamed from: arrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arrc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arrd f88166a;

    public arrc(arrd arrd) {
        this.f88166a = arrd;
    }

    public final void run() {
        arrd arrd = this.f88166a;
        argg argg = arrd.f88170d;
        argq argq = new argq(arrd.f88171e);
        DirectTransferOptions directTransferOptions = this.f88166a.f88167a;
        aqyt aqyt = new aqyt();
        aqyt.f87126a = directTransferOptions.f108053a;
        aqyt.f87128c = cgpm.f187459a.mo6606a().mo84239d();
        if (aqyt.f87126a >= 0) {
            BootstrapOptions bootstrapOptions = new BootstrapOptions();
            bootstrapOptions.mo59049b(aqyt.f87126a);
            bootstrapOptions.mo59044a(0);
            bootstrapOptions.mo59061e(aqyt.f87127b);
            bootstrapOptions.mo59047a(false);
            bootstrapOptions.mo59054c(aqyt.f87128c);
            bootstrapOptions.mo59052c(0);
            bootstrapOptions.mo59057d(rfi.f42869b);
            bootstrapOptions.mo59045a(-1L);
            bootstrapOptions.mo59064f();
            arrd arrd2 = this.f88166a;
            argg.mo48512a(argq, bootstrapOptions, arrd2.f88168b, arrd2.f88169c);
            return;
        }
        throw new IllegalArgumentException("Must set flow type before building the DirectBuilder.");
    }
}
