package p000;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: uao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uao extends AbstractQueue implements BlockingQueue {

    /* renamed from: a */
    private final ubd f47040a;

    /* renamed from: b */
    private final vpu f47041b;

    /* renamed from: c */
    private final uhn f47042c;

    /* renamed from: d */
    private final uav f47043d;

    /* renamed from: e */
    private final ufe f47044e;

    /* renamed from: f */
    private final vcz f47045f;

    /* renamed from: g */
    private final sqv f47046g;

    /* renamed from: h */
    private final boolean f47047h;

    /* renamed from: i */
    private final veg f47048i;

    public uao(vpu vpu, uhn uhn, veg veg, uav uav, ufe ufe, ubd ubd, vcz vcz, sqv sqv, boolean z) {
        this.f47040a = ubd;
        this.f47041b = vpu;
        this.f47042c = uhn;
        this.f47048i = veg;
        this.f47043d = uav;
        this.f47044e = ufe;
        this.f47045f = vcz;
        this.f47046g = sqv;
        this.f47047h = z;
    }

    /* renamed from: a */
    public final Runnable take() {
        return new uas(this.f47041b, this.f47042c, this.f47048i, this.f47043d, this.f47044e, this.f47040a, this.f47040a.mo27035a(this.f47047h), this.f47045f.mo28312c(), this.f47046g);
    }

    public final int drainTo(Collection collection) {
        return 0;
    }

    public final int drainTo(Collection collection, int i) {
        return 0;
    }

    public final Iterator iterator() {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        Runnable runnable = (Runnable) obj;
        return false;
    }

    public final /* bridge */ /* synthetic */ Object peek() {
        return null;
    }

    public final /* bridge */ /* synthetic */ void put(Object obj) {
        Runnable runnable = (Runnable) obj;
    }

    public final int remainingCapacity() {
        return 0;
    }

    public final int size() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj, long j, TimeUnit timeUnit) {
        Runnable runnable = (Runnable) obj;
        return false;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        try {
            return take();
        } catch (InterruptedException e) {
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ Object poll(long j, TimeUnit timeUnit) {
        return take();
    }
}
