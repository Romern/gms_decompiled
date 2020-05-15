package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: azat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azat {

    /* renamed from: b */
    private static azat f98881b;

    /* renamed from: a */
    public final Context f98882a;

    /* renamed from: c */
    private final azau f98883c;

    private azat(Context context, azau azau) {
        this.f98882a = context.getApplicationContext();
        this.f98883c = azau;
    }

    /* renamed from: a */
    public static azat m85170a(Context context) {
        if (f98881b == null) {
            f98881b = new azat(context, new azav(context));
        }
        return f98881b;
    }

    /* renamed from: a */
    public final boolean mo54556a(String str) {
        return mo54557a(str, true, true);
    }

    /* renamed from: a */
    public final boolean mo54557a(String str, boolean z, boolean z2) {
        bngx bngx;
        bngm bngm;
        new Object[1][0] = str;
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2)};
        if (TextUtils.isEmpty(str)) {
            azoj.m85932b("ServiceAuthorizer", "Empty package can't be authorized", new Object[0]);
            return false;
        } else if (z && azpi.m86085c(this.f98882a, str)) {
            String.valueOf(str).concat(" is google signed.");
            return true;
        } else if (!z2 || !cffv.m139345b()) {
            return false;
        } else {
            azau azau = this.f98883c;
            int i = ddt.f12955a;
            if (TextUtils.isEmpty(str)) {
                azoj.m85933c("TachystickSigList", "Empty package name!", new Object[0]);
                bngx = bngx.m109376e();
            } else {
                bngx = ((azav) azau).mo54558a(str);
            }
            if (bngx.size() != 1) {
                String valueOf = String.valueOf(str);
                azoj.m85933c("ServiceAuthorizer", valueOf.length() == 0 ? new String("Signature issue for ") : "Signature issue for ".concat(valueOf), new Object[0]);
                return false;
            }
            String str2 = (String) bngx.get(0);
            if (!cffv.m139345b()) {
                bngm = bnon.f131923a;
            } else {
                bnia j = bnic.m109500j();
                int b = (int) cffv.f183952a.mo6606a().mo81135b();
                for (int i2 = 1; i2 <= b; i2++) {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("partner_");
                    sb.append(i2);
                    String sb2 = sb.toString();
                    beah c = cffv.f183952a.mo6606a().mo81136c();
                    String valueOf2 = String.valueOf(sb2);
                    bqhk bqhk = (bqhk) c.mo58476a(valueOf2.length() == 0 ? new String("TachystickThirdPartySignatures__") : "TachystickThirdPartySignatures__".concat(valueOf2), null, azbg.f98896a);
                    if (bqhk != null && bqhk.f140665a) {
                        j.mo67752b((Iterable) bqhk.f140666b);
                    }
                }
                bngm = j.mo67751a();
            }
            if (!bngm.contains(str2)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str2).length());
                sb3.append("Signatures for ");
                sb3.append(str);
                sb3.append(" can't be verified. ");
                sb3.append(str2);
                sb3.toString();
                return false;
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 29);
            sb4.append("Package ");
            sb4.append(str);
            sb4.append(" has been authorized.");
            sb4.toString();
            return true;
        }
    }
}
