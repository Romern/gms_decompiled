package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfh */
final /* synthetic */ class akfh implements Runnable {

    /* renamed from: a */
    private final akgy f71788a;

    /* renamed from: b */
    private final ahfi f71789b;

    /* renamed from: c */
    private final ShareTarget f71790c;

    public akfh(akgy akgy, ahfi ahfi, ShareTarget shareTarget) {
        this.f71788a = akgy;
        this.f71789b = ahfi;
        this.f71790c = shareTarget;
    }

    public final void run() {
        akgy akgy = this.f71788a;
        ahfi ahfi = this.f71789b;
        ShareTarget shareTarget = this.f71790c;
        ahfi.mo36396b();
        akgy.mo39429s(shareTarget);
    }
}
