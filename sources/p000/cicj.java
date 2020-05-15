package p000;

/* renamed from: cicj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cicj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ chst f189767a;

    /* renamed from: b */
    final /* synthetic */ chrg f189768b;

    /* renamed from: c */
    final /* synthetic */ cick f189769c;

    public cicj(cick cick, chst chst, chrg chrg) {
        this.f189769c = cick;
        this.f189767a = chst;
        this.f189768b = chrg;
    }

    public final void run() {
        cick cick = this.f189769c;
        cicv cicv = cick.f189771b;
        if (cick == cicv.f189843r) {
            cicv.mo85953a(this.f189767a);
            if (this.f189768b != chrg.SHUTDOWN) {
                this.f189769c.f189771b.f189807E.mo85553a(2, "Entering {0} state with picker: {1}", this.f189768b, this.f189767a);
                this.f189769c.f189771b.f189840o.mo85813a(this.f189768b);
            }
        }
    }
}
