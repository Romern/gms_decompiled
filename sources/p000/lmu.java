package p000;

import android.accounts.Account;
import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.common.widget.phone.SwitchBar;

/* renamed from: lmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lmu extends lim {

    /* renamed from: d */
    public static final srn f26404d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: e */
    public final lho f26405e;

    /* renamed from: f */
    public final adyd f26406f;

    /* renamed from: g */
    public final int f26407g;

    /* renamed from: h */
    private final lrc f26408h;

    /* renamed from: i */
    private final kre f26409i;

    /* renamed from: j */
    private final lms f26410j = new lms(this);

    /* renamed from: k */
    private TextView f26411k;

    /* renamed from: l */
    private RecyclerView f26412l;

    /* renamed from: m */
    private final bmxv f26413m;

    /* renamed from: a */
    public final void mo15164a() {
        int i;
        lir lir = this.f26159a;
        if (!ccip.m129866f()) {
            i = 2132019642;
        } else {
            i = 2132019639;
        }
        lir.setTheme(i);
        if (!ccjf.m130035e()) {
            this.f26159a.setContentView((int) C0126R.C0128layout.autofill_settings_activity);
        } else if (cciw.f179109a.mo6606a().mo76080m()) {
            this.f26159a.setContentView((int) C0126R.C0128layout.autofill_settings_activity_with_autofill_enabled_switch_v2);
            SwitchBar switchBar = (SwitchBar) this.f26159a.findViewById(C0126R.C0129id.autofill_opt_in_enabled);
            switchBar.setChecked(this.f26405e.mo15095o());
            switchBar.setEnabled(true);
            switchBar.f30418a = new lmo(this);
        } else {
            this.f26159a.setContentView((int) C0126R.C0128layout.autofill_settings_activity_with_autofill_enabled_switch);
            Switch switchR = (Switch) this.f26159a.findViewById(C0126R.C0129id.autofill_opt_in_enabled);
            switchR.setChecked(this.f26405e.mo15095o());
            switchR.setOnClickListener(new lmk(this, switchR));
        }
        Toolbar toolbar = (Toolbar) this.f26159a.findViewById(C0126R.C0129id.toolbar);
        this.f26159a.mo8626a(toolbar);
        C1341rz aW = this.f26159a.mo8628aW();
        if (aW != null) {
            aW.mo15853b(true);
            toolbar.mo1678a(new lml(this));
        }
        ViewGroup viewGroup = (ViewGroup) this.f26159a.findViewById(C0126R.C0129id.settings_viewgroup);
        lqm lqm = new lqm(viewGroup.findViewById(C0126R.C0129id.profile_viewgroup));
        lqm.f26603u.setText((int) C0126R.string.common_google_settings_account);
        lqm.f26601s.setImageResource(C0126R.C0127drawable.quantum_ic_account_circle_grey600_24);
        this.f26411k = lqm.f26604v;
        lqm.f201a.setOnClickListener(new lmm(this));
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(16908298);
        this.f26412l = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        this.f26412l.setLayoutManager(new aah());
        this.f26412l.setAdapter(this.f26410j);
    }

    /* renamed from: b */
    public final void mo15171b() {
        if (this.f26160b.getBoolean("initial_setup_started")) {
            return;
        }
        if ((!ccjf.f179148a.mo6606a().mo76112i() || this.f26407g != 4) && kdi.f23885a.equals(this.f26405e.mo15081a()) && lqo.m19536b(this.f26406f)) {
            this.f26160b.putBoolean("initial_setup_started", true);
            mo15275h();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lmt.<init>(int, int, android.content.Intent, boolean):void
     arg types: [?, ?, android.content.Intent, int]
     candidates:
      lmt.<init>(int, int, bqgg, boolean):void
      lmt.<init>(int, int, android.content.Intent, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lmt.<init>(int, int, bqgg, boolean):void
     arg types: [?, ?, bqgg, int]
     candidates:
      lmt.<init>(int, int, android.content.Intent, boolean):void
      lmt.<init>(int, int, bqgg, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x014e, code lost:
        if (r1.canAuthenticate() == 0) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x016e, code lost:
        if (r1.hasEnrolledFingerprints() != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0170, code lost:
        r2.mo67668c(new p000.lmt((int) com.felicanetworks.mfc.C0126R.string.autofill_biometrics_label, (int) com.felicanetworks.mfc.C0126R.C0127drawable.quantum_ic_fingerprint_grey600_24, p000.lio.m19198b(com.felicanetworks.sdu.ErrorInfo.TYPE_SDU_MEMORY_FULL), false));
     */
    /* renamed from: c */
    public final void mo15172c() {
        kdi a = this.f26405e.mo15081a();
        if (kdi.f23885a.equals(a)) {
            if (lqo.m19536b(this.f26406f)) {
                this.f26411k.setText(this.f26408h.mo15386b(C0126R.string.common_choose_account_label));
            } else {
                this.f26411k.setText(this.f26408h.mo15386b(C0126R.string.common_add_account_label));
            }
            this.f26412l.setVisibility(8);
            return;
        }
        Account account = a.f23888d;
        if (account != null) {
            this.f26411k.setText(account.name);
            sre.m36087g(this.f26159a);
            lms lms = this.f26410j;
            bngs j = bngx.m109377j();
            String valueOf = String.valueOf(account.name);
            j.mo67668c(new lmt((int) C0126R.string.autofill_datatype_profile, (int) C0126R.C0127drawable.quantum_ic_info_outline_grey600_24, new Intent("android.intent.action.VIEW", Uri.parse(valueOf.length() == 0 ? new String("https://aboutme.google.com#Email=") : "https://aboutme.google.com#Email=".concat(valueOf))), false));
            j.mo67668c(new lmt((int) C0126R.string.autofill_datatype_address, (int) C0126R.C0127drawable.quantum_ic_place_grey600_24, new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/@/data=!4m2!10m1!1e2")), false));
            kuw a2 = this.f26409i.mo14825a(this.f26159a);
            j.mo67668c(new lmt((int) C0126R.string.autofill_datatype_payment, (int) C0126R.C0127drawable.quantum_ic_credit_card_grey600_24, bqdx.m112673a(liw.m19221a(this.f26159a).mo15186a((lis) new lmp(a2.mo14871i())), new lmn(this, account, a2.mo14863a().mo14899a()), bqfb.INSTANCE), true));
            Intent a3 = lio.m19191a();
            boolean i = ccip.m129869i();
            if (i) {
                a3 = new Intent().setPackage("com.google.android.gms").putExtra("extra.screenId", 413).putExtra("extra.accountName", account.name);
                if (cbro.m128210n()) {
                    a3.setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").putExtra("extra.utmSource", "android-settings").putExtra("extra.utmMedium", "autofill");
                } else {
                    a3.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
                }
            }
            j.mo67668c(new lmt((int) C0126R.string.common_passwords, (int) C0126R.C0127drawable.quantum_ic_vpn_key_grey600_24, a3, i));
            if (ccit.m129946c() || ccit.m129945b()) {
                int i2 = Build.VERSION.SDK_INT;
                BiometricManager biometricManager = (BiometricManager) this.f26159a.getSystemService(BiometricManager.class);
                if (biometricManager != null) {
                }
            }
            if (ccit.m129946c()) {
                int i3 = Build.VERSION.SDK_INT;
                FingerprintManager fingerprintManager = (FingerprintManager) this.f26159a.getSystemService("fingerprint");
                if (fingerprintManager != null) {
                    if (fingerprintManager.isHardwareDetected()) {
                    }
                }
            }
            if (ccip.m129862b()) {
                j.mo67668c(new lmt((int) C0126R.string.autofill_debug_settings, (int) C0126R.C0127drawable.quantum_ic_bug_report_grey600_24, bqga.m112775a(bmxv.m108567c(lio.m19198b(202))), false));
            }
            lms.mo15378a(j.mo67664a());
            this.f26412l.setVisibility(0);
            return;
        }
        this.f26411k.setText(a.f23887c);
        this.f26412l.setVisibility(8);
    }

    /* renamed from: h */
    public final void mo15275h() {
        this.f26159a.startActivity(lio.m19200c(12));
    }

    public lmu(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        bmxv bmxv;
        this.f26408h = lrc.m19570a(lir);
        kre a = krc.m18382a(lir);
        this.f26409i = a;
        this.f26405e = a.mo14830e();
        this.f26406f = this.f26409i.mo14834i();
        int i = 2;
        if (ccjf.m130034d()) {
            Bundle bundle2 = bundle.getBundle("com.google.android.gms.autofill.extra.METRICS_CONTEXT");
            if (bundle2 != null) {
                bmxv = bmxv.m108567c((MetricsContext) lqx.m19548a(bundle2));
            } else {
                bmxv = bmvz.f131120a;
            }
            this.f26413m = bmxv;
            int i2 = bundle.getInt("com.google.android.gms.autofill.extra.SETTINGS_SOURCE", laa.m18841a(2));
            if (i2 != 0) {
                i = i2 != 1 ? i2 != 2 ? 0 : 4 : 3;
            }
        } else {
            this.f26413m = bmvz.f131120a;
        }
        this.f26407g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15274a(boolean z) {
        if (this.f26413m.mo66813a()) {
            this.f26409i.mo14837l().mo14916q(new lmj(this, (MetricsContext) this.f26413m.mo66814b(), z));
        }
    }
}
