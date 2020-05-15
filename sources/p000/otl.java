package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.wifi.WifiInfo;

/* renamed from: otl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class otl extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public boolean f38401a = false;

    /* renamed from: b */
    final /* synthetic */ Runnable f38402b;

    /* renamed from: c */
    final /* synthetic */ String f38403c;

    /* renamed from: d */
    final /* synthetic */ int f38404d;

    /* renamed from: e */
    final /* synthetic */ WifiInfo f38405e;

    /* renamed from: f */
    final /* synthetic */ C1585otp f38406f;

    public otl(C1585otp otp, Runnable runnable, String str, int i, WifiInfo wifiInfo) {
        this.f38406f = otp;
        this.f38402b = runnable;
        this.f38403c = str;
        this.f38404d = i;
        this.f38405e = wifiInfo;
    }

    public final void onAvailable(Network network) {
        C1585otp otp = this.f38406f;
        bnsn bnsn = C1585otp.f38420a;
        otp.f38425f.post(new otj(this, this.f38402b, network, this.f38403c, this.f38404d, this.f38405e));
    }

    public final void onLost(Network network) {
        C1585otp otp = this.f38406f;
        bnsn bnsn = C1585otp.f38420a;
        otp.f38425f.post(new otk(this, this.f38402b));
    }
}
