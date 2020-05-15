package p000;

/* renamed from: bhtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhtl f119530a;

    public bhtd(bhtl bhtl) {
        this.f119530a = bhtl;
    }

    public final void run() {
        bhtl bhtl = this.f119530a;
        int i = bhtl.f119552c - 1;
        bhtl.f119552c = i;
        if (i == 0) {
            bhtl.f119553d = -1;
            bhtl.f119550a.mo64243b();
            bhtl.f119550a = null;
            bhtl.f119551b.mo64243b();
            bhtl.f119551b = null;
        }
        int i2 = bhtl.f119552c;
        if (i2 < 0) {
            i2 = 0;
        }
        bhtl.f119552c = i2;
    }
}
