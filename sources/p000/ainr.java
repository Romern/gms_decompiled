package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import java.util.concurrent.CountDownLatch;

/* renamed from: ainr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ainr extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ String f69275a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f69276b;

    /* renamed from: c */
    final /* synthetic */ ains f69277c;

    public ainr(ains ains, String str, CountDownLatch countDownLatch) {
        this.f69277c = ains;
        this.f69275a = str;
        this.f69276b = countDownLatch;
    }

    public final void onAvailable(Network network) {
        String str;
        if (cfnv.f184625a.mo6606a().mo81754aM()) {
            String str2 = this.f69275a;
            WifiInfo connectionInfo = this.f69277c.f69278a.getConnectionInfo();
            if (connectionInfo != null) {
                str = connectionInfo.getSSID();
            } else {
                str = null;
            }
            if (!str2.equals(str)) {
                return;
            }
        }
        ains ains = this.f69277c;
        int i = Build.VERSION.SDK_INT;
        Network[] c = ains.mo37729c();
        int length = c.length;
        NetworkInfo[] networkInfoArr = new NetworkInfo[length];
        for (int i2 = 0; i2 < c.length; i2++) {
            networkInfoArr[i2] = ains.f69279b.getNetworkInfo(c[i2]);
        }
        for (int i3 = 0; i3 < length; i3++) {
            NetworkInfo networkInfo = networkInfoArr[i3];
            if (networkInfo != null && networkInfo.getType() == 1 && networkInfo.isConnected()) {
                this.f69276b.countDown();
                return;
            }
        }
    }
}
