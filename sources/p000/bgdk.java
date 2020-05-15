package p000;

import android.app.PendingIntent;

/* renamed from: bgdk */
final /* synthetic */ class bgdk implements Runnable {

    /* renamed from: a */
    private final bgdo f116125a;

    /* renamed from: b */
    private final bgbs f116126b;

    /* renamed from: c */
    private final PendingIntent f116127c;

    /* renamed from: d */
    private final Object f116128d;

    /* renamed from: e */
    private final boolean f116129e;

    /* renamed from: f */
    private final bhcv f116130f;

    /* renamed from: g */
    private final String f116131g;

    /* renamed from: h */
    private final rnt f116132h;

    public bgdk(bgdo bgdo, bgbs bgbs, PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, rnt rnt) {
        this.f116125a = bgdo;
        this.f116126b = bgbs;
        this.f116127c = pendingIntent;
        this.f116128d = obj;
        this.f116129e = z;
        this.f116130f = bhcv;
        this.f116131g = str;
        this.f116132h = rnt;
    }

    public final void run() {
        bgdo bgdo = this.f116125a;
        this.f116126b.mo62609a(bgdo.f116145a, bgdo.mo62683d(), this.f116127c, this.f116128d, this.f116129e, this.f116130f, this.f116131g, this.f116132h, bgdo.f116153j);
    }
}
