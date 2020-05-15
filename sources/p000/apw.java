package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: apw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apw {

    /* renamed from: a */
    final Uri f1954a;

    /* renamed from: b */
    final Executor f1955b;

    /* renamed from: c */
    final apq f1956c;

    /* renamed from: d */
    final Runnable f1957d = new apu(this);

    /* renamed from: e */
    public final ContentObserver f1958e = new apv(this, new Handler(Looper.getMainLooper()));

    /* renamed from: f */
    final /* synthetic */ apr f1959f;

    /* renamed from: g */
    private boolean f1960g;

    public apw(apr apr, Uri uri, Executor executor, apq apq) {
        this.f1959f = apr;
        this.f1954a = uri;
        this.f1955b = executor;
        this.f1956c = apq;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2282a() {
        if (!this.f1960g) {
            try {
                this.f1959f.mo2273a(this.f1954a);
                this.f1960g = true;
            } catch (SecurityException e) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2283b() {
        this.f1959f.f1943a.getContentResolver().unregisterContentObserver(this.f1958e);
        if (this.f1960g) {
            this.f1959f.mo2275b(this.f1954a);
            this.f1960g = false;
        }
    }
}
