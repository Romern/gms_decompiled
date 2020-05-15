package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfa */
final /* synthetic */ class akfa implements Runnable {

    /* renamed from: a */
    private final akgy f71771a;

    /* renamed from: b */
    private final ahfi f71772b;

    /* renamed from: c */
    private final ShareTarget f71773c;

    public akfa(akgy akgy, ahfi ahfi, ShareTarget shareTarget) {
        this.f71771a = akgy;
        this.f71772b = ahfi;
        this.f71773c = shareTarget;
    }

    public final void run() {
        akgy akgy = this.f71771a;
        ahfi ahfi = this.f71772b;
        ShareTarget shareTarget = this.f71773c;
        ahfi.mo36396b();
        akgy.mo39429s(shareTarget);
    }
}
