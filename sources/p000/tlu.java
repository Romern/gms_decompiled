package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: tlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tlu extends tmk {

    /* renamed from: a */
    public static final egj f46246a = new tls();

    /* renamed from: b */
    public tjc f46247b;

    /* renamed from: c */
    public Handler f46248c;

    /* renamed from: d */
    public final Object f46249d = new Object();

    public tlu(tjc tjc, Looper looper) {
        sdo.m34959a(tjc);
        this.f46247b = tjc;
        sdo.m34959a(looper);
        this.f46248c = tmd.m37186a(looper);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo26651a(ContextData contextData) {
        synchronized (this.f46249d) {
            Handler handler = this.f46248c;
            if (handler != null && this.f46247b != null) {
                handler.post(new tlt(this, contextData));
            }
        }
    }
}
