package p000;

import java.io.IOException;

/* renamed from: aijd */
final /* synthetic */ class aijd implements Runnable {

    /* renamed from: a */
    private final aije f68942a;

    /* renamed from: b */
    private final bqgy f68943b;

    public aijd(aije aije, bqgy bqgy) {
        this.f68942a = aije;
        this.f68943b = bqgy;
    }

    public final void run() {
        aije aije = this.f68942a;
        bqgy bqgy = this.f68943b;
        aipa c = aije.mo37571c();
        if (c == null) {
            bqgy.mo69136a((Throwable) new IOException());
        } else if (bqgy.isCancelled()) {
            ails.m57440a(c, "Bluetooth", aije.f68944a);
            bqgy.mo69136a((Throwable) new IOException());
        } else {
            bqgy.mo69138b(c);
        }
    }
}
