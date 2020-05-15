package p000;

import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import java.util.Date;

/* renamed from: xbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xbs implements aubw {

    /* renamed from: a */
    final /* synthetic */ aucb f51887a;

    /* renamed from: b */
    final /* synthetic */ String f51888b;

    /* renamed from: c */
    final /* synthetic */ xdw f51889c;

    /* renamed from: d */
    final /* synthetic */ xbw f51890d;

    /* renamed from: e */
    final /* synthetic */ xbx f51891e;

    public xbs(xbx xbx, aucb aucb, String str, xdw xdw, xbw xbw) {
        this.f51891e = xbx;
        this.f51887a = aucb;
        this.f51888b = str;
        this.f51889c = xdw;
        this.f51890d = xbw;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        KeyRegistrationResult keyRegistrationResult = (KeyRegistrationResult) obj;
        int i = ((KeyRegistrationResult) this.f51887a.mo50386d()).f10542b.f30115i;
        Logger Logger = xbx.f51896c;
        String valueOf = String.valueOf(iov.m15809b(i));
        Logger.mo25412b(valueOf.length() == 0 ? new String("Result status code of key registration is ") : "Result status code of key registration is ".concat(valueOf), new Object[0]);
        if (i != -25501) {
            Logger logger2 = xbx.f51896c;
            String valueOf2 = String.valueOf(iov.m15809b(i));
            logger2.mo25418e(valueOf2.length() == 0 ? new String("Result of key registration is not successful. Status code: ") : "Result of key registration is not successful. Status code: ".concat(valueOf2), new Object[0]);
            xbx xbx = this.f51891e;
            xbw xbw = this.f51890d;
            xjz xjz = this.f51889c.f52031b;
            String valueOf3 = String.valueOf(iov.m15809b(i));
            xbx.mo29623a(xbw, xjz, new xma(valueOf3.length() == 0 ? new String("CryptAuth error: ") : "CryptAuth error: ".concat(valueOf3)));
            return;
        }
        try {
            this.f51891e.f51898b.mo29615a(this.f51888b, new Date(System.currentTimeMillis()), this.f51889c.f52031b);
            this.f51890d.mo29619a();
        } catch (xbn e) {
            xbx.f51896c.mo25417e("Unable to store enrollment status", e, new Object[0]);
            this.f51891e.mo29623a(this.f51890d, this.f51889c.f52031b, e);
        }
    }
}
