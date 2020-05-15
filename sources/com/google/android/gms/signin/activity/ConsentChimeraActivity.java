package com.google.android.gms.signin.activity;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConsentChimeraActivity extends adcc {

    /* renamed from: b */
    public static final sek f107656b = aqom.m71874a("ConsentChimeraActivity");

    /* renamed from: q */
    private static final bnhe f107657q;

    /* renamed from: r */
    private static final Pattern f107658r = Pattern.compile("^.+@(.*\\.|)gserviceaccount\\.com$");

    /* renamed from: c */
    public final bqgj f107659c = bqgs.m112811a((ExecutorService) sne.m35694a(2, 9));

    /* renamed from: d */
    public adap f107660d;

    /* renamed from: e */
    public CookieManager f107661e;

    /* renamed from: f */
    public adan f107662f;

    /* renamed from: g */
    public adam f107663g;

    /* renamed from: h */
    public ixl f107664h;

    /* renamed from: i */
    public TokenRequest f107665i;

    /* renamed from: j */
    public int f107666j;

    /* renamed from: k */
    public TokenResponse f107667k;

    /* renamed from: l */
    public ConsentResult f107668l;

    /* renamed from: m */
    public qws f107669m;

    /* renamed from: n */
    public aqkt f107670n;

    /* renamed from: p */
    aqnv f107671p;

    /* renamed from: s */
    private boolean f107672s;

    /* renamed from: t */
    private AccountAuthenticatorResponse f107673t;

    /* renamed from: u */
    private Set f107674u;

    /* renamed from: v */
    private String f107675v;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(0, adbm.GET_TOKEN);
        h.mo67695b(100, adbm.REAUTH);
        h.mo67695b(Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR), adbm.CONFIGURE_COOKIES);
        h.mo67695b(Integer.valueOf((int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR), adbm.BROWSWER_CONSENT);
        h.mo67695b(300, adbm.NATIVE_CONSENT);
        h.mo67695b(400, adbm.RECORD_GRANTS);
        h.mo67695b(500, adbm.HANDLE_DEVICE_MANAGEMENT_ERRORS);
        h.mo67695b(501, adbm.HANDLE_LOCK_SCREEN_ERROR);
        f107657q = h.mo67618b();
    }

    /* renamed from: i */
    private final void m92489i() {
        if (!this.f107672s && getSupportFragmentManager().findFragmentByTag("loading_interstitial") == null) {
            getSupportFragmentManager().beginTransaction().replace(16908290, new aqlz(), "loading_interstitial").commit();
        }
    }

    /* renamed from: a */
    public final void mo58973a(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f107673t;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        setResult(0, putExtra);
        finish();
    }

    /* renamed from: e */
    public final void mo58977e() {
        bqgg bqgg;
        bqgg bqgg2;
        String str;
        f107656b.mo25409a("startNextStep() is called, consentStep=%d.", Integer.valueOf(this.f107666j));
        int i = this.f107666j;
        if (i == 0) {
            m92489i();
            bqgg = bqdx.m112673a(this.f107662f.mo33292a(0, new aqlq(this)), new aqlr(this), this.f107660d);
        } else if (i == 100) {
            Account a = this.f107665i.mo7637a();
            if (a == null || !"com.google.work".equals(a.type) || !f107658r.matcher(a.name).matches()) {
                bqgg = this.f107662f.mo33292a(100, new aqls(this));
            } else {
                mo58973a(6, "Work service account");
                bqgg = bqga.m112775a(bmvz.f131120a);
            }
        } else if (i == 300) {
            TokenResponse tokenResponse = this.f107667k;
            bmxy.m108581a(tokenResponse);
            adam adam = this.f107663g;
            TokenRequest tokenRequest = this.f107665i;
            cgmg.f187313a.mo6606a().mo84118a();
            bqgg = bqdx.m112673a(adam.mo33291a(300, aczv.m50061a(this, tokenRequest, tokenResponse)), new aqlw(this), this.f107660d);
        } else if (i == 400) {
            m92489i();
            if (cgmj.m146201b()) {
                TokenRequest tokenRequest2 = this.f107665i;
                ConsentResult consentResult = this.f107668l;
                bmxy.m108581a(consentResult);
                Bundle bundle = new Bundle();
                adbw.m50145a(bundle, "token_request", tokenRequest2);
                adbw.m50145a(bundle, "consent_result", consentResult);
                aqnv aqnv = this.f107671p;
                bmxy.m108581a(aqnv);
                RecordConsentByConsentResultRequest recordConsentByConsentResultRequest = new RecordConsentByConsentResultRequest(bundle);
                roz b = rpa.m34196b();
                b.f43472a = new aqnp(recordConsentByConsentResultRequest);
                bqgg = bqdx.m112673a(this.f107662f.mo33292a(400, new aqlx(adbb.m50100a(aqnv.mo24732b(b.mo24977a())))), new aqlc(this), this.f107660d);
            } else {
                bqgg = bqdx.m112673a(this.f107662f.mo33292a(400, new aqld(this)), new aqle(this), this.f107660d);
            }
        } else if (i == 200) {
            m92489i();
            bqgg = bqdx.m112673a(this.f107662f.mo33292a(Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR), new aqlt(this)), bmxm.m108539a(bmxv.m108566b(Integer.valueOf((int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR))), this.f107660d);
        } else if (i == 201) {
            aqky aqky = (aqky) getSupportFragmentManager().findFragmentByTag("browser_consent");
            TokenResponse tokenResponse2 = this.f107667k;
            bmxy.m108581a(tokenResponse2);
            if (aqky == null) {
                Account a2 = this.f107665i.mo7637a();
                String str2 = tokenResponse2.f10749z.f9934d;
                aqky aqky2 = new aqky();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("selected_account", a2);
                bundle2.putString("url", str2);
                aqky2.setArguments(bundle2);
                getSupportFragmentManager().beginTransaction().replace(16908290, aqky2, "browser_consent").commit();
                aqky = aqky2;
            }
            bqgg = bqdx.m112673a(this.f107662f.mo33292a(Integer.valueOf((int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR), new aqlu(aqky)), new aqlv(this), this.f107660d);
        } else if (i == 500) {
            Account a3 = this.f107665i.mo7637a();
            if (!cgmp.f187322a.mo6606a().mo84124a()) {
                bqgg2 = bqga.m112775a(aczv.m50062a(this, a3, Bundle.EMPTY));
            } else {
                TokenResponse tokenResponse3 = this.f107667k;
                if (tokenResponse3 == null) {
                    str = "dmStatus";
                } else {
                    str = tokenResponse3.f10745v;
                }
                bqgg2 = bqdx.m112673a(bqfl.m112747c(this.f107659c.mo25819b(new aqlg(this, a3))), new aqlh(this, a3, str), bqfb.INSTANCE);
            }
            bqgg = bqdx.m112674a(bqgg2, new aqlf(this), this.f107660d);
        } else if (i == 501) {
            bqgg = bqdx.m112673a(this.f107663g.mo33291a(501, aczv.m50060a(this, this.f107665i.mo7637a())), new aqlj(this), this.f107660d);
        } else {
            throw new IllegalStateException(String.format("Unknown consent step: %d", Integer.valueOf(i)));
        }
        bqga.m112781a(bqgg, new aqly(this, System.currentTimeMillis()), this.f107660d);
    }

    public final void onBackPressed() {
        aqky aqky = (aqky) getSupportFragmentManager().findFragmentByTag("browser_consent");
        if (aqky != null) {
            WebView webView = aqky.f86320c;
            if (webView != null && webView.canGoBack()) {
                aqky.f86320c.goBack();
                return;
            }
            mo58973a(4, "");
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        CookieManager cookieManager;
        aqks aqks;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(2132017792);
        getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        Scope[] scopeArr = null;
        this.f107669m = new qws(this, "IDENTITY_GMSCORE", null);
        if (getPackageManager().hasSystemFeature("android.software.webview")) {
            cookieManager = CookieManager.getInstance();
        } else {
            cookieManager = new aqmz();
        }
        this.f107661e = cookieManager;
        this.f107660d = new adap(new adzt(Looper.getMainLooper()));
        this.f107662f = adan.m50084a((FragmentActivity) this);
        this.f107663g = adam.m50082a(this);
        this.f107664h = aczw.m50063a(this);
        if (bundle != null) {
            this.f107666j = bundle.getInt("consent_step", 0);
            if (bundle.containsKey("token_response")) {
                this.f107667k = (TokenResponse) sef.m35069a((byte[]) bmxy.m108581a(bundle.getByteArray("token_response")), TokenResponse.CREATOR);
            }
            if (bundle.containsKey("consent_result")) {
                this.f107668l = (ConsentResult) bundle.getParcelable("consent_result");
            }
            this.f107675v = bundle.getString("SIGN_IN_PACKAGE_NAME");
            if (bundle.containsKey("SIGN_IN_SCOPE_ARRAY")) {
                this.f107674u = bnfi.m109237a((Parcelable[]) bmxy.m108581a(bundle.getParcelableArray("SIGN_IN_SCOPE_ARRAY"))).mo67501a(aqlb.f86324a).mo67508c();
            }
            Bundle bundle2 = bundle.getBundle("sign_in_options");
            bmxy.m108581a(bundle2);
            this.f107670n = aqks.m71765a(bundle2).mo47941a();
        } else {
            this.f107666j = 0;
            this.f107667k = null;
            this.f107668l = null;
            this.f107675v = getIntent().getStringExtra("SIGN_IN_PACKAGE_NAME");
            Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("SIGN_IN_SCOPE_ARRAY");
            if (parcelableArrayExtra != null) {
                this.f107674u = bnfi.m109237a(parcelableArrayExtra).mo67501a(aqlm.f86338a).mo67508c();
            }
            Bundle bundleExtra = getIntent().getBundleExtra("sign_in_options");
            if (bundleExtra != null) {
                aqks = aqks.m71765a(bundleExtra);
            } else {
                aqks = new aqks();
            }
            aqkt a = aqks.mo47941a();
            this.f107670n = a;
            if (a.f86312g == null) {
                aqks.f86302f = adbv.m50143a();
                aqkt a2 = aqks.mo47941a();
                this.f107670n = a2;
                if (cgmd.m146192b()) {
                    qws qws = this.f107669m;
                    String str = this.f107675v;
                    Set set = this.f107674u;
                    if (set != null) {
                        scopeArr = (Scope[]) set.toArray(new Scope[0]);
                    }
                    qws.mo24333a(addd.m50199a(str, scopeArr, a2)).mo24327b();
                }
            }
        }
        if (cgmd.m146192b()) {
            adbs.m50134a(this, this, new aqlk(this));
        }
        sek sek = f107656b;
        String valueOf = String.valueOf(this.f107670n.f86312g);
        sek.mo25412b(valueOf.length() == 0 ? new String("Log Session ID: ") : "Log Session ID: ".concat(valueOf), new Object[0]);
        this.f107665i = (TokenRequest) sef.m35067a(getIntent(), "token_request", TokenRequest.CREATOR);
        this.f107672s = getIntent().getBooleanExtra("suppress_loading_ui", false);
        this.f107673t = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("account_authenticator_response");
        if (cgmj.m146201b()) {
            String str2 = this.f107675v;
            Bundle a3 = this.f107670n.mo47943a();
            a3.putString("com.google.android.gms.signin.internal.realClientPackageName", str2);
            this.f107671p = aqna.m71792a(this, aqkp.m71760a(a3));
        }
        mo58977e();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            mo58978g();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TokenResponse tokenResponse = this.f107667k;
        if (tokenResponse != null) {
            bundle.putByteArray("token_response", sef.m35074a(tokenResponse));
        }
        bundle.putInt("consent_step", this.f107666j);
        ConsentResult consentResult = this.f107668l;
        if (consentResult != null) {
            bundle.putParcelable("consent_result", consentResult);
        }
        Set set = this.f107674u;
        if (set != null) {
            bundle.putParcelableArray("SIGN_IN_SCOPE_ARRAY", (Parcelable[]) set.toArray(new Scope[0]));
        }
        bundle.putBundle("sign_in_options", this.f107670n.mo47943a());
    }

    /* renamed from: g */
    public final void mo58978g() {
        int i = Build.VERSION.SDK_INT;
        this.f107661e.removeAllCookies(null);
        this.f107661e.flush();
    }

    /* renamed from: a */
    public final void mo58974a(long j, int i, boolean z) {
        if (cgmd.m146192b()) {
            bxvd da = bomo.f133678j.mo74144da();
            adbm adbm = (adbm) f107657q.get(Integer.valueOf(i));
            bmxy.m108581a(adbm);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bomo bomo = (bomo) da.f164949b;
            bomo.f133682c = adbm.f61332j;
            int i2 = bomo.f133680a | 2;
            bomo.f133680a = i2;
            bomo.f133680a = i2 | 128;
            bomo.f133688i = z;
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bomo bomo2 = (bomo) da.f164949b;
            bomo2.f133680a |= 64;
            bomo2.f133687h = currentTimeMillis;
            bomo bomo3 = (bomo) da.mo74062i();
            bxvd da2 = bong.f133782r.mo74144da();
            String str = this.f107670n.f86312g;
            if (str != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bong bong = (bong) da2.f164949b;
                str.getClass();
                bong.f133784a |= 2;
                bong.f133786c = str;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bong bong2 = (bong) da2.f164949b;
            bong2.f133785b = 5;
            int i3 = bong2.f133784a | 1;
            bong2.f133784a = i3;
            bomo3.getClass();
            bong2.f133790g = bomo3;
            bong2.f133784a = i3 | 32;
            da2.mo74062i();
            this.f107669m.mo24333a(da2.mo74062i()).mo24327b();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo58975a(bqgy bqgy, AccountManagerFuture accountManagerFuture) {
        try {
            accountManagerFuture.getResult();
            bqgy.mo69138b(bmxv.m108566b(0));
        } catch (AuthenticatorException e) {
            mo58973a(6, "Authenticator error");
            bqgy.mo69138b(bmvz.f131120a);
        } catch (OperationCanceledException e2) {
            mo58973a(4, "Reauth canceled");
            bqgy.mo69138b(bmvz.f131120a);
        } catch (IOException e3) {
            mo58973a(3, "Network error");
            bqgy.mo69138b(bmvz.f131120a);
        }
    }

    /* renamed from: a */
    public final void mo58976a(String str) {
        Intent putExtra = new Intent().putExtra("authAccount", this.f107665i.mo7637a().name).putExtra("accountType", this.f107665i.mo7637a().type).putExtra("authtoken", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f107673t;
        if (accountAuthenticatorResponse != null) {
            Bundle extras = putExtra.getExtras();
            bmxy.m108581a(extras);
            accountAuthenticatorResponse.onResult(extras);
        }
        setResult(-1, putExtra);
        finish();
    }
}
