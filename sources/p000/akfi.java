package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfi */
final /* synthetic */ class akfi implements Runnable {

    /* renamed from: a */
    private final akgy f71791a;

    /* renamed from: b */
    private final ShareTarget f71792b;

    public akfi(akgy akgy, ShareTarget shareTarget) {
        this.f71791a = akgy;
        this.f71792b = shareTarget;
    }

    public final void run() {
        this.f71791a.mo39429s(this.f71792b);
    }
}
