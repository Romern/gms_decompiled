package p000;

import android.content.IntentSender;
import android.net.Uri;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.chimera.Activity;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akwo implements akww {

    /* renamed from: a */
    public final WebView f73008a;

    /* renamed from: b */
    public boolean f73009b;

    /* renamed from: c */
    private final Activity f73010c;

    /* renamed from: d */
    private final akwn f73011d;

    /* renamed from: e */
    private Uri f73012e = null;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.google.android.chimera.Activity, akwn], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public akwo(Activity r2, WebView webView) {
        bmxy.m108581a((Object) r2);
        this.f73010c = r2;
        bmxy.m108588a(true);
        this.f73011d = r2;
        bmxy.m108581a(webView);
        this.f73008a = webView;
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocFido2", new akzu(Pattern.compile(bmxx.m108578b(cfrf.f185502a.mo6606a().mo82561b())), Pattern.compile(bmxx.m108578b(cfrf.f185502a.mo6606a().mo82560a()))), true);
    }

    /* renamed from: b */
    public final void mo39898b() {
        this.f73009b = false;
    }

    @JavascriptInterface
    public void startBuiltInAuthenticatorAssertionRequest(String str) {
        try {
            PublicKeyCredentialRequestOptions a = PublicKeyCredentialRequestOptions.m23484a(new JSONObject(str));
            xpl xpl = new xpl();
            sdo.m34959a(a);
            xpl.f52870a = a;
            Uri uri = this.f73012e;
            BrowserPublicKeyCredentialRequestOptions.m23463a(uri);
            xpl.f52871b = uri;
            BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = new BrowserPublicKeyCredentialRequestOptions(xpl.f52870a, xpl.f52871b);
            Integer num = browserPublicKeyCredentialRequestOptions.f31734a.f31785e;
            aucb a2 = wzk.m42527a(this.f73010c.getContainerActivity()).mo24701a((rpa) new xno(browserPublicKeyCredentialRequestOptions));
            a2.mo50373a(new akwk(this, num));
            a2.mo50372a(new akwl(this, num));
        } catch (JSONException | xqr e) {
            mo39931a(ErrorCode.ENCODING_ERR, "Could not decode the request", -1);
        }
    }

    /* renamed from: a */
    public final void mo39931a(ErrorCode errorCode, String str, int i) {
        xpf xpf = new xpf();
        xpf.mo30001a(errorCode);
        xpf.f52860a = str;
        mo39933a(new xqk(xql.ERROR, Integer.valueOf(i), xpf.mo30000a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39932a(Integer num, xrx xrx) {
        if (xrx.mo30096a()) {
            try {
                this.f73011d.mo39930a(xrx, num.intValue());
            } catch (IntentSender.SendIntentException e) {
                mo39931a(ErrorCode.UNKNOWN_ERR, "Could not launch pending intent for Fido2 signature", num.intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
        this.f73012e = Uri.parse(str);
        this.f73009b = true;
    }

    /* renamed from: a */
    public final void mo39933a(xqk xqk) {
        new adzt(Looper.getMainLooper()).post(new akwm(this, String.format(Locale.ROOT, "window.ocFido2BuiltInAuthenticatorAssertionResponse(%s)", xqk.mo18664a())));
    }
}
