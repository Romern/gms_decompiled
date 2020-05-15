package p000;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;

/* renamed from: ciss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciss implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f191345a;

    /* renamed from: b */
    final /* synthetic */ cisu f191346b;

    public ciss(cisu cisu, UrlResponseInfo urlResponseInfo) {
        this.f191346b = cisu;
        this.f191345a = urlResponseInfo;
    }

    public final void run() {
        try {
            cisu cisu = this.f191346b;
            cisu.f191350a.onSucceeded(cisu.f191353d, this.f191345a);
        } catch (Exception e) {
            Log.e(cisx.f191359a, "Exception in onSucceeded method", e);
        }
    }
}
