package p000;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast_mirroring.CastSystemMirroringChimeraService;

/* renamed from: qbi */
final /* synthetic */ class qbi implements Runnable {

    /* renamed from: a */
    private final qbn f40866a;

    public qbi(qbn qbn) {
        this.f40866a = qbn;
    }

    public final void run() {
        qbn qbn = this.f40866a;
        if (qbn.f40880g != null) {
            CastDevice a = qbn.mo23873a();
            if (a != null) {
                qbn.f40880g.mo17611a(a.f29716d, qbn.f40881h, qbn.f40883j);
            } else if (!qbn.f40882i) {
                qbn.f40880g.mo17610a();
                CastSystemMirroringChimeraService.m22334a(qbn.f40877b);
            }
        }
    }
}
