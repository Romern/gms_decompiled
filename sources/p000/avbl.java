package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: avbl */
final /* synthetic */ class avbl implements bmxj {

    /* renamed from: a */
    private final AtomicBoolean f92910a;

    public avbl(AtomicBoolean atomicBoolean) {
        this.f92910a = atomicBoolean;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avbn.a(java.util.concurrent.atomic.AtomicBoolean, boolean):void
     arg types: [java.util.concurrent.atomic.AtomicBoolean, int]
     candidates:
      avbn.a(boolean, android.util.SparseArray):void
      avav.a(int, boolean):void
      avbn.a(java.util.concurrent.atomic.AtomicBoolean, boolean):void */
    public final Object apply(Object obj) {
        List list = (List) obj;
        avbn.m78194a(this.f92910a, true);
        return list;
    }
}
