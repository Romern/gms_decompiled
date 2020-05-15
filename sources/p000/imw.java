package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: imw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class imw {

    /* renamed from: a */
    private final ConnectivityManager f21368a;

    public imw(Context context) {
        this.f21368a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: a */
    public final boolean mo13150a() {
        NetworkInfo activeNetworkInfo = this.f21368a.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
