package p000;

import android.location.Location;
import java.util.List;

/* renamed from: bfxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxf extends bfxk {

    /* renamed from: b */
    private final C1245ok f115580b;

    /* renamed from: c */
    private final bfyi f115581c;

    /* renamed from: d */
    private final C1223np f115582d = new C1223np();

    /* renamed from: e */
    private final bxvd f115583e = bfxp.f115598c.mo74144da();

    public bfxf(List list, Location location, C1245ok okVar, bfyi bfyi) {
        super(-1509023308);
        this.f115580b = okVar;
        this.f115581c = bfyi;
        bxvd bxvd = this.f115583e;
        bgow a = bvzl.m121626a(location);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        a.getClass();
        ((bfxp) bxvd.f164949b).f115601b = a;
        bfxk.m98143a(list, this.f115582d);
    }

    /* renamed from: a */
    public final bfxw mo62420a() {
        bxvd bxvd = this.f115583e;
        bfxr a = bfxk.m98142a(this.f115580b, this.f115581c, this.f115582d);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bfxp bfxp = bfxp.f115598c;
        a.getClass();
        ((bfxp) bxvd.f164949b).f115600a = a;
        bxvd bxvd2 = this.f115591a;
        bxvd bxvd3 = this.f115583e;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bfxw bfxw = (bfxw) bxvd2.f164949b;
        bfxp bfxp2 = (bfxp) bxvd3.mo74062i();
        bfxw bfxw2 = bfxw.f115630e;
        bfxp2.getClass();
        bfxw.f115633b = bfxp2;
        bfxw.f115632a = 3;
        return (bfxw) this.f115591a.mo74062i();
    }
}
