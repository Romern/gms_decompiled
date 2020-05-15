package p000;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.accountsettings.utils.ButtonConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ffm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ffm extends deu implements fhj {

    /* renamed from: h */
    private static final Logger f16464h = ffw.m11631a("BaseEntryPointChimeraActivity");

    /* renamed from: b */
    public ffv f16465b;

    /* renamed from: c */
    public fgh f16466c;

    /* renamed from: d */
    String f16467d;
    @Deprecated

    /* renamed from: e */
    public int f16468e;

    /* renamed from: f */
    bsxn f16469f;

    /* renamed from: g */
    boolean f16470g;

    /* renamed from: i */
    private final AtomicBoolean f16471i = new AtomicBoolean(false);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10772a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(C0126R.C0129id.as_error_content, fragment, "ERROR");
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10776b(Intent intent) {
        try {
            startActivity(intent);
            if (!isFinishing() && !isChangingConfigurations()) {
                mo10780p();
            }
        } catch (ActivityNotFoundException e) {
            mo10775a(getString(C0126R.string.accountsettings_no_activity), null, ffz.m11634a(10, "COMMON"));
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: e */
    public abstract void mo6345e();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo6346g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo6347h();

    /* renamed from: i */
    public boolean mo6356i() {
        return false;
    }

    /* renamed from: j */
    public bsxn mo6348j() {
        Intent intent = getIntent();
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        if (intent.hasExtra("extra.screenId")) {
            int intExtra = intent.getIntExtra("extra.screenId", 0);
            if (bsxl.f164950c) {
                bsxl.mo74035c();
                bsxl.f164950c = false;
            }
            bsxn bsxn = (bsxn) bsxl.f164949b;
            bsxn.f147588a |= 1;
            bsxn.f147589b = intExtra;
        }
        bsxl.mo70720a(fga.m11641a(intent));
        return (bsxn) bsxl.mo74062i();
    }

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
    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Intent mo6352k() {
        String str;
        Intent intent = getIntent();
        Intent action = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.accountsettings.mg.ui.main.MainActivity").setAction(intent.getAction());
        if (cbro.m128201e() && intent.hasExtra("extra.themeChoice")) {
            action.putExtra("extra.themeChoice", intent.getIntExtra("extra.themeChoice", 0));
        }
        action.putExtras(mo6349l());
        if (fga.m11642b(intent) && mo6356i()) {
            action.putExtra("extra.ignoreAccount", true);
        } else if (!stm.m36302d(this.f16467d)) {
            action.putExtra("extra.accountName", this.f16467d);
        }
        action.putExtra("extra.screenId", this.f16469f.f147589b);
        for (Map.Entry entry : Collections.unmodifiableMap(this.f16469f.f147590c).entrySet()) {
            String valueOf = String.valueOf((String) entry.getKey());
            action.putExtra(valueOf.length() == 0 ? new String("extra.screen.") : "extra.screen.".concat(valueOf), (String) entry.getValue());
        }
        if (cbro.m128206j()) {
            str = mo6350q();
        } else {
            str = spn.m35852a((Activity) this);
        }
        if (!stm.m36302d(str)) {
            action.putExtra("extra.callingPackageName", str);
        } else {
            action.removeExtra("extra.callingPackageName");
        }
        int u = mo6351u();
        if (u != 1) {
            int i = u - 1;
            if (u != 0) {
                action.putExtra("extra.launchApi", i);
            } else {
                throw null;
            }
        }
        if (!cbro.m128204h() || mo6346g()) {
            action.addFlags(33554432);
        }
        return action;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Bundle mo6349l() {
        Intent intent = getIntent();
        String[] strArr = {"extra.utmCampaign", "extra.utmMedium", "extra.utmSource"};
        Bundle bundle = new Bundle();
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (intent.hasExtra(str)) {
                bundle.putString(str, intent.getStringExtra(str));
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo10777m() {
        if (!isFinishing() && !isChangingConfigurations()) {
            this.f16465b = new ffv(this, this.f16467d, this.f16466c);
            if (this.f16470g) {
                mo6345e();
            }
            this.f16470g = false;
            mo10776b(mo6352k());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo10778n() {
        mo10772a(fhk.m11701a(getString(C0126R.string.accountsettings_missing_account_title), getString(C0126R.string.accountsettings_missing_account), new ButtonConfig(getString(17039360), C0126R.C0129id.as_button_action_cancel), new ButtonConfig(getString(C0126R.string.common_add_account), C0126R.C0129id.as_button_action_add_account)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo10779o() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10) {
            this.f16471i.set(false);
            if (i2 == -1 && intent != null) {
                this.f16467d = intent.getStringExtra("authAccount");
                mo10777m();
            } else {
                mo10779o();
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String str2;
        super.onCreate(bundle);
        if (cbro.m128201e()) {
            new adyf(this, eot.f15436a, C0126R.style.AsDialogThemeLight, C0126R.style.AsDialogThemeDark, 1);
        } else {
            setTheme(C0126R.style.AsDialogThemeLight);
        }
        setContentView((int) C0126R.C0128layout.as_error_content);
        if (bundle != null) {
            this.f16471i.set(bundle.getBoolean("apLaunched", false));
        }
        if (mo6347h()) {
            if (bundle == null) {
                z = true;
            } else {
                z = false;
            }
            this.f16470g = z;
            setTitle("");
            this.f16466c = new fgh(ModuleManager.get(this));
            if (!isFinishing() && !isChangingConfigurations()) {
                this.f16468e = 1;
                this.f16467d = null;
                if (getIntent() != null) {
                    bsxn j = mo6348j();
                    if ((j.f147588a & 1) == 0) {
                        bxvd bxvd = (bxvd) j.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) j);
                        bsxl bsxl = (bsxl) bxvd;
                        if (bsxl.f164950c) {
                            bsxl.mo74035c();
                            bsxl.f164950c = false;
                        }
                        bsxn bsxn = (bsxn) bsxl.f164949b;
                        bsxn bsxn2 = bsxn.f147586d;
                        bsxn.f147588a |= 1;
                        bsxn.f147589b = 1;
                        j = (bsxn) bsxl.mo74062i();
                    }
                    this.f16469f = j;
                    this.f16468e = j.f147589b;
                    str2 = getIntent().getStringExtra("extra.accountName");
                    str = getIntent().getStringExtra("extra.fallbackUrl");
                } else {
                    str2 = null;
                    str = null;
                }
                if (!fga.m11642b(getIntent()) || !mo6356i()) {
                    List<Account> d = soz.m35801d(this, getPackageName());
                    if (stm.m36302d(str2)) {
                        if (!mo6356i()) {
                            if (d.size() == 1) {
                                this.f16467d = ((Account) d.get(0)).name;
                            } else if (!d.isEmpty()) {
                                mo10774a((String) null);
                                return;
                            } else if (mo6354s() == 1) {
                                mo10778n();
                                return;
                            } else {
                                return;
                            }
                        }
                    } else if (str == null && d.isEmpty()) {
                        mo10778n();
                        return;
                    } else {
                        for (Account account : d) {
                            if (str2.equals(account.name)) {
                                this.f16467d = str2;
                            }
                        }
                        if (mo6355t() != 2) {
                            mo10774a(getString(C0126R.string.accountsettings_different_account, new Object[]{str2}));
                            return;
                        }
                        return;
                    }
                }
                mo10777m();
            }
        } else if (mo6353r() == 1) {
            f16464h.mo25418e("Starting activity is not allowed and no fallback url is provided.", new Object[0]);
            mo10779o();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("apLaunched", this.f16471i.get());
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo10780p() {
        setResult(-1);
        finish();
    }

    /* renamed from: q */
    public abstract String mo6350q();

    /* renamed from: r */
    public int mo6353r() {
        return 1;
    }

    /* renamed from: s */
    public int mo6354s() {
        return 1;
    }

    /* renamed from: t */
    public int mo6355t() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract int mo6351u();

    /* renamed from: a */
    public final void mo10773a(fhk fhk, int i) {
        ButtonConfig buttonConfig;
        if (i == 1) {
            buttonConfig = fhk.m11700a(fhk.getArguments(), "neutralBtn");
        } else if (i != 2) {
            buttonConfig = fhk.m11700a(fhk.getArguments(), "positiveBtn");
        } else {
            buttonConfig = fhk.m11700a(fhk.getArguments(), "negativeBtn");
        }
        if (buttonConfig == null) {
            f16464h.logVerbose("Can't handle the click, no button config", new Object[0]);
            return;
        }
        int i2 = buttonConfig.f7811b;
        if (i2 == C0126R.C0129id.as_button_action_add_account) {
            Intent flags = new Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(268435456);
            int i3 = Build.VERSION.SDK_INT;
            flags.putExtra("account_types", new String[]{"com.google"});
            mo10776b(flags);
        } else if (i2 == C0126R.C0129id.as_button_action_cancel || i2 == C0126R.C0129id.as_button_action_ok) {
            mo10779o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10774a(String str) {
        if (!this.f16471i.getAndSet(true)) {
            Intent a = rew.m33486a(null, null, new String[]{"com.google"}, true, str, false, 1, 2, null, true);
            if (!a.hasExtra("realClientPackage")) {
                a.putExtra("realClientPackage", "com.google.android.gms");
            }
            acyp a2 = acyq.m50010a();
            a2.mo33245a(bmxv.m108566b(1001));
            a2.mo33246b(bmxv.m108566b(getResources().getString(C0126R.string.common_choose_account)));
            a.putExtra("first_party_options_bundle", a2.mo33244a().f61085a);
            startActivityForResult(a, 10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10775a(String str, String str2, String str3) {
        ButtonConfig buttonConfig = new ButtonConfig(getString(17039370), C0126R.C0129id.as_button_action_ok);
        ffv ffv = this.f16465b;
        if (ffv != null) {
            bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
            bsmt bsmt = bsmt.ACCOUNT_SETTINGS_MOBILE_MENU;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp = (bspp) bxvf.f164949b;
            bspp.f146556b = bsmt.f145305dO;
            int i = bspp.f146555a | 1;
            bspp.f146555a = i;
            bspp.f146557c = 2008;
            int i2 = i | 2;
            bspp.f146555a = i2;
            bspp.f146555a = i2 | 16;
            bspp.f146560f = true;
            bsof a = ffv.mo10784a();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp2 = (bspp) bxvf.f164949b;
            a.getClass();
            bspp2.f146562h = a;
            int i3 = bspp2.f146555a | 64;
            bspp2.f146555a = i3;
            if (str3 != null) {
                str3.getClass();
                bspp2.f146555a = i3 | 4;
                bspp2.f146558d = str3;
            }
            bxvd da = bspq.f146567d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspq bspq = (bspq) da.f164949b;
            bspp bspp3 = (bspp) bxvf.mo74062i();
            bspp3.getClass();
            bspq.f146570b = bspp3;
            bspq.f146569a |= 1;
            ffv.mo10788a((bspq) da.mo74062i());
        }
        mo10772a(fhk.m11701a(str2, str, null, buttonConfig));
    }
}
