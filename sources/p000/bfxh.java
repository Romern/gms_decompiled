package p000;

import android.location.Location;

/* renamed from: bfxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxh extends bfxk {

    /* renamed from: b */
    private final bxvd f115588b;

    public bfxh(int i, Location location, int i2) {
        super(i);
        bxvd da = bfxu.f115623c.mo74144da();
        this.f115588b = da;
        bgow a = bvzl.m121626a(location);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bfxu bfxu = (bfxu) da.f164949b;
        a.getClass();
        bfxu.f115625a = a;
        bfxu.f115626b = i2 - 2;
    }

    /* renamed from: a */
    public final bfxw mo62420a() {
        bxvd bxvd = this.f115591a;
        bxvd bxvd2 = this.f115588b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bfxw bfxw = (bfxw) bxvd.f164949b;
        bfxu bfxu = (bfxu) bxvd2.mo74062i();
        bfxw bfxw2 = bfxw.f115630e;
        bfxu.getClass();
        bfxw.f115633b = bfxu;
        bfxw.f115632a = 5;
        return (bfxw) this.f115591a.mo74062i();
    }
}
