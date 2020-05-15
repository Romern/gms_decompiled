package p000;

import android.net.http.SslCertificate;

/* renamed from: aoqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoqk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f78699a;

    /* renamed from: b */
    final /* synthetic */ boolean f78700b;

    /* renamed from: c */
    final /* synthetic */ aoql f78701c;

    public aoqk(aoql aoql, String str, boolean z) {
        this.f78701c = aoql;
        this.f78699a = str;
        this.f78700b = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(java.lang.StringBuilder, java.lang.String, boolean):void
     arg types: [java.lang.StringBuilder, java.lang.String, int]
     candidates:
      com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(int, int, boolean):void
      com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(java.lang.Runnable, long, java.util.concurrent.TimeUnit):void
      com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(java.lang.StringBuilder, java.lang.String, boolean):void */
    public final void run() {
        byte[] byteArray;
        String d = (this.f78701c.f78702a.f83492f.getCertificate() == null || (byteArray = SslCertificate.saveState(this.f78701c.f78702a.f83492f.getCertificate()).getByteArray("x509-certificate")) == null) ? "" : sqd.m35972d(byteArray);
        StringBuilder sb = new StringBuilder(this.f78701c.f78702a.f83487a);
        aore.m66306a(sb, "c", this.f78699a);
        aore.m66306a(sb, "sc", d);
        this.f78701c.f78702a.mo46807a(sb, !this.f78700b ? "reload" : "verify", false);
    }
}
