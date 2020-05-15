package p000;

import java.util.List;
import org.webrtc.NetworkMonitor;
import org.webrtc.NetworkMonitorAutoDetect$NetworkInformation;

/* renamed from: ciua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciua {

    /* renamed from: a */
    final /* synthetic */ NetworkMonitor f191462a;

    public ciua(NetworkMonitor networkMonitor) {
        this.f191462a = networkMonitor;
    }

    /* renamed from: a */
    public final void mo86563a(long j) {
        NetworkMonitor networkMonitor = this.f191462a;
        List a = networkMonitor.mo86817a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            networkMonitor.nativeNotifyOfNetworkDisconnect(((Long) a.get(i)).longValue(), j);
        }
    }

    /* renamed from: a */
    public final void mo86564a(NetworkMonitorAutoDetect$NetworkInformation networkMonitorAutoDetect$NetworkInformation) {
        NetworkMonitor networkMonitor = this.f191462a;
        List a = networkMonitor.mo86817a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            networkMonitor.nativeNotifyOfNetworkConnect(((Long) a.get(i)).longValue(), networkMonitorAutoDetect$NetworkInformation);
        }
    }
}
