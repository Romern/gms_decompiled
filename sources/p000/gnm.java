package p000;

import android.content.Context;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;

/* renamed from: gnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gnm {

    /* renamed from: a */
    public static final Logger f18706a = ght.m13171a("ValidateAccountCredentialsOperation");

    /* renamed from: b */
    public final Context f18707b;

    /* renamed from: c */
    public final AccountCredentials f18708c;

    /* renamed from: d */
    public final gmy f18709d;

    /* renamed from: e */
    public final gko f18710e;

    public gnm(Context context, AccountCredentials accountCredentials) {
        gko gko = (gko) gko.f18416b.mo13145b();
        gmy gmy = new gmy(context);
        sdo.m34959a(context);
        this.f18707b = context;
        sdo.m34959a(accountCredentials);
        this.f18708c = accountCredentials;
        sdo.m34959a(gko);
        this.f18710e = gko;
        sdo.m34959a(gmy);
        this.f18709d = gmy;
    }
}
