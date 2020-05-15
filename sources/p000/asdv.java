package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;

/* renamed from: asdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asdv extends aaab {

    /* renamed from: a */
    private static final Logger f88741a = ascp.m73787a("Wifi", "ConnectToWifiNetworkOperation");

    /* renamed from: b */
    private final asdq f88742b;

    /* renamed from: c */
    private final ConnectToWifiNetworkRequest f88743c;

    public asdv(asdq asdq, ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
        super(MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, "ConnectToWifiNetworkOperation");
        this.f88742b = asdq;
        this.f88743c = connectToWifiNetworkRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        mo49074a(new ascz(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49074a(ascz ascz) {
        String str = this.f88743c.f108266a;
        Logger Logger = f88741a;
        String valueOf = String.valueOf(str);
        Logger.logVerbose(valueOf.length() == 0 ? new String("SSID: ") : "SSID: ".concat(valueOf), new Object[0]);
        f88741a.logVerbose("Creating WifiConfiguration", new Object[0]);
        try {
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = this.f88743c;
            if (ascz.mo49053a(asdd.m73821a(connectToWifiNetworkRequest.f108267b, connectToWifiNetworkRequest.f108266a, connectToWifiNetworkRequest.f108268c, connectToWifiNetworkRequest.f108269d)) == -1) {
                f88741a.mo25418e("Could not setup wifi, likely due to authentication error", new Object[0]);
                this.f88742b.mo49072a(Status.f30109c, new ConnectToWifiNetworkResponse());
                return;
            }
            this.f88742b.mo49072a(Status.f30107a, new ConnectToWifiNetworkResponse());
        } catch (UnsupportedOperationException e) {
            f88741a.mo25417e("Exception setting up WiFi", e, new Object[0]);
            this.f88742b.mo49072a(new Status(10601), new ConnectToWifiNetworkResponse());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88742b.mo49072a(status, new ConnectToWifiNetworkResponse());
    }
}
