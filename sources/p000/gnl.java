package p000;

import android.content.Context;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: gnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gnl {

    /* renamed from: a */
    public static final sek f18699a = ght.m13171a("UpdateCredentialsOperation");

    /* renamed from: b */
    public final Context f18700b;

    /* renamed from: c */
    public final AccountCredentials f18701c;

    /* renamed from: d */
    public final CaptchaSolution f18702d;

    /* renamed from: e */
    public final goa f18703e;

    /* renamed from: f */
    public final gmx f18704f;

    /* renamed from: g */
    public final gko f18705g;

    public gnl(Context context, AccountCredentials accountCredentials, CaptchaSolution captchaSolution) {
        gko gko = (gko) gko.f18416b.mo13145b();
        goa goa = (goa) goa.f18759a.mo13145b();
        gmx gmx = new gmx(context);
        sdo.m34959a(context);
        this.f18700b = context;
        sdo.m34959a(goa);
        this.f18703e = goa;
        sdo.m34959a(accountCredentials);
        this.f18701c = accountCredentials;
        sdo.m34959a(gko);
        this.f18705g = gko;
        sdo.m34959a(gmx);
        this.f18704f = gmx;
        this.f18702d = captchaSolution;
    }
}
