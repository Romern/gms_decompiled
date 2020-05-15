package p000;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Message;
import android.util.Log;

/* renamed from: aybc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aybc extends snr {

    /* renamed from: a */
    final /* synthetic */ aybd f97008a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aybc(aybd aybd, sns sns) {
        super(sns);
        this.f97008a = aybd;
    }

    /* renamed from: a */
    private final void m83736a(axxi axxi) {
        if (axxi != null) {
            if (this.f97008a.f97010b.getLong("last_sync_dataitem_written", -1) < axxi.f96653h) {
                synchronized (this.f97008a.f97016h) {
                    aybd aybd = this.f97008a;
                    aybd.f97017i = axxi;
                    if (aybd.f97018j == null) {
                        NetworkRequest build = new NetworkRequest.Builder().addTransportType(1).build();
                        this.f97008a.f97018j = new ConnectivityManager.NetworkCallback();
                        aybd aybd2 = this.f97008a;
                        aybd2.f97014f.requestNetwork(build, aybd2.f97018j);
                    }
                    if (this.f97008a.f97011c.isWifiEnabled()) {
                        if (Log.isLoggable("Wear_WifiService", 3)) {
                            Log.d("Wear_WifiService", "Syncing credentials from handler.");
                        }
                        this.f97008a.mo53858c("SyncHandler");
                    }
                }
            } else if (Log.isLoggable("Wear_WifiService", 3)) {
                Log.d("Wear_WifiService", "Wifi sync skipped - data item has not changed since last sync.");
            }
        } else if (Log.isLoggable("Wear_WifiService", 3)) {
            Log.d("Wear_WifiService", "Wifi sync skipped - no data item present.");
        }
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            m83736a(axxj.m83476b(this.f97008a.f97013e, "*", "/sync_wifi_credentials"));
            this.f97008a.f97015g.set(true);
        } else if (i == 2) {
            m83736a((axxi) message.obj);
        } else if (i == 3) {
            this.f97008a.mo53858c("WifiOnReceiver");
        } else if (i == 4) {
            this.f97008a.mo53857b();
        }
    }
}
