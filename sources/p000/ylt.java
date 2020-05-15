package p000;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ylt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ylt implements Iterable {

    /* renamed from: a */
    private final ypv f54050a;

    /* renamed from: b */
    private final Iterable f54051b;

    /* renamed from: c */
    private final yhx f54052c;

    public ylt(ypv ypv, yhx yhx, Iterable iterable) {
        this.f54050a = ypv;
        this.f54052c = yhx;
        bmxy.m108581a(iterable);
        this.f54051b = iterable;
    }

    /* renamed from: a */
    public final yhu mo30600a(List list) {
        int i;
        long a = ((yhu) list.get(0)).mo30385a();
        long b = ((yhu) bnjd.m109595d(list)).mo30387b();
        if (!this.f54050a.mo30654a(8, (float) yfp.m43968b(list), yfp.m43969b(list, TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS)) {
            i = 7;
        } else {
            i = 8;
        }
        yht a2 = this.f54052c.mo30519a();
        yfm.m43953a(a2, a, b);
        a2.mo30506a(((yhu) list.get(0)).mo30511d());
        a2.mo30503a().mo30433a(i);
        return a2.mo30508c();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjr.b(java.util.Iterator, bmxz):bnrd
     arg types: [java.util.Iterator, yls]
     candidates:
      bnjr.b(java.util.Iterator, java.lang.Object):java.lang.Object
      bnjr.b(java.util.Iterator, bmxz):bnrd */
    public final Iterator iterator() {
        return new ylr(this, bnjr.m109617b(this.f54051b.iterator(), (bmxz) new yls(this.f54050a)));
    }
}
