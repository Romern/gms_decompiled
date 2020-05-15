package p000;

import android.net.Uri;
import java.util.Map;

/* renamed from: azdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azdu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ azdf f99121a;

    /* renamed from: b */
    final /* synthetic */ azdv f99122b;

    public azdu(azdv azdv, azdf azdf) {
        this.f99122b = azdv;
        this.f99121a = azdf;
    }

    public final void run() {
        boolean z;
        azdv azdv = this.f99122b;
        azdf azdf = this.f99121a;
        if (azdf == null || azdf.f99021c != 2) {
            z = false;
        } else {
            z = true;
        }
        Object[] objArr = {Boolean.valueOf(z), Long.valueOf(azdv.f99123a)};
        azeb azeb = azdv.f99124b;
        long j = azdv.f99123a;
        Uri uri = azeb.f99133a;
        Map map = azeb.f99141f;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            azea azea = (azea) azeb.f99141f.get(valueOf);
            if (z) {
                new Object[1][0] = valueOf;
                azea.mo54816a(azdf);
            } else {
                new Object[1][0] = valueOf;
                azea.mo54817d();
            }
            azeb.f99141f.remove(valueOf);
            if (azeb.f99141f.isEmpty()) {
                azeb.f99137b.getContentResolver().unregisterContentObserver(azeb.f99144i);
                return;
            }
            return;
        }
        azoj.m85933c("DownloadManager", "No listener found downloadId:%s", valueOf);
    }
}
