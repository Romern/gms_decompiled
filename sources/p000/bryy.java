package p000;

import java.nio.charset.Charset;

/* renamed from: bryy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bryy {

    /* renamed from: a */
    public static final bptw f143701a;

    /* renamed from: b */
    private static final Charset f143702b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final brzc f143703c;

    /* renamed from: d */
    private final brzf f143704d;

    static {
        bxvd da = bptw.f139192c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bptw bptw = (bptw) da.f164949b;
        bptw.f139194a |= 1;
        bptw.f139195b = 0;
        bptw.m112278a(bptw);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bptw.m112279b((bptw) da.f164949b);
        f143701a = (bptw) da.mo74062i();
    }

    public bryy(String str, String str2) {
        bxvd da = brzc.f143712e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brzc brzc = (brzc) da.f164949b;
        str.getClass();
        int i = brzc.f143714a | 2;
        brzc.f143714a = i;
        brzc.f143716c = str;
        int i2 = i | 1;
        brzc.f143714a = i2;
        brzc.f143715b = 201515033;
        str2.getClass();
        brzc.f143714a = i2 | 4;
        brzc.f143717d = str2;
        this.f143703c = (brzc) da.mo74062i();
        bxvd da2 = brzf.f143727c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        brzf brzf = (brzf) da2.f164949b;
        brzf.f143730b = 3;
        brzf.f143729a |= 1;
        this.f143704d = (brzf) da2.mo74062i();
    }

    /* renamed from: a */
    public static String m114909a(bnsw bnsw) {
        bntk g = bnsw.mo68442g();
        if (g != null) {
            return g.f132133b;
        }
        Object i = bnsw.mo68444i();
        if (i instanceof String) {
            return (String) i;
        }
        return i != null ? i.getClass().getName() : "null";
    }

    /* renamed from: b */
    public static int m114910b(bnsw bnsw) {
        return bnzi.m110896a().mo68721a(m114909a(bnsw), f143702b).mo68741c();
    }

    /* renamed from: a */
    public final bxvd mo70092a(bpwj bpwj, Object... objArr) {
        bxvd da = brzd.f143718f.mo74144da();
        bxvd da2 = brzb.f143707d.mo74144da();
        brzc brzc = this.f143703c;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        brzb brzb = (brzb) da2.f164949b;
        brzc.getClass();
        brzb.f143710b = brzc;
        int i = brzb.f143709a | 1;
        brzb.f143709a = i;
        brzf brzf = this.f143704d;
        brzf.getClass();
        brzb.f143711c = brzf;
        brzb.f143709a = i | 2;
        brzb brzb2 = (brzb) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brzd brzd = (brzd) da.f164949b;
        brzb2.getClass();
        brzd.f143721b = brzb2;
        int i2 = brzd.f143720a | 1;
        brzd.f143720a = i2;
        bpwj.getClass();
        brzd.f143722c = bpwj;
        brzd.f143720a = i2 | 2;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj instanceof bryx) {
                bryx bryx = (bryx) obj;
                int i4 = bryx.f143699a;
                bxvd da3 = brzh.f143735d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                brzh brzh = (brzh) da3.f164949b;
                brzh.f143737a |= 1;
                brzh.f143738b = i3;
                String bryx2 = bryx.toString();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                brzh brzh2 = (brzh) da3.f164949b;
                bryx2.getClass();
                brzh2.f143737a |= 2;
                brzh2.f143739c = bryx2;
                brzh brzh3 = (brzh) da3.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                brzd brzd2 = (brzd) da.f164949b;
                brzh3.getClass();
                if (!brzd2.f143724e.mo73666a()) {
                    brzd2.f143724e = bxvk.m124021a(brzd2.f143724e);
                }
                brzd2.f143724e.add(brzh3);
            }
        }
        return da;
    }
}
