package p000;

import java.lang.Thread;

/* renamed from: fkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fkl implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ fkm f16783a;

    public fkl(fkm fkm) {
        this.f16783a = fkm;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        fnt fnt = this.f16783a.f16789e;
        if (fnt != null) {
            fnt.mo10938e("Job execution failed", th);
        }
    }
}
