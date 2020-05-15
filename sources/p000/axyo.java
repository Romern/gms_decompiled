package p000;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: axyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axyo implements Closeable {

    /* renamed from: a */
    public final Object f96784a;

    /* renamed from: b */
    public final ReentrantLock f96785b = new ReentrantLock(this.f96787d.f96788a);

    /* renamed from: c */
    public int f96786c;

    /* renamed from: d */
    final /* synthetic */ axyp f96787d;

    public axyo(axyp axyp, Object obj) {
        this.f96787d = axyp;
        this.f96784a = obj;
    }

    public final void close() {
        axyp axyp = this.f96787d;
        this.f96785b.unlock();
        synchronized (axyp) {
            int i = this.f96786c - 1;
            this.f96786c = i;
            if (i == 0) {
                axyp.f96789b.remove(this.f96784a);
            }
        }
    }
}
