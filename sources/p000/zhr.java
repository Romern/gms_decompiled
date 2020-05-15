package p000;

import android.os.Handler;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: zhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zhr {

    /* renamed from: a */
    public static final srn f55098a = zvt.m46581a();

    /* renamed from: b */
    public final Semaphore f55099b = new Semaphore(1);

    /* renamed from: c */
    public String f55100c;

    /* renamed from: d */
    private final Runnable f55101d;

    /* renamed from: e */
    private final Handler f55102e;

    public zhr(Handler handler) {
        this.f55102e = handler;
        this.f55101d = new zhq(this);
    }

    /* renamed from: a */
    public final void mo31139a() {
        this.f55100c = null;
        this.f55102e.removeCallbacks(this.f55101d);
        this.f55099b.release();
    }

    /* renamed from: a */
    public final void mo31140a(String str) {
        this.f55099b.acquire();
        this.f55102e.postDelayed(this.f55101d, TimeUnit.SECONDS.toMillis(cdzd.m135476e()));
        this.f55100c = str;
    }
}
