package p000;

import java.util.List;

/* renamed from: baly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baly extends cazu {

    /* renamed from: b */
    private final cijl f101238b;

    /* renamed from: c */
    private final cazn f101239c;

    /* renamed from: d */
    private final cazn f101240d;

    /* renamed from: e */
    private final cazn f101241e;

    /* renamed from: f */
    private final cazn f101242f;

    /* renamed from: g */
    private final cazn f101243g;

    /* renamed from: h */
    private final cazn f101244h;

    public baly(cijl cijl, cijl cijl2, cijl cijl3, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6) {
        super(cijl2, cbag.m127657a(baly.class), cijl);
        this.f101238b = cijl3;
        this.f101239c = cbac.m127643a(cazn);
        this.f101240d = cbac.m127643a(cazn2);
        this.f101241e = cbac.m127643a(cazn3);
        this.f101242f = cbac.m127643a(cazn4);
        this.f101243g = cbac.m127643a(cazn5);
        this.f101244h = cbac.m127643a(cazn6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101239c.mo75201b(), this.f101240d.mo75201b(), this.f101241e.mo75201b(), this.f101242f.mo75201b(), this.f101243g.mo75201b(), this.f101244h.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        chtv chtv;
        List list = (List) obj;
        cayx.m127580b(this.f101238b);
        byik byik = (byik) list.get(0);
        String str = (String) list.get(1);
        String str2 = (String) list.get(2);
        String str3 = (String) list.get(3);
        byie byie = (byie) list.get(4);
        List list2 = (List) list.get(5);
        bxvd da = byiv.f166609h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byiv byiv = (byiv) da.f164949b;
        str.getClass();
        byiv.f166612b = 2;
        byiv.f166613c = str;
        str2.getClass();
        int i = byiv.f166611a | 4;
        byiv.f166611a = i;
        byiv.f166614d = str2;
        str3.getClass();
        byiv.f166611a = i | 8;
        byiv.f166615e = str3;
        ByteString aL = byie.mo73639aL();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byiv byiv2 = (byiv) da.f164949b;
        aL.getClass();
        byiv2.f166611a |= 16;
        byiv2.f166616f = aL;
        if (!byiv2.f166617g.mo73666a()) {
            byiv2.f166617g = GeneratedMessageLite.m124021a(byiv2.f166617g);
        }
        bxsy.m123078a(list2, byiv2.f166617g);
        byiv byiv3 = (byiv) da.mo74062i();
        chqp chqp = byik.f190402a;
        chtv chtv2 = byil.f166573d;
        if (chtv2 == null) {
            synchronized (byil.class) {
                chtv = byil.f166573d;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("search.mdh.MobileDataHubCore", "SetUpNotifications");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(byiv.f166609h);
                    a.f189139b = ciie.m150370a(byiw.f166618a);
                    chtv = a.mo85658a();
                    byil.f166573d = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, byik.f190403b), byiv3);
    }
}
