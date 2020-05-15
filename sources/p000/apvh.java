package p000;

import android.net.http.SslCertificate;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;

/* renamed from: apvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apvh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f84984a;

    /* renamed from: b */
    final /* synthetic */ boolean f84985b;

    /* renamed from: c */
    final /* synthetic */ apvi f84986c;

    public apvh(apvi apvi, String str, boolean z) {
        this.f84986c = apvi;
        this.f84984a = str;
        this.f84985b = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(java.lang.StringBuilder, java.lang.String, boolean):void
     arg types: [java.lang.StringBuilder, java.lang.String, int]
     candidates:
      com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(int, int, boolean):void
      com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(java.lang.Runnable, long, java.util.concurrent.TimeUnit):void
      com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(java.lang.StringBuilder, java.lang.String, boolean):void */
    public final void run() {
        byte[] byteArray;
        String str = RecaptchaChimeraActivity.f107498j;
        String d = (this.f84986c.f84987a.f107505f.getCertificate() == null || (byteArray = SslCertificate.saveState(this.f84986c.f84987a.f107505f.getCertificate()).getByteArray("x509-certificate")) == null) ? "" : sqd.m35972d(byteArray);
        StringBuilder sb = new StringBuilder(this.f84986c.f84987a.f107500a);
        apum.m71046a(sb, "c", this.f84984a);
        apum.m71046a(sb, "sc", d);
        this.f84986c.f84987a.mo58928a(sb, !this.f84985b ? "reload" : "verify", false);
    }
}
