package p000;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: aqmp */
final /* synthetic */ class aqmp implements Callable {

    /* renamed from: a */
    private final SignInChimeraActivity f86370a;

    public aqmp(SignInChimeraActivity signInChimeraActivity) {
        this.f86370a = signInChimeraActivity;
    }

    public final Object call() {
        SignInChimeraActivity signInChimeraActivity = this.f86370a;
        try {
            Context baseContext = signInChimeraActivity.getBaseContext();
            shl shl = new shl(baseContext, (String) aqnw.f86403d.mo58455c(), ((Integer) aqnw.f86404e.mo58455c()).intValue(), -1, 25857);
            shl.mo25556a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
            shl.mo25556a("X-Android-Package", baseContext.getPackageName());
            shl.mo25556a("X-Android-Cert", spn.m35895h(baseContext, baseContext.getPackageName()));
            aqnx aqnx = new aqnx(shl);
            String str = signInChimeraActivity.f107681e;
            bmxy.m108581a(str);
            byte[] bArr = (byte[]) bmxy.m108581a(spn.m35888f(signInChimeraActivity.getBaseContext(), str));
            bxvd da = bydu.f165857c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((bydu) da.f164949b).f165860b = str;
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
            if (aqnx.f86408b == null) {
                aqnx.f86408b = chtv.m149566a(chtu.UNARY, "google.identity.clientauthconfig.v1.ClientAuthConfig/GetClientBrand", ciie.m150370a(bydw.f165865b), ciie.m150370a(bydv.f165861c));
            }
            bydv bydv = (bydv) aqnx.f86409a.mo25554a(aqnx.f86408b, bydw, 10000, TimeUnit.MILLISECONDS);
            if (bydv != null) {
                bxwc bxwc = bydv.f165863a;
                if (!bxwc.isEmpty()) {
                    signInChimeraActivity.f107685i = (String) bxwc.get(0);
                }
                bxwc bxwc2 = bydv.f165864b;
                if (!bxwc2.isEmpty()) {
                    signInChimeraActivity.f107686j = (String) bxwc2.get(0);
                }
                return bmxv.m108566b(2);
            }
            throw new IOException("No Brand found for the calling package.");
        } catch (chuw e) {
            throw new IOException(e);
        }
    }
}
