package p000;

/* renamed from: chyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class chyf implements Runnable {

    /* renamed from: a */
    private final chrk f189511a;

    public chyf(chrk chrk) {
        this.f189511a = chrk;
    }

    /* renamed from: a */
    public abstract void mo85790a();

    public final void run() {
        chrk b = this.f189511a.mo85567b();
        try {
            mo85790a();
        } finally {
            this.f189511a.mo85566a(b);
        }
    }
}
