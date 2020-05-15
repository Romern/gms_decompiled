package p000;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;

/* renamed from: cisr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f191343a;

    /* renamed from: b */
    final /* synthetic */ cisu f191344b;

    public cisr(cisu cisu, UrlResponseInfo urlResponseInfo) {
        this.f191344b = cisu;
        this.f191343a = urlResponseInfo;
    }

    public final void run() {
        try {
            cisu cisu = this.f191344b;
            cisu.f191350a.onCanceled(cisu.f191353d, this.f191343a);
        } catch (Exception e) {
            Log.e(cisx.f191359a, "Exception in onCanceled method", e);
        }
    }
}
