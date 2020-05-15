package p000;

import java.util.ArrayList;

/* renamed from: bgef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgef {

    /* renamed from: a */
    public bgee f116223a;

    /* renamed from: b */
    public bgee f116224b;

    /* renamed from: c */
    public boolean f116225c = false;

    /* renamed from: d */
    public boolean f116226d = false;

    /* renamed from: e */
    public final bgdy f116227e;

    /* renamed from: f */
    public final bfcn f116228f;

    /* renamed from: g */
    private final bgmo f116229g;

    /* renamed from: h */
    private final bhaz f116230h;

    /* renamed from: i */
    private final bgmk f116231i;

    public bgef(bgmo bgmo, bgmk bgmk, bhaz bhaz, bgdy bgdy, bfcn bfcn) {
        this.f116229g = bgmo;
        this.f116224b = null;
        this.f116223a = null;
        this.f116230h = bhaz;
        this.f116231i = bgmk;
        this.f116227e = bgdy;
        this.f116228f = bfcn;
    }

    /* renamed from: a */
    public final void mo62707a() {
        bukj bukj;
        bgee bgee = this.f116223a;
        bmxy.m108581a(bgee);
        bmxy.m108581a(bgee.f116220a);
        bfmu bfmu = bgee.f116220a;
        bgdy bgdy = this.f116227e;
        bgdy.f116204e.mo61864a();
        bulp bulp = bgdy.f116205f.f116209a.f153981a;
        bulp.f154171l = true;
        bsax bsax = new bsax(bgox.f117121ch);
        bsax bsax2 = new bsax(bgox.f117098bl);
        bulp.f154168i.mo72836b(bsax2);
        bsax bsax3 = new bsax(bgox.f117096bj);
        bsax3.mo70118b(1, bsax2);
        bsax.mo70118b(5, bsax3);
        bsax.mo70134g(4, (int) bulp.f154166g.proksConfig());
        bsax e = bsax.mo70129e(5).mo70129e(1);
        if (e.mo70137i(1)) {
            int i = bulp.f154170k;
            bulp.f154170k = Math.min(i + i, bulp.f154169j);
            bulp.f154173n = bulp.f154162c.mo62776c();
            buki buki = bulp.f154180u;
            if (buki.f154092e) {
                bukj = new bulg();
                buki.f154091d.mo72752a(bukj);
            } else {
                bukj = bule.f154133a;
            }
            bulp.f154181v = bukj;
            bulp.f154181v.mo72772a(bulp.f154162c.mo62775b());
            bulp.f154181v.mo72773a(e);
            bsax bsax4 = new bsax(bgox.f117041ah);
            bsax4.mo70118b(17, bsax);
            bfmu.mo61959a(bsax4, 4);
        } else {
            bulp.f154174o = bulp.f154162c.mo62776c();
        }
        if (bgdy.mo62699a()) {
            bgdw bgdw = bgdy.f116200a;
            if (bgdw.mo62693a()) {
                bmxy.m108581a(bgdw.f116186b);
                bubk bubk = ((bubi) bgdw.f116186b.f153219a).f153227b;
                bubk.f153234b = true;
                bubk.f153241i++;
                bsax bsax5 = new bsax(bgox.f117121ch);
                bsax bsax6 = new bsax(bgox.f116989I);
                bubl bubl = bubk.f153237e.f153226a;
                String str = bubl.f153251f;
                if (str != null) {
                    bsax6.mo70107a(1, str);
                    String str2 = bubl.f153251f;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 39);
                    sb.append("Adding missing Cell ID Key: ");
                    sb.append(str2);
                    sb.append(" in request");
                    sb.toString();
                }
                bsax bsax7 = new bsax(bgox.f116981A);
                bsax7.mo70118b(1, bsax6);
                bsax5.mo70118b(6, bsax7);
                if (bsax5.mo70129e(6).mo70129e(1).mo70137i(1)) {
                    int i2 = bubk.f153240h;
                    bubk.f153240h = Math.min(i2 + i2, 180000);
                    bubk.f153235c = bubk.f153238f.mo62775b();
                    bubk.f153242j++;
                    bubk.f153237e.f153229d.f153210f++;
                    bubk.f153245m = bubk.f153238f.mo62775b();
                    bsax bsax8 = new bsax(bgox.f117041ah);
                    bsax8.mo70118b(17, bsax5);
                    bfmu.mo61959a(bsax8, 2);
                }
            }
        }
        bsax bsax9 = new bsax(bgox.f117045al);
        ArrayList arrayList = bfmu.f114428a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            bsax bsax10 = (bsax) arrayList.get(i3);
            bsax10.mo70134g(10, 0);
            bsax9.mo70107a(4, bsax10);
        }
        bfmu.mo61957a();
        this.f116230h.mo63512a(this.f116231i, bsax9);
        this.f116229g.mo62892a(bsax9, bfmu.f114430c, bgee.f116221b, new bged(this, bgee, bsax9));
    }

    /* renamed from: a */
    public final void mo62708a(bfmu bfmu, bgmj bgmj, bgec bgec) {
        bgee bgee = new bgee(bfmu, bgmj, bgec);
        if (this.f116223a == null) {
            this.f116223a = bgee;
            mo62707a();
            return;
        }
        this.f116224b = bgee;
    }
}
