package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;

/* renamed from: aken */
final /* synthetic */ class aken implements aubw {

    /* renamed from: a */
    private final akgy f71746a;

    /* renamed from: b */
    private final String f71747b;

    public aken(akgy akgy, String str) {
        this.f71746a = akgy;
        this.f71747b = str;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ConnectToWifiNetworkResponse connectToWifiNetworkResponse = (ConnectToWifiNetworkResponse) obj;
        this.f71746a.mo39376a(0, (int) C0126R.string.sharing_toast_wifi_connection_succeeded, this.f71747b);
    }
}
