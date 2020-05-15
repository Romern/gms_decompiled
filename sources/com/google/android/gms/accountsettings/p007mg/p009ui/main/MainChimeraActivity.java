package com.google.android.gms.accountsettings.p007mg.p009ui.main;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.accountsettings.mg.ui.main.MainChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MainChimeraActivity extends deu implements ffh, eyn, evc {

    /* renamed from: b */
    public static final bsxn f7788b;

    /* renamed from: c */
    public fdu f7789c;

    /* renamed from: d */
    public SharedPreferences f7790d;

    /* renamed from: e */
    private ffg f7791e;

    /* renamed from: f */
    private fgl f7792f;

    /* renamed from: g */
    private bdej f7793g;

    /* renamed from: h */
    private boolean f7794h;

    /* renamed from: i */
    private eym f7795i;

    static {
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        if (bsxl.f164950c) {
            bsxl.mo74035c();
            bsxl.f164950c = false;
        }
        bsxn bsxn = (bsxn) bsxl.f164949b;
        bsxn.f147588a |= 1;
        bsxn.f147589b = 0;
        f7788b = (bsxn) bsxl.mo74062i();
        C1353sk.m20237n();
    }

    /* renamed from: g */
    private final void m4985g() {
        if (this.f7793g == null) {
            bqgj a = snp.m35702a(9);
            this.f7793g = new bdej(a);
            allp a2 = allq.m61232a();
            a2.f73626a = byug.ACCOUNT_SETTINGS_MOBILE.f168292ja;
            AccountParticleDisc.m94876a(this, this.f7793g, a, new bddp(), new bddr(this, a, a2.mo40491a()), bddo.class);
        }
    }

    /* renamed from: h */
    private final bsxn m4986h() {
        sre.m36087g(this);
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        int intExtra = getIntent().getIntExtra("extra.screenId", 1);
        if (bsxl.f164950c) {
            bsxl.mo74035c();
            bsxl.f164950c = false;
        }
        bsxn bsxn = (bsxn) bsxl.f164949b;
        bsxn.f147588a = 1 | bsxn.f147588a;
        bsxn.f147589b = intExtra;
        bsxl.mo70720a(fga.m11641a(getIntent()));
        return (bsxn) bsxl.mo74062i();
    }

    /* renamed from: i */
    private final ffk m4987i() {
        if (fga.m11642b(getIntent())) {
            return ffk.f16456b;
        }
        List<Account> d = soz.m35801d(this, getPackageName());
        String stringExtra = getIntent().getStringExtra("extra.accountName");
        if (bmxx.m108577a(stringExtra)) {
            stringExtra = this.f7790d.getString("google.account_settings.selected_account", null);
        }
        boolean z = false;
        for (Account account : d) {
            z |= account.name.equals(stringExtra);
        }
        if (!bmxx.m108577a(stringExtra) && z) {
            return ffr.m11619a(stringExtra);
        }
        if (!d.isEmpty()) {
            return ffr.m11619a(((Account) d.get(0)).name);
        }
        return ffk.f16456b;
    }

    /* renamed from: a */
    public final bdej mo6337a() {
        m4985g();
        return this.f7793g;
    }

    /* renamed from: b */
    public final eym mo6339b() {
        if (this.f7795i == null) {
            this.f7795i = ((exa) getSupportFragmentManager().findFragmentByTag("activityRetained")).f15963b;
        }
        return this.f7795i;
    }

    /* renamed from: c */
    public final ffg mo6340c() {
        if (this.f7791e == null) {
            this.f7791e = ((exa) getSupportFragmentManager().findFragmentByTag("activityRetained")).f15962a;
        }
        return this.f7791e;
    }

    /* renamed from: e */
    public final fbs mo6341e() {
        if (fbt.m11412a(this, "splashScreen") || fbt.m11412a(this, "onboarding")) {
            return fbs.CROSS_FADE;
        }
        return fbs.INSTANT;
    }

    public final void onBackPressed() {
        this.f7789c.f16344a.mo10749a(feg.BACK);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        Integer num;
        exa exa;
        int i;
        super.onCreate(bundle);
        if (cbro.m128201e()) {
            bmzi bmzi = eot.f15436a;
            int intExtra = getIntent().getIntExtra("extra.themeChoice", 0);
            if (intExtra < 0 || intExtra >= adye.m51385a().length) {
                i = 1;
            } else {
                i = adye.m51385a()[intExtra];
            }
            new adyf(this, bmzi, C0126R.style.AsAppTheme, C0126R.style.AsAppThemeDark, i);
            this.f7794h = adyf.m51386a(eot.f15436a);
        }
        this.f7790d = getApplicationContext().getSharedPreferences("google.account_settings", 0);
        getWindow().setSoftInputMode(32);
        setTitle((int) C0126R.string.common_asm_google_account_title);
        setContentView((int) C0126R.C0128layout.as_main_activity);
        m4985g();
        bspi bspi = null;
        if (cbro.m128206j()) {
            Intent intent = getIntent();
            if (intent != null) {
                if (intent.hasExtra("extra.callingPackageName")) {
                    str = intent.getStringExtra("extra.callingPackageName");
                } else if ("com.google.android.gms.accountsettings.MY_ACCOUNT".equals(intent.getAction())) {
                    str = "com.google.android.gms";
                }
            }
            str = null;
        } else {
            Intent intent2 = getIntent();
            ComponentName b = spn.m35865b((Activity) this);
            String action = intent2.getAction();
            if (intent2.hasExtra("extra.callingPackageName")) {
                str = intent2.getStringExtra("extra.callingPackageName");
            } else if ("com.google.android.gms.accountsettings.MY_ACCOUNT".equals(action)) {
                int i2 = Build.VERSION.SDK_INT;
                str = "o-settings";
            } else {
                str = b != null ? b.getPackageName() : intent2.hasExtra("com.android.browser.application_id") ? intent2.getStringExtra("com.android.browser.application_id") : null;
            }
        }
        if (getSupportFragmentManager().findFragmentByTag("activityRetained") == null) {
            if (cbro.m128206j()) {
                exa = exa.m11254a(m4986h(), m4987i(), str);
            } else {
                exa = exa.m11254a(m4986h(), m4987i(), null);
            }
            getSupportFragmentManager().beginTransaction().add(exa, "activityRetained").commitNow();
        }
        ffg c = mo6340c();
        fdu fdu = new fdu(c.f16446a, c.f16447b, c.f16448c, c.f16449d, c.f16450e);
        this.f7789c = fdu;
        fdu.f16345b.f16266d.mo2445a(this, new ffi(this));
        if (bundle == null) {
            int a = bsor.m116045a(getIntent().getIntExtra("extra.launchApi", 0));
            bsxn h = m4986h();
            "screenFlavor".getClass();
            if (h.f147590c.containsKey("screenFlavor")) {
                "screenFlavor".getClass();
                bxww bxww = h.f147590c;
                if (bxww.containsKey("screenFlavor")) {
                    num = (Integer) bmxu.m108565a(bqcn.m112582a((String) bxww.get("screenFlavor")), 0);
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                num = null;
            }
            ffv a2 = ffv.m11622a(getApplicationContext(), this.f7789c.f16345b.mo10683b());
            int i3 = h.f147589b;
            Intent intent3 = getIntent();
            bxvd da = bspi.f146504e.mo74144da();
            String stringExtra = intent3.getStringExtra("extra.utmCampaign");
            if (stringExtra != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bspi bspi2 = (bspi) da.f164949b;
                stringExtra.getClass();
                bspi2.f146506a |= 4;
                bspi2.f146509d = stringExtra;
            }
            String stringExtra2 = intent3.getStringExtra("extra.utmMedium");
            if (stringExtra2 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bspi bspi3 = (bspi) da.f164949b;
                stringExtra2.getClass();
                bspi3.f146506a |= 2;
                bspi3.f146508c = stringExtra2;
            }
            String stringExtra3 = intent3.getStringExtra("extra.utmSource");
            if (stringExtra3 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bspi bspi4 = (bspi) da.f164949b;
                stringExtra3.getClass();
                bspi4.f146506a |= 1;
                bspi4.f146507b = stringExtra3;
            }
            if (cbro.m128206j() && "com.google.android.gms.accountsettings.MY_ACCOUNT".equals(intent3.getAction())) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bspi bspi5 = (bspi) da.f164949b;
                "android-settings".getClass();
                int i4 = bspi5.f146506a | 1;
                bspi5.f146506a = i4;
                bspi5.f146507b = "android-settings";
                "account".getClass();
                bspi5.f146506a = i4 | 2;
                bspi5.f146508c = "account";
            }
            int i5 = ((bspi) da.f164949b).f146506a;
            if (!((i5 & 4) == 0 && (i5 & 2) == 0 && (i5 & 1) == 0)) {
                bspi = (bspi) da.mo74062i();
            }
            bxvd da2 = bsos.f146416g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsos bsos = (bsos) da2.f164949b;
            int i6 = bsos.f146418a | 2;
            bsos.f146418a = i6;
            bsos.f146420c = i3;
            if (str != null) {
                str.getClass();
                bsos.f146418a = i6 | 1;
                bsos.f146419b = str;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsos bsos2 = (bsos) da2.f164949b;
                bsos2.f146418a |= 8;
                bsos2.f146421d = intValue;
            }
            if (a != 0) {
                bsos bsos3 = (bsos) da2.f164949b;
                bsos3.f146422e = a - 1;
                bsos3.f146418a |= 16;
            }
            if (bspi != null) {
                bsos bsos4 = (bsos) da2.f164949b;
                bspi.getClass();
                bsos4.f146423f = bspi;
                bsos4.f146418a |= 32;
            }
            bxvd da3 = bspq.f146567d.mo74144da();
            bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
            bsof a3 = a2.mo10784a();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp = (bspp) bxvf.f164949b;
            a3.getClass();
            bspp.f146562h = a3;
            bspp.f146555a |= 64;
            bxvd da4 = bsog.f146371f.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsog bsog = (bsog) da4.f164949b;
            bsos bsos5 = (bsos) da2.mo74062i();
            bsos5.getClass();
            bsog.f146374b = bsos5;
            bsog.f146373a |= 1;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp2 = (bspp) bxvf.f164949b;
            bsog bsog2 = (bsog) da4.mo74062i();
            bsog2.getClass();
            bspp2.f146565k = bsog2;
            bspp2.f146555a |= 2048;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bspq bspq = (bspq) da3.f164949b;
            bspp bspp3 = (bspp) bxvf.mo74062i();
            bspp3.getClass();
            bspq.f146570b = bspp3;
            bspq.f146569a |= 1;
            a2.mo10788a((bspq) da3.mo74062i());
        }
        fdu fdu2 = this.f7789c;
        fdu2.f16345b.mo10680a(fdu2.f16346c.mo10756b());
        this.f7789c.f16348e.mo2445a(this, new ffj(this));
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        int i = Build.VERSION.SDK_INT;
        if (this.f7792f == null) {
            this.f7792f = new fgl(this);
        }
        fgl fgl = this.f7792f;
        bmza bmza = fgl.f16516c;
        if (bmza == null || bmza.mo66928a(TimeUnit.MILLISECONDS) > cbri.f178135a.mo6606a().mo75266p()) {
            if (fgl.f16515b.size() > 1) {
                String join = TextUtils.join("\"><img src=\"", fgl.f16515b);
                StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 51);
                sb.append("<html><head></head><body><img src=\"");
                sb.append(join);
                sb.append("\"></body></html>");
                fgl.f16514a.loadData(sb.toString(), "text/html", null);
            } else if (fgl.f16515b.size() == 1 && !bmxx.m108577a((String) fgl.f16515b.get(0))) {
                fgl.f16514a.loadUrl((String) fgl.f16515b.get(0));
            }
            fgl.f16516c = bmza.m108659b(new srg());
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (cbro.m128201e()) {
            bundle.putBoolean("wasDarkThemeEnabled", this.f7794h);
        }
    }

    /* renamed from: a */
    public final void mo6338a(Fragment fragment, String str, fbs fbs) {
        fbt.m11409a(this, getSupportFragmentManager(), fragment, str, fbs);
    }
}
