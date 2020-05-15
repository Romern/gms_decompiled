package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: apue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apue implements Handler.Callback {

    /* renamed from: d */
    private static apue f84908d;

    /* renamed from: a */
    public final apua f84909a;

    /* renamed from: b */
    public final aqbh f84910b;

    /* renamed from: c */
    private final Handler f84911c = new adzt(Looper.getMainLooper(), this);

    static {
        apue.class.getSimpleName();
    }

    private apue(apua apua, aqbh aqbh) {
        this.f84909a = apua;
        this.f84910b = aqbh;
    }

    /* renamed from: a */
    public static synchronized apue m71014a(Context context) {
        apue apue;
        synchronized (apue.class) {
            if (f84908d == null) {
                f84908d = new apue(apua.m71005a(context), aqbh.m71290a(context));
            }
            apue = f84908d;
        }
        return apue;
    }

    /* renamed from: b */
    static synchronized void m71015b() {
        synchronized (apue.class) {
            f84908d = null;
        }
    }

    public final boolean handleMessage(Message message) {
        snp.m35704b(9).execute(new apud(this, message.what));
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo47619a() {
        if (!this.f84911c.hasMessages(1) && !this.f84911c.hasMessages(2) && !this.f84911c.hasMessages(3)) {
            m71015b();
        }
    }

    /* renamed from: b */
    public final synchronized void mo47621b(int i) {
        if (!(i == 1 || i == 2)) {
            i = 3;
        }
        if (!this.f84911c.hasMessages(i)) {
            Handler handler = this.f84911c;
            handler.sendMessageAtTime(handler.obtainMessage(i, null), SystemClock.uptimeMillis() + apum.f84928a);
        }
    }

    /* renamed from: a */
    public final synchronized void mo47620a(int i) {
        this.f84911c.removeMessages(i, null);
        mo47619a();
    }
}
