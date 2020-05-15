package p000;

import android.content.Intent;

/* renamed from: azgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgb implements Runnable {

    /* renamed from: a */
    private final azga f99260a;

    /* renamed from: b */
    private final Intent f99261b;

    /* renamed from: c */
    private final Runnable f99262c;

    public azgb(azga azga, String str, Runnable runnable) {
        this.f99260a = azga;
        Intent intent = new Intent(str);
        this.f99261b = intent;
        this.f99262c = runnable;
        this.f99260a.mo54891a(intent);
    }

    /* renamed from: a */
    public final void mo54893a() {
        this.f99260a.mo54892b(this.f99261b);
    }

    public final void run() {
        try {
            this.f99262c.run();
        } catch (Exception e) {
            azoj.m85931a("WakefulRunnable", e, "Exception running task", new Object[0]);
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
        } catch (Throwable th) {
            mo54893a();
            throw th;
        }
        mo54893a();
    }
}
