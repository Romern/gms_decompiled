package p000;

import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: gne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gne {

    /* renamed from: a */
    public final Context f18667a;

    /* renamed from: b */
    public final gmj f18668b;

    /* renamed from: c */
    public final AppDescription f18669c;

    /* renamed from: d */
    public final AccountCredentials f18670d;

    /* renamed from: e */
    public final GoogleAccountSetupRequest f18671e;

    /* renamed from: f */
    public final CaptchaSolution f18672f;

    public gne(Context context, AppDescription appDescription, AccountCredentials accountCredentials, GoogleAccountSetupRequest googleAccountSetupRequest, CaptchaSolution captchaSolution) {
        gmj gmj = new gmj(context);
        new glq(context);
        sdo.m34959a(context);
        this.f18667a = context;
        sdo.m34959a(gmj);
        this.f18668b = gmj;
        sdo.m34959a(appDescription);
        this.f18669c = appDescription;
        sdo.m34959a(accountCredentials);
        this.f18670d = accountCredentials;
        sdo.m34959a(googleAccountSetupRequest);
        this.f18671e = googleAccountSetupRequest;
        this.f18672f = captchaSolution;
    }
}
