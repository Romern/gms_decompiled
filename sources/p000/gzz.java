package p000;

import android.app.Application;
import android.graphics.Bitmap;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.List;

/* renamed from: gzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gzz extends C1261p {

    /* renamed from: d */
    public static final Logger f19315d = ght.m13172b("AssistedSignInViewModel");

    /* renamed from: e */
    public final BeginSignInRequest f19316e;

    /* renamed from: f */
    public final String f19317f;

    /* renamed from: g */
    public final String f19318g;

    /* renamed from: h */
    public final hvd f19319h;

    /* renamed from: i */
    public final bqgj f19320i;

    /* renamed from: j */
    public final String f19321j;

    /* renamed from: k */
    public final qws f19322k;

    /* renamed from: l */
    public final hdz f19323l;

    /* renamed from: m */
    public final hbc f19324m;

    /* renamed from: n */
    public final Bitmap f19325n;

    /* renamed from: o */
    public final gzy f19326o;

    /* renamed from: p */
    public InternalSignInCredentialWrapper f19327p;

    /* renamed from: q */
    public List f19328q;

    /* renamed from: r */
    public hba f19329r;

    /* renamed from: s */
    public SignInCredential f19330s;

    /* renamed from: t */
    public long f19331t;

    /* renamed from: u */
    public final C0034at f19332u = new C0034at();

    /* renamed from: v */
    public final C0034at f19333v = new C0034at();

    /* renamed from: w */
    public final C0034at f19334w = new C0034at();

    /* renamed from: x */
    public final C0034at f19335x = new C0034at(bmxv.m108566b(false));

    public gzz(Application application, String str, C1240of ofVar, BeginSignInRequest beginSignInRequest, String str2, qws qws) {
        super(application);
        this.f19317f = str;
        this.f19316e = beginSignInRequest;
        this.f19321j = str2;
        this.f19322k = qws;
        CharSequence charSequence = (CharSequence) ofVar.f26798a;
        sdo.m34959a(charSequence);
        this.f19318g = charSequence.toString();
        this.f19325n = (Bitmap) ofVar.f26799b;
        this.f19320i = sne.m35694a(2, 9);
        this.f19324m = new hbc(application);
        this.f19329r = new hba();
        hvb a = hvc.m14893a();
        a.f20471a = str2;
        this.f19319h = hva.m14891a(application, a.mo12751a());
        this.f19326o = new gzy(this);
        hdy a2 = hdz.m14237a();
        a2.f19553a = adco.FETCH_CREDENTIALS;
        a2.mo12419a(adco.FETCH_CREDENTIALS, new gze(this));
        a2.mo12419a(adco.CHOOSE_MULTI_CREDENTIAL, new gzm(this));
        a2.mo12419a(adco.FETCH_TOS_AND_PP, new gzn(this));
        a2.mo12419a(adco.CHOOSE_SINGLE_CREDENTIAL, new gzo(this));
        a2.mo12419a(adco.COMPLETE_SIGN_IN_AND_START_CONFIRMATION, new gzp(this));
        a2.mo12419a(adco.EXTEND_CONFIRMATION, new gzq(this));
        a2.mo12419a(adco.RECORD_GRANTS, new gzr(this));
        a2.mo12419a(adco.UPDATE_DEFAULT_ACCOUNT, new gzs(this));
        a2.f19554b = new gzt(this);
        a2.f19555c = new gzu(this);
        a2.mo12420a(qws, str2, gzf.f19289a);
        this.f19323l = a2.mo12418a();
    }

    /* renamed from: a */
    public final void mo12356a() {
        hvd hvd = this.f19319h;
        String str = this.f19317f;
        String str2 = this.f19321j;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        roz b = rpa.m34196b();
        b.f43472a = new hwz(str2, str);
        ((rjx) hvd).mo24701a(b.mo24977a());
        mo12358a(haz.m14155a());
    }

    /* renamed from: a */
    public final void mo12357a(int i) {
        if (i == 1) {
            this.f19323l.mo12425c();
        } else {
            mo12356a();
        }
    }

    /* renamed from: a */
    public final void mo12358a(haz haz) {
        this.f19333v.mo2453l(haz);
    }
}
