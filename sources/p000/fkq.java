package p000;

/* renamed from: fkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fkq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ fno f16808a;

    /* renamed from: b */
    final /* synthetic */ fks f16809b;

    public fkq(fks fks, fno fno) {
        this.f16809b = fks;
        this.f16808a = fno;
    }

    public final void run() {
        if (!this.f16809b.f16814c.mo10970b()) {
            this.f16809b.f16814c.mo10937e("Connected to service after a timeout");
            fkt fkt = this.f16809b.f16814c;
            fno fno = this.f16808a;
            fje.m11804a();
            fkt.f16816b = fno;
            fkt.mo10971c();
            fkh k = fkt.mo10946k();
            fje.m11804a();
            k.f16778a.mo10993b();
        }
    }
}
