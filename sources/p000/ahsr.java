package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahsr extends buqn {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f67954a;

    /* renamed from: b */
    final /* synthetic */ bmzi f67955b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahsr(String str, AtomicReference atomicReference, bmzi bmzi) {
        super(str);
        this.f67954a = atomicReference;
        this.f67955b = bmzi;
    }

    public final void run() {
        this.f67954a.set(this.f67955b.mo6606a());
    }
}
