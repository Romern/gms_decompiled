package p000;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;

/* renamed from: apkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apkc implements apkd {
    /* renamed from: a */
    public final boolean mo47354a(Uri uri, int i) {
        try {
            return InetAddress.getByName(uri.getHost()).isReachable(i);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("PingReachabilityChecker", String.format("Error checking if %s is reachable: %s", uri.getHost(), e));
            return false;
        }
    }
}
