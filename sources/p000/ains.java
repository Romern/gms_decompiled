package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ains */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ains extends airo {

    /* renamed from: a */
    public final WifiManager f69278a;

    /* renamed from: b */
    public final ConnectivityManager f69279b;

    /* renamed from: c */
    public aiwd f69280c;

    /* renamed from: d */
    private final AtomicBoolean f69281d;

    /* renamed from: e */
    private final String f69282e;

    /* renamed from: f */
    private final String f69283f;

    /* renamed from: i */
    private final int f69284i;

    /* renamed from: j */
    private final String f69285j;

    public ains(WifiManager wifiManager, ConnectivityManager connectivityManager, AtomicBoolean atomicBoolean, String str, String str2, int i, String str3) {
        super(64);
        this.f69278a = wifiManager;
        this.f69279b = connectivityManager;
        this.f69281d = atomicBoolean;
        this.f69282e = str;
        this.f69283f = str2;
        this.f69284i = i;
        this.f69285j = str3;
    }

    /* renamed from: a */
    private final void m57513a(ConnectivityManager.NetworkCallback networkCallback) {
        this.f69279b.unregisterNetworkCallback(networkCallback);
    }

    /* renamed from: c */
    private final int m57517c(WifiConfiguration wifiConfiguration) {
        if (!cfnv.f184625a.mo6606a().mo81753aL()) {
            return this.f69278a.addNetwork(wifiConfiguration);
        }
        List<WifiConfiguration> configuredNetworks = this.f69278a.getConfiguredNetworks();
        WifiConfiguration wifiConfiguration2 = null;
        if (configuredNetworks != null) {
            Iterator<WifiConfiguration> it = configuredNetworks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WifiConfiguration next = it.next();
                if (next.SSID.equals(wifiConfiguration.SSID)) {
                    wifiConfiguration2 = next;
                    break;
                }
            }
        }
        if (wifiConfiguration2 == null || wifiConfiguration2.networkId == -1) {
            return this.f69278a.addNetwork(wifiConfiguration);
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("ains", "c", 2206, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Found Wi-Fi network %s has already been saved. Updating the credentials.", wifiConfiguration.SSID);
        aiof.m57539a(wifiConfiguration, wifiConfiguration2);
        int updateNetwork = this.f69278a.updateNetwork(wifiConfiguration2);
        if (updateNetwork == -1) {
            return wifiConfiguration2.networkId;
        }
        return updateNetwork;
    }

    /* renamed from: a */
    private final boolean m57514a(WifiConfiguration wifiConfiguration) {
        int i;
        boolean z;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        int i2 = Build.VERSION.SDK_INT;
        ainr ainr = new ainr(this, wifiConfiguration.SSID, countDownLatch);
        this.f69279b.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), ainr);
        try {
            if (cfnv.f184625a.mo6606a().mo81753aL()) {
                List<WifiConfiguration> configuredNetworks = this.f69278a.getConfiguredNetworks();
                WifiConfiguration wifiConfiguration2 = null;
                if (configuredNetworks != null) {
                    Iterator<WifiConfiguration> it = configuredNetworks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        WifiConfiguration next = it.next();
                        if (next.SSID.equals(wifiConfiguration.SSID)) {
                            wifiConfiguration2 = next;
                            break;
                        }
                    }
                }
                if (wifiConfiguration2 != null) {
                    if (wifiConfiguration2.networkId != -1) {
                        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                        bnsl.mo68432a("ains", "c", 2206, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Found Wi-Fi network %s has already been saved. Updating the credentials.", wifiConfiguration.SSID);
                        aiof.m57539a(wifiConfiguration, wifiConfiguration2);
                        i = this.f69278a.updateNetwork(wifiConfiguration2);
                        if (i == -1) {
                            i = wifiConfiguration2.networkId;
                        }
                    }
                }
                i = this.f69278a.addNetwork(wifiConfiguration);
            } else {
                i = this.f69278a.addNetwork(wifiConfiguration);
            }
            z = false;
            if (i == -1) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("ains", "b", 2106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Failed to add network %s.", wifiConfiguration.SSID);
            } else {
                int i3 = Build.VERSION.SDK_INT;
                int i4 = Build.VERSION.SDK_INT;
                if (!this.f69278a.enableNetwork(i, true)) {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl3.mo68432a("ains", "b", 2115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Failed to enable network %s.", wifiConfiguration.SSID);
                } else if (!this.f69278a.reconnect()) {
                    bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl4.mo68432a("ains", "b", 2120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68420a("Failed to reconnect to network %s.", wifiConfiguration.SSID);
                } else {
                    z = countDownLatch.await(cfnv.m140770af(), TimeUnit.SECONDS);
                    if (!z) {
                        m57515a(wifiConfiguration.SSID);
                        bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl5.mo68432a("ains", "a", 2046, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68423a("Couldn't connect to Wifi AP %s after %d seconds", wifiConfiguration.SSID, cfnv.m140770af());
                    } else {
                        srn srn = ailf.f69111a;
                        String str = wifiConfiguration.SSID;
                    }
                    int i5 = Build.VERSION.SDK_INT;
                    m57513a(ainr);
                    return z;
                }
            }
            bnsl bnsl6 = (bnsl) ailf.f69111a.mo68387b();
            bnsl6.mo68432a("ains", "a", 2020, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68420a("Failed to initiate connection to discovered Wifi AP %s.", wifiConfiguration.SSID);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl7 = (bnsl) ailf.f69111a.mo68387b();
            bnsl7.mo68432a("ains", "a", 2034, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68420a("Interrupted while waiting to connect to Wifi AP %s", wifiConfiguration.SSID);
        } catch (Throwable th) {
            int i6 = Build.VERSION.SDK_INT;
            m57513a(ainr);
            throw th;
        }
        int i52 = Build.VERSION.SDK_INT;
        m57513a(ainr);
        return z;
    }

    /* renamed from: b */
    private final boolean m57516b(WifiConfiguration wifiConfiguration) {
        int i;
        if (!cfnv.f184625a.mo6606a().mo81753aL()) {
            i = this.f69278a.addNetwork(wifiConfiguration);
        } else {
            List<WifiConfiguration> configuredNetworks = this.f69278a.getConfiguredNetworks();
            WifiConfiguration wifiConfiguration2 = null;
            if (configuredNetworks != null) {
                Iterator<WifiConfiguration> it = configuredNetworks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WifiConfiguration next = it.next();
                    if (next.SSID.equals(wifiConfiguration.SSID)) {
                        wifiConfiguration2 = next;
                        break;
                    }
                }
            }
            if (wifiConfiguration2 == null || wifiConfiguration2.networkId == -1) {
                i = this.f69278a.addNetwork(wifiConfiguration);
            } else {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("ains", "c", 2206, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Found Wi-Fi network %s has already been saved. Updating the credentials.", wifiConfiguration.SSID);
                aiof.m57539a(wifiConfiguration, wifiConfiguration2);
                i = this.f69278a.updateNetwork(wifiConfiguration2);
                if (i == -1) {
                    i = wifiConfiguration2.networkId;
                }
            }
        }
        if (i != -1) {
            int i2 = Build.VERSION.SDK_INT;
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f69278a.enableNetwork(i, true)) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("ains", "b", 2115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Failed to enable network %s.", wifiConfiguration.SSID);
                return false;
            } else if (this.f69278a.reconnect()) {
                return true;
            } else {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68432a("ains", "b", 2120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Failed to reconnect to network %s.", wifiConfiguration.SSID);
                return false;
            }
        } else {
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
            bnsl4.mo68432a("ains", "b", 2106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("Failed to add network %s.", wifiConfiguration.SSID);
            return false;
        }
    }

    /* renamed from: c */
    public final Network[] mo37729c() {
        return this.f69279b.getAllNetworks();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: b */
    public final int mo37568b() {
        int i;
        boolean z;
        String str = this.f69282e;
        String str2 = this.f69283f;
        WifiConfiguration a = aiof.m57536a(aiof.m57537a(str), aiof.m57537a(str2), true);
        if (!aiwc.m58053a(a, this.f69285j)) {
            a = aiof.m57536a(aiof.m57537a(str), aiof.m57537a(str2), true);
        }
        int i2 = Build.VERSION.SDK_INT;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        int i3 = Build.VERSION.SDK_INT;
        ainr ainr = new ainr(this, a.SSID, countDownLatch);
        this.f69279b.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), ainr);
        try {
            if (cfnv.f184625a.mo6606a().mo81753aL()) {
                List<WifiConfiguration> configuredNetworks = this.f69278a.getConfiguredNetworks();
                WifiConfiguration wifiConfiguration = null;
                if (configuredNetworks != null) {
                    Iterator<WifiConfiguration> it = configuredNetworks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        WifiConfiguration next = it.next();
                        if (next.SSID.equals(a.SSID)) {
                            wifiConfiguration = next;
                            break;
                        }
                    }
                }
                if (wifiConfiguration != null) {
                    if (wifiConfiguration.networkId != -1) {
                        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                        bnsl.mo68432a("ains", "c", 2206, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Found Wi-Fi network %s has already been saved. Updating the credentials.", a.SSID);
                        aiof.m57539a(a, wifiConfiguration);
                        i = this.f69278a.updateNetwork(wifiConfiguration);
                        if (i == -1) {
                            i = wifiConfiguration.networkId;
                        }
                    }
                }
                i = this.f69278a.addNetwork(a);
            } else {
                i = this.f69278a.addNetwork(a);
            }
            if (i == -1) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("ains", "b", 2106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Failed to add network %s.", a.SSID);
            } else {
                int i4 = Build.VERSION.SDK_INT;
                int i5 = Build.VERSION.SDK_INT;
                if (!this.f69278a.enableNetwork(i, true)) {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl3.mo68432a("ains", "b", 2115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Failed to enable network %s.", a.SSID);
                } else if (!this.f69278a.reconnect()) {
                    bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl4.mo68432a("ains", "b", 2120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68420a("Failed to reconnect to network %s.", a.SSID);
                } else {
                    z = countDownLatch.await(cfnv.m140770af(), TimeUnit.SECONDS);
                    if (!z) {
                        m57515a(a.SSID);
                        bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl5.mo68432a("ains", "a", 2046, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68423a("Couldn't connect to Wifi AP %s after %d seconds", a.SSID, cfnv.m140770af());
                    } else {
                        srn srn = ailf.f69111a;
                        String str3 = a.SSID;
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    m57513a(ainr);
                    if (z) {
                        String str4 = this.f69282e;
                        int i7 = this.f69284i;
                        ainq ainq = new ainq(this, i7, String.format("{%s:%s}", str4, Integer.valueOf(i7)));
                        butj butj = new butj(cfnv.m140772ah());
                        butj.f154849a = this.f69281d;
                        aiwd aiwd = (aiwd) butl.m120433a(ainq, "CreateSocketToConnectedWifiAp", butj.mo73110a());
                        if (aiwd != null) {
                            this.f69280c = aiwd;
                            return mo37899a(65);
                        }
                        m57515a(this.f69282e);
                        bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl6.mo68432a("ains", "b", 1857, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68422a("Failed to connect to Wifi hotspot (%s, %s) because we couldn't create a socket to it.", (Object) this.f69282e, this.f69284i);
                        return 3;
                    }
                    bnsl bnsl7 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl7.mo68432a("ains", "b", 1846, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl7.mo68422a("Failed to connect to Wifi hotspot (%s, %s) because we couldn't connect to the AP.", (Object) this.f69282e, this.f69284i);
                    return 3;
                }
            }
            bnsl bnsl8 = (bnsl) ailf.f69111a.mo68387b();
            bnsl8.mo68432a("ains", "a", 2020, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl8.mo68420a("Failed to initiate connection to discovered Wifi AP %s.", a.SSID);
            int i8 = Build.VERSION.SDK_INT;
            m57513a(ainr);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl9 = (bnsl) ailf.f69111a.mo68387b();
            bnsl9.mo68432a("ains", "a", 2034, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl9.mo68420a("Interrupted while waiting to connect to Wifi AP %s", a.SSID);
            z = false;
        } catch (Throwable th) {
            int i9 = Build.VERSION.SDK_INT;
            m57513a(ainr);
            throw th;
        }
        bnsl bnsl72 = (bnsl) ailf.f69111a.mo68390d();
        bnsl72.mo68432a("ains", "b", 1846, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl72.mo68422a("Failed to connect to Wifi hotspot (%s, %s) because we couldn't connect to the AP.", (Object) this.f69282e, this.f69284i);
        return 3;
    }

    /* renamed from: a */
    private final boolean m57515a(String str) {
        boolean disconnect = this.f69278a.disconnect();
        WifiManager wifiManager = this.f69278a;
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null) {
            Iterator<WifiConfiguration> it = configuredNetworks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                    bnsl.mo68432a("aiof", "a", 920, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to forget SSID %s. Unable to find it in the list of configured Wifi networks.", str);
                    break;
                }
                WifiConfiguration next = it.next();
                if (aiof.m57543b(next.SSID).equals(aiof.m57543b(str))) {
                    wifiManager.removeNetwork(next.networkId);
                    wifiManager.saveConfiguration();
                    srn srn = ailf.f69111a;
                    break;
                }
            }
        } else {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aiof", "a", 925, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to forget SSID %s because wifiManager.getConfiguredNetworks() returned null.", str);
        }
        return disconnect;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f A[SYNTHETIC, Splitter:B:18:0x007f] */
    /* renamed from: a */
    public final /* synthetic */ aiwd mo37728a(int i, String str) {
        Socket socket;
        try {
            ails.m57439a();
            socket = ainv.m57524a();
            int i2 = Build.VERSION.SDK_INT;
            Network[] c = mo37729c();
            int length = c.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    Network network = c[i3];
                    if (this.f69279b.getNetworkInfo(network).getType() == 1) {
                        network.bindSocket(socket);
                        break;
                    }
                    i3++;
                }
            }
            try {
                srn srn = ailf.f69111a;
                ails.m57449c(this.f69278a.getDhcpInfo().gateway);
                socket.connect(new InetSocketAddress(ails.m57449c(this.f69278a.getDhcpInfo().gateway), i), (int) cfnv.f184625a.mo6606a().mo81796bB());
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("ains", "a", 2241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Successfully connected via a Wifi socket to %s.", str);
                aiwd aiwd = new aiwd(socket);
                ails.m57447b();
                return aiwd;
            } catch (IOException e) {
                e = e;
                if (socket != null) {
                }
                throw new RuntimeException(String.format("Failed to connect via a Wifi socket to %s.", str), e);
            }
        } catch (IOException e2) {
            e = e2;
            socket = null;
            if (socket != null) {
                try {
                    socket.close();
                    srn srn2 = ailf.f69111a;
                } catch (IOException e3) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl2.mo68437a(e3);
                    bnsl2.mo68432a("ails", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68424a("Failed to close %sSocket %s", "WifiHotspot", str);
                } catch (Throwable th) {
                    ails.m57447b();
                    throw th;
                }
            }
            throw new RuntimeException(String.format("Failed to connect via a Wifi socket to %s.", str), e);
        }
    }

    /* renamed from: a */
    public final void mo37566a() {
        if (!m57515a(this.f69282e)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("ains", "a", 1872, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to disconnect from the currently-connected Wifi hotspot");
            return;
        }
        srn srn = ailf.f69111a;
    }
}
