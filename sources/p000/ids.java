package p000;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.service.SignInChimeraService;
import com.google.android.gms.common.api.Scope;

/* renamed from: ids */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ids extends idg implements aaai {

    /* renamed from: a */
    public final String f20773a;

    /* renamed from: b */
    public final qws f20774b;

    /* renamed from: c */
    private final Context f20775c;

    /* renamed from: d */
    private final String f20776d;

    /* renamed from: e */
    private final aaag f20777e;

    public ids(Context context, String str, Scope[] scopeArr, aqkt aqkt, aaag aaag, qws qws) {
        this.f20775c = context;
        sdo.m34977c(str);
        this.f20776d = str;
        sdo.m34959a(aaag);
        this.f20777e = aaag;
        String str2 = aqkt.f86312g;
        if (str2 == null) {
            this.f20773a = adbv.m50143a();
        } else {
            this.f20773a = str2;
        }
        this.f20774b = qws;
        if (cgmd.m146192b()) {
            this.f20774b.mo24333a(addd.m50199a(str, scopeArr, aqkt)).mo24327b();
        }
        sek sek = SignInChimeraService.f10359a;
        String valueOf = String.valueOf(this.f20773a);
        sek.mo25412b(valueOf.length() == 0 ? new String("Log Session ID: ") : "Log Session ID: ".concat(valueOf), new Object[0]);
    }

    /* renamed from: a */
    public final void mo12937a(ide ide, GoogleSignInOptions googleSignInOptions) {
        Context context = this.f20775c;
        ich ich = new ich(googleSignInOptions);
        ich.f20726b = this.f20773a;
        this.f20777e.mo16658a(new idp(ide, context, ich.mo12912a(), this.f20776d));
    }

    /* renamed from: b */
    public final void mo12938b(ide ide, GoogleSignInOptions googleSignInOptions) {
        this.f20777e.mo16658a(new idn(ide, this.f20776d));
    }

    /* renamed from: c */
    public final void mo12939c(ide ide, GoogleSignInOptions googleSignInOptions) {
        ich ich = new ich(googleSignInOptions);
        ich.f20726b = this.f20773a;
        this.f20777e.mo16658a(new idm(ide, ich.mo12912a(), this.f20776d, new shj(rpr.m34216b(), (String) icl.f20736a.mo58455c(), (String) icl.f20737b.mo58455c(), false, true, null, null, 4101)));
    }
}
