package p000;

import java.util.concurrent.FutureTask;

/* renamed from: bhre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhre implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FutureTask f119370a;

    /* renamed from: b */
    final /* synthetic */ bhri f119371b;

    public bhre(bhri bhri, FutureTask futureTask) {
        this.f119371b = bhri;
        this.f119370a = futureTask;
    }

    public final void run() {
        this.f119371b.mo64184a((Runnable) this.f119370a);
    }
}
