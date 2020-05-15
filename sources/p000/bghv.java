package p000;

import android.net.Uri;
import android.os.Handler;

/* renamed from: bghv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bghv extends adzx {

    /* renamed from: a */
    final /* synthetic */ bgid f116466a;

    /* renamed from: b */
    private final bgoy f116467b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bghv(bgid bgid, Handler handler, bgoy bgoy) {
        super("location", "MyContentObserver", handler);
        this.f116466a = bgid;
        this.f116467b = bgoy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        this.f116466a.mo62849b(this.f116467b);
    }
}
