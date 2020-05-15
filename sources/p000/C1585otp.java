package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.carsetup.CarWifiSetup$1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: otp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1585otp {

    /* renamed from: a */
    public static final bnsn f38420a = odk.m28481a("CAR.SETUP.WIFI");

    /* renamed from: b */
    public final Context f38421b;

    /* renamed from: c */
    public final otr f38422c;

    /* renamed from: d */
    public final boolean f38423d;

    /* renamed from: e */
    public otq f38424e;

    /* renamed from: f */
    public final Handler f38425f;

    /* renamed from: g */
    public volatile ScheduledExecutorService f38426g;

    /* renamed from: h */
    public ScheduledFuture f38427h;

    /* renamed from: i */
    public boolean f38428i;

    /* renamed from: j */
    public int f38429j;

    /* renamed from: k */
    public volatile long f38430k;

    /* renamed from: l */
    public final BroadcastReceiver f38431l = new CarWifiSetup$1(this, "car_setup");

    /* renamed from: m */
    private final ConnectivityManager f38432m;

    /* renamed from: n */
    private ConnectivityManager.NetworkCallback f38433n;

    public C1585otp(Context context, otr otr, boolean z) {
        bmxy.m108581a(context);
        bmxy.m108581a(otr);
        this.f38421b = context.getApplicationContext();
        this.f38422c = otr;
        this.f38423d = z;
        this.f38425f = new adzt(Looper.getMainLooper());
        this.f38432m = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: a */
    public final void mo22614a() {
        ConnectivityManager.NetworkCallback networkCallback = this.f38433n;
        if (networkCallback != null) {
            this.f38432m.unregisterNetworkCallback(networkCallback);
            this.f38433n = null;
        }
    }

    /* renamed from: a */
    public final void mo22615a(Network network, String str, int i, WifiInfo wifiInfo, boolean z) {
        npe.m27155a();
        pcm.m30208a(this.f38432m, network);
        oto oto = new oto(this, str, i, z, wifiInfo);
        if (this.f38428i) {
            this.f38426g.execute(oto);
            return;
        }
        bnsi b = f38420a.mo68387b();
        b.mo68432a("otp", "a", 322, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Tried to connect while not initialized");
    }

    /* renamed from: a */
    public final void mo22616a(String str, int i, WifiInfo wifiInfo) {
        oth oth = new oth(this, str, i, wifiInfo);
        if (this.f38433n == null) {
            this.f38433n = new otl(this, oth, str, i, wifiInfo);
        }
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(1);
        this.f38432m.requestNetwork(builder.build(), this.f38433n);
        this.f38425f.postDelayed(oth, 10000);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: otp.a(android.net.Network, java.lang.String, int, android.net.wifi.WifiInfo, boolean):void
     arg types: [android.net.Network, java.lang.String, int, android.net.wifi.WifiInfo, int]
     candidates:
      otp.a(java.lang.String, int, android.net.wifi.WifiInfo, android.net.Network, boolean):void
      otp.a(android.net.Network, java.lang.String, int, android.net.wifi.WifiInfo, boolean):void */
    /* renamed from: a */
    public final void mo22617a(String str, int i, WifiInfo wifiInfo, Network network, boolean z) {
        Network network2;
        npe.m27155a();
        this.f38430k = SystemClock.elapsedRealtime();
        if (!z) {
            WifiManager wifiManager = (WifiManager) this.f38421b.getApplicationContext().getSystemService("wifi");
            if (network == null) {
                network2 = pcm.m30202a(this.f38432m);
            } else {
                network2 = network;
            }
            if (wifiInfo == null || !pcm.m30210a(wifiInfo, wifiManager) || network2 == null) {
                mo22616a(str, i, wifiInfo);
            } else {
                mo22615a(network2, str, i, wifiInfo, true);
            }
        } else {
            mo22615a(network, str, i, wifiInfo, false);
        }
    }

    /* renamed from: a */
    public final void mo22618a(otq otq) {
        bmxy.m108581a(otq);
        if (this.f38428i) {
            bnsi b = f38420a.mo68387b();
            b.mo68432a("otp", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Already initialized");
            return;
        }
        this.f38424e = otq;
        this.f38426g = snp.m35703a(1, 9);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        this.f38421b.registerReceiver(this.f38431l, intentFilter);
        this.f38429j = 0;
        this.f38428i = true;
    }
}
