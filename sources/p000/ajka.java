package p000;

import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajka */
final /* synthetic */ class ajka implements Runnable {

    /* renamed from: a */
    private final ajkd f70776a;

    /* renamed from: b */
    private final ShareTarget f70777b;

    public ajka(ajkd ajkd, ShareTarget shareTarget) {
        this.f70776a = ajkd;
        this.f70777b = shareTarget;
    }

    public final void run() {
        int i;
        ajkd ajkd = this.f70776a;
        ShareTarget shareTarget = this.f70777b;
        NearbySharingChimeraService nearbySharingChimeraService = ajkd.f70783a;
        for (ajmx ajmx : nearbySharingChimeraService.f80901m.values()) {
            ajmx.f70944a.mo38707a(shareTarget);
        }
        if (!shareTarget.f81041n && nearbySharingChimeraService.f80911w.mo38804b(shareTarget) == null) {
            nearbySharingChimeraService.f80911w.mo38802a(shareTarget, "INTERNAL_PROVIDER_ID");
        }
        ajvg ajvg = nearbySharingChimeraService.f80906r;
        long elapsedRealtime = SystemClock.elapsedRealtime() - nearbySharingChimeraService.f80907s;
        if (!shareTarget.f81038k) {
            i = 4;
        } else {
            i = 3;
        }
        bxvd d = ajvh.m59107d(12);
        bxvd da = bvfg.f155859d.mo74144da();
        bxun a = bxzr.m124575a(elapsedRealtime);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfg bvfg = (bvfg) da.f164949b;
        a.getClass();
        bvfg.f155863c = a;
        bvfg.f155861a |= 2;
        da.mo74062i();
        bvga b = ajvh.m59105b(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfg bvfg2 = (bvfg) da.f164949b;
        b.getClass();
        bvfg2.f155862b = b;
        bvfg2.f155861a |= 1;
        bvfg bvfg3 = (bvfg) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfg3.getClass();
        bvgd.f155976m = bvfg3;
        bvgd.f155964a |= 4096;
        ajvg.mo38957a(new ajva((bvgd) d.mo74062i()));
    }
}
