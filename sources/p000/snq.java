package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: snq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class snq implements snb {

    /* renamed from: a */
    final Message f44805a;

    /* renamed from: b */
    final Object f44806b;

    /* renamed from: c */
    final /* synthetic */ snr f44807c;

    public snq(snr snr, Message message, Object obj) {
        this.f44807c = snr;
        this.f44805a = message;
        this.f44806b = obj;
    }

    /* renamed from: a */
    public final Object mo25764a() {
        return this.f44806b;
    }

    /* renamed from: b */
    public final Runnable mo25765b() {
        return this;
    }

    public final void run() {
        try {
            Runnable callback = this.f44805a.getCallback();
            if (callback == null) {
                Handler.Callback callback2 = this.f44807c.f44810e;
                if (callback2 == null || !callback2.handleMessage(this.f44805a)) {
                    this.f44807c.handleMessage(this.f44805a);
                }
            } else {
                callback.run();
            }
        } finally {
            this.f44805a.recycle();
        }
    }

    public final String toString() {
        return this.f44807c.toString();
    }
}
