package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: avbk */
final /* synthetic */ class avbk implements bqeh {

    /* renamed from: a */
    private final AtomicBoolean f92909a;

    public avbk(AtomicBoolean atomicBoolean) {
        this.f92909a = atomicBoolean;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avbn.a(java.util.concurrent.atomic.AtomicBoolean, boolean):void
     arg types: [java.util.concurrent.atomic.AtomicBoolean, int]
     candidates:
      avbn.a(boolean, android.util.SparseArray):void
      avav.a(int, boolean):void
      avbn.a(java.util.concurrent.atomic.AtomicBoolean, boolean):void */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Exception exc = (Exception) obj;
        avbn.m78194a(this.f92909a, false);
        throw exc;
    }
}
