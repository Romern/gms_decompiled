package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: aqln */
final /* synthetic */ class aqln implements Callable {

    /* renamed from: a */
    private final ConsentChimeraActivity f86339a;

    public aqln(ConsentChimeraActivity consentChimeraActivity) {
        this.f86339a = consentChimeraActivity;
    }

    public final Object call() {
        int i;
        ConsentChimeraActivity consentChimeraActivity = this.f86339a;
        consentChimeraActivity.mo58978g();
        TokenResponse tokenResponse = consentChimeraActivity.f107667k;
        bmxy.m108581a(tokenResponse);
        BrowserResolutionCookie[] browserResolutionCookieArr = tokenResponse.f10749z.f9935e;
        if (browserResolutionCookieArr != null) {
            int length = browserResolutionCookieArr.length;
            int i2 = 0;
            while (i2 < length) {
                BrowserResolutionCookie browserResolutionCookie = browserResolutionCookieArr[i2];
                if (TextUtils.isEmpty(browserResolutionCookie.f9921c)) {
                    i = length;
                } else if (TextUtils.isEmpty(browserResolutionCookie.f9919a)) {
                    i = length;
                } else if (!TextUtils.isEmpty(browserResolutionCookie.f9920b)) {
                    String str = browserResolutionCookie.f9921c;
                    bmxy.m108581a(str);
                    String a = ghx.m13173a(str, Boolean.valueOf(browserResolutionCookie.f9924f));
                    i = length;
                    String a2 = ghx.m13174a(browserResolutionCookie.f9919a, browserResolutionCookie.f9920b, browserResolutionCookie.f9921c, browserResolutionCookie.f9922d, Boolean.valueOf(browserResolutionCookie.f9925g), Boolean.valueOf(browserResolutionCookie.f9924f), Long.valueOf(browserResolutionCookie.f9923e));
                    Logger Logger = ConsentChimeraActivity.f107656b;
                    String valueOf = String.valueOf(a);
                    Logger.mo25412b(valueOf.length() == 0 ? new String("Setting browser resolution cookie for url: ") : "Setting browser resolution cookie for url: ".concat(valueOf), new Object[0]);
                    consentChimeraActivity.f107661e.setCookie(a, a2);
                    i2++;
                    length = i;
                } else {
                    i = length;
                }
                ConsentChimeraActivity.f107656b.mo25416d("Invalid browser resolution cookie.", new Object[0]);
                i2++;
                length = i;
            }
        }
        return giu.m13225a(consentChimeraActivity).mo11918a(consentChimeraActivity.f107665i.mo7637a(), tokenResponse.f10749z.f9934d);
    }
}
