package p000;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import java.util.concurrent.Callable;

/* renamed from: hmo */
final /* synthetic */ class hmo implements Callable {

    /* renamed from: a */
    private final hms f20032a;

    /* renamed from: b */
    private final acyr f20033b;

    /* renamed from: c */
    private final String f20034c;

    /* renamed from: d */
    private final String f20035d;

    /* renamed from: e */
    private final String f20036e;

    /* renamed from: f */
    private final Credential f20037f;

    public hmo(hms hms, acyr acyr, String str, String str2, String str3, Credential credential) {
        this.f20032a = hms;
        this.f20033b = acyr;
        this.f20034c = str;
        this.f20035d = str2;
        this.f20036e = str3;
        this.f20037f = credential;
    }

    public final Object call() {
        hms hms = this.f20032a;
        acyr acyr = this.f20033b;
        String str = this.f20034c;
        String str2 = this.f20035d;
        String str3 = this.f20036e;
        Credential credential = this.f20037f;
        IdToken a = hms.f20043c.mo12639a(acyr, str, str2, str3);
        gvl gvl = new gvl(credential);
        gvl.f19079c = bngx.m109356a(a);
        return gvl.mo12267a();
    }
}
