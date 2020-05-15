package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bnax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnax extends bnah {

    /* renamed from: b */
    final /* synthetic */ bncb f131328b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnax(bncb bncb, ConcurrentMap concurrentMap) {
        super(concurrentMap);
        this.f131328b = bncb;
    }

    public final boolean contains(Object obj) {
        return this.f131304a.containsKey(obj);
    }

    public final Iterator iterator() {
        return new bnaw(this.f131328b);
    }

    public final boolean remove(Object obj) {
        return this.f131304a.remove(obj) != null;
    }
}
