package p000;

import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avok extends avnn {

    /* renamed from: e */
    private final avmx f93628e = ((avmx) avmx.f93453h.mo51589b());

    public avok(avte avte) {
        super("pending", avte);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* renamed from: c */
    public final avni mo51435c() {
        SystemUpdateStatus d = this.f93628e.mo51414d();
        if (bmxx.m108577a(d.f109459a)) {
            this.f93628e.mo51402a(0, -1.0d);
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        } else if (!d.f109460b) {
            return new avni("pre-download-validate", avte.m79305a(new avtc[0]));
        } else {
            avtd a = avte.m79303a();
            a.mo51594a(avoj.f93623e, d.f109459a);
            return new avni("non-streaming-process-package", a.mo51593a());
        }
    }
}
