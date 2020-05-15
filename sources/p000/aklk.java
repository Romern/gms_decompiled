package p000;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.gms.netrec.scoring.client.wfa.PersistentNetworkRequest$1;
import java.util.List;

/* renamed from: aklk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aklk {

    /* renamed from: a */
    static final NetworkRequest f72198a = new NetworkRequest.Builder().removeCapability(14).addCapability(12).addCapability(15).addTransportType(1).build();

    /* renamed from: b */
    static aklk f72199b;

    /* renamed from: k */
    public static final /* synthetic */ int f72200k = 0;

    /* renamed from: c */
    public final snr f72201c;

    /* renamed from: d */
    aklw f72202d;

    /* renamed from: e */
    BroadcastReceiver f72203e = null;

    /* renamed from: f */
    public final Object f72204f = new Object();

    /* renamed from: g */
    public Network f72205g;

    /* renamed from: h */
    aklj f72206h;

    /* renamed from: i */
    final akli f72207i = new akli(this);

    /* renamed from: j */
    public long f72208j = 0;

    /* renamed from: l */
    private final ConnectivityManager f72209l;

    /* renamed from: m */
    private final PowerManager f72210m;

    /* renamed from: n */
    private final Context f72211n;

    private aklk(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f72211n = applicationContext;
        this.f72209l = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        this.f72210m = (PowerManager) context.getSystemService("power");
        sns sns = new sns(10);
        sns.start();
        this.f72201c = new snr(sns);
        this.f72202d = new aklw(this.f72211n, this.f72201c);
        synchronized (this.f72204f) {
            this.f72209l.registerNetworkCallback(f72198a, this.f72207i);
            mo39542c();
        }
        if (m59961b(context) && m59962c(context)) {
            m59964e();
        }
    }

    /* renamed from: a */
    public static void m59959a(Context context) {
        int i = spn.f44932a;
        if (m59961b(context)) {
            m59963d(context);
        } else {
            m59966g();
        }
    }

    /* renamed from: b */
    public static ComponentName m59960b() {
        String b = cfpm.m142486b();
        String valueOf = String.valueOf(b);
        String valueOf2 = String.valueOf(cfpm.f185392a.mo6606a().mo82466b());
        return new ComponentName(b, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    /* renamed from: c */
    private static boolean m59962c(Context context) {
        aklc.m59952a();
        return akld.m59955b(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* renamed from: d */
    private static synchronized void m59963d(Context context) {
        synchronized (aklk.class) {
            if (f72199b == null) {
                int i = eoa.f15378a;
                f72199b = new aklk(context);
                return;
            }
            f72199b.mo39542c();
            if (m59962c(context)) {
                f72199b.m59964e();
            }
        }
    }

    /* renamed from: e */
    private final synchronized void m59964e() {
        if (this.f72203e == null) {
            this.f72203e = new PersistentNetworkRequest$1(this, "netrec");
            this.f72211n.getApplicationContext().registerReceiver(this.f72203e, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
        }
    }

    /* renamed from: f */
    private final synchronized void m59965f() {
        BroadcastReceiver broadcastReceiver = this.f72203e;
        if (broadcastReceiver != null) {
            this.f72211n.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: g */
    private static synchronized void m59966g() {
        synchronized (aklk.class) {
            if (f72199b != null) {
                int i = eoa.f15378a;
                f72199b.f72201c.mo25780c();
                f72199b.m59965f();
                synchronized (f72199b.f72204f) {
                    f72199b.mo39543d();
                    f72199b.f72209l.unregisterNetworkCallback(f72199b.f72207i);
                }
                f72199b = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo39542c() {
        int i = eoa.f15378a;
        synchronized (this.f72204f) {
            if (mo39541a() && this.f72206h == null && this.f72205g == null) {
                aklj aklj = new aklj(this);
                this.f72206h = aklj;
                this.f72209l.requestNetwork(f72198a, aklj);
            }
        }
    }

    /* renamed from: b */
    private static boolean m59961b(Context context) {
        if (!aklx.m59989a(context)) {
            return false;
        }
        aklx.m59987a();
        return akmq.m60024b(context) && cfpd.m142364d() && aklx.m59990a(context, m59960b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fe, code lost:
        if (r6 != false) goto L_0x0100;
     */
    /* renamed from: a */
    public final void mo39540a(Network network) {
        String str;
        boolean z;
        sdo.checkIfNull(this.f72202d, "WfaNetworkStatusClient can not be null in network available callback.");
        synchronized (this.f72204f) {
            if (this.f72205g == null) {
                this.f72205g = network;
                WifiInfo connectionInfo = ((WifiManager) this.f72211n.getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    str = connectionInfo.getSSID();
                } else {
                    str = "";
                }
                String c = akmk.m60019c(str);
                if (!TextUtils.isEmpty(str) && !TextUtils.equals(c, (CharSequence) akka.f72132g.mo10351a())) {
                    akka.f72131f.mo10352a(Integer.valueOf((int) cfpm.f185392a.mo6606a().mo82471g()));
                } else {
                    akka.f72131f.mo10352a(Integer.valueOf(Math.min(((Integer) akka.f72131f.mo10351a()).intValue() + ((int) cfpm.f185392a.mo6606a().mo82469e()), (int) cfpm.f185392a.mo6606a().mo82470f())));
                }
                akka.f72132g.mo10352a(c);
                List<WifiConfiguration> configuredNetworks = ((WifiManager) this.f72211n.getSystemService("wifi")).getConfiguredNetworks();
                WifiConfiguration wifiConfiguration = null;
                boolean z2 = false;
                if (configuredNetworks != null) {
                    int i = 0;
                    while (true) {
                        if (i >= configuredNetworks.size()) {
                            break;
                        }
                        WifiConfiguration wifiConfiguration2 = configuredNetworks.get(i);
                        if (TextUtils.equals(str, wifiConfiguration2.SSID)) {
                            wifiConfiguration = wifiConfiguration2;
                            break;
                        }
                        i++;
                    }
                }
                NetworkInfo networkInfo = this.f72209l.getNetworkInfo(network);
                boolean z3 = networkInfo != null ? networkInfo.isConnected() : false;
                if (wifiConfiguration == null || wifiConfiguration.allowedKeyManagement.get(1) || wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
                    z = false;
                } else {
                    z = wifiConfiguration.wepKeys == null || wifiConfiguration.wepKeys[0] == null;
                }
                if (z3) {
                    if (wifiConfiguration == null) {
                    }
                    aklw aklw = this.f72202d;
                    akle akle = new akle(this, network);
                    sdo.m34973b("Cannot be called from the main thread.");
                    if (!aklw.mo39549a()) {
                        int i2 = eoa.f15378a;
                        Intent intent = new Intent(cfpm.f185392a.mo6606a().mo82465a());
                        intent.setComponent(m59960b());
                        intent.putExtra("android.net.extra.NETWORK", network);
                        aklw.f72226a.sendBroadcast(intent);
                        aklw.f72227b.postDelayed(new aklm(akle), cfpm.m142487c());
                    } else {
                        int i3 = eoa.f15378a;
                        aknf.m60075a("NetworkAvailableStartBinding");
                        int a = aklw.mo39548a(new akls(network));
                        if (a == 1) {
                            aknf.m60075a("NetworkAvailableBindingError");
                        } else if (a == 2) {
                            aknf.m60075a("NetworkAvailableMessageNotAcked");
                        }
                        if (a == 0) {
                            z2 = true;
                        }
                        akle.mo39534a(z2);
                    }
                }
                mo39543d();
            }
        }
    }

    /* renamed from: d */
    public final void mo39543d() {
        synchronized (this.f72204f) {
            aklj aklj = this.f72206h;
            if (aklj != null) {
                this.f72209l.unregisterNetworkCallback(aklj);
                this.f72206h = null;
                int i = eoa.f15378a;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo39541a() {
        if (!m59961b(this.f72211n) || !m59962c(this.f72211n)) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return !this.f72210m.isDeviceIdleMode();
    }
}
