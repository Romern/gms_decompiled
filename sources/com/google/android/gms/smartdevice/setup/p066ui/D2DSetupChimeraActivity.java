package com.google.android.gms.smartdevice.setup.p066ui;

import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.CompanionApp;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class D2DSetupChimeraActivity extends deu implements asas, arok, arww, aryt, arwz, asah, arzw, arxn, aryz, arzd, asam, arwr, asba {

    /* renamed from: b */
    public static final sek f108197b = ascp.m73787a("Setup", "UI", "D2DSetupChimeraActivity");

    /* renamed from: x */
    private static final ExecutorService f108198x = snp.m35704b(9);

    /* renamed from: A */
    private ConnectionRequest f108199A;

    /* renamed from: c */
    SourceLogManager f108200c;

    /* renamed from: d */
    int f108201d;

    /* renamed from: e */
    ArrayList f108202e = new ArrayList();

    /* renamed from: f */
    public String f108203f;

    /* renamed from: g */
    public arxy f108204g;

    /* renamed from: h */
    private D2DDevice f108205h;

    /* renamed from: i */
    private aqzm f108206i = aqzm.UNKNOWN;

    /* renamed from: j */
    private int f108207j;

    /* renamed from: k */
    private boolean f108208k;

    /* renamed from: l */
    private Integer f108209l = -99999;

    /* renamed from: m */
    private ArrayList f108210m;

    /* renamed from: n */
    private boolean f108211n;

    /* renamed from: o */
    private boolean f108212o = false;

    /* renamed from: p */
    private adyd f108213p;

    /* renamed from: q */
    private int f108214q;

    /* renamed from: r */
    private String f108215r;

    /* renamed from: s */
    private String f108216s;

    /* renamed from: t */
    private arwt f108217t;

    /* renamed from: u */
    private String f108218u;

    /* renamed from: v */
    private aryg f108219v;

    /* renamed from: w */
    private ascm f108220w;

    /* renamed from: y */
    private boolean f108221y;

    /* renamed from: z */
    private boolean f108222z;

    /* renamed from: A */
    private final void m92894A() {
        CompanionApp companionApp = mo59172o().f107835h;
        if (companionApp == null) {
            m92907e(0);
            return;
        }
        String str = companionApp.f107863e;
        String str2 = companionApp.f107861c;
        if (TextUtils.isEmpty(str2)) {
            f108197b.mo25418e("Cannot install companion app; package name is null or empty", new Object[0]);
            m92907e(0);
        } else if (new ascc(this).mo49035a(str2)) {
            f108197b.mo25414c("No need to install companion app, it's already installed", new Object[0]);
            m92907e(2);
        } else {
            if (TextUtils.isEmpty(str)) {
                str = getResources().getString(C0126R.string.smartdevice_install_app_reason, companionApp.f107860b, this.f108205h.f107874c);
            }
            String string = getString(C0126R.string.smartdevice_install_app);
            sdo.m34959a((Object) str);
            arwx arwx = new arwx();
            Bundle bundle = new Bundle();
            bundle.putString("smartdevice.message", str);
            bundle.putString("smartdevice.title", string);
            arwx.setArguments(bundle);
            m92903a(arwx);
        }
    }

    /* renamed from: B */
    private final void m92895B() {
        startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(com.google.android.gms.smartdevice.d2d.BootstrapOptions, boolean):void
     arg types: [com.google.android.gms.smartdevice.d2d.BootstrapOptions, int]
     candidates:
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(int, android.os.Bundle):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(int, int):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(java.lang.String, java.lang.String):void
      aryt.a(int, int):void
      asba.a(java.lang.String, java.lang.String):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(com.google.android.gms.smartdevice.d2d.BootstrapOptions, boolean):void */
    /* renamed from: C */
    private final void m92896C() {
        if (!arze.m73708a(this)) {
            int i = Build.VERSION.SDK_INT;
            if (aqxm.m72201b() && arza.m73699a(this)) {
                m92903a(arza.m73698a(getString(C0126R.string.smartdevice_d2d_fingerprint_title), getString(C0126R.string.smartdevice_d2d_fingerprint_verification_text, new Object[]{mo59172o().f107834g}), false));
            } else if (this.f108206i != aqzm.AUTO || !cgou.m146379d()) {
                m92903a(m92911u());
            } else {
                arzc arzc = new arzc();
                Bundle bundle = new Bundle();
                bundle.putString("lockScreenText", null);
                arzc.setArguments(bundle);
                if (!isFinishing()) {
                    getSupportFragmentManager().beginTransaction().add(arzc, "smartdevice.headlessfragment").commit();
                }
                f108197b.mo25409a("Added headless Lock Screen fragment", new Object[0]);
            }
        } else {
            m92905a(mo59172o(), false);
        }
    }

    /* renamed from: D */
    private final int m92897D() {
        boolean z;
        BootstrapOptions bootstrapOptions = this.f108204g.f88436g;
        boolean z2 = true;
        if (bootstrapOptions == null || !asbu.m73761a(bootstrapOptions)) {
            z = false;
        } else {
            z = true;
        }
        if (bootstrapOptions == null || arsq.m73409a(this, bootstrapOptions.f107848u) == boui.NONE) {
            z2 = false;
        }
        return !z ? z2 ? C0126R.string.copy_confirmation_description : C0126R.string.smartdevice_d2d_copy_account_text : z2 ? C0126R.string.copy_confirmation_description_3p : C0126R.string.smartdevice_d2d_copy_3p_account_text;
    }

    /* renamed from: E */
    private final int m92898E() {
        return this.f108213p.mo33916a("com.google").length;
    }

    /* renamed from: a */
    public static Intent m92899a(Context context, D2DDevice d2DDevice, int i, String str, SourceLogManager sourceLogManager) {
        sdo.m34959a(context);
        sdo.m34959a(d2DDevice);
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.d2dDevice", sef.m35075b(d2DDevice));
        bundle.putInt("smartdevice.trigger", i);
        bundle.putString("smartdevice.pin", str);
        bundle.putParcelable("smartdevice.sourceLogManager", sourceLogManager);
        return new Intent().setClassName(context, "com.google.android.gms.smartdevice.setup.ui.D2DSetupActivity").putExtras(bundle);
    }

    /* renamed from: c */
    private final DialogFragment m92906c(String str) {
        String str2;
        if (TextUtils.isEmpty(null)) {
            str2 = getString(C0126R.string.common_something_went_wrong);
        } else {
            str2 = null;
        }
        return aryu.m73694a(4, str2, str, getString(C0126R.string.common_ok), null, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: arpg.a(int, boolean):void
     arg types: [?, int]
     candidates:
      arpg.a(java.lang.String, int):void
      arpg.a(int, boolean):void */
    /* renamed from: e */
    private final void m92907e(int i) {
        SourceLogManager sourceLogManager = this.f108200c;
        bxvd da = bovw.f135063l.mo74144da();
        bxvd da2 = bovh.f135021c.mo74144da();
        if (i != 0) {
            if (i == 1) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bovh bovh = (bovh) da2.f164949b;
                bovh.f135024b = 3;
                bovh.f135023a |= 1;
            } else if (i == 2) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bovh bovh2 = (bovh) da2.f164949b;
                bovh2.f135024b = 2;
                bovh2.f135023a |= 1;
            } else if (i != 3) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bovh bovh3 = (bovh) da2.f164949b;
                bovh3.f135024b = 5;
                bovh3.f135023a |= 1;
            } else {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bovh bovh4 = (bovh) da2.f164949b;
                bovh4.f135024b = 4;
                bovh4.f135023a |= 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw = (bovw) da.f164949b;
            bovw.f135067c = 8;
            bovw.f135065a |= 2;
            bovh bovh5 = (bovh) da2.mo74062i();
            bovh5.getClass();
            bovw.f135073i = bovh5;
            bovw.f135065a |= 1024;
            sourceLogManager.mo59115a(da);
        }
        arpg arpg = new arpg();
        arpg.f88057a = C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_36;
        arpg.mo48732a((int) C0126R.C0127drawable.smartdevice_setup_success, false);
        arpg.f88058b = getString(C0126R.string.smartdevice_d2d_source_setup_success);
        if (i == 1) {
            arpg.mo48733a(getString(C0126R.string.smartdevice_action_open_app), 3);
        } else if (i != 2) {
            if (!cgou.m146380e() || this.f108206i != aqzm.AUTO) {
                arpg.f88059c = getString(C0126R.string.smartdevice_d2d_source_setup_continue_on_target, new Object[]{mo59172o().f107834g});
            } else {
                arpg.f88058b = getString(C0126R.string.smartdevice_d2d_source_setup_success_auto);
                arpg.f88057a = C0126R.C0127drawable.quantum_gm_ic_directions_car_gm_blue_36;
                arpg.f88059c = getString(C0126R.string.smartdevice_d2d_source_setup_success_description_auto);
            }
            arpg.mo48733a(getString(C0126R.string.close_button_label), 2);
        } else {
            arpg.mo48733a(getString(C0126R.string.smartdevice_action_open_app), 3);
            arpg.f88059c = getString(C0126R.string.smartdevice_companion_app_ready, new Object[]{mo59172o().f107835h.f107860b});
        }
        m92903a(arpg.mo48731a());
    }

    /* renamed from: r */
    private final void m92908r() {
        this.f108204g.f88432c.mo48359a();
    }

    /* renamed from: s */
    private final void m92909s() {
        if (cgrh.m146741b()) {
            Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C0126R.C0129id.fragment_container);
            if (findFragmentById instanceof arzy) {
                mo48979b(((arzy) findFragmentById).mo48983a((Account) null));
            }
        }
        if (this.f108199A != null) {
            m92901a(5, Bundle.EMPTY);
        } else {
            m92901a(3, Bundle.EMPTY);
        }
    }

    /* renamed from: t */
    private final void m92910t() {
        if (mo59172o().f107831d) {
            m92904a(asai.m73729b(getString(C0126R.string.smartdevice_connect_to_wifi)), getSupportFragmentManager().findFragmentById(C0126R.C0129id.fragment_container) != null, true);
        } else {
            m92896C();
        }
    }

    /* renamed from: u */
    private final Fragment m92911u() {
        return arzf.m73710a(getString(C0126R.string.smartdevice_d2d_copy_account_title), getString(m92897D()), null, getString(C0126R.string.smartdevice_action_copy), C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_36, false);
    }

    /* renamed from: v */
    private final Fragment m92912v() {
        arpg arpg = new arpg();
        arpg.f88058b = getString(C0126R.string.smartdevice_d2d_copy_account_title);
        arpg.f88059c = getString(m92897D());
        arpg.f88057a = C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_36;
        arpg.mo48733a(getString(C0126R.string.smartdevice_action_copy), 1);
        return arpg.mo48731a();
    }

    /* renamed from: w */
    private final BootstrapConfigurations m92913w() {
        araa araa = new araa();
        araa.mo48319a(2, this.f108221y);
        aqyp aqyp = new aqyp();
        aqyp.f87109f = araa;
        aqyp.f87107d = this.f108211n;
        if (!TextUtils.isEmpty(this.f108215r)) {
            aqyp.f87104a = this.f108215r;
            if (!TextUtils.isEmpty(this.f108216s)) {
                aqyp.f87106c = "PSK";
                aqyp.f87105b = this.f108216s;
            } else {
                aqyp.f87106c = "Open";
            }
        }
        Account[] a = this.f108213p.mo33916a("com.google");
        if (mo59172o().mo59056c() && a.length == 0) {
            f108197b.mo25420f("BootstrapOptions require account but no accounts found on device.", new Object[0]);
            m92916z();
            return null;
        } else if (!mo59172o().mo59059d() || this.f108202e.size() == 1) {
            if (this.f108202e.isEmpty()) {
                aqyp.mo48279a(a);
            } else {
                ArrayList arrayList = this.f108202e;
                aqyp.mo48279a((Account[]) arrayList.toArray(new Account[arrayList.size()]));
            }
            return aqyp.mo48278a();
        } else {
            if (this.f108202e.isEmpty()) {
                f108197b.mo25418e("BootstrapOptions require a single account but for some reason no  was selected.", new Object[0]);
            } else if (this.f108202e.size() > 1) {
                f108197b.mo25418e("BootstrapOptions require a single account but multiple accounts selected.", new Object[0]);
            }
            m92916z();
            return null;
        }
    }

    /* renamed from: y */
    private final void m92915y() {
        BootstrapConfigurations w = m92913w();
        if (w != null) {
            this.f108204g.mo48924a(w);
            this.f108201d = 2;
        }
    }

    /* renamed from: z */
    private final void m92916z() {
        this.f108207j = C0126R.string.common_something_went_wrong;
        m92901a(2, Bundle.EMPTY);
        finish();
    }

    /* renamed from: a */
    public final void mo49010a(int i) {
    }

    /* renamed from: b */
    public final void mo48897b() {
        m92907e(4);
    }

    /* renamed from: d */
    public final void mo48909d() {
        if (this.f108201d != 3) {
            this.f108201d = 0;
            mo48908c(4);
        }
    }

    /* renamed from: f */
    public final void mo48910f() {
        this.f108201d = 3;
        m92901a(-1, Bundle.EMPTY);
        BootstrapOptions o = mo59172o();
        if (o != null) {
            PostTransferAction postTransferAction = o.f107848u;
            if (postTransferAction == null || !cgqs.f187523a.mo6606a().mo84306S()) {
                m92894A();
            } else {
                Intent intent = (Intent) arsq.m73410a(getPackageManager(), postTransferAction).f26799b;
                if (intent != null) {
                    startActivity(intent.addFlags(268435456));
                    finish();
                } else {
                    m92907e(0);
                }
            }
            int E = m92898E();
            if ((o.mo59059d() || o.mo59063e()) && E > 0 && arqb.m73290a()) {
                arqb.m73289a(this, E, o.f107834g);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(com.google.android.gms.smartdevice.d2d.BootstrapOptions, boolean):void
     arg types: [com.google.android.gms.smartdevice.d2d.BootstrapOptions, int]
     candidates:
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(int, android.os.Bundle):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(int, int):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(java.lang.String, java.lang.String):void
      aryt.a(int, int):void
      asba.a(java.lang.String, java.lang.String):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(com.google.android.gms.smartdevice.d2d.BootstrapOptions, boolean):void */
    /* renamed from: g */
    public final void mo48960g() {
        this.f108212o = true;
        this.f108200c.mo59116b();
        this.f108211n = true;
        m92905a(mo59172o(), true);
        overridePendingTransition(C0126R.anim.slide_next_in, C0126R.anim.slide_next_out);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(com.google.android.gms.smartdevice.d2d.BootstrapOptions, boolean):void
     arg types: [com.google.android.gms.smartdevice.d2d.BootstrapOptions, int]
     candidates:
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(int, android.os.Bundle):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(int, int):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(java.lang.String, java.lang.String):void
      aryt.a(int, int):void
      asba.a(java.lang.String, java.lang.String):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(com.google.android.gms.smartdevice.d2d.BootstrapOptions, boolean):void */
    /* renamed from: h */
    public final void mo48961h() {
        m92905a(mo59172o(), false);
    }

    /* renamed from: i */
    public final void mo48962i() {
        onBackPressed();
    }

    /* renamed from: j */
    public final void mo48963j() {
        f108197b.mo25412b("suppressing setup incomplete toast", new Object[0]);
        this.f108208k = true;
    }

    /* renamed from: k */
    public final void mo48957k() {
        m92903a(m92911u());
    }

    /* renamed from: l */
    public final void mo48958l() {
    }

    /* renamed from: m */
    public final void mo48980m() {
        this.f108213p.mo33913a("com.google", null, null, null, null, new arya(this));
    }

    /* renamed from: n */
    public final void mo48911n() {
        mo48908c(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final BootstrapOptions mo59172o() {
        arxy arxy = this.f108204g;
        if (arxy != null) {
            return arxy.f88436g;
        }
        throw new IllegalStateException("No bootstrap options available yet");
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3) {
            this.f108217t.mo48888a(i, i2);
        } else if (i == 4) {
            Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C0126R.C0129id.fragment_container);
            if (findFragmentById != null && (findFragmentById instanceof asai)) {
                findFragmentById.onActivityResult(i, i2, intent);
            }
        } else if (i != 7) {
            if (i != 9) {
                sek sek = f108197b;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown request code: ");
                sb.append(i);
                sek.mo25418e(sb.toString(), new Object[0]);
                return;
            }
            this.f108208k = false;
            sek sek2 = f108197b;
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("RESULT CODE = ");
            sb2.append(i2);
            sek2.mo25414c(sb2.toString(), new Object[0]);
            if (i2 == 0) {
                if (m92898E() == 0) {
                    finish();
                    return;
                }
            } else if (i2 == -1) {
                Account account = null;
                if (intent != null) {
                    String stringExtra = intent.getStringExtra("authAccount");
                    Account[] a = asbs.m73758a(this).mo33916a("com.google");
                    int length = a.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        Account account2 = a[i3];
                        if (account2.name.equals(stringExtra)) {
                            account = account2;
                            break;
                        }
                        i3++;
                    }
                }
                if (account != null) {
                    f108197b.mo25414c("Account successfully added: %s", account.name);
                    arpg arpg = new arpg();
                    arpg.f88058b = getString(C0126R.string.smartdevice_d2d_adding_account);
                    arpg.f88057a = C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_36;
                    arpg.mo48734b();
                    m92903a(arpg.mo48731a());
                    arwj arwj = new arwj(this);
                    bqga.m112781a(bqga.m112773a(new bqew(bngx.m109370a((Object[]) new bqgg[]{arwj.mo48874a(account, "service_HOSTED"), arwj.mo48874a(account, "service_usm")}), false), cgou.m146381f(), TimeUnit.MILLISECONDS, snp.m35703a(1, 9)), new aryf(this, account), snp.m35704b(9));
                    return;
                }
                f108197b.mo25416d("Couldn't find account", new Object[0]);
                mo59171d(C0126R.string.common_something_went_wrong);
                return;
            }
            mo59171d(C0126R.string.common_something_went_wrong);
        } else if (i2 != -1) {
            f108197b.mo25414c("User denied companion app permissions, or clicked back", new Object[0]);
            m92894A();
        } else {
            f108197b.mo25414c("User approved companion app permissions, installing app.", new Object[0]);
        }
    }

    public final void onBackPressed() {
        int i = this.f108201d;
        if (i == 0) {
            m92909s();
            m92908r();
            finish();
        } else if (i == 3) {
            finish();
        } else if (i == 2 || this.f108210m.size() == 0) {
            m92902a(aryu.m73694a(9, "", getString(C0126R.string.smartdevice_alert_exit_setup_message), getString(C0126R.string.smartdevice_alert_quit_button), getString(C0126R.string.common_cancel), true));
        } else {
            ArrayList arrayList = this.f108210m;
            this.f108209l = (Integer) arrayList.remove(arrayList.size() - 1);
            getSupportFragmentManager().popBackStack(this.f108209l.intValue(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        arzb arzb;
        Status status;
        aqzm aqzm;
        super.onCreate(bundle);
        arqh.m73305a((Activity) this);
        setContentView((int) C0126R.C0128layout.smartdevice_fragment_container);
        this.f108213p = asbs.m73758a(this);
        Intent intent = getIntent();
        this.f108214q = intent.getIntExtra("smartdevice.trigger", 0);
        if (intent.hasExtra("connectionRequest")) {
            this.f108199A = (ConnectionRequest) sef.m35068a(intent.getStringExtra("connectionRequest"), ConnectionRequest.CREATOR);
            this.f108206i = aqzm.m72294a(intent.getStringExtra("device_type"));
        } else {
            D2DDevice d2DDevice = (D2DDevice) sef.m35068a(intent.getStringExtra("smartdevice.d2dDevice"), D2DDevice.CREATOR);
            sdo.m34966a(d2DDevice, "D2D device cannot be null");
            this.f108205h = d2DDevice;
            byte b = d2DDevice.f107876e;
            aqzm[] values = aqzm.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aqzm = aqzm.UNKNOWN;
                    break;
                }
                aqzm = values[i];
                if (aqzm.f87167h == b) {
                    break;
                }
                i++;
            }
            this.f108206i = aqzm;
            this.f108218u = intent.getStringExtra("smartdevice.pin");
        }
        aryg aryg = new aryg(this);
        this.f108219v = aryg;
        aryg.execute(new Void[0]);
        this.f108220w = new ascm(getApplicationContext());
        this.f108221y = arqd.m73298c(this).mo48618a();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        arxy arxy = (arxy) supportFragmentManager.findFragmentByTag("connectionless_connection_fragment");
        this.f108204g = arxy;
        if (arxy == null) {
            this.f108204g = new arxy();
            supportFragmentManager.beginTransaction().add(this.f108204g, "connectionless_connection_fragment").commit();
            if (this.f108199A != null) {
                arxy arxy2 = this.f108204g;
                Context applicationContext = getApplicationContext();
                ConnectionRequest connectionRequest = this.f108199A;
                arxy2.f88432c = aqxc.m72189b(applicationContext);
                arxy2.f88431b.mo48921a(this);
                if (cgpa.f187426a.mo6606a().mo84207a()) {
                    arxy2.f88432c.mo48359a().mo50371a(new arxb(arxy2, connectionRequest));
                } else {
                    arxy2.f88432c.mo48360a(connectionRequest, arxy2.f88437h).mo50372a(new arxc(arxy2));
                }
            } else if (!cgqs.f187523a.mo6606a().mo84335u()) {
                f108197b.mo25418e("Source mode is disabled using gservices.", new Object[0]);
                m92902a(m92906c(getString(C0126R.string.smartdevice_d2d_source_disabled_text)));
            } else {
                if (arqd.m73296a() == null) {
                    f108197b.mo25416d("Bluetooth not available", new Object[0]);
                    status = new Status(10570);
                } else if (ascq.m73789a(this)) {
                    f108197b.mo25416d("Cannot copy restricted profile", new Object[0]);
                    status = new Status(10569);
                } else {
                    status = Status.f30107a;
                }
                if (status.mo17710c()) {
                    arxy arxy3 = this.f108204g;
                    Context applicationContext2 = getApplicationContext();
                    D2DDevice d2DDevice2 = this.f108205h;
                    int i2 = this.f108214q;
                    String str = this.f108218u;
                    arxy3.f88432c = aqxc.m72189b(applicationContext2);
                    arxy3.f88433d = d2DDevice2;
                    arxy3.f88434e = i2;
                    arxy3.f88435f = str;
                    arxy3.f88431b.mo48921a(this);
                    if (arxy3.f88434e == 1) {
                        arxy3.f88432c.mo48361a(arxy3.f88438i);
                    } else {
                        arxy3.mo48922a();
                    }
                } else {
                    int i3 = status.f30115i;
                    if (i3 == 10569) {
                        m92902a(m92906c(getString(C0126R.string.smartdevice_d2d_source_restricted_user_text)));
                    } else if (i3 != 10570) {
                        sek sek = f108197b;
                        String valueOf = String.valueOf(araj.m72321a(status.f30115i));
                        sek.mo25418e(valueOf.length() == 0 ? new String("Source mode is unsupported. Reason: ") : "Source mode is unsupported. Reason: ".concat(valueOf), new Object[0]);
                    } else {
                        m92902a(m92906c(getString(C0126R.string.smartdevice_d2d_source_bluetooth_unavailable_text)));
                    }
                }
            }
        }
        this.f108217t = new arwt(this, new aryb(this), bundle);
        if (bundle == null) {
            bundle2 = Bundle.EMPTY;
        } else {
            bundle2 = bundle;
        }
        this.f108211n = bundle2.getBoolean("smartdevice.d2dSetupActivity.lockscreenUnlocked", false);
        this.f108215r = bundle2.getString("smartdevice.d2dSetupActivity.wifiSsid", "");
        String str2 = null;
        this.f108216s = bundle2.getString("smartdevice.d2dSetupActivity.wifiPassword", null);
        this.f108201d = bundle2.getInt("smartdevice.d2dSetupActivity.bootstrapState", 0);
        this.f108209l = Integer.valueOf(bundle2.getInt("smartdevice.d2dSetupActivity.backStackFragmentId", -99999));
        ArrayList<Integer> integerArrayList = bundle2.getIntegerArrayList("smartdevice.d2dSetupActivity.backStackIds");
        if (integerArrayList == null) {
            integerArrayList = new ArrayList<>(0);
        }
        this.f108210m = integerArrayList;
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("smartdevice.d2dSetupActivity.selectedAccounts");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList(0);
        }
        this.f108202e = parcelableArrayList;
        if (bundle != null) {
            this.f108200c = (SourceLogManager) bundle2.getParcelable("smartdevice.sourceLogManager");
        } else {
            if (!cgou.m146380e()) {
                arzb = arzb.m73701a(getString(C0126R.string.common_connecting_to_your_device));
            } else {
                if (this.f108206i == aqzm.AUTO) {
                    str2 = getString(C0126R.string.smartdevice_setup_bluetooth_connecting_text_auto);
                }
                arzb = arzb.m73702a(getString(C0126R.string.common_connecting), str2);
            }
            m92903a(arzb);
            this.f108200c = (SourceLogManager) intent.getParcelableExtra("smartdevice.sourceLogManager");
        }
        SourceLogManager sourceLogManager = this.f108200c;
        if (sourceLogManager == null) {
            SourceLogManager sourceLogManager2 = new SourceLogManager(this);
            this.f108200c = sourceLogManager2;
            sourceLogManager2.mo59113a(this.f108214q, arpu.m73280a(this));
        } else {
            sourceLogManager.f108008f = this;
        }
        ascq.m73788a(getContainerActivity());
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        f108197b.mo25412b("onDestroy", new Object[0]);
        this.f108219v.cancel(true);
        if (!this.f108222z) {
            this.f108200c.mo59111a(4);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        f108197b.mo25412b("onPause", new Object[0]);
        this.f108220w.mo49044a();
        if (!cgqy.m146727b()) {
            this.f108217t.mo48891b();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        super.onPostResume();
        f108197b.mo25412b("onPostResume", new Object[0]);
        cgqy.m146727b();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        f108197b.mo25412b("onResume", new Object[0]);
        this.f108208k = false;
        ascm ascm = this.f108220w;
        ascu.m73796a();
        if (!ascm.f88708d) {
            ascm.f88708d = true;
            ascm.f88707c = Settings.System.getInt(ascm.f88706b, "screen_off_timeout", ascm.f88705a);
            ascm.mo49045a(ascm.f88705a);
            ascm.f88709e = new asby(ascm, Thread.getDefaultUncaughtExceptionHandler());
            Thread.setDefaultUncaughtExceptionHandler(ascm.f88709e);
        }
        if (!cgqy.m146727b()) {
            this.f108217t.mo48887a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        f108197b.mo25412b("onSaveInstanceState", new Object[0]);
        super.onSaveInstanceState(bundle);
        this.f108217t.mo48889a(bundle);
        bundle.putBoolean("smartdevice.d2dSetupActivity.lockscreenUnlocked", this.f108211n);
        bundle.putString("smartdevice.d2dSetupActivity.wifiSsid", this.f108215r);
        bundle.putString("smartdevice.d2dSetupActivity.wifiPassword", this.f108216s);
        bundle.putInt("smartdevice.d2dSetupActivity.bootstrapState", this.f108201d);
        bundle.putInt("smartdevice.d2dSetupActivity.backStackFragmentId", this.f108209l.intValue());
        bundle.putIntegerArrayList("smartdevice.d2dSetupActivity.backStackIds", this.f108210m);
        bundle.putParcelable("smartdevice.sourceLogManager", this.f108200c);
        bundle.putParcelableArrayList("smartdevice.d2dSetupActivity.selectedAccounts", this.f108202e);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        f108197b.mo25412b("onStop", new Object[0]);
        if (!isChangingConfigurations() && this.f108201d != 3 && !cgqy.m146727b() && !this.f108208k) {
            if (this.f108207j > 0) {
                f108197b.mo25412b("Displaying error toast", new Object[0]);
                Toast.makeText(this, this.f108207j, 1).show();
            } else {
                f108197b.mo25412b("Displaying setup incomplete toast", new Object[0]);
                Toast.makeText(this, (int) C0126R.string.smartdevice_alert_setup_incomplete, 1).show();
            }
        }
        super.onStop();
    }

    /* renamed from: p */
    public final void mo49004p() {
        if (cgou.m146379d() && this.f108201d == 1) {
            m92910t();
            return;
        }
        arba arba = this.f108204g.f88432c;
        roz b = rpa.m34196b();
        b.f43472a = new arkr();
        arba.mo24732b(b.mo24977a());
    }

    /* renamed from: q */
    public final void mo49005q() {
        this.f108208k = true;
        m92908r();
        if (this.f108206i == aqzm.AUTO) {
            m92901a(0, Bundle.EMPTY);
        } else {
            m92901a(3, Bundle.EMPTY);
        }
        finish();
    }

    /* renamed from: x */
    private final void m92914x() {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (((UserManager) getSystemService("user")).getUserProfiles().size() > 1) {
            boolean z2 = !this.f108202e.isEmpty();
            if (!mo59172o().mo59048b().mo48320a(5) || !cgps.m146491c()) {
                z = false;
            }
            if (!z2 && !z) {
                f108197b.mo25412b("Warning Android At Work profiles will not copy over", new Object[0]);
                m92902a(aryu.m73694a(10, getString(C0126R.string.smartdevice_alert_work_profile_title), getString(C0126R.string.smartdevice_alert_work_profile_message), getString(C0126R.string.common_ok), null, false));
                return;
            }
            m92915y();
            return;
        }
        m92915y();
    }

    /* renamed from: b */
    public final void mo48894b(int i) {
        if (i != 1) {
            f108197b.mo25414c("User chose not to install companion app, going to done state.", new Object[0]);
            m92907e(3);
        } else if (mo59172o() == null) {
            f108197b.mo25418e("Cannot install companion app; bootstrap options are null", new Object[0]);
            m92907e(0);
        } else {
            CompanionApp companionApp = mo59172o().f107835h;
            if (companionApp == null) {
                f108197b.mo25418e("Cannot install companion app; companion app is null", new Object[0]);
                m92907e(0);
                return;
            }
            String str = companionApp.f107861c;
            if (TextUtils.isEmpty(str)) {
                f108197b.mo25418e("Cannot install companion app; package name is null or empty", new Object[0]);
                m92907e(0);
                return;
            }
            f108197b.mo25414c("Displaying companion app confirmation.", new Object[0]);
            bmxy.m108581a(this);
            bmxy.m108588a(true ^ TextUtils.isEmpty(str));
            Bundle b = arzb.m73703b(getResources().getString(C0126R.string.smartdevice_setup_info_installing_app), null);
            b.putString("smartdevice.appPackage", str);
            arxa arxa = new arxa();
            arxa.setArguments(b);
            m92903a(arxa);
            startActivityForResult(sbv.m34870a(this, str), 7);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(com.google.android.gms.smartdevice.d2d.BootstrapOptions, boolean):void
     arg types: [com.google.android.gms.smartdevice.d2d.BootstrapOptions, int]
     candidates:
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(int, android.os.Bundle):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(int, int):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(java.lang.String, java.lang.String):void
      aryt.a(int, int):void
      asba.a(java.lang.String, java.lang.String):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(com.google.android.gms.smartdevice.d2d.BootstrapOptions, boolean):void */
    /* renamed from: d */
    public final void mo59171d(int i) {
        Toast.makeText(this, i, 1).show();
        m92905a(mo59172o(), false);
    }

    /* renamed from: a */
    public static Intent m92900a(ConnectionRequest connectionRequest, int i, SourceLogManager sourceLogManager, aqzm aqzm) {
        sdo.m34959a(connectionRequest);
        sdo.m34959a(aqzm);
        Bundle bundle = new Bundle();
        bundle.putString("connectionRequest", sef.m35075b(connectionRequest));
        bundle.putInt("smartdevice.trigger", i);
        bundle.putParcelable("smartdevice.sourceLogManager", sourceLogManager);
        bundle.putString("device_type", aqzm.name());
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.setup.ui.D2DSetupActivity").putExtras(bundle);
    }

    /* renamed from: c */
    public final void mo48907c() {
        this.f108201d = 1;
        BootstrapOptions o = mo59172o();
        if (!cgpa.m146406g() || !o.mo59056c() || ((cgou.m146377b() && this.f108206i == aqzm.AUTO) || this.f108213p.mo33916a("com.google").length != 0)) {
            long j = o.f107839l;
            if (j == -1 || j == 0) {
                j = ascn.m73780a();
            }
            SourceLogManager sourceLogManager = this.f108200c;
            bxvd da = bovw.f135063l.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw = (bovw) da.f164949b;
            bovw.f135067c = 17;
            int i = bovw.f135065a | 2;
            bovw.f135065a = i;
            bovw.f135065a = i | 4096;
            bovw.f135075k = j;
            sourceLogManager.mo59115a(da);
            SourceLogManager sourceLogManager2 = this.f108200c;
            synchronized (sourceLogManager2.f108006d) {
                if (sourceLogManager2.f108005c) {
                    SourceLogManager.f108003a.mo25416d("Attempted to set sessionId twice", new Object[0]);
                } else if (j != -1) {
                    sek sek = SourceLogManager.f108003a;
                    StringBuilder sb = new StringBuilder(40);
                    sb.append("Set session ID to : ");
                    sb.append(j);
                    sek.mo25409a(sb.toString(), new Object[0]);
                    sourceLogManager2.f108004b = j;
                    sourceLogManager2.f108005c = true;
                    sourceLogManager2.mo59120e();
                } else {
                    SourceLogManager.f108003a.mo25418e("Attempted to set invalid sessionId", new Object[0]);
                }
            }
            araa b = o.mo59048b();
            if ((!o.mo59059d() || m92898E() == 1 || !cgps.f187469a.mo6606a().mo84244a()) && this.f108221y && !b.mo48320a(1)) {
                m92902a(asbz.m73764a(this, 12));
            } else if (cgqy.m146727b()) {
                this.f108204g.mo48924a(new aqyp().mo48278a());
                this.f108201d = 2;
            } else {
                m92910t();
            }
        } else {
            mo48908c(7);
        }
    }

    /* renamed from: a */
    private final void m92901a(int i, Bundle bundle) {
        Intent putExtras = new Intent().putExtras(bundle);
        this.f108200c.mo59111a(i);
        SourceLogManager sourceLogManager = this.f108200c;
        long a = cgrh.f187592a.mo6606a().mo84352a();
        if (a > 0) {
            f108198x.execute(new arxz(sourceLogManager, a));
        }
        putExtras.putExtra("smartdevice.sourceLogManager", this.f108200c);
        setResult(i, putExtras);
        this.f108222z = true;
    }

    /* renamed from: a */
    private final void m92902a(DialogFragment dialogFragment) {
        if (!isFinishing()) {
            dialogFragment.show(getSupportFragmentManager(), "smartdevice.dialogfragment");
        }
    }

    /* renamed from: b */
    public final void mo48707b(int i, Bundle bundle) {
        if (i == 1) {
            this.f108200c.mo59116b();
            m92914x();
        } else if (i == 2) {
            m92895B();
            finish();
        } else if (i == 3) {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(mo59172o().f107835h.f107861c);
            if (launchIntentForPackage != null) {
                startActivity(launchIntentForPackage);
            } else {
                f108197b.mo25418e("Can't launch app, package manager says it's not installed", new Object[0]);
                m92895B();
            }
            finish();
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown action ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private final void m92903a(Fragment fragment) {
        m92904a(fragment, getSupportFragmentManager().findFragmentById(C0126R.C0129id.fragment_container) != null, false);
    }

    /* renamed from: a */
    private final void m92904a(Fragment fragment, boolean z, boolean z2) {
        if (!(fragment instanceof DialogFragment)) {
            asbr.m73757a(getContainerActivity(), fragment.getArguments().getString("smartdevice.title"));
            if (!isFinishing()) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                if (z) {
                    beginTransaction.setCustomAnimations(C0126R.anim.slide_next_in, C0126R.anim.slide_next_out, C0126R.anim.slide_back_in, C0126R.anim.slide_back_out);
                }
                if (this.f108209l.intValue() != -99999) {
                    this.f108210m.add(this.f108209l);
                }
                int commit = beginTransaction.replace(C0126R.C0129id.fragment_container, fragment).addToBackStack(null).commit();
                if (z2) {
                    this.f108209l = Integer.valueOf(commit);
                } else {
                    this.f108209l = -99999;
                }
            }
        } else {
            throw new IllegalArgumentException("DialogFragments cannot be added using this method. Did you mean to call 'addOnly(DialogFragment)'?");
        }
    }

    /* renamed from: b */
    public final void mo48979b(arzx arzx) {
        if (cgou.m146378c()) {
            this.f108200c.mo59114a(arzx);
        }
    }

    /* renamed from: b */
    public final void mo48906b(String str) {
        m92903a(arzb.m73701a(str));
    }

    /* renamed from: c */
    public final void mo48908c(int i) {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        SourceLogManager sourceLogManager = this.f108200c;
        bxvd da = bovo.f135035c.mo74144da();
        int i2 = -1;
        int i3 = i - 1;
        int i4 = 6;
        if (i3 == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovo bovo = (bovo) da.f164949b;
            bovo.f135038b = 8;
            bovo.f135037a |= 1;
        } else if (i3 == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovo bovo2 = (bovo) da.f164949b;
            bovo2.f135038b = 3;
            bovo2.f135037a |= 1;
        } else if (i3 == 3) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovo bovo3 = (bovo) da.f164949b;
            bovo3.f135038b = 6;
            bovo3.f135037a |= 1;
        } else if (i3 == 5) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovo bovo4 = (bovo) da.f164949b;
            bovo4.f135038b = 2;
            bovo4.f135037a |= 1;
        } else if (i3 != 6) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovo bovo5 = (bovo) da.f164949b;
            bovo5.f135038b = 0;
            bovo5.f135037a |= 1;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovo bovo6 = (bovo) da.f164949b;
            bovo6.f135038b = 7;
            bovo6.f135037a |= 1;
        }
        bxvd da2 = bovw.f135063l.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bovw bovw = (bovw) da2.f164949b;
        bovo bovo7 = (bovo) da.mo74062i();
        bovo7.getClass();
        bovw.f135074j = bovo7;
        bovw.f135065a |= 2048;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bovw bovw2 = (bovw) da2.f164949b;
        bovw2.f135067c = 12;
        bovw2.f135065a |= 2;
        sourceLogManager.mo59115a(da2);
        if (i3 == 1) {
            i2 = 3;
            i4 = 3;
        } else if (i3 == 2) {
            i2 = 1;
            i4 = 3;
        } else if (i3 != 3) {
            if (i3 == 6) {
                if (mo59172o() != null) {
                    str = mo59172o().f107834g;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str2 = getString(C0126R.string.smartdevice_alert_no_accounts_generic_text);
                } else {
                    str2 = String.format(getString(C0126R.string.smartdevice_alert_no_accounts_text), str.trim());
                }
                m92902a(aryu.m73694a(8, getString(C0126R.string.smartdevice_alert_no_accounts_title), str2, getString(C0126R.string.common_ok), null, false));
                return;
            } else if (i3 != 7) {
                m92916z();
                return;
            }
        } else if (this.f108199A == null) {
            i2 = 2;
            i4 = 3;
        } else {
            m92916z();
            return;
        }
        this.f108208k = true;
        bundle.putInt("restart_code", i2);
        m92901a(i4, bundle);
        finish();
    }

    /* renamed from: a */
    private final void m92905a(BootstrapOptions bootstrapOptions, boolean z) {
        sdo.m34966a(bootstrapOptions, "bootstrapOptions cannot be null.");
        if (!bootstrapOptions.mo59056c() && m92898E() == 0) {
            f108197b.mo25412b("No accounts required and no accounts on device.", new Object[0]);
            m92914x();
        } else if (bootstrapOptions.mo59059d()) {
            this.f108202e.clear();
            if (cgou.m146377b() && this.f108206i == aqzm.AUTO && m92898E() == 0) {
                mo48980m();
            } else {
                m92904a(arzy.m73719a(getString(C0126R.string.common_choose_account_label), false, false, this.f108206i), !z, true);
            }
        } else if (!bootstrapOptions.mo59063e()) {
            f108197b.mo25418e("Unsupported account requirements set in BootstrapOptions.", new Object[0]);
            m92916z();
        } else if (!this.f108212o) {
            m92904a(m92912v(), !z, false);
        } else {
            m92914x();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(com.google.android.gms.smartdevice.d2d.BootstrapOptions, boolean):void
     arg types: [com.google.android.gms.smartdevice.d2d.BootstrapOptions, int]
     candidates:
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(int, android.os.Bundle):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(int, int):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(java.lang.String, java.lang.String):void
      aryt.a(int, int):void
      asba.a(java.lang.String, java.lang.String):void
      com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity.a(com.google.android.gms.smartdevice.d2d.BootstrapOptions, boolean):void */
    /* renamed from: e */
    public final void mo48956e() {
        this.f108212o = true;
        this.f108211n = true;
        SourceLogManager sourceLogManager = this.f108200c;
        bxvd da = bovw.f135063l.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bovw bovw = (bovw) da.f164949b;
        bovw.f135067c = 14;
        bovw.f135065a |= 2;
        sourceLogManager.mo59115a(da);
        m92905a(mo59172o(), false);
    }

    /* renamed from: a */
    public final void mo48896a() {
        m92907e(1);
    }

    /* renamed from: a */
    public final void mo48948a(int i, int i2) {
        if (i != 4) {
            if (i != 12) {
                switch (i) {
                    case 8:
                        break;
                    case 9:
                        if (i2 == 1) {
                            m92909s();
                            if (cgpg.m146449c()) {
                                m92908r();
                            }
                            finish();
                            return;
                        }
                        return;
                    case 10:
                        m92915y();
                        return;
                    default:
                        return;
                }
            } else {
                m92901a(2, Bundle.EMPTY);
                finish();
                return;
            }
        }
        if (i2 == 3) {
            m92901a(2, Bundle.EMPTY);
            finish();
        }
    }

    /* renamed from: a */
    public final void mo59169a(Account account) {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C0126R.C0129id.fragment_container);
        if (findFragmentById instanceof arzy) {
            arzy arzy = (arzy) findFragmentById;
            arzw arzw = arzy.f88555b;
            if (arzw != null) {
                arzw.mo48978a(new arzx(account, arzy.f88558e.size(), arzy.f88560g.size(), arzy.f88561h.size(), arzy.f88565l, true));
                return;
            }
            return;
        }
        mo48978a(new arzx(account, m92898E(), 0, 0, false, true));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo59170a(AccountManagerFuture accountManagerFuture) {
        try {
            this.f108208k = true;
            startActivityForResult((Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent"), 9);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            f108197b.mo25417e("Failed to add account", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo48978a(arzx arzx) {
        Account account = arzx.f88548a;
        if (account != null) {
            f108197b.mo25412b("Selected account: %s", account);
            if (mo59172o().mo59059d()) {
                this.f108202e.clear();
            }
            this.f108202e.add(account);
            this.f108200c.mo59114a(arzx);
            if (this.f108212o) {
                m92914x();
            } else {
                m92903a(m92912v());
            }
        } else {
            throw new IllegalStateException("onAccountSelected was called but account was null!");
        }
    }

    /* renamed from: a */
    public final void mo48903a(BootstrapProgressResult bootstrapProgressResult) {
        int i = bootstrapProgressResult.f107854a;
        if (i == 1) {
            Bundle bundle = bootstrapProgressResult.f107855b;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("accounts");
            if (parcelableArrayList != null) {
                m92903a(arws.m73628a(parcelableArrayList, this.f108203f));
                return;
            }
            f108197b.mo25409a("Has pending intent to delegate", new Object[0]);
            this.f108217t.mo48890a((Fragment) null, (PendingIntent) bundle.getParcelable("pendingIntent"));
        } else if (i == 6) {
            f108197b.mo25409a("WIFI_AUTHENTICATION_FAILED", new Object[0]);
            f108197b.mo25418e("Wifi Password was incorrect", new Object[0]);
            asbb.m73747a(this.f108215r, true).show(getSupportFragmentManager(), "dialog");
        }
    }

    /* renamed from: a */
    public final void mo48904a(VerificationInfo verificationInfo) {
        String str = verificationInfo.f107953a;
        this.f108200c.mo59117c();
        m92903a(asan.m73740a(bowh.m111606a(verificationInfo.f107954b), str, true, true, this.f108206i));
    }

    /* renamed from: a */
    public final void mo48905a(String str) {
        if (str != null) {
            this.f108200c.mo59117c();
            m92903a(asan.m73740a(bowh.m111606a(this.f108205h.f107879h), str, true, true, this.f108206i));
            return;
        }
        f108197b.mo25418e("PIN verification is no longer supported.", new Object[0]);
        m92916z();
    }

    /* renamed from: a */
    public final void mo48996a(String str, String str2) {
        this.f108215r = str;
        this.f108216s = str2;
        m92913w();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* renamed from: a */
    public final void mo48992a(String str, String str2, int i, int i2, int i3) {
        int i4;
        this.f108215r = str;
        this.f108216s = str2;
        SourceLogManager sourceLogManager = this.f108200c;
        bxvd da = bovw.f135063l.mo74144da();
        bxvd da2 = bovt.f135051e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bovt bovt = (bovt) da2.f164949b;
        bovt.f135056d = i - 1;
        int i5 = bovt.f135053a | 4;
        bovt.f135053a = i5;
        if (i2 == 10) {
            bovt.f135055c = 3;
        } else if (i2 != 11) {
            bovt.f135055c = 1;
            i4 = i5 | 2;
            bovt.f135053a = i4;
            bovt.f135053a = i4 | 1;
            bovt.f135054b = i3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovw bovw = (bovw) da.f164949b;
            bovw.f135067c = 4;
            bovw.f135065a |= 2;
            bovt bovt2 = (bovt) da2.mo74062i();
            bovt2.getClass();
            bovw.f135071g = bovt2;
            bovw.f135065a |= 128;
            sourceLogManager.mo59115a(da);
            m92896C();
        } else {
            bovt.f135055c = 2;
        }
        i4 = i5 | 2;
        bovt.f135053a = i4;
        bovt.f135053a = i4 | 1;
        bovt.f135054b = i3;
        if (da.f164950c) {
        }
        bovw bovw2 = (bovw) da.f164949b;
        bovw2.f135067c = 4;
        bovw2.f135065a |= 2;
        bovt bovt22 = (bovt) da2.mo74062i();
        bovt22.getClass();
        bovw2.f135071g = bovt22;
        bovw2.f135065a |= 128;
        sourceLogManager.mo59115a(da);
        m92896C();
    }

    /* renamed from: a */
    public final void mo48885a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) arrayList.get(i);
            if (!TextUtils.isEmpty(bundle.getString("sessionCheckpoint"))) {
                arrayList2.add(bundle);
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("accounts", arrayList2);
        this.f108204g.mo48923a(bundle2);
    }
}
