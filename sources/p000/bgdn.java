package p000;

import android.net.Uri;
import android.os.Handler;

/* renamed from: bgdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgdn extends adzx {

    /* renamed from: a */
    final /* synthetic */ bgdo f116138a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgdn(bgdo bgdo, Handler handler) {
        super("location", "MyContentObserver", handler);
        this.f116138a = bgdo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("MyContentObserver: change is ");
        sb.append(z);
        sb.toString();
        this.f116138a.mo62681c();
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }
}
