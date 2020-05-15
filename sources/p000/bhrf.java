package p000;

import java.util.concurrent.FutureTask;

/* renamed from: bhrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhrf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FutureTask f119372a;

    /* renamed from: b */
    final /* synthetic */ bhri f119373b;

    public bhrf(bhri bhri, FutureTask futureTask) {
        this.f119373b = bhri;
        this.f119372a = futureTask;
    }

    public final void run() {
        this.f119373b.mo64184a((Runnable) this.f119372a);
    }
}
