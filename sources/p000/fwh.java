package p000;

/* renamed from: fwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fwh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ fwo f17436a;

    public fwh(fwo fwo) {
        this.f17436a = fwo;
    }

    public final void run() {
        fyt fyt = this.f17436a.f17480s;
        if (fyt.f17660c == null || !fyt.f17661d.isShown()) {
            fyt.f17659b.mo11464d();
            return;
        }
        fyt.f17661d.fullScroll(130);
        fyt.f17660c.mo11464d();
    }
}
