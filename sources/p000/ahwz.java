package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahwz extends buqn {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f68270a;

    /* renamed from: b */
    final /* synthetic */ bmzi f68271b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahwz(String str, AtomicReference atomicReference, bmzi bmzi) {
        super(str);
        this.f68270a = atomicReference;
        this.f68271b = bmzi;
    }

    public final void run() {
        this.f68270a.set(this.f68271b.mo6606a());
    }
}
