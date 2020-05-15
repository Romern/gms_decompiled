package p000;

import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pConfig;
import com.google.android.gms.nearby.mediums.WifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1;
import java.net.InetAddress;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aimv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aimv implements Runnable {

    /* renamed from: a */
    public InetAddress f69209a;

    /* renamed from: b */
    final /* synthetic */ WifiP2pConfig f69210b;

    /* renamed from: c */
    final /* synthetic */ String f69211c;

    /* renamed from: d */
    final /* synthetic */ aimx f69212d;

    public aimv(aimx aimx, WifiP2pConfig wifiP2pConfig, String str) {
        this.f69212d = aimx;
        this.f69210b = wifiP2pConfig;
        this.f69211c = str;
    }

    public final void run() {
        bqgy c = bqgy.m112818c();
        WifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1 wifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1 = new WifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1("nearby", c);
        this.f69212d.f69216a.registerReceiver(wifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1, new IntentFilter("android.net.wifi.p2p.CONNECTION_STATE_CHANGE"));
        aimx aimx = this.f69212d;
        aimx.f69217b.connect(aimx.f69219d, this.f69210b, new aimu(this, c));
        try {
            this.f69209a = (InetAddress) c.get(cfnv.m140768ad(), TimeUnit.SECONDS);
            srn srn = ailf.f69111a;
            ahhd.m55766a(this.f69212d.f69216a, wifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(String.format("Interrupted while connecting to %s", this.f69211c), e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(String.format("Failed to connect to %s", this.f69211c), e2);
        } catch (TimeoutException e3) {
            throw new RuntimeException(String.format("Timed out waiting to connect to %s", this.f69211c), e3);
        } catch (Throwable th) {
            ahhd.m55766a(this.f69212d.f69216a, wifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1);
            throw th;
        }
    }
}
