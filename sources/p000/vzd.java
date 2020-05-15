package p000;

import android.media.MediaDrm;
import android.util.Log;
import java.io.IOException;

/* renamed from: vzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vzd extends Thread {

    /* renamed from: a */
    final /* synthetic */ vze f50273a;

    /* renamed from: b */
    private final MediaDrm f50274b;

    public vzd(vze vze, MediaDrm mediaDrm) {
        this.f50273a = vze;
        this.f50274b = mediaDrm;
    }

    public final void run() {
        try {
            vze vze = this.f50273a;
            int i = vze.f50275d;
            vze.f50277a = false;
            vze.f50278b = true;
            try {
                MediaDrm.ProvisionRequest provisionRequest = this.f50274b.getProvisionRequest();
                String defaultUrl = provisionRequest.getDefaultUrl();
                String str = new String(provisionRequest.getData(), "UTF-8");
                StringBuilder sb = new StringBuilder(String.valueOf(defaultUrl).length() + 15 + str.length());
                sb.append(defaultUrl);
                sb.append("&signedRequest=");
                sb.append(str);
                this.f50273a.mo28994a(vwg.m41486a(sb.toString(), bxtx.f164797b).mo73780k(), this.f50274b);
                this.f50273a.f50277a = true;
            } catch (IOException e) {
                Log.e("DG.WV", "Could not communicate with the provisioning server.", e);
            }
            this.f50273a.f50278b = false;
        } catch (Exception e2) {
            vze vze2 = this.f50273a;
            int i2 = vze.f50275d;
            vze2.f50279c.mo28911a(e2);
        }
    }
}
