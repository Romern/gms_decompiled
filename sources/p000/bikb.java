package p000;

/* renamed from: bikb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bikb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aelh f120765a;

    /* renamed from: b */
    final /* synthetic */ bikf f120766b;

    public bikb(bikf bikf, aelh aelh) {
        this.f120766b = bikf;
        this.f120765a = aelh;
    }

    public final void run() {
        if (this.f120766b.isVisible()) {
            bikf bikf = this.f120766b;
            bikf.f120774f = false;
            bikf.f120777i = null;
            bikf.mo64701a(this.f120765a);
        }
    }
}
