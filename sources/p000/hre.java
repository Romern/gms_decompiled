package p000;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: hre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hre implements hep {

    /* renamed from: a */
    public final hky f20294a;

    /* renamed from: b */
    public final String f20295b;

    /* renamed from: c */
    public final hdw f20296c;

    /* renamed from: d */
    private final hln f20297d;

    public hre(Context context, String str, Credential credential) {
        this.f20297d = hln.m14581a(context);
        this.f20294a = hms.m14612a(context);
        sdo.m34977c(str);
        this.f20295b = str;
        sdo.m34959a(credential);
        this.f20296c = hdw.m14231a(credential);
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_DELETE;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        bngs j = bngx.m109377j();
        bnre i = heb.m14256a().listIterator();
        while (i.hasNext()) {
            acyr acyr = (acyr) i.next();
            adbj adbj = adbj.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_SERVICE_ENABLED;
            bqgg a = this.f20297d.mo12602a(acyr);
            hez.mo12448a(adbj, a);
            j.mo67668c(bqdx.m112673a(bqdx.m112674a(a, new hra(this, hez, acyr), bqfb.INSTANCE), new adau(new hrb(this)), bqfb.INSTANCE));
        }
        return bqdx.m112674a(adax.m50091a(j.mo67664a(), hrc.f20291a), new hrd(this, hez), bqfb.INSTANCE);
    }
}
