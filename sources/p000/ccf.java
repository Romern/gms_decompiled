package p000;

import java.util.concurrent.Callable;

/* renamed from: ccf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ccf implements Callable {

    /* renamed from: a */
    final /* synthetic */ cck f6474a;

    public ccf(cck cck) {
        this.f6474a = cck;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return null;
     */
    public final /* bridge */ /* synthetic */ Object call() {
        synchronized (this.f6474a) {
            cck cck = this.f6474a;
            if (cck.f6492f == null) {
                return null;
            }
            cck.mo3712d();
            if (this.f6474a.mo3710c()) {
                this.f6474a.mo3708b();
                this.f6474a.f6494h = 0;
            }
        }
    }
}
