package p000;

import java.util.List;

/* renamed from: gxx */
final /* synthetic */ class gxx implements C0038ax {

    /* renamed from: a */
    private final gyc f19203a;

    public gxx(gyc gyc) {
        this.f19203a = gyc;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        gyc gyc = this.f19203a;
        List list = (List) obj;
        gyc.f19212c.mo12441a(bnfi.m109235a(list).mo67501a(new gxz(gyc)).mo67505b());
        qws qws = gyc.f19214e;
        bxvd da = bong.f133782r.mo74144da();
        String str = gyc.f19211b.f19321j;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong = (bong) da.f164949b;
        str.getClass();
        int i = bong.f133784a | 2;
        bong.f133784a = i;
        bong.f133786c = str;
        bong.f133785b = 10;
        bong.f133784a = i | 1;
        bxvd da2 = bomv.f133724b.mo74144da();
        bngx b = bnfi.m109235a(list).mo67501a(gya.f19208a).mo67505b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bomv bomv = (bomv) da2.f164949b;
        if (!bomv.f133726a.mo73666a()) {
            bomv.f133726a = bxvk.m124021a(bomv.f133726a);
        }
        bxsy.m123078a(b, bomv.f133726a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong2 = (bong) da.f164949b;
        bomv bomv2 = (bomv) da2.mo74062i();
        bomv2.getClass();
        bong2.f133794k = bomv2;
        bong2.f133784a |= 512;
        qws.mo24333a(da.mo74062i()).mo24327b();
        gyc.f19213d.getViewTreeObserver().addOnGlobalLayoutListener(new gyb(gyc));
    }
}
