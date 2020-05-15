package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.DeviceOrientation;

/* renamed from: bfuf */
final /* synthetic */ class bfuf {

    /* renamed from: a */
    private final bfuh f115323a;

    public bfuf(bfuh bfuh) {
        this.f115323a = bfuh;
    }

    /* renamed from: a */
    public final void mo62278a(DeviceOrientation deviceOrientation) {
        bfuh bfuh = this.f115323a;
        for (bfub bfub : bfuh.f115327c.mo25992c()) {
            try {
                bfub.f115310d.mo34156a(deviceOrientation);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Client died while calling listener. ");
                sb.append(valueOf);
                Log.e("GCoreFlp", sb.toString());
                bfub.mo62273a();
            }
        }
        bfox bfox = bfuh.f115331g;
        if (bfox.mo62073a()) {
            float g = deviceOrientation.mo43528g();
            float e2 = deviceOrientation.mo43525e();
            if (e2 <= 360.0f && e2 >= 0.0f && g <= 180.0f && g >= 0.0f) {
                bxvd bxvd = bfox.f114737e;
                long j = ((bplb) bxvd.f164949b).f138060f + 1;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bplb bplb = (bplb) bxvd.f164949b;
                bplb bplb2 = bplb.f138053h;
                bplb.f138055a |= 4;
                bplb.f138060f = j;
                int ceil = (int) Math.ceil((double) (e2 / 45.0f));
                bxvd bxvd2 = bfox.f114737e;
                int b = ((bplb) bxvd2.f164949b).f138057c.mo74151b(ceil) + 1;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bplb bplb3 = (bplb) bxvd2.f164949b;
                bplb3.mo68964b();
                bplb3.f138057c.mo74149a(ceil, b);
                int ceil2 = (int) Math.ceil((double) (g / 45.0f));
                bxvd bxvd3 = bfox.f114737e;
                int b2 = ((bplb) bxvd3.f164949b).f138056b.mo74151b(ceil2) + 1;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bplb bplb4 = (bplb) bxvd3.f164949b;
                bplb4.mo68963a();
                bplb4.f138056b.mo74149a(ceil2, b2);
                if (bfox.f114734b != deviceOrientation.mo43518a()) {
                    bxvd bxvd4 = bfox.f114737e;
                    int i = ((bplb) bxvd4.f164949b).f138059e + 1;
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    bplb bplb5 = (bplb) bxvd4.f164949b;
                    bplb5.f138055a |= 2;
                    bplb5.f138059e = i;
                    bfox.f114734b = deviceOrientation.mo43518a();
                }
                if (bfox.f114733a != deviceOrientation.mo43523c()) {
                    bxvd bxvd5 = bfox.f114737e;
                    int i2 = ((bplb) bxvd5.f164949b).f138058d + 1;
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    bplb bplb6 = (bplb) bxvd5.f164949b;
                    bplb6.f138055a |= 1;
                    bplb6.f138058d = i2;
                    bfox.f114733a = deviceOrientation.mo43523c();
                }
            }
        }
    }
}
