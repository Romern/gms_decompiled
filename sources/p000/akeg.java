package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akeg */
final /* synthetic */ class akeg implements Runnable {

    /* renamed from: a */
    private final akgy f71730a;

    /* renamed from: b */
    private final akdd f71731b;

    /* renamed from: c */
    private final ajud f71732c;

    /* renamed from: d */
    private final String f71733d;

    /* renamed from: e */
    private final ShareTarget f71734e;

    public akeg(akgy akgy, akdd akdd, ajud ajud, String str, ShareTarget shareTarget) {
        this.f71730a = akgy;
        this.f71731b = akdd;
        this.f71732c = ajud;
        this.f71733d = str;
        this.f71734e = shareTarget;
    }

    public final void run() {
        akgy akgy = this.f71730a;
        akdd akdd = this.f71731b;
        akgy.mo39385a(new akfk(akgy, akdd, this.f71732c, this.f71733d, this.f71734e, akgy.mo39369a(akdd, ajnv.RESPONSE, cfov.m142032H())));
    }
}
