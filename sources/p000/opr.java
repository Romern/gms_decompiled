package p000;

import android.view.animation.Animation;

/* renamed from: opr */
final /* synthetic */ class opr implements Runnable {

    /* renamed from: a */
    private final opt f38185a;

    /* renamed from: b */
    private final oos f38186b;

    /* renamed from: c */
    private final Animation f38187c;

    public opr(opt opt, oos oos, Animation animation) {
        this.f38185a = opt;
        this.f38186b = oos;
        this.f38187c = animation;
    }

    public final void run() {
        opt opt = this.f38185a;
        oos oos = this.f38186b;
        Animation animation = this.f38187c;
        opu opu = opt.f38191a;
        bnsn bnsn = opu.f38192a;
        opu.mo22503e(oos, animation);
    }
}
