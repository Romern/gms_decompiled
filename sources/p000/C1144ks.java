package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class C1144ks {

    /* renamed from: a */
    private static Handler f24915a;

    /* renamed from: c */
    public final FutureTask f24916c = new C1142kq(this, new C1141kp(this));

    /* renamed from: d */
    final AtomicBoolean f24917d = new AtomicBoolean();

    /* renamed from: e */
    final AtomicBoolean f24918e = new AtomicBoolean();

    /* renamed from: f */
    public volatile int f24919f = 1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo14437a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14438a(Object obj) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14439b(Object obj) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14855c(Object obj) {
        if (!this.f24918e.get()) {
            mo14856d(obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14856d(Object obj) {
        Handler handler;
        synchronized (C1144ks.class) {
            if (f24915a == null) {
                f24915a = new Handler(Looper.getMainLooper());
            }
            handler = f24915a;
        }
        handler.post(new C1143kr(this, obj));
    }

    /* renamed from: b */
    public final boolean mo14854b() {
        return this.f24917d.get();
    }
}
