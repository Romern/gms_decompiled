package p000;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/* renamed from: bfzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzj implements stv {

    /* renamed from: a */
    final /* synthetic */ bfzt f115772a;

    /* renamed from: b */
    private String f115773b;

    public bfzj(bfzt bfzt) {
        this.f115772a = bfzt;
        WifiInfo connectionInfo = ((WifiManager) bfzt.f115807l.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo != null) {
            this.f115773b = connectionInfo.getBSSID();
        }
    }

    /* renamed from: a */
    public final void mo26077a(boolean z, String str) {
        if (z) {
            this.f115773b = str;
        }
        if (!cexh.m138383b()) {
            bfxa.f115569a.mo62416a(new bfxd(1713186543, z, this.f115773b));
        } else {
            bfxa.f115569a.mo62415a(-1953066164, z, this.f115773b);
        }
        this.f115772a.mo62513a(z);
    }
}
