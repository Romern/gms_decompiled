package p000;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;

/* renamed from: ahey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahey implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EnableTargetRequest f67087a;

    /* renamed from: b */
    final /* synthetic */ ahfe f67088b;

    public ahey(ahfe ahfe, EnableTargetRequest enableTargetRequest) {
        this.f67088b = ahfe;
        this.f67087a = enableTargetRequest;
    }

    public final void run() {
        ahdb ahdb;
        ahct b = this.f67088b.mo36391b();
        if (b != null) {
            EnableTargetRequest enableTargetRequest = this.f67087a;
            String str = enableTargetRequest.f80422b;
            String str2 = enableTargetRequest.f80423c;
            byte b2 = enableTargetRequest.f80427g;
            byte b3 = enableTargetRequest.f80428h;
            ahdj ahdj = enableTargetRequest.f80424d;
            ahdm ahdm = enableTargetRequest.f80425e;
            ahdp ahdp = enableTargetRequest.f80426f;
            if (b.mo36321c()) {
                b.mo36316a(ahdp, 2982);
            } else if (b.mo36318a()) {
                b.mo36316a(ahdp, 2982);
            } else if (!b.mo36320b()) {
                int i = Build.VERSION.SDK_INT;
                buye buye = b.f67015g;
                buqb buqb = b.f67018j;
                BluetoothAdapter bluetoothAdapter = b.f67016h;
                ahcs ahcs = new ahcs(b, cfns.f184620a.mo6606a().mo81712b());
                if (b3 == 2) {
                    ahdb = new ahch(buye, buqb, str, str2, b2, ahdj, ahdm, ahcs);
                } else {
                    ahdb = new ahcn(buye, buqb, bluetoothAdapter, str, str2, b2, ahdj, ahdm, ahcs);
                }
                b.f67010b = ahdb;
                b.f67018j.mo72973a(2, b.f67010b);
                b.f67010b.mo36334j();
                b.mo36319b(ahdp);
            } else {
                b.mo36316a(ahdp, -1);
            }
        }
    }
}
