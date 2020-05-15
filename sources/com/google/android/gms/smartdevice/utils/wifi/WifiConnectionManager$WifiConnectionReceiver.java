package com.google.android.gms.smartdevice.utils.wifi;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiConnectionManager$WifiConnectionReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ ascz f108262a;

    /* renamed from: b */
    private final int f108263b;

    /* renamed from: c */
    private final CountDownLatch f108264c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiConnectionManager$WifiConnectionReceiver(ascz ascz, int i, CountDownLatch countDownLatch) {
        super("smartdevice");
        this.f108262a = ascz;
        this.f108263b = i;
        sdo.m34959a(countDownLatch);
        this.f108264c = countDownLatch;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo == null) {
            Log.i(ascz.f88720a, "State is null");
            return;
        }
        if (networkInfo.getDetailedState() != null) {
            String str = ascz.f88720a;
            String valueOf = String.valueOf(networkInfo.getDetailedState().name());
            Log.i(str, valueOf.length() == 0 ? new String("Detailed state: ") : "Detailed state: ".concat(valueOf));
        }
        if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.CONNECTED && this.f108262a.mo49056b() == this.f108263b) {
            this.f108264c.countDown();
        }
    }
}
