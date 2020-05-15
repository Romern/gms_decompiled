package p000;

/* renamed from: bhxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhxs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhxn f119840a;

    /* renamed from: b */
    final /* synthetic */ long f119841b;

    /* renamed from: c */
    final /* synthetic */ bhxt f119842c;

    public bhxs(bhxt bhxt, bhxn bhxn, long j) {
        this.f119842c = bhxt;
        this.f119840a = bhxn;
        this.f119841b = j;
    }

    public final void run() {
        bhxt bhxt = this.f119842c;
        new bhyc(bhxt.f119846d, this.f119840a, bhxt.f119845c, this.f119841b).mo64410b();
    }
}
