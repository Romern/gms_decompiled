package p000;

import android.net.Uri;
import android.os.Handler;
import java.util.Set;

/* renamed from: aplc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aplc extends adzx {

    /* renamed from: a */
    public final Set f84681a = new C1225nr();

    /* renamed from: b */
    private final apkr f84682b;

    /* renamed from: c */
    private final aeab f84683c;

    public aplc(Handler handler, aeab aeab, apkr apkr) {
        super("scheduler", "UriTaskContentObserver", handler);
        this.f84682b = apkr;
        this.f84683c = aeab;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        this.f84682b.mo47374a(this.f84683c, uri, 0);
    }
}
