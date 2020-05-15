package p000;

import android.net.Uri;
import android.os.Handler;

/* renamed from: wtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wtp extends adzx {

    /* renamed from: a */
    final /* synthetic */ wts f51310a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wtp(wts wts, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.f51310a = wts;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        srn srn = wtw.f51331a;
        uri.toString();
        if (uri.equals(aypl.f98193a)) {
            this.f51310a.mo29399b();
        } else if (uri.equals(busp.f154817a)) {
            this.f51310a.mo29400c();
        }
    }
}
