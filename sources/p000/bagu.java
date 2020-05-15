package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bagu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bagu extends cazu {

    /* renamed from: b */
    private final cazn f100836b;

    /* renamed from: c */
    private final cazn f100837c;

    /* renamed from: d */
    private final cazn f100838d;

    public bagu(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(bagu.class), cijl);
        this.f100836b = cbac.m127643a(cazn);
        this.f100837c = cbac.m127643a(cazn2);
        this.f100838d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100836b.mo75201b(), this.f100837c.mo75201b(), this.f100838d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        byhs byhs;
        List list = (List) obj;
        bamm bamm = (bamm) list.get(0);
        bygv bygv = (bygv) list.get(1);
        ArrayList arrayList = new ArrayList();
        if (((babr) list.get(2)).mo32676H()) {
            bndu r = bndu.m109109r();
            bngx bngx = bamm.f101270a;
            int size = bngx.size();
            for (int i = 0; i < size; i++) {
                byhr byhr = (byhr) bngx.get(i);
                bxvd da = byhi.f166451f.mo74144da();
                ByteString bxtx = byhr.f166498c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byhi byhi = (byhi) da.f164949b;
                bxtx.getClass();
                int i2 = byhi.f166453a | 4;
                byhi.f166453a = i2;
                byhi.f166456d = bxtx;
                if ((byhr.f166496a & 4) != 0) {
                    ByteString bxtx2 = byhr.f166499d;
                    bxtx2.getClass();
                    byhi.f166453a = i2 | 2;
                    byhi.f166455c = bxtx2;
                }
                List a = r.mo67127c(byhr.f166499d);
                bxvd da2 = bygu.f166382e.mo74144da();
                byhq a2 = byhq.m124822a(byhr.f166497b);
                if (a2 == null) {
                    a2 = byhq.UNKNOWN;
                }
                bagq.m86858a(a2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bygu bygu = (bygu) da2.f164949b;
                bygu.f166387d = 4;
                bygu.f166384a |= 1;
                byhi byhi2 = (byhi) da.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bygu bygu2 = (bygu) da2.f164949b;
                byhi2.getClass();
                bygu2.f166386c = byhi2;
                bygu2.f166385b = 4;
                a.add((bygu) da2.mo74062i());
            }
            if (bygv.f166390a == 4) {
                byhs = (byhs) bygv.f166391b;
            } else {
                byhs = byhs.f166502c;
            }
            int i3 = byhs.f166505b;
            for (ByteString bxtx3 : r.mo67316o()) {
                List a3 = r.mo67127c(bxtx3);
                for (int max = Math.max(0, a3.size() - i3); max < a3.size(); max++) {
                    arrayList.add((bygu) a3.get(max));
                }
            }
        } else {
            bngx bngx2 = bamm.f101270a;
            int size2 = bngx2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                byhr byhr2 = (byhr) bngx2.get(i4);
                bxvd da3 = byhi.f166451f.mo74144da();
                ByteString bxtx4 = byhr2.f166498c;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byhi byhi3 = (byhi) da3.f164949b;
                bxtx4.getClass();
                int i5 = byhi3.f166453a | 4;
                byhi3.f166453a = i5;
                byhi3.f166456d = bxtx4;
                if ((byhr2.f166496a & 4) != 0) {
                    ByteString bxtx5 = byhr2.f166499d;
                    bxtx5.getClass();
                    byhi3.f166453a = i5 | 2;
                    byhi3.f166455c = bxtx5;
                }
                bxvd da4 = bygu.f166382e.mo74144da();
                byhq a4 = byhq.m124822a(byhr2.f166497b);
                if (a4 == null) {
                    a4 = byhq.UNKNOWN;
                }
                bagq.m86858a(a4);
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bygu bygu3 = (bygu) da4.f164949b;
                bygu3.f166387d = 4;
                bygu3.f166384a |= 1;
                byhi byhi4 = (byhi) da3.mo74062i();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bygu bygu4 = (bygu) da4.f164949b;
                byhi4.getClass();
                bygu4.f166386c = byhi4;
                bygu4.f166385b = 4;
                arrayList.add((bygu) da4.mo74062i());
            }
        }
        return bqga.m112775a((Object) arrayList);
    }
}
