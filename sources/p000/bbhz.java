package p000;

import android.util.Pair;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bbhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbhz extends cazu {

    /* renamed from: b */
    private final bbho f102683b;

    /* renamed from: c */
    private final cazn f102684c;

    /* renamed from: d */
    private final cazn f102685d;

    /* renamed from: e */
    private final cazn f102686e;

    public bbhz(bbho bbho, cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(bbhz.class), cijl);
        this.f102683b = bbho;
        this.f102684c = cbac.m127643a(cazn);
        this.f102685d = cbac.m127643a(cazn2);
        this.f102686e = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f102684c.mo75201b(), this.f102685d.mo75201b(), this.f102686e.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        chtv chtv;
        List list = (List) obj;
        bbho bbho = this.f102683b;
        Pair pair = (Pair) bbho.f102661a.f102663b.mo6606a();
        byfq byfq = (byfq) ((byfq) ((byfq) ciih.m150373a(new byfp(), (chqp) list.get(0))).mo86138a((chqm) list.get(1))).mo86137a(((Long) pair.first).longValue(), (TimeUnit) pair.second);
        bxvd da = byft.f166062d.mo74144da();
        for (bxtx bxtx : (Iterable) list.get(2)) {
            bxvd da2 = byfs.f166058c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byfs byfs = (byfs) da2.f164949b;
            bxtx.getClass();
            byfs.f166060a |= 1;
            byfs.f166061b = bxtx;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byft byft = (byft) da.f164949b;
            byfs byfs2 = (byfs) da2.mo74062i();
            byfs2.getClass();
            if (!byft.f166065b.mo73666a()) {
                byft.f166065b = bxvk.m124021a(byft.f166065b);
            }
            byft.f166065b.add(byfs2);
        }
        bxvd da3 = byfw.f166076c.mo74144da();
        String str = bbho.f102661a.f102666e;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byfw byfw = (byfw) da3.f164949b;
        str.getClass();
        byfw.f166078a |= 1;
        byfw.f166079b = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byft byft2 = (byft) da.f164949b;
        byfw byfw2 = (byfw) da3.mo74062i();
        byfw2.getClass();
        byft2.f166066c = byfw2;
        byft2.f166064a |= 1;
        byft byft3 = (byft) da.mo74062i();
        chqp chqp = byfq.f190402a;
        chtv chtv2 = byfr.f166057a;
        if (chtv2 == null) {
            synchronized (byfr.class) {
                chtv = byfr.f166057a;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("mdi.InfiniteData", "Lookup");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(byft.f166062d);
                    a.f189139b = ciie.m150370a(byfu.f166067b);
                    chtv = a.mo85658a();
                    byfr.f166057a = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, byfq.f190403b), byft3);
    }
}
