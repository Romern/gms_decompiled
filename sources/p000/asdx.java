package p000;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;
import java.util.concurrent.ExecutionException;

/* renamed from: asdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asdx extends aaab {

    /* renamed from: a */
    public static final sek f88745a = ascp.m73787a("Wifi", "GetWifiCredentialsOperation");

    /* renamed from: b */
    private final asdq f88746b;

    /* renamed from: c */
    private final GetWifiCredentialsRequest f88747c;

    public asdx(asdq asdq, GetWifiCredentialsRequest getWifiCredentialsRequest) {
        super(MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, "GetWifiCredentialsOperation");
        this.f88746b = asdq;
        this.f88747c = getWifiCredentialsRequest;
    }

    /* renamed from: a */
    public static final GetWifiCredentialsResponse m73850a() {
        return new GetWifiCredentialsResponse(0, null);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        Object obj;
        WifiConfiguration a = new ascz(context).mo49054a(this.f88747c.f108270a);
        if (a == null) {
            this.f88746b.mo49073a(new Status(10602), m73850a());
        } else if (a.allowedKeyManagement.get(0) && ((a.allowedAuthAlgorithms.get(0) && a.allowedAuthAlgorithms.cardinality() == 1) || a.allowedAuthAlgorithms.isEmpty())) {
            this.f88746b.mo49073a(Status.f30107a, new GetWifiCredentialsResponse(1, null));
        } else if (!a.allowedKeyManagement.get(1)) {
            this.f88746b.mo49073a(new Status(10601), m73850a());
        } else if (!asdd.m73823a(a)) {
            this.f88746b.mo49073a(Status.f30107a, new GetWifiCredentialsResponse(1, ascr.m73791b(a.preSharedKey)));
        } else if (asce.m73770a(context)) {
            this.f88746b.mo49073a(new Status(10600), m73850a());
        } else {
            bqgy c = bqgy.m112818c();
            bmxy.m108581a(c);
            new asbn(context).mo49032a(this.f88747c.f108270a, new asdw(c));
            try {
                C1240of ofVar = (C1240of) c.get();
                Object obj2 = ofVar.f26798a;
                if (obj2 == null || (obj = ofVar.f26799b) == null) {
                    this.f88746b.mo49073a(Status.f30109c, m73850a());
                } else {
                    this.f88746b.mo49073a((Status) obj2, (GetWifiCredentialsResponse) obj);
                }
            } catch (InterruptedException | ExecutionException e) {
                f88745a.mo25417e("Error while fetching PSK from backup.", e, new Object[0]);
                this.f88746b.mo49073a(Status.f30109c, m73850a());
            }
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88746b.mo49073a(status, m73850a());
    }
}
