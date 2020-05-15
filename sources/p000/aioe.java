package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.nearby.mediums.WifiHotspot$WifiDirectHotspotOperation$1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aioe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aioe extends airo {

    /* renamed from: a */
    public final WifiP2pManager f69313a;

    /* renamed from: b */
    public aint f69314b;

    /* renamed from: c */
    private final Context f69315c;

    /* renamed from: d */
    private final WifiManager f69316d;

    /* renamed from: e */
    private final WifiP2pManager.ChannelListener f69317e;

    /* renamed from: f */
    private WifiP2pManager.Channel f69318f;

    /* renamed from: i */
    private final boolean f69319i;

    public aioe(Context context, WifiP2pManager wifiP2pManager, WifiP2pManager.ChannelListener channelListener, WifiManager wifiManager, boolean z) {
        super(61);
        this.f69315c = context;
        this.f69313a = wifiP2pManager;
        this.f69317e = channelListener;
        this.f69316d = wifiManager;
        this.f69319i = z;
    }

    /* renamed from: d */
    private static final WifiP2pConfig m57532d(int i) {
        String format = String.format("DIRECT-%s-%s", ails.m57437a(2), ails.m57437a(6));
        return new WifiP2pConfig.Builder().setNetworkName(format).setPassphrase(ails.m57437a(8)).setGroupOperatingBand(i).build();
    }

    /* renamed from: a */
    public final void mo37566a() {
        if (this.f69318f != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            WifiP2pManager.Channel channel = this.f69318f;
            this.f69313a.requestGroupInfo(channel, new aioa(this, countDownLatch, channel));
            try {
                if (!countDownLatch.await(cfnv.m140773ai(), TimeUnit.SECONDS)) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                    bnsl.mo68432a("aioe", "a", 1492, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Timed out while waiting on latch to signal successful stopping of Wifi direct hotspot.");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("aioe", "a", 1498, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Interrupted while disabling Wifi Direct hotspot.");
            }
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            this.f69318f.close();
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aioe", "c", 1536, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Closed Wifi Direct channel.");
            this.f69318f = null;
            return;
        }
        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
        bnsl4.mo68432a("aioe", "a", 1446, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("Failed to stop Wifi Direct hotspot because there is no Wifi Direct Channel.");
    }

    /* renamed from: c */
    private final void m57531c() {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        this.f69318f.close();
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aioe", "c", 1536, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Closed Wifi Direct channel.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (((java.lang.Boolean) p000.ahft.m55666a(r0).mo36404a("isDualBandSupported", new java.lang.Class[0]).mo36403a(new java.lang.Object[0])).booleanValue() != false) goto L_0x0090;
     */
    /* renamed from: b */
    public final int mo37568b() {
        WifiHotspot$WifiDirectHotspotOperation$1 wifiHotspot$WifiDirectHotspotOperation$1;
        Context context;
        if (cfnv.f184625a.mo6606a().mo81731Q()) {
            int i = Build.VERSION.SDK_INT;
            WifiManager wifiManager = this.f69316d;
            if (cfnv.f184625a.mo6606a().mo81770ac()) {
            }
            int frequency = this.f69316d.getConnectionInfo().getFrequency();
            if ((frequency >= 2400 && frequency <= 2495 && this.f69319i) || (frequency >= 5000 && frequency <= 5855 && !this.f69319i)) {
                if (!this.f69316d.disconnect()) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                    bnsl.mo68432a("aioe", "b", 1307, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to disconnect from current WiFi before hosting a WiFi Direct Hotspot.");
                    return 3;
                }
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aioe", "b", 1311, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Disconnected from current WiFi before hosting a WiFi Direct Hotspot.");
            }
        }
        WifiP2pManager.Channel initialize = this.f69313a.initialize(this.f69315c, Looper.getMainLooper(), this.f69317e);
        this.f69318f = initialize;
        if (initialize == null) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68432a("aioe", "b", 1317, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Wifi Direct failed to initialize a channel.");
            return 3;
        }
        bqgy c = bqgy.m112818c();
        wifiHotspot$WifiDirectHotspotOperation$1 = new WifiHotspot$WifiDirectHotspotOperation$1("nearby", c);
        this.f69315c.registerReceiver(wifiHotspot$WifiDirectHotspotOperation$1, new IntentFilter("android.net.wifi.p2p.CONNECTION_STATE_CHANGE"));
        aiob aiob = new aiob(c);
        if (!this.f69319i) {
            WifiP2pManager.Channel channel = this.f69318f;
            int i2 = Build.VERSION.SDK_INT;
            this.f69313a.createGroup(channel, m57532d(1), aiob);
        } else {
            WifiP2pManager.Channel channel2 = this.f69318f;
            int i3 = Build.VERSION.SDK_INT;
            this.f69313a.createGroup(channel2, m57532d(2), aiob);
        }
        try {
            this.f69314b = (aint) c.get(cfnv.f184625a.mo6606a().mo81799bE(), TimeUnit.SECONDS);
            ahhd.m55766a(this.f69315c, wifiHotspot$WifiDirectHotspotOperation$1);
            return 2;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
            bnsl4.mo68432a("aioe", "b", 1400, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Interrupted while waiting to enable Wifi Direct hotspot");
            context = this.f69315c;
        } catch (ExecutionException e2) {
            bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
            bnsl5.mo68437a(e2);
            bnsl5.mo68432a("aioe", "b", 1402, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Failed to start Wifi Direct hotspot");
            context = this.f69315c;
        } catch (TimeoutException e3) {
            bnsl bnsl6 = (bnsl) ailf.f69111a.mo68387b();
            bnsl6.mo68437a(e3);
            bnsl6.mo68432a("aioe", "b", 1404, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Timed out waiting for Wifi Direct hotspot to start");
            context = this.f69315c;
        } catch (Throwable th) {
            ahhd.m55766a(this.f69315c, wifiHotspot$WifiDirectHotspotOperation$1);
            throw th;
        }
        ahhd.m55766a(context, wifiHotspot$WifiDirectHotspotOperation$1);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f69313a.cancelConnect(this.f69318f, new aioc(countDownLatch));
        try {
            if (!countDownLatch.await(cfnv.m140773ai(), TimeUnit.SECONDS)) {
                bnsl bnsl7 = (bnsl) ailf.f69111a.mo68388c();
                bnsl7.mo68432a("aioe", "b", 1430, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl7.mo68405a("Timed out while waiting on latch to signal Wifi direct hotspot cancellation because of failure to start.");
            }
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            bnsl bnsl8 = (bnsl) ailf.f69111a.mo68387b();
            bnsl8.mo68432a("aioe", "b", 1436, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl8.mo68405a("Interrupted while waiting to cancel Wifi Direct hotspot");
        }
        return 3;
        return 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo37740a(CountDownLatch countDownLatch, WifiP2pManager.Channel channel, WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup != null && wifiP2pGroup.isGroupOwner()) {
            this.f69313a.removeGroup(channel, new aiod(countDownLatch));
            return;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aioe", "a", 1463, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to stop Wifi Direct hotspot because no group was found.");
        countDownLatch.countDown();
    }
}
