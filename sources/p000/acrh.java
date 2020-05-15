package p000;

import android.os.SystemClock;

/* renamed from: acrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acrh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ abrv f60605a;

    /* renamed from: b */
    final /* synthetic */ acri f60606b;

    public acrh(acri acri, abrv abrv) {
        this.f60606b = acri;
        this.f60605a = abrv;
    }

    public final void run() {
        if (!this.f60605a.mo32320d()) {
            SystemClock.sleep(600000);
            synchronized (this.f60606b.f60608a) {
                acri acri = this.f60606b;
                if (acri.f60611d == this.f60605a) {
                    acri.f60611d = null;
                }
            }
            this.f60605a.mo32332o();
        }
    }
}
