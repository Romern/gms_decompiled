package p000;

import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.google.android.chimera.Activity;
import com.google.android.gms.nearby.sharing.utils.WifiUtils$1;
import java.util.concurrent.Callable;

/* renamed from: akiv */
final /* synthetic */ class akiv implements Callable {

    /* renamed from: a */
    private final Activity f72063a;

    /* renamed from: b */
    private final WifiManager f72064b;

    public akiv(Activity activity, WifiManager wifiManager) {
        this.f72063a = activity;
        this.f72064b = wifiManager;
    }

    public final Object call() {
        Activity activity = this.f72063a;
        WifiManager wifiManager = this.f72064b;
        bqgy c = bqgy.m112818c();
        WifiUtils$1 wifiUtils$1 = new WifiUtils$1("nearby", c);
        activity.registerReceiver(wifiUtils$1, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        if (!wifiManager.setWifiEnabled(true)) {
            c.mo69136a((Throwable) new Exception("Wifi manager denied the enable request."));
        }
        boolean b = ahhf.m55777b("enableWifi", c, 3000);
        ahhd.m55766a(activity, wifiUtils$1);
        if (b || wifiManager.isWifiEnabled()) {
            return null;
        }
        throw new Exception("Got exception when turning on Wi-Fi");
    }
}
