package p000;

import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;
import java.util.Arrays;

/* renamed from: atdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdl implements atcy {
    /* renamed from: a */
    public final atcv mo49808a(askf askf, atcv atcv, bmtc bmtc, byte[] bArr, long j) {
        ataq ataq;
        bmta bmta;
        if (atcv != null) {
            ataq = (ataq) ((atdk) atcv).f90122a.mo74062i();
        } else {
            ataq = ataq.f89963f;
        }
        if (bmtc.f130815a == 2) {
            bmta = (bmta) bmtc.f130816b;
        } else {
            bmta = bmta.f130803d;
        }
        atap atap = (atap) ataq.f89963f.mo74144da();
        if (atap.f164950c) {
            atap.mo74035c();
            atap.f164950c = false;
        }
        ataq ataq2 = (ataq) atap.f164949b;
        ataq2.f89965a = 2 | ataq2.f89965a;
        ataq2.f89969e = 0;
        if (!bmta.f130807c) {
            int size = ataq.f89967c.size() - ataq.f89969e;
            bmsz[] bmszArr = new bmsz[(bmta.f130806b.size() + size)];
            System.arraycopy(ataq.f89967c.toArray(new bmsz[0]), ataq.f89969e, bmszArr, 0, size);
            System.arraycopy(bmta.f130806b.toArray(new bmsz[0]), 0, bmszArr, size, bmta.f130806b.size());
            atap.mo49767a(Arrays.asList(bmszArr));
        } else {
            atap.mo49767a(bmta.f130806b);
        }
        bmsy bmsy = bmta.f130805a;
        if (bmsy == null) {
            bmsy bmsy2 = ataq.f89966b;
            if (bmsy2 == null) {
                bmsy2 = bmsy.f130790d;
            }
            if (atap.f164950c) {
                atap.mo74035c();
                atap.f164950c = false;
            }
            ataq ataq3 = (ataq) atap.f164949b;
            bmsy2.getClass();
            ataq3.f89966b = bmsy2;
            ataq3.f89965a |= 1;
        } else {
            if (atap.f164950c) {
                atap.mo74035c();
                atap.f164950c = false;
            }
            ataq ataq4 = (ataq) atap.f164949b;
            bmsy.getClass();
            ataq4.f89966b = bmsy;
            ataq4.f89965a |= 1;
        }
        return new atdk((ataq) atap.mo74062i());
    }

    /* renamed from: a */
    public final btmd mo49809a() {
        return btmd.f149473c;
    }

    /* renamed from: a */
    public final CryptoParameters mo49810a(atcv atcv) {
        return CryptoParameters.f108620c;
    }
}
