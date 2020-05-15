package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: aked */
final /* synthetic */ class aked implements Runnable {

    /* renamed from: a */
    private final akgy f71711a;

    /* renamed from: b */
    private final akgo f71712b;

    /* renamed from: c */
    private final String f71713c;

    /* renamed from: d */
    private final ShareTarget f71714d;

    /* renamed from: e */
    private final ajud f71715e;

    public aked(akgy akgy, akgo akgo, String str, ShareTarget shareTarget, ajud ajud) {
        this.f71711a = akgy;
        this.f71712b = akgo;
        this.f71713c = str;
        this.f71714d = shareTarget;
        this.f71715e = ajud;
    }

    public final void run() {
        boolean z;
        akgy akgy = this.f71711a;
        akgo akgo = this.f71712b;
        String str = this.f71713c;
        ShareTarget shareTarget = this.f71714d;
        ajud ajud = this.f71715e;
        if (ahhf.m55778c("DiscoveryCancellationRunnable", akgo.f71888a, cfov.m142058k()) != null) {
            z = true;
        } else {
            z = false;
        }
        akgy.mo39385a(new akfo(akgy, z, str, shareTarget, ajud));
    }
}
