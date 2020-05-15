package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0069c extends C0978f {

    /* renamed from: b */
    public static final Executor f6313b = new C0000a();

    /* renamed from: c */
    public static final Executor f6314c = new C0041b();

    /* renamed from: d */
    private static volatile C0069c f6315d;

    /* renamed from: a */
    public final C0978f f6316a;

    /* renamed from: e */
    private final C0978f f6317e;

    private C0069c() {
        C0950e eVar = new C0950e();
        this.f6317e = eVar;
        this.f6316a = eVar;
    }

    /* renamed from: a */
    public static C0069c m3830a() {
        if (f6315d == null) {
            synchronized (C0069c.class) {
                if (f6315d == null) {
                    f6315d = new C0069c();
                }
            }
        }
        return f6315d;
    }

    /* renamed from: a */
    public final void mo3630a(Runnable runnable) {
        C0978f fVar = this.f6316a;
        C0950e eVar = (C0950e) fVar;
        if (eVar.f14520c == null) {
            synchronized (eVar.f14518a) {
                if (((C0950e) fVar).f14520c == null) {
                    Looper mainLooper = Looper.getMainLooper();
                    int i = Build.VERSION.SDK_INT;
                    ((C0950e) fVar).f14520c = Handler.createAsync(mainLooper);
                }
            }
        }
        eVar.f14520c.post(runnable);
    }
}
