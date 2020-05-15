package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.ResolutionData;
import java.util.concurrent.Callable;

/* renamed from: hcr */
final /* synthetic */ class hcr implements Callable {

    /* renamed from: a */
    private final hdf f19476a;

    public hcr(hdf hdf) {
        this.f19476a = hdf;
    }

    public final Object call() {
        int i;
        hdf hdf = this.f19476a;
        ResolutionData resolutionData = hdf.f19512r.f10749z;
        String str = resolutionData.f9934d;
        BrowserResolutionCookie[] browserResolutionCookieArr = resolutionData.f9935e;
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
                    String a = ghx.m13173a(browserResolutionCookie.f9921c, Boolean.valueOf(browserResolutionCookie.f9924f));
                    i = length;
                    String a2 = ghx.m13174a(browserResolutionCookie.f9919a, browserResolutionCookie.f9920b, browserResolutionCookie.f9921c, browserResolutionCookie.f9922d, Boolean.valueOf(browserResolutionCookie.f9925g), Boolean.valueOf(browserResolutionCookie.f9924f), Long.valueOf(browserResolutionCookie.f9923e));
                    Logger Logger = hdf.f19494a;
                    String valueOf = String.valueOf(a);
                    Logger.mo25412b(valueOf.length() == 0 ? new String("Setting browser resolution cookie for url: ") : "Setting browser resolution cookie for url: ".concat(valueOf), new Object[0]);
                    hdf.f19517w.setCookie(a, a2);
                    i2++;
                    length = i;
                } else {
                    i = length;
                }
                hdf.f19494a.mo25416d("Invalid browser resolution cookie.", new Object[0]);
                i2++;
                length = i;
            }
        }
        ((giu) hdf.f19516v.mo6606a()).mo11918a(hdf.f19506l, str);
        return bmxv.m108566b(adcq.CONSENT_SHOW_REMOTE_UI);
    }
}
