package p000;

import com.google.android.cast.JGCastService;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlf */
final /* synthetic */ class ajlf implements Callable {

    /* renamed from: a */
    private final ajmt f70846a;

    /* renamed from: b */
    private final SetDataUsageParams f70847b;

    public ajlf(ajmt ajmt, SetDataUsageParams setDataUsageParams) {
        this.f70846a = ajmt;
        this.f70847b = setDataUsageParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70846a;
        SetDataUsageParams setDataUsageParams = this.f70847b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        int i = setDataUsageParams.f81124a;
        Charset charset = NearbySharingChimeraService.f80888a;
        int l = nearbySharingChimeraService.mo44447l();
        int i2 = 0;
        if (l == i) {
            i2 = 35500;
        } else if (i == 1 || i == 2 || i == 3) {
            nearbySharingChimeraService.mo44439d().edit().putInt("data_usage", i).apply();
            ajvg ajvg = nearbySharingChimeraService.f80906r;
            bxvd d = ajvh.m59107d(29);
            bxvd da = bvfy.f155938d.mo74144da();
            int c = ajvh.m59106c(l);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvfy bvfy = (bvfy) da.f164949b;
            bvfy.f155941b = c - 1;
            bvfy.f155940a |= 1;
            int c2 = ajvh.m59106c(i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvfy bvfy2 = (bvfy) da.f164949b;
            bvfy2.f155942c = c2 - 1;
            bvfy2.f155940a |= 2;
            if (d.f164950c) {
                d.mo74035c();
                d.f164950c = false;
            }
            bvgd bvgd = (bvgd) d.f164949b;
            bvfy bvfy3 = (bvfy) da.mo74062i();
            bvgd bvgd2 = bvgd.f155960B;
            bvfy3.getClass();
            bvgd.f155989z = bvfy3;
            bvgd.f155964a |= JGCastService.FLAG_PRIVATE_DISPLAY;
            ajvg.mo38958a(new ajvb((bvgd) d.mo74062i()));
            ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Data usage preference state changed to %s", nearbySharingChimeraService.mo44436c(i));
            nearbySharingChimeraService.mo44442g();
            nearbySharingChimeraService.mo44457v();
        } else {
            ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("Invalid Data Usage Preference. Refer to SharingClient to see all valid cases.");
            i2 = 13;
        }
        return Integer.valueOf(i2);
    }
}
