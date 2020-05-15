package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akge */
final /* synthetic */ class akge implements Runnable {

    /* renamed from: a */
    private final akgf f71856a;

    /* renamed from: b */
    private final ShareTarget f71857b;

    public akge(akgf akgf, ShareTarget shareTarget) {
        this.f71856a = akgf;
        this.f71857b = shareTarget;
    }

    public final void run() {
        akgf akgf = this.f71856a;
        akgf.f71860c.mo39429s(this.f71857b);
    }
}
