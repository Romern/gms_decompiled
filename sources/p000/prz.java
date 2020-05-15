package p000;

import java.util.TimerTask;

/* renamed from: prz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class prz extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ psd f40125a;

    public prz(psd psd) {
        this.f40125a = psd;
    }

    public final void run() {
        rke rke;
        psd psd = this.f40125a;
        if (!psd.f40135h.isEmpty() && psd.f40136i == null && psd.f40129b != 0) {
            psx psx = psd.f40130c;
            int[] a = ptk.m31237a(psd.f40135h);
            sdo.m34967a("Must be called from the main thread.");
            if (!psx.mo23622e()) {
                rke = psx.mo23623f();
            } else {
                psh psh = new psh(psx, a);
                psx.mo23618a(psh);
                rke = psh;
            }
            psd.f40136i = rke;
            psd.f40136i.mo9458a(new pry(psd));
            psd.f40135h.clear();
        }
    }
}
