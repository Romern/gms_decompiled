package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfn */
final /* synthetic */ class akfn implements Runnable {

    /* renamed from: a */
    private final akgy f71809a;

    /* renamed from: b */
    private final akdd f71810b;

    /* renamed from: c */
    private final ajud f71811c;

    /* renamed from: d */
    private final ShareTarget f71812d;

    /* renamed from: e */
    private final akgq f71813e;

    /* renamed from: f */
    private final long f71814f;

    /* renamed from: g */
    private final String f71815g;

    public akfn(akgy akgy, akdd akdd, ajud ajud, ShareTarget shareTarget, akgq akgq, long j, String str) {
        this.f71809a = akgy;
        this.f71810b = akdd;
        this.f71811c = ajud;
        this.f71812d = shareTarget;
        this.f71813e = akgq;
        this.f71814f = j;
        this.f71815g = str;
    }

    public final void run() {
        this.f71809a.mo39379a(this.f71810b, this.f71811c, this.f71812d, this.f71813e, this.f71814f, this.f71815g);
    }
}
