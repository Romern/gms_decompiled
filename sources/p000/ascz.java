package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import com.google.android.gms.smartdevice.utils.wifi.WifiConnectionManager$WifiConnectionReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ascz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascz {

    /* renamed from: a */
    public static final String f88720a = ascz.class.getName();

    /* renamed from: b */
    public final WifiManager f88721b;

    /* renamed from: c */
    private final Context f88722c;

    /* renamed from: d */
    private final CountDownLatch f88723d = new CountDownLatch(1);

    public ascz(Context context) {
        WifiManager a = asdd.m73822a(context);
        sdo.m34959a(context);
        this.f88722c = context;
        sdo.m34959a(a);
        this.f88721b = a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c3 A[SYNTHETIC, Splitter:B:52:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d3 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x00a3=Splitter:B:39:0x00a3, B:35:0x0095=Splitter:B:35:0x0095, B:49:0x00ba=Splitter:B:49:0x00ba} */
    /* renamed from: a */
    private final synchronized int m73809a(int i) {
        int i2;
        String str = f88720a;
        StringBuilder sb = new StringBuilder(33);
        sb.append("doConnect. NetworkId: ");
        sb.append(i);
        Log.v(str, sb.toString());
        if (i == -1) {
            Log.w(f88720a, "Network not found");
            return -1;
        } else if (mo49056b() == i) {
            return i;
        } else {
            for (WifiConfiguration wifiConfiguration : m73810c()) {
                if (wifiConfiguration.networkId == i) {
                    WifiConnectionManager$WifiConnectionReceiver wifiConnectionManager$WifiConnectionReceiver = null;
                    try {
                        WifiConnectionManager$WifiConnectionReceiver wifiConnectionManager$WifiConnectionReceiver2 = new WifiConnectionManager$WifiConnectionReceiver(this, i, this.f88723d);
                        try {
                            this.f88722c.registerReceiver(wifiConnectionManager$WifiConnectionReceiver2, new IntentFilter("android.net.wifi.STATE_CHANGE"));
                            if (!this.f88721b.enableNetwork(i, true)) {
                                i2 = -1;
                            } else {
                                i2 = i;
                            }
                            if (i2 != -1) {
                                this.f88723d.await(15, TimeUnit.SECONDS);
                                if (mo49056b() != i) {
                                    if (i != -1) {
                                        Iterator it = m73810c().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((WifiConfiguration) it.next()).networkId == i) {
                                                    this.f88721b.removeNetwork(i);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    Log.v(f88720a, "Unregistering wifi state receiver");
                                    this.f88722c.unregisterReceiver(wifiConnectionManager$WifiConnectionReceiver2);
                                    break;
                                }
                            }
                            Log.v(f88720a, "Unregistering wifi state receiver");
                            this.f88722c.unregisterReceiver(wifiConnectionManager$WifiConnectionReceiver2);
                            return i2;
                        } catch (InterruptedException e) {
                            e = e;
                            wifiConnectionManager$WifiConnectionReceiver = wifiConnectionManager$WifiConnectionReceiver2;
                            try {
                                Log.e(f88720a, "WiFi connection interrupted", e);
                                if (wifiConnectionManager$WifiConnectionReceiver != null) {
                                    Log.v(f88720a, "Unregistering wifi state receiver");
                                    this.f88722c.unregisterReceiver(wifiConnectionManager$WifiConnectionReceiver);
                                }
                                return -1;
                            } catch (Throwable th) {
                                th = th;
                                if (wifiConnectionManager$WifiConnectionReceiver != null) {
                                    Log.v(f88720a, "Unregistering wifi state receiver");
                                    this.f88722c.unregisterReceiver(wifiConnectionManager$WifiConnectionReceiver);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            wifiConnectionManager$WifiConnectionReceiver = wifiConnectionManager$WifiConnectionReceiver2;
                            if (wifiConnectionManager$WifiConnectionReceiver != null) {
                            }
                            throw th;
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        Log.e(f88720a, "WiFi connection interrupted", e);
                        if (wifiConnectionManager$WifiConnectionReceiver != null) {
                        }
                        return -1;
                    } catch (Throwable th3) {
                        th = th3;
                        if (wifiConnectionManager$WifiConnectionReceiver != null) {
                        }
                        throw th;
                    }
                }
            }
            Log.w(f88720a, "Network not found");
            return -1;
        }
    }

    /* renamed from: c */
    private final List m73810c() {
        List<WifiConfiguration> configuredNetworks = this.f88721b.getConfiguredNetworks();
        return configuredNetworks == null ? new ArrayList() : configuredNetworks;
    }

    /* renamed from: b */
    public final int mo49056b() {
        WifiInfo connectionInfo = this.f88721b.getConnectionInfo();
        if (connectionInfo != null) {
            return connectionInfo.getNetworkId();
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo49053a(WifiConfiguration wifiConfiguration) {
        int i;
        sdo.m34959a(wifiConfiguration);
        sdo.m34959a((Object) wifiConfiguration.SSID);
        String b = ascr.m73791b(wifiConfiguration.SSID);
        if (b != null) {
            Iterator it = m73810c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WifiConfiguration wifiConfiguration2 = (WifiConfiguration) it.next();
                String b2 = ascr.m73791b(wifiConfiguration2.SSID);
                if (b2 != null && b2.equals(b)) {
                    i = wifiConfiguration2.networkId;
                    break;
                }
            }
        }
        i = -1;
        if (i != -1) {
            Log.w(f88720a, "Network already exists, connecting.");
        }
        if (i == -1) {
            i = this.f88721b.addNetwork(wifiConfiguration);
        }
        if (i != -1) {
            return m73809a(i);
        }
        String str = f88720a;
        String valueOf = String.valueOf(wifiConfiguration.SSID);
        Log.e(str, valueOf.length() == 0 ? new String("Could not create/add network configuration for ") : "Could not create/add network configuration for ".concat(valueOf));
        return -1;
    }

    /* renamed from: a */
    public final WifiConfiguration mo49054a(String str) {
        for (WifiConfiguration wifiConfiguration : mo49055a()) {
            String b = ascr.m73791b(wifiConfiguration.SSID);
            if (b != null && b.equals(str)) {
                return wifiConfiguration;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final List mo49055a() {
        List list;
        if (asce.m73770a(this.f88722c)) {
            list = this.f88721b.getPrivilegedConfiguredNetworks();
        } else {
            list = m73810c();
        }
        return list == null ? new ArrayList() : list;
    }
}
