package p000;

import android.net.Uri;
import android.os.Handler;

/* renamed from: azdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azdz extends adzx {

    /* renamed from: a */
    final String f99131a;

    /* renamed from: b */
    final /* synthetic */ azeb f99132b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azdz(azeb azeb, Handler handler, String str) {
        super("matchstick", "DownloadCompletedObserver", handler);
        this.f99132b = azeb;
        this.f99131a = str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        char c;
        if (uri != null) {
            String str = this.f99131a;
            int hashCode = str.hashCode();
            if (hashCode != 454658636) {
                if (hashCode == 658976531 && str.equals("preloaded_file_key")) {
                    c = 1;
                    if (c == 0) {
                        new azdy(this, Long.parseLong(uri.getLastPathSegment())).start();
                        return;
                    } else if (c != 1) {
                        azoj.m85933c("DownloadManager", "onChange for unknown downloadType %s", str);
                        return;
                    } else {
                        azoj.m85933c("DownloadManager", "onChange for downloadId %s", uri.getLastPathSegment());
                        azeb azeb = this.f99132b;
                        long parseLong = Long.parseLong(uri.getLastPathSegment());
                        Uri uri2 = azeb.f99133a;
                        new azdv(azeb, parseLong).start();
                        return;
                    }
                }
            } else if (str.equals("media_message_key")) {
                c = 0;
                if (c == 0) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
        }
    }
}
