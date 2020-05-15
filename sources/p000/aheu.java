package p000;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;

/* renamed from: aheu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aheu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SendDataRequest f67080a;

    /* renamed from: b */
    final /* synthetic */ ahfe f67081b;

    public aheu(ahfe ahfe, SendDataRequest sendDataRequest) {
        this.f67081b = ahfe;
        this.f67080a = sendDataRequest;
    }

    public final void run() {
        ahct b = this.f67081b.mo36391b();
        if (b != null) {
            SendDataRequest sendDataRequest = this.f67080a;
            Device device = sendDataRequest.f80430b;
            byte[] bArr = sendDataRequest.f80431c;
            ahdp ahdp = sendDataRequest.f80432d;
            ahcy d = b.mo36322d();
            if (d == null || !d.mo36326a(device)) {
                b.mo36316a(ahdp, 2981);
                return;
            }
            ahcy d2 = b.mo36322d();
            if (d2 == null) {
                b.mo36316a(ahdp, 2982);
            }
            int length = bArr.length;
            buzo buzo = d2.f67023e;
            boolean z = true;
            int i = 0;
            if (buzo == null) {
                bnsl bnsl = (bnsl) ahcy.f67020b.mo68388c();
                bnsl.mo68432a("ahcy", "b", 252, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("SocketDevice: device is not connected before send");
                z = false;
            } else {
                bxvd da = bval.f155487d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bval bval = (bval) da.f164949b;
                buzo.getClass();
                bval.f155490b = buzo;
                bval.f155489a |= 1;
                bxvd da2 = buzq.f155418c.mo74144da();
                bxtx a = bxtx.m123261a(bArr);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                buzq buzq = (buzq) da2.f164949b;
                a.getClass();
                buzq.f155420a |= 1;
                buzq.f155421b = a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bval bval2 = (bval) da.f164949b;
                buzq buzq2 = (buzq) da2.mo74062i();
                buzq2.getClass();
                bval2.f155491c = buzq2;
                bval2.f155489a |= 2;
                d2.f67021c.mo73256a((bval) da.mo74062i(), new ahcw());
            }
            if (!z) {
                i = 13;
            }
            b.mo36316a(ahdp, i);
        }
    }
}
