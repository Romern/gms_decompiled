package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajly */
final /* synthetic */ class ajly implements Callable {

    /* renamed from: a */
    private final ajmt f70889a;

    public ajly(ajmt ajmt) {
        this.f70889a = ajmt;
    }

    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService = this.f70889a.f70935c;
        Charset charset = NearbySharingChimeraService.f80888a;
        int i = 0;
        if (!nearbySharingChimeraService.mo44439d().getBoolean("opt_in", false)) {
            nearbySharingChimeraService.mo44439d().edit().putBoolean("opt_in", true).apply();
            nearbySharingChimeraService.mo44457v();
            ajvg ajvg = nearbySharingChimeraService.f80906r;
            bxvd d = ajvh.m59107d(2);
            if (d.f164950c) {
                d.mo74035c();
                d.f164950c = false;
            }
            bvgd bvgd = (bvgd) d.f164949b;
            bvgd bvgd2 = bvgd.f155960B;
            bvgd.f155965b = 1;
            bvgd.f155964a = 1 | bvgd.f155964a;
            bvfa bvfa = bvfa.f155837a;
            if (d.f164950c) {
                d.mo74035c();
                d.f164950c = false;
            }
            bvgd bvgd3 = (bvgd) d.f164949b;
            bvfa.getClass();
            bvgd3.f155966c = bvfa;
            bvgd3.f155964a |= 4;
            ajvg.mo38958a(new ajvb((bvgd) d.mo74062i()));
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("NearbySharing was opted in");
        } else {
            i = 35500;
        }
        return Integer.valueOf(i);
    }
}
