package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: chvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chvh extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ chvi f189260a;

    /* renamed from: b */
    private boolean f189261b = false;

    public chvh(chvi chvi) {
        this.f189260a = chvi;
    }

    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.f189261b;
        boolean z2 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z2 = true;
        }
        this.f189261b = z2;
        if (z2 && !z) {
            this.f189260a.f189262a.mo85627f();
        }
    }
}
