package p000;

import java.util.Map;

/* renamed from: atdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdm implements atcl {
    /* renamed from: a */
    public static final btlc m75640a(askf askf, btiy btiy, String str, byte[] bArr, String str2) {
        bxvd da = btlb.f149338e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btiy.getClass();
        ((btlb) da.f164949b).f149340a = btiy;
        bxtx a = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btlb btlb = (btlb) da.f164949b;
        a.getClass();
        btlb.f149341b = a;
        str.getClass();
        btlb.f149342c = str;
        if (str2 != null) {
            str2.getClass();
            btlb.f149343d = str2;
        }
        return (btlc) atff.m75760a(askf, "e/cardtokenization/getpaymentbundle", da.mo74062i(), btlc.f149344e, (Map) null);
    }

    /* renamed from: a */
    public static final void m75641a(askf askf, btiy btiy, String str, byte[] bArr, btjw btjw, int i) {
        bxvd da = btjr.f149168f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btjr btjr = (btjr) da.f164949b;
        btjw.getClass();
        btjr.f149172c = btjw;
        btiy.getClass();
        btjr.f149170a = btiy;
        bxtx a = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btjr btjr2 = (btjr) da.f164949b;
        a.getClass();
        btjr2.f149171b = a;
        str.getClass();
        btjr2.f149173d = str;
        btjr2.f149174e = i;
        btjs btjs = (btjs) atff.m75759a(askf, "t/cardtokenization/acknowledgepaymentbundle", (btjr) da.mo74062i(), btjs.f149175a);
    }

    /* renamed from: a */
    public final btkm mo49825a(askf askf, btkl btkl) {
        return (btkm) atff.m75759a(askf, "t/cardtokenization/getinapppaymentbundle", btkl, btkm.f149274b);
    }
}
