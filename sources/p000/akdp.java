package p000;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: akdp */
final /* synthetic */ class akdp implements Runnable {

    /* renamed from: a */
    private final akdq f71672a;

    /* renamed from: b */
    private final String f71673b;

    /* renamed from: c */
    private final PayloadTransferUpdate f71674c;

    public akdp(akdq akdq, String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.f71672a = akdq;
        this.f71673b = str;
        this.f71674c = payloadTransferUpdate;
    }

    public final void run() {
        akdq akdq = this.f71672a;
        akdq.f71675a.mo39292a(this.f71673b, this.f71674c);
    }
}
