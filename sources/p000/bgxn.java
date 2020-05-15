package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;

/* renamed from: bgxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgxn extends adzx {

    /* renamed from: a */
    final /* synthetic */ bgxx f117928a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgxn(bgxx bgxx, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.f117928a = bgxx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        bgxx bgxx = this.f117928a;
        int i = bgxx.f117951w;
        bgxt bgxt = bgxx.f117961k;
        bgxt.sendMessage(bgxt.obtainMessage(1, new Intent("com.google.android.location.reporting.CHANGE_ON_WIFI_ALWAYS_SCAN_MODE")));
    }
}
