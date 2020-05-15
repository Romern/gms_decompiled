package com.google.android.gms.signin.activity;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SignInChimeraActivity extends adcc {

    /* renamed from: b */
    public static final sek f107676b = aqom.m71874a("SignInChimeraActivity");

    /* renamed from: q */
    private static final bnhe f107677q;

    /* renamed from: r */
    private static final bnic f107678r = bnic.m109494a(aqkq.f86289a, aqkq.f86290b, ankt.f77033c, new Scope("https://www.googleapis.com/auth/userinfo.profile"), new Scope("https://www.googleapis.com/auth/userinfo.email"), new Scope("openid"), new Scope[0]);

    /* renamed from: c */
    public final bqgj f107679c = bqgs.m112811a((ExecutorService) sne.m35694a(1, 9));

    /* renamed from: d */
    public int f107680d;

    /* renamed from: e */
    public String f107681e;

    /* renamed from: f */
    public boolean f107682f;

    /* renamed from: g */
    public Account f107683g;

    /* renamed from: h */
    public Set f107684h;

    /* renamed from: i */
    public String f107685i;

    /* renamed from: j */
    public String f107686j;

    /* renamed from: k */
    public Intent f107687k;

    /* renamed from: l */
    public rkb f107688l;

    /* renamed from: m */
    public qws f107689m;

    /* renamed from: n */
    public aqkt f107690n;

    /* renamed from: p */
    public aqnv f107691p;

    /* renamed from: s */
    private adap f107692s;

    /* renamed from: t */
    private adan f107693t;

    /* renamed from: u */
    private adam f107694u;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(1, adbo.FETCH_TOS_AND_PP);
        h.mo67695b(2, adbo.CHOOSE_ACCOUNT);
        h.mo67695b(3, adbo.RECORD_ACCOUNT_CHIP_CONSENT);
        h.mo67695b(4, adbo.PRE_CONSENT);
        h.mo67695b(5, adbo.CONSENT);
        h.mo67695b(6, adbo.SAVE_SELECTED_ACCOUNT);
        f107677q = h.mo67618b();
    }

    /* renamed from: a */
    public static Intent m92496a(Context context, String str, Scope[] scopeArr, Intent intent, Bundle bundle) {
        if (intent != null) {
            intent.putExtra("SIGN_IN_PACKAGE_NAME", str);
            intent.putExtra("SIGN_IN_SCOPE_ARRAY", scopeArr);
            intent.putExtra("sign_in_options", bundle);
        }
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.signin.activity.SignInActivity");
        intent2.putExtra("SIGN_IN_PACKAGE_NAME", str);
        intent2.putExtra("start_step", 5);
        intent2.putExtra("SIGN_IN_SCOPE_ARRAY", scopeArr);
        intent2.putExtra("consent_intent", intent);
        intent2.putExtra("sign_in_options", bundle);
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        intent2.addCategory(valueOf.length() == 0 ? new String("categoryhack:") : "categoryhack:".concat(valueOf));
        return intent2;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: e */
    public final void mo58981e() {
        bqgy bqgy;
        Intent intent;
        adas adas;
        f107676b.mo25409a("startNextStep() is called, signInStep=%d.", Integer.valueOf(this.f107680d));
        int i = this.f107680d;
        switch (i) {
            case 1:
                if (!bnfi.m109235a(bmyx.m108640a(',').mo66917a().mo66920b().mo66918a((CharSequence) aqnw.f86400a.mo58455c())).mo67506b(new aqmm(stu.m36323i()))) {
                    bqgy = bqdf.m112619a(this.f107693t.mo33292a(1, new aqml(this)), IOException.class, new aqmq(this), this.f107692s);
                    break;
                } else {
                    bqgy c = bqgy.m112818c();
                    new AlertDialog.Builder(this).setCancelable(true).setTitle((int) C0126R.string.signin_not_supported_dialog_title).setMessage((int) C0126R.string.signin_not_supported_dialog_message).setPositiveButton(17039370, aqms.f86373a).setOnCancelListener(new aqmt(this, c)).create().show();
                    bqgy = c;
                    break;
                }
            case 2:
                boolean booleanExtra = getIntent().getBooleanExtra("SIGN_IN_SAVE_DEFAULT_ACCOUNT", false);
                if (cgmv.f187328a.mo6606a().mo84128a()) {
                    res res = new res();
                    res.mo24564a(Arrays.asList("com.google"));
                    res.mo24565b();
                    res.f42826d = booleanExtra;
                    res.mo24566c();
                    res.f42829g = getIntent().getStringExtra("hosted_domain");
                    res.f42827e = this.f107681e;
                    res.f42828f = 1000;
                    ret ret = new ret();
                    ret.f42835b = this.f107686j;
                    ret.f42834a = this.f107685i;
                    reu reu = new reu();
                    reu.f42837b = ret.f42835b;
                    reu.f42836a = ret.f42834a;
                    res.f42830h = reu;
                    intent = rew.m33488a(res.mo24563a());
                } else {
                    intent = rew.m33486a(null, null, new String[]{"com.google"}, true, null, booleanExtra, 0, 2, getIntent().getStringExtra("hosted_domain"), true);
                    intent.putExtra("realClientPackage", this.f107681e);
                    acyp a = acyq.m50010a();
                    a.mo33245a(bmxv.m108566b(1000));
                    bmxv c2 = bmxv.m108567c(this.f107686j);
                    bmxv c3 = bmxv.m108567c(this.f107685i);
                    a.f61084a.putBoolean("should_show_consent", true);
                    a.f61084a.putString("privacy_policy_url", (String) c2.mo66815c());
                    a.f61084a.putString("terms_of_service_url", (String) c3.mo66815c());
                    intent.putExtra("first_party_options_bundle", a.mo33244a().f61085a);
                }
                bqgy = bqdx.m112673a(this.f107694u.mo33291a(2, intent), new aqmr(this), this.f107692s);
                break;
            case 3:
                if (f107678r.containsAll(this.f107684h)) {
                    Account account = this.f107683g;
                    bmxy.m108581a(account);
                    RecordConsentRequest recordConsentRequest = new RecordConsentRequest(1, account, (Scope[]) this.f107684h.toArray(new Scope[0]), getIntent().getStringExtra("service_client_id"));
                    if (!cgmm.m146206b()) {
                        bqgy = bqdx.m112673a(this.f107693t.mo33292a(3, new aqmx(this, recordConsentRequest)), aqmb.f86354a, this.f107692s);
                        break;
                    } else {
                        bqgy = bqdx.m112673a(bqdf.m112619a(this.f107693t.mo33292a(3, new aqmu(this, recordConsentRequest)), rjp.class, aqmv.f86378a, this.f107692s), aqmw.f86379a, this.f107692s);
                        break;
                    }
                } else {
                    bqgy = bqga.m112775a(bmxv.m108566b(4));
                    break;
                }
            case 4:
                if (this.f107687k == null) {
                    if (cgmm.m146206b()) {
                        adas = this.f107693t.mo33292a(4, new aqmc(this));
                    } else {
                        adas = this.f107693t.mo33292a(4, new aqmd(this));
                    }
                    bqgy = bqdx.m112673a(adas, new aqme(this), this.f107692s);
                    break;
                } else {
                    bqgy = bqga.m112775a(bmxv.m108566b(5));
                    break;
                }
            case 5:
                adam adam = this.f107694u;
                Intent intent2 = this.f107687k;
                bmxy.m108581a(intent2);
                bqgy = bqdx.m112673a(adam.mo33291a(5, intent2), new aqmf(this), this.f107692s);
                break;
            case 6:
                int intExtra = getIntent().getIntExtra("com.google.android.gms.signin.extraSessionId", -1);
                if (intExtra != -1) {
                    if (!cgmm.m146206b()) {
                        bqgy = bqdx.m112673a(this.f107693t.mo33292a(6, new aqmj(this, intExtra)), new aqmk(this), this.f107692s);
                        break;
                    } else {
                        bqgy = bqdx.m112673a(bqdf.m112619a(this.f107693t.mo33292a(6, new aqmg(this, intExtra)), rjp.class, aqmh.f86361a, this.f107692s), new aqmi(this), this.f107692s);
                        break;
                    }
                } else {
                    mo58979a(-1, null);
                    bqgy = bqga.m112775a(bmvz.f131120a);
                    break;
                }
            default:
                throw new IllegalStateException(String.format("Unknown sign-in step: %d", Integer.valueOf(i)));
        }
        bqga.m112781a(bqgy, new aqmy(this, System.currentTimeMillis()), this.f107692s);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(2132017796);
        this.f107689m = new qws(this, "IDENTITY_GMSCORE", null);
        if (bundle != null) {
            this.f107681e = bundle.getString("SIGN_IN_PACKAGE_NAME");
            this.f107682f = bundle.getBoolean("launched_by_gmscore");
            m92498a(bundle);
        } else {
            String a = spn.m35852a((Activity) this);
            this.f107681e = a;
            boolean equalsIgnoreCase = "com.google.android.gms".equalsIgnoreCase(a);
            this.f107682f = equalsIgnoreCase;
            if (equalsIgnoreCase) {
                this.f107681e = (String) bmxu.m108565a(getIntent().getStringExtra("SIGN_IN_PACKAGE_NAME"), this.f107681e);
            }
            Bundle extras = getIntent().getExtras();
            bmxy.m108581a(extras);
            m92498a(extras);
            aqkt aqkt = this.f107690n;
            if (aqkt.f86312g == null) {
                aqks aqks = new aqks();
                aqkt aqkt2 = aqkt.f86306a;
                aqks.f86297a = aqkt.f86307b;
                aqks.f86298b = aqkt.f86308c;
                aqks.f86299c = aqkt.f86309d;
                aqks.f86300d = aqkt.f86310e;
                aqks.f86301e = aqkt.f86311f;
                aqks.f86302f = aqkt.f86312g;
                aqks.f86303g = aqkt.f86313h;
                aqks.f86304h = aqkt.f86314i;
                aqks.f86305i = aqkt.f86315j;
                aqks.f86302f = adbv.m50143a();
                aqkt a2 = aqks.mo47941a();
                this.f107690n = a2;
                if (cgmd.m146192b()) {
                    this.f107689m.mo24333a(addd.m50199a(this.f107681e, (Scope[]) this.f107684h.toArray(new Scope[0]), a2)).mo24327b();
                }
            }
        }
        if (cgmd.m146192b()) {
            adbs.m50134a(this, this, new aqmo(this));
        }
        sek sek = f107676b;
        String valueOf = String.valueOf(this.f107690n.f86312g);
        sek.mo25412b(valueOf.length() == 0 ? new String("Log Session ID: ") : "Log Session ID: ".concat(valueOf), new Object[0]);
        this.f107692s = new adap(new adzt(Looper.getMainLooper()));
        if (cgmm.m146206b() && this.f107691p == null) {
            String str = this.f107681e;
            Bundle a3 = this.f107690n.mo47943a();
            a3.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
            this.f107691p = aqna.m71792a(this, aqkp.m71760a(a3));
        } else {
            String str2 = this.f107681e;
            aqkt aqkt3 = this.f107690n;
            rjy rjy = new rjy(this);
            rjy.mo24776a(this, new aqmn(this));
            rjy.mo24780a(aqkq.f86292d, aqkp.m71760a(aqkt3.mo47943a()));
            rjy.f43173b = str2;
            this.f107688l = rjy.mo24784b();
        }
        this.f107693t = adan.m50084a((FragmentActivity) this);
        this.f107694u = adam.m50082a(this);
        mo58981e();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("start_step", this.f107680d);
        bundle.putParcelable("picked_account", this.f107683g);
        bundle.putString("SIGN_IN_PACKAGE_NAME", this.f107681e);
        bundle.putBoolean("launched_by_gmscore", this.f107682f);
        bundle.putParcelableArray("SIGN_IN_SCOPE_ARRAY", (Parcelable[]) this.f107684h.toArray(new Scope[0]));
        bundle.putString("terms_of_service_url", this.f107685i);
        bundle.putString("privacy_policy_url", this.f107686j);
        bundle.putParcelable("consent_intent", this.f107687k);
        bundle.putBundle("sign_in_options", this.f107690n.mo47943a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sbv.a(java.lang.String, com.google.android.gms.common.api.Scope[], boolean):android.content.Intent
     arg types: [java.lang.String, com.google.android.gms.common.api.Scope[], int]
     candidates:
      sbv.a(android.content.Context, java.lang.String, java.lang.String):void
      sbv.a(android.content.Context, java.lang.String, int[]):void
      sbv.a(java.lang.String, com.google.android.gms.common.api.Scope[], boolean):android.content.Intent */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static Intent m92497a(String str, Scope[] scopeArr, Bundle bundle, int i) {
        Intent a = sbv.m34873a(str, scopeArr, false);
        a.putExtra("complete_sign_in_process", true);
        a.putExtra("sign_in_options", bundle);
        a.putExtra("com.google.android.gms.signin.extraSessionId", i);
        a.putExtra("service_client_id", bundle.getString("com.google.android.gms.signin.internal.serverClientId"));
        a.putExtra("hosted_domain", bundle.getString("com.google.android.gms.signin.internal.hostedDomain"));
        return a;
    }

    /* renamed from: a */
    private final void m92498a(Bundle bundle) {
        int i;
        if (bundle.containsKey("start_step")) {
            i = bundle.getInt("start_step");
        } else {
            i = 1;
        }
        this.f107680d = i;
        this.f107683g = (Account) bundle.getParcelable("picked_account");
        Parcelable[] parcelableArray = bundle.getParcelableArray("SIGN_IN_SCOPE_ARRAY");
        if (parcelableArray != null) {
            this.f107684h = bnfi.m109237a(parcelableArray).mo67501a(aqma.f86353a).mo67508c();
        }
        this.f107685i = bundle.getString("terms_of_service_url");
        this.f107686j = bundle.getString("privacy_policy_url");
        this.f107687k = (Intent) bundle.getParcelable("consent_intent");
        Bundle bundle2 = bundle.getBundle("sign_in_options");
        this.f107690n = bundle2 != null ? aqks.m71765a(bundle2).mo47941a() : new aqks().mo47941a();
    }

    /* renamed from: a */
    public final void mo58979a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo58980a(long j, int i, boolean z) {
        if (cgmd.m146192b()) {
            bxvd da = bomo.f133678j.mo74144da();
            adbo adbo = (adbo) f107677q.get(Integer.valueOf(i));
            bmxy.m108581a(adbo);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bomo bomo = (bomo) da.f164949b;
            bomo.f133681b = adbo.f61343i;
            int i2 = bomo.f133680a | 1;
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
            String str = this.f107690n.f86312g;
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
            qws qws = this.f107689m;
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
            qws.mo24333a(da2.mo74062i()).mo24327b();
        }
    }
}
