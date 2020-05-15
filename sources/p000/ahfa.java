package p000;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;

/* renamed from: ahfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahfa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectRequest f67091a;

    /* renamed from: b */
    final /* synthetic */ ahfe f67092b;

    public ahfa(ahfe ahfe, ConnectRequest connectRequest) {
        this.f67092b = ahfe;
        this.f67091a = connectRequest;
    }

    public final void run() {
        ahcz ahcz;
        byte b;
        ahct b2 = this.f67092b.mo36391b();
        if (b2 != null) {
            ConnectRequest connectRequest = this.f67091a;
            Device device = connectRequest.f80402b;
            String str = connectRequest.f80403c;
            String str2 = connectRequest.f80404d;
            byte b3 = connectRequest.f80408h;
            byte b4 = connectRequest.f80412l;
            ahdj ahdj = connectRequest.f80405e;
            ahdm ahdm = connectRequest.f80406f;
            long j = connectRequest.f80409i;
            String str3 = connectRequest.f80410j;
            byte b5 = connectRequest.f80411k;
            ahdp ahdp = connectRequest.f80407g;
            if (b2.mo36320b()) {
                b2.mo36316a(ahdp, 2982);
                return;
            }
            if (b2.mo36321c()) {
                if (b2.f67012d.mo36326a(device)) {
                    b2.mo36316a(ahdp, -1);
                    return;
                }
                b2.f67012d.mo36337m();
            }
            String str4 = device.f80399d;
            if (str4 == null) {
                bnsl bnsl = (bnsl) ahct.f67009a.mo68388c();
                bnsl.mo68432a("ahct", "a", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("NearbyBootstrapController: Cannot connect to a remote device that does not exist");
                b2.mo36316a(ahdp, 2980);
                return;
            }
            if (b2.mo36318a()) {
                b2.f67011c.mo36286a();
            }
            buye buye = b2.f67015g;
            buqb buqb = b2.f67018j;
            String str5 = str3;
            ahcs ahcs = new ahcs(b2, j);
            if (b4 == 2) {
                b = 2;
                ahcz = new ahcf(buye, buqb, str, str2, b3, ahdj, ahdm, ahcs);
            } else {
                b = 2;
                ahcz = new ahck(buye, buqb, str, str2, b3, ahdj, ahdm, ahcs);
            }
            b2.f67012d = ahcz;
            b2.f67012d.mo36339a(device, str4);
            b2.f67013e = b5;
            if (b5 == 1) {
                b2.f67018j.mo72973a(8, b2.f67012d);
                ahcz ahcz2 = b2.f67012d;
                ahcz2.mo36341b(ahcz2.f67038s, null);
            } else if (b5 != b) {
                b2.mo36316a(ahdp, 13);
                return;
            } else if (str5 == null) {
                b2.f67018j.mo72973a(7, b2.f67012d);
                b2.f67012d.mo36340b(cfns.m140730b());
            } else if (!ahcj.m55468e(str5)) {
                b2.mo36316a(ahdp, 2989);
                return;
            } else {
                b2.f67018j.mo72973a(9, b2.f67012d);
                b2.f67012d.mo36340b(str5);
            }
            b2.mo36319b(ahdp);
        }
    }
}
