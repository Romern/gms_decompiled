package p000;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: kp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1141kp implements Callable {

    /* renamed from: a */
    final /* synthetic */ C1144ks f24654a;

    public C1141kp(C1144ks ksVar) {
        this.f24654a = ksVar;
    }

    public final Object call() {
        Throwable th;
        Object obj;
        this.f24654a.f24918e.set(true);
        try {
            Process.setThreadPriority(10);
            obj = this.f24654a.mo14437a();
            try {
                Binder.flushPendingCommands();
                this.f24654a.mo14856d(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.f24654a.f24917d.set(true);
                    throw th;
                } catch (Throwable th3) {
                    this.f24654a.mo14856d(obj);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            obj = null;
            this.f24654a.f24917d.set(true);
            throw th;
        }
    }
}
