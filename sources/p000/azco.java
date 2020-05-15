package p000;

import android.content.Context;
import java.util.concurrent.ConcurrentMap;

/* renamed from: azco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azco {

    /* renamed from: a */
    private final Context f98999a;

    /* renamed from: b */
    private final ConcurrentMap f99000b = bnmt.m109809c();

    public azco(Context context) {
        this.f98999a = context;
    }

    /* renamed from: a */
    public final synchronized bdae mo54682a(long j) {
        ConcurrentMap concurrentMap = this.f99000b;
        Long valueOf = Long.valueOf(j);
        if (concurrentMap.containsKey(valueOf)) {
            return (bdae) this.f99000b.get(valueOf);
        }
        azcn azcn = new azcn(this.f98999a, j);
        return (bdae) bmxv.m108567c((bdae) this.f99000b.putIfAbsent(valueOf, azcn)).mo66812a(azcn);
    }
}
