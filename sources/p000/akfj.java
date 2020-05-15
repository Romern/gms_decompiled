package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfj */
final /* synthetic */ class akfj implements Runnable {

    /* renamed from: a */
    private final akgy f71793a;

    /* renamed from: b */
    private final ahfi f71794b;

    /* renamed from: c */
    private final ShareTarget f71795c;

    public akfj(akgy akgy, ahfi ahfi, ShareTarget shareTarget) {
        this.f71793a = akgy;
        this.f71794b = ahfi;
        this.f71795c = shareTarget;
    }

    public final void run() {
        akgy akgy = this.f71793a;
        ahfi ahfi = this.f71794b;
        ShareTarget shareTarget = this.f71795c;
        ahfi.mo36396b();
        akgy.mo39429s(shareTarget);
    }
}
