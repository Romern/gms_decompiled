package p000;

import android.content.Context;

/* renamed from: atfj */
final /* synthetic */ class atfj implements Runnable {

    /* renamed from: a */
    private final atfk f90235a;

    /* renamed from: b */
    private final Context f90236b;

    /* renamed from: c */
    private final brff f90237c;

    public atfj(atfk atfk, Context context, brff brff) {
        this.f90235a = atfk;
        this.f90236b = context;
        this.f90237c = brff;
    }

    public final void run() {
        atfk atfk = this.f90235a;
        Context context = this.f90236b;
        brff brff = this.f90237c;
        atfk.f90239b.f90250c.init(context);
        brff.mo69479a(atfk.f90239b.f90250c);
    }
}
