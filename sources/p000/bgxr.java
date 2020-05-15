package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;

/* renamed from: bgxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgxr extends adzx {

    /* renamed from: a */
    final /* synthetic */ Intent f117932a;

    /* renamed from: b */
    final /* synthetic */ bgxx f117933b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgxr(bgxx bgxx, String str, String str2, Handler handler, Intent intent) {
        super(str, str2, handler);
        this.f117933b = bgxx;
        this.f117932a = intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        bgxx bgxx = this.f117933b;
        int i = bgxx.f117951w;
        bgxt bgxt = bgxx.f117961k;
        bgxt.sendMessage(bgxt.obtainMessage(1, this.f117932a));
    }
}
