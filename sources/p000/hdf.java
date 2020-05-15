package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: hdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hdf extends adcf {

    /* renamed from: a */
    public static final Logger f19494a = ght.m13172b("AuthorizationControllerFragment");

    /* renamed from: A */
    private bnic f19495A;

    /* renamed from: b */
    public AuthorizationRequest f19496b;

    /* renamed from: c */
    public String f19497c;

    /* renamed from: d */
    public String f19498d;

    /* renamed from: e */
    public qws f19499e;

    /* renamed from: f */
    public hdi f19500f;

    /* renamed from: g */
    public hdz f19501g;

    /* renamed from: h */
    public bqgj f19502h;

    /* renamed from: i */
    public String f19503i;

    /* renamed from: j */
    public String f19504j;

    /* renamed from: k */
    public String f19505k;

    /* renamed from: l */
    public Account f19506l;

    /* renamed from: m */
    public hvd f19507m;

    /* renamed from: n */
    public int f19508n;

    /* renamed from: o */
    public Set f19509o;

    /* renamed from: p */
    public ixl f19510p;

    /* renamed from: q */
    public TokenRequest f19511q;

    /* renamed from: r */
    public TokenResponse f19512r;

    /* renamed from: s */
    public ConsentResult f19513s;

    /* renamed from: t */
    public int f19514t;

    /* renamed from: u */
    public bmzi f19515u;

    /* renamed from: v */
    public bmzi f19516v;

    /* renamed from: w */
    public CookieManager f19517w;

    /* renamed from: x */
    public GoogleSignInAccount f19518x;

    /* renamed from: y */
    private hqv f19519y;

    /* renamed from: z */
    private aczc f19520z;

    /* renamed from: a */
    public static hdf m14203a(String str, AuthorizationRequest authorizationRequest, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        bundle.putString("session_id", str2);
        bundle.putParcelable("auth_request", authorizationRequest);
        hdf hdf = new hdf();
        hdf.setArguments(bundle);
        return hdf;
    }

    /* renamed from: a */
    public final void mo12404a(int i, String str) {
        if (i == 1) {
            this.f19503i = str;
        } else if (i == 2) {
            this.f19504j = str;
        } else if (i == 3) {
            this.f19505k = str;
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f19501g.mo12423b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        this.f19496b = (AuthorizationRequest) arguments.getParcelable("auth_request");
        this.f19498d = arguments.getString("session_id");
        this.f19497c = arguments.getString("calling_package");
        Context context = getContext();
        this.f19499e = new qws(context.getApplicationContext(), "IDENTITY_GMSCORE", null);
        Context applicationContext = context.getApplicationContext();
        hvb a = hvc.m14893a();
        a.f20471a = this.f19498d;
        this.f19507m = hva.m14891a(applicationContext, a.mo12751a());
        this.f19502h = sne.m35694a(1, 9);
        this.f19508n = spn.m35897i(context.getApplicationContext(), this.f19497c);
        this.f19510p = aczw.m50063a(context.getApplicationContext());
        this.f19495A = bnic.m109495a((Collection) this.f19496b.f10199a);
        this.f19509o = new HashSet();
        this.f19515u = new hcd(this);
        this.f19516v = new hco(this);
        this.f19517w = CookieManager.getInstance();
        Activity activity = getActivity();
        this.f19500f = (hdi) adcj.m50161a(activity).mo3444a(hdi.class);
        this.f19519y = (hqv) adcj.m50161a(activity).mo3444a(hqv.class);
        this.f19520z = (aczc) adcj.m50161a(activity).mo3444a(aczc.class);
        this.f19519y.f20259a.mo2445a(this, new hcj(this));
        this.f19500f.f19526e.mo2445a(this, new hck(this));
        this.f19500f.f19529h.mo2445a(this, new hcl(this));
        this.f19520z.f61123d.mo2445a(this, new hcm(this));
        this.f19520z.f61126g.mo2445a(this, new hcn(this));
        this.f19500f.mo12406a(1);
        this.f19500f.f19525d.mo2445a(this, new hcp(this));
        hdy a2 = hdz.m14237a();
        a2.f19553a = adcq.RESOLVE_ACCOUNT;
        a2.mo12419a(adcq.RESOLVE_ACCOUNT, new hcw(this));
        a2.mo12419a(adcq.EXTERNAL_ACCOUNT_CHOOSER, new hcx(this));
        a2.mo12419a(adcq.EXTERNAL_REAUTH_ACCOUNT, new hcy(this));
        a2.mo12419a(adcq.AUTH_ACCOUNT, new hcz(this));
        a2.mo12419a(adcq.CONSENT_GET_COOKIES, new hda(this));
        a2.mo12419a(adcq.CONSENT_SHOW_REMOTE_UI, new hdb(this));
        a2.mo12419a(adcq.EXTERNAL_CONSENT_SHOW_NATIVE_ACTIVITY, new hdc(this));
        a2.mo12419a(adcq.CONSENT_RECORD_GRANTS, new hdd(this));
        a2.mo12419a(adcq.BUILD_GOOGLE_SIGN_IN_ACCOUNT, new C1043hce(this));
        a2.mo12419a(adcq.SET_DEFAULT_ACCOUNT, new hcf(this));
        a2.f19554b = new hcg(this);
        a2.f19555c = new hch(this);
        a2.mo12420a(this.f19499e, this.f19498d, hci.f19466a);
        this.f19501g = a2.mo12418a();
    }

    /* renamed from: a */
    public static boolean m14204a(Account account, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String lowerCase = account.name.toLowerCase(Locale.ROOT);
        String valueOf = String.valueOf(str.toLowerCase(Locale.ROOT));
        return lowerCase.endsWith(valueOf.length() == 0 ? new String("@") : "@".concat(valueOf));
    }

    public final void onDestroy() {
        int i = Build.VERSION.SDK_INT;
        this.f19517w.removeAllCookies(null);
        this.f19517w.flush();
        super.onDestroy();
    }

    /* renamed from: a */
    public final bqgg mo12402a(int i) {
        this.f19514t = i;
        return this.f19502h.mo25819b(new hcv(this, i));
    }

    /* renamed from: a */
    public final Set mo12403a() {
        return !this.f19509o.isEmpty() ? this.f19509o : this.f19495A;
    }

    /* renamed from: a */
    public final void mo12405a(hdh hdh) {
        this.f19500f.mo12408a(hdh);
    }
}
