package p000;

import android.view.animation.Animation;

/* renamed from: ops */
final /* synthetic */ class ops implements Runnable {

    /* renamed from: a */
    private final opt f38188a;

    /* renamed from: b */
    private final oos f38189b;

    /* renamed from: c */
    private final Animation f38190c;

    public ops(opt opt, oos oos, Animation animation) {
        this.f38188a = opt;
        this.f38189b = oos;
        this.f38190c = animation;
    }

    public final void run() {
        opt opt = this.f38188a;
        oos oos = this.f38189b;
        Animation animation = this.f38190c;
        opu opu = opt.f38191a;
        bnsn bnsn = opu.f38192a;
        opu.mo22502d(oos, animation);
    }
}
