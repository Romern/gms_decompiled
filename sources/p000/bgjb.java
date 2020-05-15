package p000;

/* renamed from: bgjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgjb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bgjc f116583a;

    public bgjb(bgjc bgjc) {
        this.f116583a = bgjc;
    }

    public final void run() {
        synchronized (this.f116583a.f116584a) {
            bgje bgje = this.f116583a.f116584a;
            if (bgje.f116586b != null) {
                bgje.mo62883c(3);
                this.f116583a.f116584a.f116586b = null;
            }
        }
    }
}
