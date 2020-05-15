package p000;

import android.os.Handler;

/* renamed from: ozx */
final /* synthetic */ class ozx implements Runnable {

    /* renamed from: a */
    private final pad f38687a;

    public ozx(pad pad) {
        this.f38687a = pad;
    }

    public final void run() {
        pad pad = this.f38687a;
        if (pad.f38704l == 1) {
            pad.f38704l = 3;
            pam pam = pad.f38703k;
            bnsn bnsn = pam.f38717a;
            pam.f38718b.unbindService(pad);
            pam pam2 = pad.f38703k;
            Handler handler = pam2.f38720d;
            nov nov = pam2.f38724h;
            nov.getClass();
            handler.post(new pac(nov));
        }
    }
}
