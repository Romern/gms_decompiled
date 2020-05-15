package p000;

import java.util.concurrent.Callable;

/* renamed from: nke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nke implements Callable {

    /* renamed from: a */
    final /* synthetic */ Callable f35884a;

    /* renamed from: b */
    final /* synthetic */ nkq f35885b;

    public nke(nkq nkq, Callable callable) {
        this.f35885b = nkq;
        this.f35884a = callable;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bnsn bnsn = nkq.f35898a;
        this.f35885b.mo20975m();
        nkq nkq = this.f35885b;
        nkq.f35913o.mo22280d();
        if (nkq.f35905g == null) {
            throw new IllegalStateException("CarNotConnected");
        } else if (!nkq.f35907i) {
            return (Boolean) this.f35884a.call();
        } else {
            throw new IllegalStateException("CarNotConnected");
        }
    }
}
