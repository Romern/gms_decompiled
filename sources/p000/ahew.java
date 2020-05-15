package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;

/* renamed from: ahew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahew implements Runnable {

    /* renamed from: a */
    final /* synthetic */ StartScanRequest f67083a;

    /* renamed from: b */
    final /* synthetic */ ahfe f67084b;

    public ahew(ahfe ahfe, StartScanRequest startScanRequest) {
        this.f67084b = ahfe;
        this.f67083a = startScanRequest;
    }

    public final void run() {
        ahcv ahcv;
        ahct b = this.f67084b.mo36391b();
        if (b != null) {
            StartScanRequest startScanRequest = this.f67083a;
            byte b2 = startScanRequest.f80436d;
            ahdv ahdv = startScanRequest.f80434b;
            ahdp ahdp = startScanRequest.f80435c;
            if (b.mo36318a()) {
                b.mo36316a(ahdp, -1);
            } else if (!b.mo36320b()) {
                int i = Build.VERSION.SDK_INT;
                Context context = b.f67014f;
                buye buye = b.f67015g;
                buqb buqb = b.f67018j;
                if (b2 != 2) {
                    ahcv = new ahci(context, buqb);
                } else {
                    ahcv = new ahcd(buye, buqb);
                }
                b.f67011c = ahcv;
                b.f67018j.mo72972a(4, b.f67011c);
                b.f67011c.mo36287a(ahdv);
                b.mo36319b(ahdp);
            } else {
                b.mo36316a(ahdp, 2982);
            }
        }
    }
}
