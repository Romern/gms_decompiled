package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.concurrent.Callable;

/* renamed from: akeh */
final /* synthetic */ class akeh implements Callable {

    /* renamed from: a */
    private final akgy f71735a;

    /* renamed from: b */
    private final ShareTarget f71736b;

    public akeh(akgy akgy, ShareTarget shareTarget) {
        this.f71735a = akgy;
        this.f71736b = shareTarget;
    }

    public final Object call() {
        akgy akgy = this.f71735a;
        ShareTarget shareTarget = this.f71736b;
        if (akgy.f71957x != 2) {
            return 35511;
        }
        if (shareTarget.f81036i) {
            return Integer.valueOf(akgy.mo39404e(shareTarget));
        }
        return Integer.valueOf(akgy.mo39408g(shareTarget));
    }
}
