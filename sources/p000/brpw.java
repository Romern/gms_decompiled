package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.MfaInfo;
import com.google.firebase.auth.api.model.ResetPasswordResponse;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import java.util.List;
import java.util.Locale;

/* renamed from: brpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpw {

    /* renamed from: a */
    public final gsu f143141a;

    /* renamed from: b */
    public final brpx f143142b;

    /* renamed from: c */
    public final Context f143143c;

    /* renamed from: d */
    private final String f143144d;

    /* renamed from: e */
    private final String f143145e;

    public brpw() {
    }

    /* renamed from: a */
    public static aucb m114444a(Context context, gsu gsu, ProxyRequest proxyRequest, bxxk bxxk) {
        rjx a = gss.m13836a(context, gsu);
        roz b = rpa.m34196b();
        b.f43472a = new ibx(proxyRequest);
        return a.mo24732b(b.mo24977a()).mo50382b(new brlx(proxyRequest, bxxk));
    }

    public brpw(Context context, brpx brpx, String str, brps brps) {
        String str2;
        sdo.m34959a(context);
        this.f143143c = context;
        sdo.m34959a(brpx);
        this.f143142b = brpx;
        sdo.m34977c(str);
        this.f143144d = str;
        Object[] objArr = new Object[2];
        objArr[0] = "GmsCore";
        int i = brps.f143139a;
        if (i == -1) {
            str2 = Integer.toString(brps.f143140b);
        } else {
            str2 = String.format("X%s", Integer.toString(i));
        }
        objArr[1] = str2;
        this.f143145e = String.format("Android/%s/%s", objArr);
        gst gst = new gst();
        String str3 = brpx.f143146a;
        if (str3 != null) {
            gst.f18972a.putString("consumerPkg", str3);
        }
        this.f143141a = gst.mo12176a();
    }

    /* renamed from: a */
    public static void m114445a(Context context, List list, String str) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MfaInfo mfaInfo = (MfaInfo) list.get(i);
            if (!TextUtils.isEmpty(mfaInfo.f152535e)) {
                brla.f142902a.mo69674a(context, str, mfaInfo.f152532b, mfaInfo.f152535e);
            }
        }
    }

    /* renamed from: a */
    public final aucb mo69774a(brpy brpy, brpk brpk, String str, String str2) {
        return mo69775a(brpy, brpk, str, str2, null);
    }

    /* renamed from: a */
    public final aucb mo69775a(brpy brpy, brpk brpk, String str, String str2, String str3) {
        return m114444a(this.f143143c, this.f143141a, mo69776a(mo69777a(str, str2), brpy.mo69786a().serializeToBytes(), str3), brpk.mo69763a()).mo50382b(new brlv(brpk));
    }

    /* renamed from: a */
    public final ProxyRequest mo69776a(String str, byte[] bArr, String str2) {
        String str3;
        if (Boolean.valueOf(this.f143143c.getSharedPreferences(String.format("com.google.firebase.auth.internal.proxyApiHelper.%s", this.f143142b.f143146a), 0).getBoolean("com.google.firebase.auth.internal.FIREBASE_UI_BIT", false)).booleanValue()) {
            String str4 = this.f143145e;
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 19);
            sb.append(str4);
            sb.append("/FirebaseUI-Android");
            str3 = sb.toString();
        } else {
            String str5 = this.f143145e;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 21);
            sb2.append(str5);
            sb2.append("/FirebaseCore-Android");
            str3 = sb2.toString();
        }
        ibo ibo = new ibo(str);
        ibo.f20688c = bArr;
        sdo.m34975b(true, "Unrecognized http method code.");
        ibo.f20687b = 1;
        ibo.mo12893a("X-Android-Package", this.f143142b.f143146a);
        Locale locale = Locale.getDefault();
        StringBuilder sb3 = new StringBuilder();
        brpt.m114441a(sb3, locale);
        if (!locale.equals(Locale.US)) {
            if (sb3.length() > 0) {
                sb3.append(", ");
            }
            brpt.m114441a(sb3, Locale.US);
        }
        ibo.mo12893a("Accept-Language", sb3.toString());
        ibo.mo12893a("X-Client-Version", str3);
        ibo.mo12893a("X-Android-Cert", this.f143142b.f143147b);
        ibo.mo12893a("X-Firebase-Locale", str2);
        ibo.mo12893a("Content-Type", "application/x-protobuf");
        if (ibo.f20688c == null) {
            ibo.f20688c = new byte[0];
        }
        return new ProxyRequest(2, ibo.f20686a, ibo.f20687b, 3000, ibo.f20688c, ibo.f20689d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo69777a(String str, String str2) {
        return String.format("%s/%s?alt=proto&key=%s", str, str2, this.f143144d);
    }

    /* renamed from: a */
    public final void mo69778a(Context context, brrp brrp, brpv brpv) {
        mo69774a(brrp, new brrq(), cdxz.m135248c(), "verifyPhoneNumber").mo50371a(new brme(this, context, brpv, brrp));
    }

    /* renamed from: a */
    public final void mo69779a(Context context, VerifyAssertionRequest verifyAssertionRequest, brpv brpv) {
        mo69774a(verifyAssertionRequest, new brrk(), cdxz.m135248c(), "verifyAssertion").mo50371a(new brlz(context, brpv));
    }

    /* renamed from: a */
    public final void mo69780a(brqj brqj, brpv brpv) {
        mo69774a(brqj, new GetTokenResponse(), cdxz.m135249d(), "token").mo50371a(new brlu(brpv));
    }

    /* renamed from: a */
    public final void mo69781a(brqk brqk, brpv brpv) {
        mo69774a(brqk, new GetAccountInfoResponse(), cdxz.m135248c(), "getAccountInfo").mo50371a(new brmf(brpv));
    }

    /* renamed from: a */
    public final void mo69782a(brqo brqo, brpv brpv) {
        String str;
        ActionCodeSettings actionCodeSettings = brqo.f143193c;
        if (actionCodeSettings != null) {
            str = actionCodeSettings.f152386h;
        } else {
            str = null;
        }
        mo69775a(brqo, new brqp(), cdxz.m135248c(), "getOobConfirmationCode", str).mo50371a(new brlm(brpv));
    }

    /* renamed from: a */
    public final void mo69783a(brqw brqw, brpv brpv) {
        mo69774a(brqw, new ResetPasswordResponse(), cdxz.m135248c(), "resetPassword").mo50371a(new brmc(brpv));
    }

    /* renamed from: a */
    public final void mo69784a(brra brra, brpv brpv) {
        mo69774a(brra, new brrb(), cdxz.m135248c(), "setAccountInfo").mo50371a(new brlk(brpv));
    }

    /* renamed from: a */
    public final void mo69785a(brrc brrc, brpv brpv) {
        mo69774a(brrc, new brrd(), cdxz.m135248c(), "signupNewUser").mo50371a(new brma(brpv));
    }
}
