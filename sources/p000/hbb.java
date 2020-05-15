package p000;

import android.util.Base64;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: hbb */
final /* synthetic */ class hbb implements Callable {

    /* renamed from: a */
    private final hbc f19395a;

    /* renamed from: b */
    private final jef f19396b;

    /* renamed from: c */
    private final String f19397c;

    public hbb(hbc hbc, jef jef, String str) {
        this.f19395a = hbc;
        this.f19396b = jef;
        this.f19397c = str;
    }

    public final Object call() {
        bydv bydv;
        hba hba;
        String str;
        hbc hbc = this.f19395a;
        jef jef = this.f19396b;
        String str2 = this.f19397c;
        try {
            byte[] bArr = (byte[]) sdo.m34959a(spn.m35888f(hbc.f19398a, str2));
            bxvd da = bydu.f165857c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((bydu) da.f164949b).f165860b = str2;
            String encodeToString = Base64.encodeToString(bArr, 2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            encodeToString.getClass();
            ((bydu) da.f164949b).f165859a = encodeToString;
            bydu bydu = (bydu) da.mo74062i();
            bxvd da2 = bydw.f165865b.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bydu.getClass();
            ((bydw) da2.f164949b).f165867a = bydu;
            bydw bydw = (bydw) da2.mo74062i();
            String str3 = null;
            try {
                if (jef.f22276b == null) {
                    jef.f22276b = chtv.m149566a(chtu.UNARY, "google.identity.clientauthconfig.v1.ClientAuthConfig/GetClientBrand", ciie.m150370a(bydw.f165865b), ciie.m150370a(bydv.f165861c));
                }
                bydv = (bydv) jef.f22277a.mo25554a(jef.f22276b, bydw, 10000, TimeUnit.MILLISECONDS);
            } catch (chuw e) {
                bydv = null;
            }
            if (bydv == null) {
                hba = new hba();
            } else {
                if (!bydv.f165863a.isEmpty()) {
                    str = hbc.m14161a((String) bydv.f165863a.get(0));
                } else {
                    str = null;
                }
                if (!bydv.f165864b.isEmpty()) {
                    str3 = hbc.m14161a((String) bydv.f165864b.get(0));
                }
                hba = new hba(str, str3);
            }
            return hba;
        } finally {
            jef.mo13649a();
        }
    }
}
