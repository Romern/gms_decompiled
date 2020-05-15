package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.node.WifiService$2;
import com.google.android.gms.wearable.node.WifiService$SavedNetworkBroadcastReceiver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aybd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aybd implements axxg {

    /* renamed from: a */
    public static aybd f97009a;

    /* renamed from: b */
    public final SharedPreferences f97010b;

    /* renamed from: c */
    public final WifiManager f97011c;

    /* renamed from: d */
    public final boolean f97012d;

    /* renamed from: e */
    public final axxv f97013e;

    /* renamed from: f */
    public final ConnectivityManager f97014f;

    /* renamed from: g */
    final AtomicBoolean f97015g = new AtomicBoolean(false);

    /* renamed from: h */
    public final Object f97016h = new Object();

    /* renamed from: i */
    public axxi f97017i = null;

    /* renamed from: j */
    public ConnectivityManager.NetworkCallback f97018j = null;

    /* renamed from: k */
    public final Handler f97019k = new aybc(this, new sns("WearWifiServiceHandler", 9));

    /* renamed from: l */
    private final Context f97020l;

    /* renamed from: m */
    private final BroadcastReceiver f97021m;

    /* renamed from: n */
    private final axzt f97022n;

    public aybd(Context context, SharedPreferences sharedPreferences, boolean z, axzt axzt, WifiManager wifiManager, axxv axxv, ConnectivityManager connectivityManager) {
        WifiService$2 wifiService$2 = new WifiService$2(this, "wearable");
        this.f97021m = wifiService$2;
        this.f97020l = context;
        this.f97010b = sharedPreferences;
        this.f97011c = wifiManager;
        this.f97022n = axzt;
        this.f97012d = z;
        this.f97013e = axxv;
        this.f97014f = connectivityManager;
        if (!z) {
            context.registerReceiver(new WifiService$SavedNetworkBroadcastReceiver(this), new IntentFilter("android.net.wifi.CONFIGURED_NETWORKS_CHANGE"));
            return;
        }
        context.registerReceiver(wifiService$2, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        this.f97019k.sendEmptyMessage(1);
    }

    /* renamed from: a */
    static String m83737a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    /* renamed from: b */
    static String m83738b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        if (length <= 1 || str.charAt(0) != '\"') {
            return str;
        }
        int i = length - 1;
        return str.charAt(i) == '\"' ? str.substring(1, i) : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0159, code lost:
        if (r9 != 58) goto L_0x0163;
     */
    /* renamed from: c */
    public final void mo53858c(String str) {
        boolean z;
        WifiConfiguration wifiConfiguration;
        int i;
        synchronized (this.f97016h) {
            if (this.f97017i != null) {
                if (Log.isLoggable("Wear_WifiService", 3)) {
                    Log.d("Wear_WifiService", str.length() == 0 ? new String("Syncing credentials from ") : "Syncing credentials from ".concat(str));
                }
                axos a = axos.m82822a(this.f97017i.f96647b.f96642d);
                int h = a.mo53345h("source");
                if (Log.isLoggable("Wear_WifiService", 3)) {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Credential source is from: ");
                    sb.append(h);
                    Log.d("Wear_WifiService", sb.toString());
                }
                ArrayList e = a.mo53341e("list");
                if (e == null) {
                    Log.w("Wear_WifiService", "Received an empty wifi credentials data item.");
                    return;
                }
                if (Log.isLoggable("Wear_WifiService", 3)) {
                    int size = e.size();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Wifi Credentials to sync: ");
                    sb2.append(size);
                    Log.d("Wear_WifiService", sb2.toString());
                }
                if (Log.isLoggable("Wear_WifiService", 3)) {
                    int size2 = e.size();
                    StringBuilder sb3 = new StringBuilder(28);
                    sb3.append("Adding ");
                    sb3.append(size2);
                    sb3.append(" networks.");
                    Log.d("Wear_WifiService", sb3.toString());
                }
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    axos axos = (axos) it.next();
                    String c = axos.mo53337c("ssid");
                    int h2 = axos.mo53345h("key_mgmt");
                    String c2 = axos.mo53337c("key");
                    if (!(c == null || h2 == 3)) {
                        if (axos.mo53345h("hiddenSsid") != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h2 == 0) {
                            wifiConfiguration = new WifiConfiguration();
                            wifiConfiguration.SSID = m83737a(c);
                            wifiConfiguration.hiddenSSID = z;
                            wifiConfiguration.allowedKeyManagement.set(0);
                        } else {
                            WifiConfiguration wifiConfiguration2 = new WifiConfiguration();
                            wifiConfiguration2.hiddenSSID = z;
                            wifiConfiguration2.SSID = m83737a(c);
                            wifiConfiguration2.priority = 1;
                            wifiConfiguration2.status = 2;
                            if (c2 != null) {
                                i = c2.length();
                            } else {
                                i = 0;
                            }
                            if (h2 == 1) {
                                wifiConfiguration2.allowedKeyManagement.set(0);
                                wifiConfiguration2.allowedProtocols.set(1);
                                wifiConfiguration2.allowedProtocols.set(0);
                                wifiConfiguration2.allowedAuthAlgorithms.set(0);
                                wifiConfiguration2.allowedAuthAlgorithms.set(1);
                                wifiConfiguration2.allowedPairwiseCiphers.set(2);
                                wifiConfiguration2.allowedPairwiseCiphers.set(1);
                                wifiConfiguration2.allowedGroupCiphers.set(0);
                                wifiConfiguration2.allowedGroupCiphers.set(1);
                                wifiConfiguration2.wepKeys = new String[4];
                                if (i > 0) {
                                    if (i != 10) {
                                        if (i != 26) {
                                        }
                                    }
                                    if (c2.matches("[0-9A-Fa-f]*")) {
                                        wifiConfiguration2.wepKeys[0] = c2;
                                        wifiConfiguration2.wepTxKeyIndex = 0;
                                    }
                                    wifiConfiguration2.wepKeys[0] = m83737a(c2);
                                    wifiConfiguration2.wepTxKeyIndex = 0;
                                }
                            } else if (h2 == 2) {
                                wifiConfiguration2.allowedKeyManagement.set(1);
                                wifiConfiguration2.allowedProtocols.set(1);
                                wifiConfiguration2.allowedProtocols.set(0);
                                wifiConfiguration2.allowedPairwiseCiphers.set(1);
                                wifiConfiguration2.allowedPairwiseCiphers.set(2);
                                wifiConfiguration2.allowedGroupCiphers.set(0);
                                wifiConfiguration2.allowedGroupCiphers.set(1);
                                wifiConfiguration2.allowedGroupCiphers.set(2);
                                wifiConfiguration2.allowedGroupCiphers.set(3);
                                if (i > 0) {
                                    if (!c2.matches("[0-9A-Fa-f]{64}")) {
                                        wifiConfiguration2.preSharedKey = m83737a(c2);
                                    } else {
                                        wifiConfiguration2.preSharedKey = c2;
                                    }
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder(47);
                                sb4.append("Unrecognized key management scheme: ");
                                sb4.append(h2);
                                throw new UnsupportedOperationException(sb4.toString());
                            }
                            wifiConfiguration = wifiConfiguration2;
                        }
                        int addNetwork = this.f97011c.addNetwork(wifiConfiguration);
                        if (addNetwork != -1) {
                            StringBuilder sb5 = new StringBuilder(c.length() + 17);
                            sb5.append("Network <");
                            sb5.append(c);
                            sb5.append("> added.");
                            Log.i("Wear_WifiService", sb5.toString());
                            this.f97011c.enableNetwork(addNetwork, false);
                        } else {
                            StringBuilder sb6 = new StringBuilder(c.length() + 22);
                            sb6.append("Add network <");
                            sb6.append(c);
                            sb6.append("> failed.");
                            Log.w("Wear_WifiService", sb6.toString());
                        }
                    }
                }
                if (Log.isLoggable("Wear_WifiService", 3)) {
                    Log.d("Wear_WifiService", "Saving configurations to disk...");
                }
                this.f97011c.saveConfiguration();
                ConnectivityManager.NetworkCallback networkCallback = this.f97018j;
                if (networkCallback != null) {
                    this.f97014f.unregisterNetworkCallback(networkCallback);
                    this.f97018j = null;
                }
                this.f97010b.edit().putLong("last_sync_dataitem_written", this.f97017i.f96653h).commit();
                this.f97017i = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo53557a(ArrayList arrayList) {
        if (this.f97012d && this.f97011c != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                axxi axxi = (axxi) arrayList.get(i);
                if (!ayha.f97559a.equals(axxi.f96646a) || !"/sync_wifi_credentials".equals(axxi.f96647b.f96640b)) {
                    i++;
                } else if (!axxi.f96648c) {
                    this.f97019k.sendMessage(this.f97019k.obtainMessage(2, axxi));
                    return;
                } else if (Log.isLoggable("Wear_WifiService", 3)) {
                    Log.d("Wear_WifiService", "Wifi Credentials data item was deleted.");
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo53857b() {
        try {
            if (!mo53856a(false)) {
                Log.w("Wear_WifiService", "Failed to sync new wifi credential.");
            }
        } catch (IOException e) {
            Log.w("Wear_WifiService", "Error trying to sync new wifi credentials", e);
        }
    }

    /* renamed from: a */
    public final boolean mo53855a() {
        return Settings.Global.getInt(this.f97020l.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    /* renamed from: a */
    public final boolean mo53856a(boolean z) {
        boolean z2;
        if (this.f97012d) {
            return false;
        }
        Log.w("Wear_WifiService", "Syncing Wifi Credentials");
        if (this.f97011c == null) {
            Log.w("Wear_WifiService", "No WiFi service. Exit...");
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        WifiManager wifiManager = this.f97011c;
        if (wifiManager != null) {
            if (wifiManager.isWifiEnabled()) {
                z2 = false;
            } else if (!z || mo53855a()) {
                z2 = false;
            } else {
                this.f97011c.setWifiEnabled(true);
                z2 = true;
            }
            List<WifiConfiguration> privilegedConfiguredNetworks = this.f97011c.getPrivilegedConfiguredNetworks();
            if (privilegedConfiguredNetworks != null) {
                for (WifiConfiguration wifiConfiguration : privilegedConfiguredNetworks) {
                    axos axos = new axos();
                    axos.mo53328a("ssid", m83738b(wifiConfiguration.SSID));
                    if (wifiConfiguration.hiddenSSID) {
                        axos.mo53325a("hiddenSsid", 1);
                    }
                    if (wifiConfiguration.allowedKeyManagement.get(1)) {
                        axos.mo53325a("key_mgmt", 2);
                        axos.mo53328a("key", m83738b(wifiConfiguration.preSharedKey));
                    } else if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
                        axos.mo53325a("key_mgmt", 3);
                    } else if (wifiConfiguration.wepKeys[0] != null) {
                        axos.mo53325a("key_mgmt", 1);
                        axos.mo53328a("key", m83738b(wifiConfiguration.wepKeys[0]));
                    } else {
                        axos.mo53325a("key_mgmt", 0);
                    }
                    arrayList.add(axos);
                }
            }
            if (z2 && !mo53855a()) {
                this.f97011c.setWifiEnabled(false);
            }
        }
        if (arrayList.size() == 0) {
            return false;
        }
        if (Log.isLoggable("Wear_WifiService", 3)) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Wifi credentials source: 1");
            Log.d("Wear_WifiService", sb.toString());
            int size = arrayList.size();
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("Number of wifi credentials: ");
            sb2.append(size);
            Log.d("Wear_WifiService", sb2.toString());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String valueOf = String.valueOf(((axos) arrayList.get(i2)).mo53337c("ssid"));
                Log.d("Wear_WifiService", valueOf.length() == 0 ? new String("SSID: ") : "SSID: ".concat(valueOf));
            }
        }
        axxf axxf = new axxf(this.f97022n.mo53808b().f96814a, "/sync_wifi_credentials");
        axos axos2 = new axos();
        axos2.mo53329a("list", arrayList);
        axos2.mo53325a("source", 1);
        axxf.f96642d = axos2.mo53333a();
        this.f97013e.mo53728a(ayha.f97559a, axxf);
        return true;
    }
}
