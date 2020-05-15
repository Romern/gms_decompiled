package p000;

import android.util.Log;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* renamed from: cist */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cist implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f191347a;

    /* renamed from: b */
    final /* synthetic */ CronetException f191348b;

    /* renamed from: c */
    final /* synthetic */ cisu f191349c;

    public cist(cisu cisu, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f191349c = cisu;
        this.f191347a = urlResponseInfo;
        this.f191348b = cronetException;
    }

    public final void run() {
        try {
            cisu cisu = this.f191349c;
            cisu.f191350a.onFailed(cisu.f191353d, this.f191347a, this.f191348b);
        } catch (Exception e) {
            Log.e(cisx.f191359a, "Exception in onFailed method", e);
        }
    }
}
