package p000;

import android.content.Context;

/* renamed from: atfm */
final /* synthetic */ class atfm implements Runnable {

    /* renamed from: a */
    private final atfn f90243a;

    /* renamed from: b */
    private final Context f90244b;

    /* renamed from: c */
    private final brff f90245c;

    public atfm(atfn atfn, Context context, brff brff) {
        this.f90243a = atfn;
        this.f90244b = context;
        this.f90245c = brff;
    }

    public final void run() {
        atfn atfn = this.f90243a;
        Context context = this.f90244b;
        brff brff = this.f90245c;
        atfn.f90247b.f90251d.init(context);
        brff.mo69479a(atfn.f90247b.f90251d);
    }
}
