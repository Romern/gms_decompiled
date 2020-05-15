package p000;

import java.util.List;

/* renamed from: bfxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxg extends bfxk {

    /* renamed from: b */
    private final C1245ok f115584b;

    /* renamed from: c */
    private final bfyi f115585c;

    /* renamed from: d */
    private final C1223np f115586d = new C1223np();

    /* renamed from: e */
    private final bxvd f115587e = bfxt.f115618d.mo74144da();

    public bfxg(int i, int i2, boolean z, List list, C1245ok okVar, bfyi bfyi) {
        super(i);
        bxvd bxvd = this.f115587e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((bfxt) bxvd.f164949b).f115620a = i2 - 2;
        ((bfxt) bxvd.f164949b).f115621b = z;
        this.f115584b = okVar;
        this.f115585c = bfyi;
        bfxk.m98143a(list, this.f115586d);
    }

    /* renamed from: a */
    public final bfxw mo62420a() {
        bxvd bxvd = this.f115587e;
        bfxr a = bfxk.m98142a(this.f115584b, this.f115585c, this.f115586d);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bfxt bfxt = bfxt.f115618d;
        a.getClass();
        ((bfxt) bxvd.f164949b).f115622c = a;
        bxvd bxvd2 = this.f115591a;
        bxvd bxvd3 = this.f115587e;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bfxw bfxw = (bfxw) bxvd2.f164949b;
        bfxt bfxt2 = (bfxt) bxvd3.mo74062i();
        bfxw bfxw2 = bfxw.f115630e;
        bfxt2.getClass();
        bfxw.f115633b = bfxt2;
        bfxw.f115632a = 4;
        return (bfxw) this.f115591a.mo74062i();
    }
}
