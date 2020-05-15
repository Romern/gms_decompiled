package p000;

/* renamed from: bhxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhxr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f119838a;

    /* renamed from: b */
    final /* synthetic */ bhxt f119839b;

    public bhxr(bhxt bhxt, long j) {
        this.f119839b = bhxt;
        this.f119838a = j;
    }

    public final void run() {
        this.f119839b.mo64399a();
        bhxt bhxt = this.f119839b;
        new bhxt(bhxt.f119846d, bhxt.f119843a, bhxt.f119844b, bhxt.f119845c, this.f119838a).mo64401b();
    }
}
