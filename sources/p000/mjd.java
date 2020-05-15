package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: mjd */
final /* synthetic */ class mjd implements Runnable {

    /* renamed from: a */
    private final mje f33815a;

    /* renamed from: b */
    private final Exception f33816b;

    public mjd(mje mje, Exception exc) {
        this.f33815a = mje;
        this.f33816b = exc;
    }

    public final void run() {
        int i;
        mje mje = this.f33815a;
        Exception exc = this.f33816b;
        if (exc instanceof rjp) {
            i = ((rjp) exc).mo24655a();
        } else {
            i = Status.f30109c.f30115i;
        }
        mje.mo20092a(i, exc.getMessage());
    }
}
