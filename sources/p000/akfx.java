package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfx */
final /* synthetic */ class akfx implements Runnable {

    /* renamed from: a */
    private final akgy f71840a;

    /* renamed from: b */
    private final ShareTarget f71841b;

    public akfx(akgy akgy, ShareTarget shareTarget) {
        this.f71840a = akgy;
        this.f71841b = shareTarget;
    }

    public final void run() {
        this.f71840a.mo39429s(this.f71841b);
    }
}
