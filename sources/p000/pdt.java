package p000;

import android.content.Intent;

/* renamed from: pdt */
final /* synthetic */ class pdt implements Runnable {

    /* renamed from: a */
    private final pdu f38884a;

    /* renamed from: b */
    private final Intent f38885b;

    /* renamed from: c */
    private final Runnable f38886c;

    public pdt(pdu pdu, Intent intent, Runnable runnable) {
        this.f38884a = pdu;
        this.f38885b = intent;
        this.f38886c = runnable;
    }

    public final void run() {
        pdu pdu = this.f38884a;
        Intent intent = this.f38885b;
        Runnable runnable = this.f38886c;
        pdu.f38887a.mo22946a(intent);
        pdz pdz = pdu.f38887a;
        bnsn bnsn = pdz.f38896a;
        pdz.f38944u.removeCallbacks(runnable);
    }
}
