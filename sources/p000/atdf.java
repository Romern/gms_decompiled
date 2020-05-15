package p000;

import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;

/* renamed from: atdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdf implements atcy {

    /* renamed from: a */
    private final String f90115a;

    public atdf(String str) {
        this.f90115a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ atcv mo49808a(askf askf, atcv atcv, bmtc bmtc, byte[] bArr, long j) {
        bxvd bxvd;
        asjp asjp;
        bmsq bmsq;
        bmtb bmtb;
        bmsq bmsq2;
        bmsq bmsq3;
        asjq asjq;
        if (atcv instanceof atde) {
            bxvd = ((atde) atcv).f90113a;
            asjr asjr = (asjr) bxvd.f164949b;
            if (asjr.f89087a != 2) {
                asjq = asjq.f89078f;
            } else {
                asjq = (asjq) asjr.f89088b;
            }
            bxvd bxvd2 = (bxvd) asjq.mo74142c(5);
            bxvd2.mo73625a((bxvk) asjq);
            asjp = (asjp) bxvd2;
        } else {
            bxvd = asjr.f89085h.mo74144da();
            asjp = (asjp) asjq.f89078f.mo74144da();
        }
        if (bmtc.f130815a == 6) {
            bmsq = (bmsq) bmtc.f130816b;
        } else {
            bmsq = bmsq.f130734e;
        }
        if (bmsq.f130736a == 3) {
            bmtb = (bmtb) bmsq.f130737b;
        } else {
            bmtb = bmtb.f130808d;
        }
        if (bmtb.f130811b.size() > 0) {
            if (asjp.f164950c) {
                asjp.mo74035c();
                asjp.f164950c = false;
            }
            asjq asjq2 = asjq.f89078f;
            ((asjq) asjp.f164949b).f89081b = bxvk.m124030de();
            bxwc bxwc = bmtb.f130811b;
            if (asjp.f164950c) {
                asjp.mo74035c();
                asjp.f164950c = false;
            }
            asjq asjq3 = (asjq) asjp.f164949b;
            if (!asjq3.f89081b.mo73666a()) {
                asjq3.f89081b = bxvk.m124021a(asjq3.f89081b);
            }
            bxsy.m123078a(bxwc, asjq3.f89081b);
            if (asjp.f164950c) {
                asjp.mo74035c();
                asjp.f164950c = false;
            }
            ((asjq) asjp.f164949b).f89083d = 0;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            asjr asjr2 = asjr.f89085h;
            ((asjr) bxvd.f164949b).f89093g = 0;
        }
        if (!bmtb.f130810a.isEmpty()) {
            String str = bmtb.f130810a;
            if (asjp.f164950c) {
                asjp.mo74035c();
                asjp.f164950c = false;
            }
            asjq asjq4 = asjq.f89078f;
            str.getClass();
            ((asjq) asjp.f164949b).f89080a = str;
        }
        if (!bmtb.f130812c.isEmpty()) {
            String str2 = bmtb.f130812c;
            if (asjp.f164950c) {
                asjp.mo74035c();
                asjp.f164950c = false;
            }
            asjq asjq5 = asjq.f89078f;
            str2.getClass();
            ((asjq) asjp.f164949b).f89082c = str2;
        }
        if (bmtc.f130815a == 6) {
            bmsq2 = (bmsq) bmtc.f130816b;
        } else {
            bmsq2 = bmsq.f130734e;
        }
        String str3 = bmsq2.f130738c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        asjr asjr3 = asjr.f89085h;
        str3.getClass();
        ((asjr) bxvd.f164949b).f89089c = str3;
        if (bmtc.f130815a == 6) {
            bmsq3 = (bmsq) bmtc.f130816b;
        } else {
            bmsq3 = bmsq.f130734e;
        }
        bmtd bmtd = bmsq3.f130739d;
        if (bmtd == null) {
            bmtd = bmtd.f130817d;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmtd.getClass();
        ((asjr) bxvd.f164949b).f89092f = bmtd;
        long j2 = 0;
        if (j != 0) {
            j2 = System.currentTimeMillis() - j;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        asjr asjr4 = (asjr) bxvd.f164949b;
        asjr4.f89091e = j2;
        asjr4.f89090d = j;
        asjq asjq6 = (asjq) asjp.mo74062i();
        asjq6.getClass();
        asjr4.f89088b = asjq6;
        asjr4.f89087a = 2;
        return new atde(this.f90115a, bxvd);
    }

    /* renamed from: a */
    public final btmd mo49809a() {
        bxvd da = btmd.f149473c.mo74144da();
        btlx btlx = btlx.f149451b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btmd btmd = (btmd) da.f164949b;
        btlx.getClass();
        btmd.f149476b = btlx;
        btmd.f149475a = 5;
        return (btmd) da.mo74062i();
    }

    /* renamed from: a */
    public final CryptoParameters mo49810a(atcv atcv) {
        return CryptoParameters.f108620c;
    }
}
